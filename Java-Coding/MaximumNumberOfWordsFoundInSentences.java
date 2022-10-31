public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        String[] x = {"w jrpihe zsyqn l dxchifbxlasaehj",
                "nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom",
                "xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg",
                "krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm",
                "rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr",
                "o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk",
                "hrvh efqvjilibdqxjlpmanmogiossjyxepotezo",
                "qstd zui nbbohtuk",
                "qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"
        };

        System.out.println(mostWordsFound(x));
    }

    public static int mostWordsFound(String[] sentences) {
        int count = 0, maxCount = 0;
        for (int i = 0; i < sentences.length; i++) {
            count = 0;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    count++;
                }
            }
            System.out.print(count + " ");
            System.out.println(maxCount);
            if (count >= maxCount) {
                maxCount = count;
            }
        }
        return (maxCount + 1);
    }
}