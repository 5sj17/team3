import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Taro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Taro extends Actor
{
    // specialImageとimageDisplayedをクラスのフィールドとして宣言します。
    private GreenfootImage specialImage;
    private boolean imageDisplayed = false;

    /**
     * コンストラクタ: Taroクラスのオブジェクトが作成されるときに一度だけ実行されます。
     */
    public Taro()
    {
        // 画像の読み込みとリサイズはコンストラクタで行います。
        specialImage = new GreenfootImage("hair_skinhead_megane.png");
        specialImage.scale(specialImage.getWidth() / 2, specialImage.getHeight() / 2);

        // 最初は画像をセットしないため、非表示になります。
        // または、透明な画像をセットする方法もありますが、この方法では画像がセットされない状態になります。
    }

    /**
     * Act - do whatever the Taro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {        
        if( Greenfoot.isKeyDown( "space" ) ){
            getWorld().showText( "", 450, 450 );
        }
        // スペースキーが押されたか、かつまだ画像が表示されていないかを確認
        if (Greenfoot.isKeyDown("space") && !imageDisplayed)
        {
            setImage(specialImage); // 画像をセットして表示
            imageDisplayed = true; // 画像が表示されたことを記録
        } 
    }    
}
