import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class yaji extends Actor
{
    private GreenfootImage baseImg;
    
    public yaji() {
        baseImg = new GreenfootImage("yajirusi.png");
        baseImg.scale(100,100);   // ←  最初から縮小しておく
        setImage(baseImg);        // ← 初期表示も正しい大きさになる
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
