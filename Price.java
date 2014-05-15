/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swerefactoringhomework;

/**
 *
 * @author MarcelB
 */
public abstract class Price
{
    public abstract int getPriceCode();
    
    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented)
    {
        int frequentRenterPoints = 1;
        return frequentRenterPoints;
    }
}
