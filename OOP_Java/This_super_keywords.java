package OOP_Java;
// Ekclass constructor called with one  arguments
// 5
// Ekclass constructor called without arguments   // ye kyu aaraha hai ???
// Contructor of DusriClass with c= 30
// 0
//
//
class EkClass{
    int a;

    EkClass()
    {
        System.out.println("Ekclass constructor called without arguments");
    }
    EkClass(int a)
    {
        this.a=a;   // "this" keyword is used to solve the problem of same name( argument_name and object_variable_name )
        System.out.println("Ekclass constructor called with one  arguments");
    }
    EkClass(int a,int b)
    {
        System.out.println("Ekclass constructor called with two  arguments");
    }
    public int getA(){
        return a;
    }

}
    class DusriClass extends EkClass{
        int b;
        DusriClass()
        {
            System.out.println("Contructor of DusriClass without b");
        }
        DusriClass(int b)
        {
            System.out.println("Contructor of DusriClass with c= "+b);
        }
        public int getB(){
            return this.b;
        }
    }



public class This_super_keywords {
    public static void main(String[] args) {
        
        EkClass c= new EkClass(5);
        System.out.println(c.getA());

        DusriClass d = new DusriClass(30);
        System.out.println(d.getB());

    }
    
    
}
