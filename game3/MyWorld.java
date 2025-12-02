import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

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

        
        addObject( new status_bw_heart(), 70, 50 );//ステータス表示
        addObject( new status_heart(), 200, 50 );
        addObject( new status_heart(), 330, 50 );

        showText( "1", 300, 50 );

    }
}

