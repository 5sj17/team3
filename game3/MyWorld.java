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
    
    private int currentHp = 3;//ハートの初期値,現在
    private final int MAX_HP = 3;//最大HP
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
            status_prepare();
        }
        if (Greenfoot.isKeyDown("space"))
        {
            showText( "", 450, 300 );
            showText( "", 450, 450 ); 
            
        }
     
        //addObject( new status_bw_heart(), 70, 50 );//ステータス表示
        //addObject( new status_heart(), 200, 50 );
        //addObject( new status_heart(), 330, 50 );
        
        

    }
    public void status_prepare()
    {
        for(int i=0;i<MAX_HP;i++){
            addObject(new status_heart(),70+(130*i),50);
        }
    }
    public void status_damage()
    {
        if(currentHp>0){
            currentHp--;
            switch(currentHp){
                case 2://削除動作作る
                //removeObject(new status_heart(),70+(130*2),50);
                addObject(new status_bw_heart(),70+(130*2),50);
                break;
                case 1:
                //removeObject(new status_heart(),70+(130*1),50);
                addObject(new status_bw_heart(),70+(130*1),50);
                break;
                case 0://ゲームオーバー
                //removeObject(new status_heart(),70+(130*0),50);
                addObject(new status_bw_heart(),70+(130*0),50);
                Greenfoot.stop();
                break;
                
        }
    }      
    }
    //public void status_heal()
    //{
    //}
}

