public class Main {
    public static void main(String[] args) {

        //declare variables with data types
        int a = 3;
        long c = 3334678954342132131l;
        double x = 32.84537;
        float y = 32.84537f;
        char ch = 'C';
        boolean cond = true;
        String str = "Hello";
        //System.out.println(c);

        int num1 = 10, num2 = 8, num3 = 6, result;
        //if else statement
        if(num1 > num2 && num1 > num3){
            System.out.println(num1);
        }else if(num2 > num3){
            System.out.println(num2);
            }else {
            System.out.println(num3);
        }

        //ternary operator
        result = (num1 > num2)?((num1 > num3)?num1:num3):((num2 > num3)?num2:num3);
        System.out.println(result);

        //switch statement
        String n = "Sunday";
        int m = 1, Result, Result2;

        //old switch
        switch (m){
            case 1:
                System.out.println("One");break;
            case 2:
                System.out.println("Two");break;
            default:
                System.out.println("None");
        }

        //updated switch
        //can use strings
        switch (n){
            case "Monday", "Sunday" -> //work for two conditions
                System.out.println("Monday");
            case "Tuesday" -> //with arrow key except colon, don't need to put break.
                System.out.println("Tuesday");
            case "Wednesday" ->
                System.out.println("Wednesday");
            case "Thursday" ->
                System.out.println("Thursday");
            case "Friday" ->
                System.out.println("Friday");
            case "Saturday" ->
                System.out.println("Saturday");
        }

        //switch statement can return values
        Result = switch (m){
            case 1 -> 2; //this returning value 2 will get by the variable Result
            case 2 -> 3;
            default -> 0;
        }; //must end with a semicolon

        System.out.println(Result);

        Result2 = switch (m){
            case 1: yield  2; //if use colon except arrow, must use 'yield' keyword to return value
            case 2: yield 3;
            default: yield 0;
        };

        System.out.println(Result2);

        //loops
        //while loop
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        //do while loop
        do {
            System.out.println(i);
            i++;
        }while (i <= 20);

        //for loop
        for(int j = 0; j < 10; j++){
            System.out.println(j+1);
        }
    }
}
