import java.util.List;
import java.util.ArrayList;

public class SeatPlan {

    private List<Seat> seats = new ArrayList<Seat>();
    {
        seats.add(new Seat("42",false,CustomerClass.BUSINESS.getCustomer()));
        seats.add(new Seat("52",false,CustomerClass.BUSINESS.getCustomer()));
        seats.add(new Seat("62",true ,CustomerClass.BUSINESS.getCustomer()));
        seats.add(new Seat("43",false,CustomerClass.ECONOMIC.getCustomer()));
        seats.add(new Seat("45",true ,CustomerClass.ECONOMIC.getCustomer()));
    }

    public void setSeat(){
        for (int i = 0; i < 1; i++) {


        }
    }









}
