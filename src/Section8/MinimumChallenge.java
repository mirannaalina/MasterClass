package Section8;

import java.util.Scanner;

public class MinimumChallenge {

    private static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {



        int count = sc. nextInt();
        sc.nextLine();

        int[] arr = readIntegers(count);

        int returnedMin =  findMin(arr);

        System.out.println(returnedMin);


    }

    public static int[] readIntegers(int count){
        //how many integers the user needs to enter

        int[] array = new int[count];

        for(int i=0;i<array.length;i++){
            System.out.println("Enter a number : ");
           int num = sc.nextInt();
           sc.nextLine();
           array[i] = num;
        }

        return array;
    }

    private static int findMin(int[]array){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length;i++){

            int value = array[i];
            if(value <min){
                min = value;
            }
        }

        return min;
    }
}
