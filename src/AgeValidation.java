import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        Scanner SC= new Scanner (System.in);
        System.out.println("Ingresa tu edad:");
        int age= SC.nextInt();
        final int AGE_LIMIT=18;
        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        }
        else if (age < AGE_LIMIT) {
            System.out.println("your are minor age");
        }
        else{
            System.out.println ("acess denied");
        }
    }
}
