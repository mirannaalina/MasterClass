package Section12;

import Section8.GroceryList;

import java.util.Scanner;

import static Section12.ArrayLis.groceryList;

public class MainArray {

    private static Scanner sc = new Scanner(System.in);
    private static GroceryList grocerylist = new GroceryList();

    public static void main(String[] args) {
        boolean quit= false;
        int choice =0;
        printInstructions();
        while(!quit){
            System.out.println("Enter choice ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0 :
                    printInstructions();
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("dsadsda");
        System.out.println("asdsadsad");
    }

    public static void addItem(){
        System.out.println("Please enter the grocer item: ");
        grocerylist.addGroceryItem(sc.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number : ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        System.out.println("enter replacement item : ");
        String newitem =  sc.nextLine();
        grocerylist.modifyGroceryItem(itemNo-1,newitem);
    }

    public static void removeItem(){
        System.out.println("Enter item nr : ");
        int itemNo = sc.nextInt();
        sc.nextLine();
       // groceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchForITem(){
        System.out.println("Item to search : ");
        String searchItem = sc.nextLine();
        //if(groceryList.findItem)
    }
}
