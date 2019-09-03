/**
 * CS 272 - Fall 2019
 * H01-RoachPopulation.java
 */
package occ.cs272.h01;

/**
 * @author <jjang12>
 * @version <9/3/2019>
 *
 */
public class RoachPopulation
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "jjang12";
    public static final String ASSIGNMENT = "H01-A";

    // TODO: Complete the RoachPopulation class
    private int population;
    
    public RoachPopulation()
    {
    	population = 0;
    }
    
    public RoachPopulation(int initialSize)
    {
    	population = initialSize;
    }
    
    public void breed()
    {
    	population *= 2;
    }
    
    public void spray()
    {
    	population -= (int)(population * 0.1);
    }
    
    public int getRoaches()
    {
        return population;
    }
    
    
}
