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
    private GreenfootImage baseImg;
    private boolean imageDisplayed = false;

    /**
     * コンストラクタ: Taroクラスのオブジェクトが作成されるときに一度だけ実行されます。
     */
    public Taro() {
        baseImg = new GreenfootImage("hair_skinhead_megane.png");
        baseImg.scale(250,250);   // ←  最初から縮小しておく
        setImage(baseImg);        // ← 初期表示も正しい大きさになる
    }
    /**
     * Act - do whatever the Taro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {        
        if( Greenfoot.isKeyDown( "space" ) ){
            getWorld().showText( "", 450, 300 );
            getWorld().showText( "", 450, 450 );
        }
        // スペースキーが押されたか、かつまだ画像が表示されていないかを確認
        if (Greenfoot.isKeyDown("space") && !imageDisplayed)
        {
            setImage(baseImg); // 画像をセットして表示
            imageDisplayed = true; // 画像が表示されたことを記録
        } 
    }    
}
