package Section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {

    public static void main(String[] args) {
        // int x=10;
        // int y=0;
        // System.out.println(divideBYL(x,y));
        // System.out.println(divideEAFP(x,y));
        // System.out.println(divide(x,y));

        int x = getIntEAFP();
        System.out.println("x is" + x);


    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();

    }

    private static int getIntEAFP() {
        Scanner s = new Scanner((System.in));
        System.out.println("Please enter an integer");
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    private static int getIntBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter a integer ");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = true;
                break;
            }
        }
        return 0;
    }



    private static int divideBYL(int x, int y){

        if(y!=0){
            return x/y;
        }else{
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try{
            return x/y;
        }catch (ArithmeticException e){
            return 0;
        }
    }
    private static int divide(int x, int y){
        return x/y;
    }
}
