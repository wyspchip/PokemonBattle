/**
 *  This is an amazing program that will win me lots of money
 */

class Pokemon
{
    /**
     * Used for attacking
     */
    private int health;
    private int attack;
    
    private Attack myAttack;
    
    public Pokemon()
    {
        this.health = 100;
        this.attack = 10;
    }
    
    public Pokemon(int health, int attack)
    {
        this.health = health;
        this.attack = attack;
    }
    
    /**
     * Accessors and Mutators
     */
    
    public int getHealth()
    {
        return health;
    }
    
    public void setHealth( int health)
    {
        this.health = health;
    }
    
    public int getAttack()
    {
        return attack;
    }
    
    public void setAttack( int attack )
    {
        this.attack = attack;
    }
    
    
    public void damaged(int attack)
    {
        health -= attack;
        // You can also use
        // this.health -= attack but there is only one health so there is no
        // ambiguity
    }
    
    
}





