class BattleArena
{
    
    // a nice comment which I wrote
    public static void main(String[] args)
    {
        Pokemon  squirtle = new Pokemon(120,8);
        Pokemon  psyduck  = new Pokemon(200,5);
        
        System.out.println("squirtle health is "+squirtle.getHealth());
        System.out.println("psyduck health is "+psyduck.getHealth());
        
        System.out.println("squirtle attacks psyduck");
        psyduck.damaged( squirtle.getAttack() );
        System.out.println("psyduck attacks squirtle");
        squirtle.damaged( psyduck.getAttack() );
        
        System.out.println("squirtle health is "+squirtle.getHealth());
        System.out.println("psyduck health is "+psyduck.getHealth());
        
        
        
        
        
        
        
    }
}

