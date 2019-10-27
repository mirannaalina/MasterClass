package Section8;

import java.util.ArrayList;

public class GroceryList {

    private int[] mynumbers= new int[70];

    private ArrayList<String> groceryList =new ArrayList<>();


    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("you have  " +groceryList.size() + " items in your grocery list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1 + " ." + groceryList.get(i) ));
        }
    }

    public void modifyGroceryItem (int position, String newitem){
        groceryList.set(position, newitem);
        System.out.println("grocery item "+ (position+1) + "has been modified");
    }

    //public void removeGrocery(int position)
}
