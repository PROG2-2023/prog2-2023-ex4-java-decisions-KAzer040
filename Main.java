package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.util.Scanner;

public class Main 
{
    public static void main( String[] args )
    {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your full name:");
        String name = input.nextLine();

        System.out.println("Now, please enter your departure date as YYYY-MM-DD:");
        String sdepart = input.nextLine();
        LocalDate depart = LocalDate.parse(sdepart);

        System.out.println("Now, please enter your return date as YYYY-MM-DD:");
        String sreturn = input.nextLine();
        LocalDate returnDate = LocalDate.parse(sreturn);
        
        System.out.println("How many children as passengers. Enter 0 if none: ");
        int children = input.nextInt();

        System.out.println("How many adults as passengers: ");
        int adults = input.nextInt();

        FlightBooking flightbooking = new FlightBooking(name, depart, returnDate, children, adults);

        flightbooking.setTotalPassengers(children, adults);
        flightbooking.setFlightID(name);
        flightbooking.setTicketNumber(name);
        flightbooking.setDepartingDate(depart);
        flightbooking.setReturnDate(returnDate);
        flightbooking.setDepartingTicketPrice(children, adults);
        flightbooking.setReturnTicketPrice(children, adults);
        flightbooking.setTotalTicketPrice();
    
        System.out.println(flightbooking);
        
        input.close();
    }
}
