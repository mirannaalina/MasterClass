package Section14;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Readd {

    static{

        Scanner scanner = null;
        try{
            scanner = new Scanner(new FileReader("file.csv"));
            while(scanner.hasNextLine()){
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println(loc + description);
                Map< String, Integer > tempExit = new HashMap<>();
               // location.put(loc, new Location (loc,description,tempExit));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
