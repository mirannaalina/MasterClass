package Section8;

import java.util.Arrays;

public class ReverseChallenge {

    public static void main(String[] args) {

        int [] arr =  {1,2,3,4};

        System.out.println("array "+ Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed array " +Arrays.toString(arr));
    }

    private static void reverse(int[]array){

        int maxIndex = array.length-1;
        int halflength = array.length /2;

        for(int i=0; i <halflength ;i++){
            int temp = array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;
            //System.out.println(array[i]);

        }

    }
}
