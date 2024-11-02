import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ImageIcon imageIconOne = null;

        try{
            int myArray[] = new int[5];

            // trying to access element 5
            System.out.println(myArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The element " + e.getMessage() + " does not exist!");
        }

        // ----------------------------------------------

        try{
            imageIconOne = new ImageIcon(Main.class.getResource("one.png"));
        }catch(NullPointerException e){
            System.out.println("Image one not found");
        }

        // ----------------------------------------------

        Scanner input = new Scanner(System.in);
        int value = 0;
        System.out.println("Please enter an integer");
        try {
            value = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer");
        }
    }
}