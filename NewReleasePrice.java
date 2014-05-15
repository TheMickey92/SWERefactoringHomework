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
    int getPriceCode()
    {
        return Movie.NEW_RELEASE;
    }
    
}
