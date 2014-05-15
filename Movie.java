package swerefactoringhomework;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }
    
    public double getCharge(int daysRented)
    {
        double thisAmount = 0;
        switch (getPriceCode())
        {
            case Movie.REGULAR:
                thisAmount += 2;
                if (daysRented > 2)
                {
                    thisAmount += (daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (daysRented > 3)
                {
                    thisAmount += (daysRented - 3) * 1.5;
                }
                break;
        }
        return thisAmount;
    }
    
    public int getFrequentRenterPoints(int daysRented)
    {
        int frequentRenterPoints = 0;
        
        frequentRenterPoints++;
        if ((priceCode == Movie.NEW_RELEASE) && daysRented > 1)
        {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
    
    
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle (){
        return title;
    };
}