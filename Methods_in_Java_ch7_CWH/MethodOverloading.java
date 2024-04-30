// package aj_Java_Code;
// import aj_Java_Code.Methods_in_Java_ch7_CWH;
// pakage aj_Java_Code.Methods_in_Java_ch7_CWH;

pakage Methods_in_Java_ch7_CWH;
public class MethodOverloading {

    static void foo() {
        System.out.println("I am foo without argument. ");
    }

    static void foo(int a) {
        System.out.println("I am foo with one argument int a: " + a);
    }

    static void foo(int a, int b) {
        System.out.printf("I am foo with two argument int a: %d , int b: %d \n ", a, b);
    }

    public static void main(String args[]) {
        foo();
        foo(99);
        foo(10, 20);

    }

}
