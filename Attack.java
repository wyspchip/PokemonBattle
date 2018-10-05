
/**
 * Pokemon attack.  Contains attack min, max, type
 *
 * @author (Mr. Kim)
 * @version (10-04-2018)
 */
public class Attack
{
    // instance variables
    // Min and Max attack strength
    private int min;
    private int max;
    
    // Attack Type here

    /**
     * Constructor for objects of class Attack
     */
    public Attack()
    {

    }

    /**
     * Calculate attack Strength
     *
     * @param     a sample parameter for a method
     * @return    the sum of x and y
     */
    public int calcAttackStrength()
    {
        // put your code here
        int range = max-min+1;
        int strength = (int)(range*Math.random())+min;
        return strength;
    }
}
