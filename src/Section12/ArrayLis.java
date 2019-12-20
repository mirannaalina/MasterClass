package Section12;

import java.util.ArrayList;

public class ArrayLis {


    static ArrayList<String> groceryList = new ArrayList<>();

    public static void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public static void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items");

        for(int i =0; i<groceryList.size();i++){
            System.out.println((i+1) +  " ." + groceryList.get(i));
        }
    }

    public static void modifyGroceryItem(int position,String newItem ){
        groceryList.set(position,newItem);
    }

    public static void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }

    public static String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if(position>=0){
            return groceryList.get(position);
        }

        return null;
    }


}

