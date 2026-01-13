import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bunnki2 extends Actor
{
    // specialImageとimageDisplayedをクラスのフィールドとして宣言します。
    private boolean imageDisplayed = false;
    private GreenfootImage baseImg;
    public Bunnki2()
    {
        baseImg = new GreenfootImage("分岐2.png");
        baseImg.scale(600,450);   // ←  最初から縮小しておく
        setImage(baseImg);        // ← 初期表示も正しい大きさになる
    }
}