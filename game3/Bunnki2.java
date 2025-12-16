import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bunnki2 extends Actor
{
    // specialImageとimageDisplayedをクラスのフィールドとして宣言します。
    private GreenfootImage specialImage;
    private boolean imageDisplayed = false;
    public Bunnki2()
    {
        // 画像の読み込みとリサイズはコンストラクタで行います。
        specialImage = new GreenfootImage("分岐2.png");
        specialImage.scale(specialImage.getWidth() / 2, specialImage.getHeight() / 2);
 
        // 最初は画像をセットしないため、非表示になります。
        // または、透明な画像をセットする方法もありますが、この方法では画像がセットされない状態になります。
    }
        public void act() 
    {
        // スペースキーが押されたか、かつまだ画像が表示されていないかを確認
        if (Greenfoot.isKeyDown("space") && !imageDisplayed)
        {
            setImage(specialImage); // 画像をセットして表示
            imageDisplayed = true; // 画像が表示されたことを記録
        } 
    }        
}