//create a class called calculator. This is the blueprint of the object
class Calculator {

    //There can be properties of the object. They create as properties.
    //This is a method (behavior) of the object. There can be many objects.
    public int add(int a, int b){
        return a+b;
    }
}

class Computer {

    public void playMusic(){
        System.out.println("Playing music...");
    }

    public String getPen(int cost){
        if(cost > 10)
            return "Here is yr pen..";

        return "Money not enough";
    }
}

public class Main {
    public static void main(String[] args) {

        int x = 10, y = 8, result;

        Calculator calc = new Calculator(); //creating new object using new keyword and pre-defined blueprint

        result = calc.add(x, y); //calling the function through created object
        //the result variable will catch the value that return by method
        System.out.println(result);

        Computer obj = new Computer();

        obj.playMusic();
        String pen = obj.getPen(12);
        System.out.println(pen);
    }
}
