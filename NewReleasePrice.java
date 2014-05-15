/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swerefactoringhomework;

/**
 *
 * @author MarcelB
 */
public class NewReleasePrice extends Price
{
    @Override
    public int getPriceCode()
    {
        return Movie.NEW_RELEASE;
    }
    
    @Override
    public double getCharge(int daysRented)
    {
        double result = daysRented * 3;
        return result;
    }
    
    @Override
    public int getFrequentRenterPoints(int daysRented)
    {
        int frequentRenterPoints = 1;
        if (daysRented > 1)
        {
            return 2;
        }
        return frequentRenterPoints;
    }
}
