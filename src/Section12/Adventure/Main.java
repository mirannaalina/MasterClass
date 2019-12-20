package Section12.Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        locations.put(0,new Location(0,"bla bla bla"));
        locations.put(1,new Location(1,"bla bla bla"));
        locations.put(2,new Location(2,"bla bla bla"));
        locations.put(3,new Location(3,"bla bla bla"));

        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);
        locations.get(1).addExit("Q",20);

        int loc =1;

        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc==0){
                break;
            }

            loc=sc.nextInt();
            if(!locations.containsKey(loc)){
                System.out.println("you cannot go there");
            }
        }
    }
}
