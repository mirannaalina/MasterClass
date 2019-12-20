package Section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exampl {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide(){
        int x=getInt();
        int y =getInt();
        System.out.println("x is "+ x +" y is "+ y);
        return x/y;
    }

    private static int getInt(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please enter an integer");

        while(true){
            try{
                return sc.nextInt();
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Please enter a number using only digits 0 to 9");
            }
        }
        //return sc.nextInt();
    }
}
