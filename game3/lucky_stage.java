import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class lucky_stage extends World
{
    private int returnHp;
    private int returnCount;

    public lucky_stage(int hp,int Count)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground("lucky.png");
        this.returnHp =hp;
        this.returnCount =Count;
    }
}
