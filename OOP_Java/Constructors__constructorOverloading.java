package OOP_Java;
class MyEmployee {
    int id;
    String name;

    public MyEmployee() {   //constructor
        this.id = 5;
        this.name = "aj";
    }

    public MyEmployee(int myid) {
        id = myid;
    }

    public MyEmployee(String myname) {
        name = myname;
    }

    public MyEmployee(int myid, String myname) {
        this.id = myid;
        this.name = myname;
    }

}

public class Constructors__constructorOverloading {
    public static void main(String[] args){

        MyEmployee emp_n = new MyEmployee("babu"); //wrong in single quotes->'babu'
        MyEmployee emp_id__= new MyEmployee(9);
        MyEmployee emp = new MyEmployee();
        MyEmployee emp_all = new MyEmployee(12,"Abhi");

        System.out.println(emp_n.id);
        System.out.println(emp_n.name);

        System.out.println(emp_id__.id);
        System.out.println(emp_id__.name);

        System.out.println(emp.id);
        System.out.println(emp.name);

        System.out.println(emp_all.id);
        System.out.println(emp_all.name);
    }

}
