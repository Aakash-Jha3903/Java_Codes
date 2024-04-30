package OOP_Java;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    int salary;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void DispalyDetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + getName());
        System.out.println("My salary is " + getSalary());
        // System.out.println("My salary is " + Employee.getSalary()); //Cannot make a
        // static reference to the non-static method getSalary() from the type Employee
    }

    public void setName(String n) {
        name = n;
    }

}

class CellPhone {
    public void ring() {
        System.out.println("Ringing........");
    }

    public void Vibrate() {
        System.out.println("Vibrating..........");
    }
}

class Square {
    float side;
    float area;
    float perimeter;
    // float area = side * side; // not valid !!
    // float perimeter = 4 * side; // not valid !!

    public void area() {
        area = side * side;
        System.out.println("Area is " + area);
    }

    public float perimeter() {
        perimeter = 4 * side;
        return perimeter;
    }
}

class Game {
    public void hit() {
        System.out.println("Hitting the enemy ........");
    }

    public void running() {
        System.out.println("Running towards the enemy........");
    }

    public void fire() {
        System.out.println("Firing on the enemy ........");
    }
}

public class CH_8_Practice_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the question number : ");
        int q = sc.nextInt();

        switch (q) {
            case 1:
                Employee emp = new Employee();
                emp.id = 1;
                emp.name = "Shivam";
                emp.salary = 150;
                emp.DispalyDetails();
                // int money = emp.getSalary();

                System.out.print("Enter the new name : ");
                String newName = sc.nextLine();
                emp.setName(newName);

                System.out.print(emp.getName());

            case 2:
                CellPhone cell = new CellPhone();
                cell.ring();
                cell.Vibrate();

            case 3:
                Square s = new Square();
                s.side = 5;
                s.area();
                System.out.println(s.perimeter());

            case 4:
                Game g = new Game();
                g.running();
                g.hit();
                g.fire();
        }

    }
}
