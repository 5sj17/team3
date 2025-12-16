import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Huki1 extends Actor
{
    // specialImageとimageDisplayedをクラスのフィールドとして宣言します。

    public Huki1()
    {
        GreenfootImage img = new GreenfootImage("huki1.png");
        int newWidth = img.getWidth() / 2;
        int newHeight = img.getHeight() / 2;
        img.scale(newWidth, newHeight);
        setImage(img);
    }       
}
