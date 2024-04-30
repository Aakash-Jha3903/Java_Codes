package OOP_Java;

class Employee {
    private int id;
    private String name;

    public void setName(String n) {
        this.name = n;
        // name = n; // also worked for seting the name
    }

    public void setId(int i) {
        this.id = i;
        // id = i; // also worked for seting the id
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

}

public class Private_Access_Modifiers {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // emp.id = 1;
        // emp.name = "Babu";

        emp.setName("Bauua");
        emp.setId(7);
        System.out.println(emp.getName());
        System.out.println(emp.getID());

    }

}
