enum Status {
    Running, Failed, Pending, Success;
}

enum Laptop {
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    Laptop() {
        price = 500;
    }

    Laptop(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {

        //Using Status enum......

    Status s = Status.Success;
    //give all values as an array
    Status[] ss = Status.values();

    for(Status x : ss){
        System.out.println(x + " : "+ x.ordinal());
    }

    System.out.println(s);

    switch (s){
        case Running : System.out.println("All good"); break;
        case Failed : System.out.println("Try Again"); break;
        case Pending : System.out.println("Please wait"); break;
        default : System.out.println("Done");

        }

        System.out.println("..............................");
        //Using Laptop enum.......

        Laptop[] lap = Laptop.values(); //all values as an array

        for(Laptop x : lap){
            System.out.println(x + " : " + x.getPrice());
        }

        System.out.println("....after change value......");
        //can change the values using setter
        lap[0].setPrice(2300);

        for(Laptop x : lap){
            System.out.println(x + " : " + x.getPrice());
        }
    }
}
