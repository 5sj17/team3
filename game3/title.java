import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class title extends Actor
{
    public title() 
    {
        GreenfootImage img = new GreenfootImage("taitol.png");
        img.scale(600, 600);
        setImage(img);
    }

    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            getWorld().removeObject(this);
        }
    }
}
