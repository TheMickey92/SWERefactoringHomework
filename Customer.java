package swerefactoringhomework;

import java.util.*;

class Customer
{

    private String name;
    private Vector rentals = new Vector();

    public Customer(String newname)
    {
        name = newname;
    }

    ;
    public void addRental(Rental arg)
    {
        rentals.addElement(arg);
    }

    ;
    public String getName()
    {
        return name;
    }

    ;
    public String statement()
    {
        Enumeration enum_rentals = rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements())
        {            
            Rental each = (Rental) enum_rentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }
    
    public String htmlStatement()
    {
        Enumeration enum_rentals = rentals.elements();
        String result = "<H1>Rental Record for <EM>" + this.getName() + "</EM><P>\n";
        
        while (enum_rentals.hasMoreElements())
        {            
            Rental each = (Rental) enum_rentals.nextElement();
            //show figures for this rental
            result += each.getMovie().getTitle() + ":" + String.valueOf(each.getCharge()) + "</BR>\n";
        }
        //add footer lines
        result += "<P>Amount owed is <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
        result += "You earned <EM>" + String.valueOf(getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
        return result;
    }
    
    private int getTotalFrequentRenterPoints()
    {
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();
        while (enum_rentals.hasMoreElements())
        {            
            Rental each = (Rental) enum_rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }
    
    private double getTotalCharge()
    {
        double totalCharge = 0;
        Enumeration enum_rentals = rentals.elements();
        while (enum_rentals.hasMoreElements())
        {            
            Rental each = (Rental) enum_rentals.nextElement();
            totalCharge += each.getCharge();
        }        
        return totalCharge;
    }
}
