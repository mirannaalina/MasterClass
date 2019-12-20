package Section8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedLs {

    public static void main(String[] args) {



        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Darwin");

        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Darwin");

        visit(placesToVisit);


        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){

        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()){
            System.out.println("now visiting" + i.next());
        }
        System.out.println("=======================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison ==0){
                System.out.println(newCity+ " is already included as a destination");
                return false;
            }else if(comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison<0){

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner sc= new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("no cities in the itenerary");
            return;
        }else{
            System.out.println(" now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = sc.nextInt();
            sc.nextLine();
            switch (action){
                case 0 :
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(listIterator.hasNext()) {
                        System.out.println("now visiting " + listIterator.next());

                    }else {
                        System.out.println(" Reached the end of the list");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("now visiting " + listIterator.previous());

                    }else{
                        System.out.println("we are at the start of the list");
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("available actions:\n press");
        System.out.println("");
    }
}
