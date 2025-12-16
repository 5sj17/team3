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
    private boolean RAdded = false;
    private GreenfootImage yaji;
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
            addObject(new Taro(), 150, 400); 
            taroAdded = true; // 二度追加されないようにする
        }
        if (Greenfoot.isKeyDown("space"))
        {
            showText( "", 450, 300 );
            showText( "", 450, 450 ); 
        }
        if (Greenfoot.isKeyDown("space") && !RAdded)
        {
            addObject(new yaji(), 720, 100); 
            addObject(new R(), 600, 100); 
            RAdded = true; // 二度追加されないようにする
        }

        addObject( new status_bw_heart(), 70, 50 );//ステータス表示
        addObject( new status_heart(), 200, 50 );
        addObject( new status_heart(), 330, 50 );
    }
}

