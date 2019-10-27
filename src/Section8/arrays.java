package Section8;

import java.util.Scanner;

public class arrays {

    private static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {



        int[] myintegers = getIntegers(5);

        for(int i=0;i<myintegers.length;i++){
            System.out.println("Element " +i + " typed value was "+ myintegers[i]);
        }

        int [] myintarray = new int[10];

        myintarray[5] =50;

        int [] myintarray2 ={1,2,3,4,4,5,5,4,3,4,3};

        double[] mydoublearray = new double[10];

        mydoublearray[5] = 10;

        System.out.println(mydoublearray[5]);
        System.out.println(myintarray2.length);

        for(int i =0;i<mydoublearray.length;i++){
            mydoublearray[i] =i*10;
            System.out.println(mydoublearray[i]);
        }
        printarray(myintarray);

    }

    public static void printarray( int[] array ){

        for(int i=0;i<array.length;i++){
            array[i] = i+10;
            System.out.println(i+ " " + array[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+ number+" values");
        int[] values = new int[number];

        for(int i=0;i<values.length;i++){
            values[i] = sc.nextInt();
        }
        return values;
    }


    public static double getaverage(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum / (double) array.length;
    }
}
