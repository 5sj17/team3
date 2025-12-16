import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Huki2 extends Actor
{
    // specialImageとimageDisplayedをクラスのフィールドとして宣言します。

    public Huki2()
    {
        GreenfootImage img = new GreenfootImage("huki2.png");
        int newWidth = img.getWidth() / 2;
        int newHeight = img.getHeight() / 2;
        img.scale(newWidth, newHeight);
        setImage(img);
    }       
}
