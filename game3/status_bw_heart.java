import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class status_bw_heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class status_bw_heart extends Actor
{
    /**
     * Act - do whatever the status_bw_heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public status_bw_heart()
    {
        // 現在の画像を取得
        GreenfootImage image = getImage();
        
        image.scale(100,100);
        
        // サイズ変更した画像をセットする
        setImage(image);
    } 
    
    public void act() 
    {
        // Add your action code here.
        
    }    
}
