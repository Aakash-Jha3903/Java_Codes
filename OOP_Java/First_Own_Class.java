package OOP_Java;

class Employee {
    int id = 5;
    String name = "Java";
    int salary = 150;

    // void showDetails() {
    public void showDetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class First_Own_Class {
    public static void main(String[] args) {
        Employee aj = new Employee(); // Instantiation of a new Employee object

        // aj.id = 1;
        // aj.name="Aakash Jha";
        aj.salary = 10000000;
        aj.showDetails();

        int money = aj.getSalary();
        System.out.println("My salary is  " + money);

        Employee emp = new Employee();
        emp.id = 7;
        emp.name = "Raju";      // "Raju" is also saved in emp.name  
        emp.getClass();
        int pay = emp.getSalary();
        System.out.println(emp.name + "salary is  " + pay);

    }

}
