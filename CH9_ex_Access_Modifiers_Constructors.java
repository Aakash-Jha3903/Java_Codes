import java.util.Scanner;

import org.w3c.dom.css.Rect;

class Cylinder {
    int radius;
    int height;

    // Getters and setters for radius and height properties of Cylinder
    // object................
    public void setradius(int r) {
        radius = r;
    }

    public void setheight(int h) {
        height = h;
    }

    public int getheight() {
        return height;
    }

    public int getradius() {
        return radius;
    }

    public double surfaceArea() { // double *********
        return ((2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height));
    }

    public double volume() {
        return 3.14 * radius * radius * height;
    }

    // Constructors ......................
    public Cylinder(int r, int h) {
        this.radius = r;
        this.height = h;
    }

    // public Cylinder(int r) { // Constructors not implemented
    // radius = r;
    // }
    // public Cylinder(int h) {
    // this.height = h;
    // }
}

class Rectangle {
    int lenght;
    int breadth;

    // Constructors and constructor Overloading ................
    public Rectangle() {
        this.lenght = 4;
        this.breadth = 5;
    }

    public Rectangle(int l, int w) {
        this.lenght = l;
        this.breadth = w;
    }

    // Getters and setters for Rectangle ..........................
    public int getLenght() {
        return lenght;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLenght(int l) {
        lenght = l;
    }

    public void setBreadth(int w) {
        breadth = w;
    }

}

public class CH9_ex_Access_Modifiers_Constructors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the question : ");
        int q = sc.nextInt();
        switch (q) {
            case 1:
                Cylinder myCylinder = new Cylinder(2, 4);
                myCylinder.setradius(9);
                myCylinder.setheight(12);

                System.out.println(myCylinder.getheight());
                System.out.println(myCylinder.getradius());

            case 2:
                Cylinder c2 = new Cylinder(2, 4);
                c2.setradius(9);
                c2.setheight(12);
                System.out.println("Surface Area is " + c2.surfaceArea());
                System.out.println("Volume is " + c2.volume());

                case 3:
                Rectangle r = new Rectangle();
                System.out.println(r.getBreadth());

        }
    }
}
