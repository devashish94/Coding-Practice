public class IDE_two extends hello {
    public static void main(String[] args) throws Exception {

        hello x = new hello() {
            @Override
            void hello() {
                super.hello();
            }
        };
        x.hello();
//        try {
//            d(5, 0);
//        }
//        catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("this code is shit");
//        }
    }
    int d(int a, int b) throws Exception {
        if (b == 0) {
            throw new ArithmeticException("yoyo welcome back to another video");
        }
        return a / b;
    }
}

abstract class hello {
    void hello() {
        System.out.println("hello");
    }
}