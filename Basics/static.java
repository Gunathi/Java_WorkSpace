
class Mobile {
    String brand; //instance variable
    int price;
    static String name; //this is common for all objects. use 'static' keyword to make it common

    //this is a static block that contains variables that static
    //this block calls only once when class is being called
    static {
        name = "Phone";
        System.out.println("Calling static block");
    }

    //this is the constructor
    //it initializes the values
    //when create an object, it initializes by these values.
    //constructor class calls everytime when new object creates
    public Mobile(){
        String brand = "";
        int price = 200;
        System.out.println("calling constructor");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    //create static method
    public static void show2(Mobile obj){
        //to access non static variables inside a static method we have to specify a particular object
        //it takes as a parameter 'Mobile obj'

        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone"; //call the attribute using class name, without using object name

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        obj1.show();
        obj2.show();

        Mobile.show2(obj1); //calling static method

        //Because there are two objects it calls the constructor two times and static block only once
    //        Calling static block
    //        calling constructor
    //        calling constructor
    }
}
