public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(new LengthOfLastWord().lengthOfLastWord(s));
    }
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        int count = 0;

        while (s.charAt(index) == ' ') {
            index--;
        }
        while (s.charAt(index) != ' ') {
            index--;
            count++;
        }
        return count;
    }
}
