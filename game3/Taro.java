import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Taro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taro extends Actor
{
    /**
     * Act - do whatever the Taro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {        
        if( Greenfoot.isKeyDown( "space" ) ){
        getWorld().showText( "", 450, 300 );
        getWorld().showText( "", 450, 450 );
}
    }    
}
