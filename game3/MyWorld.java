import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private boolean taroAdded = false;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(851, 567, 1); 
        showText( "サイコロクエスト", 450, 300 );
        showText( "Spaceを押してスタート", 450, 450 ); 
    }
        public void act()
    {
        if (Greenfoot.isKeyDown("space") && !taroAdded)
        {
            addObject(new Taro(), 300, 400); // 座標(300, 400)にTaroオブジェクトを追加
            taroAdded = true; // フラグを立てて、二度追加されないようにする
        }
    }
}
