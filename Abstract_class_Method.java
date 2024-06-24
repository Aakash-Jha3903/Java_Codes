//  https://www.codewithharry.com/videos/java-tutorials-for-beginners-53/

// Abstract method : 
//  -->  An abstract class cannot be instantiated(abstract class ka object create nahi hota !).
//  -->  Java requires us to "extend" it if we want to access it.
//  -->  It can include abstract and non-abstract methods.
//  -->  If a class includes abstract methods, then the class itself must be declared abstract.

//  -->  A method that is declared without implementation is known as the abstract method. ( definition )
//  -->  An abstract method can only be used inside an abstract class.
//  -->  The body of the abstract method is provided by the class that inherits the abstract class in which the abstract method is present.

//  -->  Abstract class are used when we want to achieve security & abstraction(hide certain details & show only necessary details to the user).

abstract class Parent {
    public Parent() {
        System.out.println("mai parent ka constructor hu ");

    }

    public void sayNamaste() {
        System.out.println("Namaste Ji");
    }

    abstract public void greet1();

    abstract public void greet2();
}

// abstract nahi likha gaya hai, class ke pehle !
class Child extends Parent {
    @Override
    public void greet1() {
        System.out.println("Good morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}

abstract class Children extends Child {
    public void th() {
        System.out.println("I am good");
    }
}

public class Abstract_class_Method {
    public static void main(String[] args) {
        // abstract class ka object create nahi hota !
        // Parent p = new Parent(); //-- error
        Child c = new Child();
        // Children c3 = new Children(); //-- error

        c.sayNamaste();
        c.greet1();
        c.greet2();
        c.greet2();
    }
}