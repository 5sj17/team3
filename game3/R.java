import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class R here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class R extends Actor
{
    /**
     * Act - do whatever the R wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage img;
    
    public R() {
        GreenfootImage img = new GreenfootImage("publicdomainq-0007601btydle.png");
        img.scale(150, 150);  // 50×50 ピクセルに縮小
        setImage(img);
    }
    
    public void act() {
    if (Greenfoot.isKeyDown( "space" )) {
        while(true){
            turn(10);
        }    
    }
}
}
