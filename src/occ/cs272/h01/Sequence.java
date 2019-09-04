/**
 * CS 272 - Fall 2019
 * H01-Sequence.java
 */
package occ.cs272.h01;

/**
 * @author <jjang12>
 * @version <9/3/2019>
 *
 */
public class Sequence
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "jjang12";
    public static final String ASSIGNMENT = "H01-D";
    
    private int[] array;
    
    /**
     * Constructs a sequence of integers.
     * @param array the array to initialize the sequence.
     */
    public Sequence(int[] array)
    {
        this.array = array.clone();
    }
    
    // TODO: Write the three versions of slice() here
    
    public Sequence slice(int start)
    {
        int s = (start < 0) ? start + array.length : start; 
    	int n = array.length - s;
    	int[] a = new int[n];
    	for (int i = 0; i < n; ++i)
    	    a[i] = array[s + i];
    	return new Sequence(a);
    }
    
    public Sequence slice(int start, int end)
    {
        int s = (start < 0) ? start + array.length : start;
        int e = (end < 0) ? end + array.length : end;
    	int n = e - s;
    	int[] a = new int[n];
    	for (int i = 0; i < n; ++i)
            a[i] = array[s + i];
    	return new Sequence(a);
    }
    
    public Sequence slice(int start, int end, int step)
    {
        int s = (start < 0) ? start + array.length : start;
        int e = (end < 0) ? end + array.length : end;
        int n = e - s;
        int[] a = new int[n / Math.abs(step)];
        for (int i = 0; i < n; i += step)
            a[i] = array[s + i];
        return new Sequence(a);
    }  
    
    
    @Override
    public String toString()
    {
        String result = "{";
        if (array.length > 0)
        {
            result += array[0];
            for (int i = 1; i < array.length; i++)
            {
                result += ", " + array[i];
            }
        }
        return result + "}";
    }
    
    public static void main(String[] args)
    {
        Sequence a = new Sequence(new int[]{1, 2, 3, 4, 5});
        // some informal testing
        System.out.println("a.slice(0)->" + a.slice(0));
//        System.out.println("a.slice(1)->" + a.slice(1));
//        System.out.println("a.slice(-1)->" + a.slice(-1));
//        System.out.println("a.slice(-2)->" + a.slice(-2));
//        System.out.println("a.slice(5)->" + a.slice(5));
//        System.out.println("a.slice(-5)->" + a.slice(-5));
//        System.out.println("a.slice(0, 5, 2)->" + a.slice(0, 5, 2));
//        System.out.println("a.slice(1, 5, 2)->" + a.slice(1, 5, 2));
//        System.out.println("a.slice(1, 5, 3)->" + a.slice(1, 5, 3));
//        System.out.println("a.slice(2, 5, 3)->" + a.slice(2, 5, 3));
//        System.out.println("a.slice(-1, -6, -1)->" + a.slice(-1, -6, -1));
    }
}
