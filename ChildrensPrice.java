/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swerefactoringhomework;

/**
 *
 * @author MarcelB
 */
public class ChildrensPrice extends Price
{

    @Override
    public int getPriceCode()
    {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented)
    {
        double result = 1.5;
        if (daysRented > 3)
        {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}
