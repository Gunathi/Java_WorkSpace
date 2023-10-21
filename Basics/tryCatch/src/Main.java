public class Main {
    public static void main(String[] args) {


        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try{
            //Try to execute this block
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        } //If it fails, this blocks will execute.
        catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }

        //Therefore program won't stop executing.
        System.out.println(j);

        System.out.println("Bye");
    }
}