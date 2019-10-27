package Section8;


import java.util.Scanner;

public class ArrayChallenge {

    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int [] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

    public static int[] getIntegers(int numbers){

        int [] values = new int [numbers];

        for(int i =0;i<values.length;i++){
            values[i] = sc.nextInt();
        }
        //return an array get from keyboard
        return values;
    }

    public static void printArray(int []array){
        //prints de elem of the array

        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }

    }
    public static int[] sortIntegers(int []array){

        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;

        while(flag){
            flag =false;
            for(int i =0; i<sortedArray.length;i++){
                if(sortedArray[i] <sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] =temp;
                    flag =true;
                }
            }
        }
        return sortedArray;
    }




}
