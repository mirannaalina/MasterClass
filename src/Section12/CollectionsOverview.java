package Section12;

import java.util.ArrayList;
import java.util.List;

public class CollectionsOverview {

    private String theatrename;
    private List<Seat> seats = new ArrayList<Seat>();



    public CollectionsOverview(String theatrename, int numRows, int seatsPerRow){
        this.theatrename =theatrename;

        int lastRow = 'A' + (numRows-1);
        for(char row = 'A';  row<= lastRow ; row++ ){
            for(int seatNum = 1 ;  seatNum <= seatsPerRow;seatNum++){
                //
                //
            }
        }
    }

}

class Seat implements Comparable<Seat>{
    private  String seatNumber;
    public Seat(String seatNumber){
        this.seatNumber= seatNumber;
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase((seat.seatNumber));
    }
}
