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
<<<<<<< HEAD
        showText( "Spaceを押してスタート", 450, 450 ); 
    }
        public void act()
    {
        if (Greenfoot.isKeyDown("space") && !taroAdded)
        {
            addObject(new Taro(), 300, 400); // 座標(300, 400)にTaroオブジェクトを追加
            taroAdded = true; // フラグを立てて、二度追加されないようにする
        }
=======
        showText( "Spaceを押してスタート", 450, 450 );

        
        addObject( new status_bw_heart(), 70, 50 );//ステータス表示
        addObject( new status_heart(), 200, 50 );
        addObject( new status_heart(), 330, 50 );

        showText( "1", 300, 50 );

>>>>>>> 25808b116ac6bedfc976c7c9b4d62957c92c0baf
    }
}

