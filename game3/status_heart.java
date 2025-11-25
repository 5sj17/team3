import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class status_heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class status_heart extends Actor
{
    /**
     * Act - do whatever the status_heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void MyActor()
    {
       GreenfootImage image = getImage();
       int newWidth = image.getWidth() / 2; // 幅を半分に計算
       int newHeight = image.getHeight() / 2; // 高さを半分に計算
       image.scale(newWidth, newHeight); // 新しいサイズにスケール
       setImage(image); 
        
    }
    public void act() 
    {
       
    }    
}
