public class ReferrencingOneObjectFromOther {
    public static void main(String[] args) {
        System.out.println("hello world");
        Student one = new Student(19, "Devashish");
        one.intro();
        Student two = one;
        two.name = "serene";
        one.intro();
        two.intro();
    }
}
class Student {
    int age;
    String name;
    void intro() {
        System.out.println("My name is " + this.name);
    }
    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}