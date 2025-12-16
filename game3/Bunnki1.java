import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bunnki1 extends Actor
{
    // specialImageとimageDisplayedをクラスのフィールドとして宣言します。
    private boolean imageDisplayed = false;
    private GreenfootImage baseImg;
    public Bunnki1()
    {
        baseImg = new GreenfootImage("分岐1.png");
        baseImg.scale(800,650);   // ←  最初から縮小しておく
        setImage(baseImg);        // ← 初期表示も正しい大きさになる
    }
        public void act() 
    {
        // スペースキーが押されたか、かつまだ画像が表示されていないかを確認
        if (Greenfoot.isKeyDown("space") && !imageDisplayed)
        {
            setImage(baseImg); // 画像をセットして表示
            imageDisplayed = true; // 画像が表示されたことを記録
        } 
    }        
}