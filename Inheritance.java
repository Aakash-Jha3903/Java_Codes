import java.util.Scanner;

class Base {
    int x;

    Base() {
        System.out.println("I am Base class constructor");
    }

    Base(int a) {
        System.out.println("I am Base class overloaded constructor with value is " + a);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMeBase() {
        System.out.println("print() : i am contructor of Base ");
    }
}

class Derived extends Base {
    int y;

    Derived() {
        System.out.println("i am  Derived class contructor ");
    }
    
    Derived(int b) {
        super(99);      // writen in constructor
        System.out.println("i am Overloaded contructor of Derived class with value of  " + b);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printMe() {
        System.out.println("print() :  i am contructor of derived ");
    }

}

class GrandChild extends Derived{
    int z;

    GrandChild() {
        super(108);      // writen in constructor
        System.out.println("i am GrandChild class contructor  ");
    }

    GrandChild(int c) {
        System.out.println("i am Overloaded contructor of GrandChild class with value of  " + c);
    }

    public int getZ() {     // setters and getters
        return z;
    }

    public void setZ(int z) {   // setters and getters
        this.z = z;
    }

    public void GrandprintMe() {
        System.out.println("print() : i am contructor of GrandChild ");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");

        int q = sc.nextInt();
        switch (q) {
            case 1:

                // Pure base class properties
                Base b = new Base();
                b.setX(5);
                System.out.println("Value in getX "+b.getX());
                b.printMeBase();
                break;

            case 2:
                // pure derived class properties
                Derived d = new Derived();
                d.setY(9);
                System.out.println("Value in getY "+d.getY());
                d.printMe();
                break;

            case 3:
                // Base + Derived classes properties using Derived classes
                Derived bd = new Derived();
                bd.setX(55);
                System.out.println("Value in getX by derived "+bd.getX());
                bd.printMeBase();
                break;
                
            case 4:
                GrandChild g = new GrandChild();
                g.setZ(3);
                System.out.println("Value in getZ by GrandChild "+g.getX());
                g.GrandprintMe();
                break;

        }
    }

}
