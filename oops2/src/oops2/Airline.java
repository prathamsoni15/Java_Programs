package oops2;

public class Airline {
	
	  int row;
	  String seat;
	  
	  Airline (int row, String seat) {
	    this.row = row;
	    this.seat = seat;
	  }

}

class AirlineTicket {
	  String fromCity;
	  String toCity;
	  int flightNum;
	  Airline seat;
	  
	  AirlineTicket (String fromCity, String toCity, 
	                 int flightNum, Airline seat) {
	    this.fromCity = fromCity;
	    this.toCity = toCity;
	    this.flightNum = flightNum;
	    this.seat = seat;
	  }
	}


class Examples {
	  Examples() {}
	  
	  AirlineTicket ticketToRome = 
	    new AirlineTicket("Boston", "Rome", 56,
	                      new Airline(12, "A"));
}













