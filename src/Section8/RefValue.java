package Section8;

import java.util.Arrays;

public class RefValue {
    public static void main(String[] args) {
        int myintvalue = 9;
        int anotherintvalue = myintvalue;

        System.out.println(myintvalue);
        System.out.println(anotherintvalue);

        anotherintvalue++;//se schimba doar a doua variabila, pt ca nu depinde de nimeni

        System.out.println(myintvalue);
        System.out.println(anotherintvalue);

        int[] myintarray = new int[5];//when you use new, a different array will be created.
        int[] anotherarray = myintarray; //another reference to the same array

        System.out.println("my int array" + Arrays.toString(myintarray));
        System.out.println("another array " + Arrays.toString(anotherarray));


        anotherarray[0] = 1;

        anotherarray = new int[]{ 4,5,6,7,8};
        modifyArray(myintarray);

        System.out.println(Arrays.toString(myintarray));
        System.out.println(Arrays.toString(anotherarray));//se modifica amandoua pt ca refera la acelasi array



    }

    private static void modifyArray(int[] array){
        array[0] =2;

        array =  new int[] {1,2,3,4,5};

    }
}
