public class _04_Class_vs_Instance {

    int age;

    _04_Class_vs_Instance(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    void yearPasses() {
        this.age++;
    }

    void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else if (age >= 18) {
            System.out.println("You are old.");
        }
    }

    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        int T = read.nextInt();
        while (T-- > 0) {
            int age = read.nextInt();
            _04_Class_vs_Instance person = new _04_Class_vs_Instance(age);
            person.amIOld();
            for(int j = 0; j < 3; j++) {
                person.yearPasses();
            }
            person.amIOld();
            System.out.println();
        }
    }
}
