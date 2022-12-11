package PaperOutput;

class Person {
    public void talk() {
        System.out.println("I am a Person");
    }
}

class Student extends Person {
    public void talk() {
        System.out.println("I am Student");
    }
}

public class Test {
    public static void main(String[] args) {
        Person p = new Student();
        p.talk();
    }
}