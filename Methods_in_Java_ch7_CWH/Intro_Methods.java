// The line `package aj_Java_Code;` is declaring the package name for the Java class `Intro_Methods`.
// Packages in Java are used to organize classes into namespaces, making it easier to manage and
// maintain code. In this case, the class `Intro_Methods` is part of the `aj_Java_Code` package.


package Methods_in_Java_ch7_CWH;

public class Intro_Methods {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x * y;
        } else {
            z = x / y;
        }
        return z;
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 5;

        int c = logic(a, b);  // static method ke help se bina object banaye, call kar sakte hai(static, static ko call karta hai , bina object banaye) 

        // Intro_Methods obj = new Intro_Methods(); // Without static method, we can call it by creating a new instance   
        // int c = obj.logic(a,b);  // ????????????

        System.out.print("The value of c is " + c);

    }
}
