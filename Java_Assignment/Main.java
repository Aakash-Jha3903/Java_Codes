/* Q7. Write declaration for a class person which has the following:
data members(name, phone), set and get functions for every data member, a display function a destructor
i) For the person class above write each of the constructor, the assignment operator, and the
getName member function. use member initialization lists as often as possible.
ii) Given the person class above write the declaration for a class spouse that inherits from person and
does the following : has an extra data member spouseName, redefines the display member
function
iii) For the spouse class above write each of the constructors and display the member function. use
member initialization lists as often as possible */

class Person {
    private String name;
    private String phone;
    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public Person(Person other) {
        this.name = other.name;
        this.phone = other.phone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }
}
class Spouse extends Person {
    private String spouseName;
    public Spouse(String name, String phone, String spouseName) {
        super(name, phone);
        this.spouseName = spouseName;
    }
    public Spouse(Spouse other) {
        super(other);
        this.spouseName = other.spouseName;
    }
    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }
    public String getSpouseName() {
        return spouseName;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Spouse Name: " + spouseName);
    }
}
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", "1234567890");
        person1.display();
        System.out.println();
        Spouse spouse1 = new Spouse("Bob", "0987654321", "Alice");
        spouse1.display();
        System.out.println();
        Spouse spouse2 = new Spouse(spouse1);
        spouse2.display();
    }
}