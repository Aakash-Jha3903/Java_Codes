package OOP_Java;
import java.util.Scanner;

class A {
    public int a;

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void printA() {
        System.out.println("i am printA()");
    }

    public void method1() {
        System.out.println("i am method1 of class A");

    }

    public void method2() {
        System.out.println("i am method2 of class A");

    }
}

class ClassB extends A {
    @Override  // now it cleared that this method is SURELY Overrided------------
    public void method2() {  
     // Overriding(same name && list of arguments && public-to-public only && static and final are not overrided) : gives priority to itself methods **************
        System.out.println("i am method2 of class B");
    }

    public void method3() {
        System.out.println("i am method3 of class B");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        System.out.println("Method_Overriding : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of q :");
        int q = sc.nextInt();
        switch (q) {
            case 1:
                A obja = new A();
                obja.setA(99);
                System.out.println(obja.getA());
                obja.printA();

            case 2:
                ClassB b = new ClassB();
                b.method1();
                b.method2();
                b.method3();

        }
    }

}
