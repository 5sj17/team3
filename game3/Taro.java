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
        GreenfootImage Taro = getImage(); // 現在の画像を取得
        int newWidth = Taro.getWidth() / 2; // 幅を半分に計算
        int newHeight = Taro.getHeight() / 2; // 高さを半分に計算
        Taro.scale(newWidth, newHeight); // 新しいサイズにスケール
        setImage(Taro); // スケールした画像をセット
    }    
}
