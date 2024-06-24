// aj : only parent ke methods run honge

package OOP_Java;
class Phone {
    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        // Phone obj = new Phone(); // Allowed
        // SmartPhone smobj = new SmartPhone(); // Allowed
        // obj.name();

        Phone obj = new SmartPhone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed XX

        obj.showTime();
        obj.on();   // Parent ka hi call hoga, as execution start from parent
        // obj.music(); //Not Allowed

    }

}