import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private boolean start = false;

    private int currentHp = 3;//ハートの初期値,現在
    private final int MAX_HP = 3;//最大HP
    private title titleObj;//title
    
    private final int[] HEART_X_POSITIONS = new int[3]; 
    private final int HEART_Y_POS = 50; // 固定のY座標

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(851, 567, 1); 

        titleObj = new title();
        addObject(titleObj, 450, 250);

        showText( "Spaceを押してスタート", 450, 450 );

    }

    public void act()
    {
        if (!start && Greenfoot.isKeyDown("space"))
        {
            startGame();
        }
    }

    private void startGame()
    {
        start = true;

        showText( "", 450, 300 );
        showText( "", 450, 450 ); 
        removeObject(titleObj);

        addObject(new Taro(), 430, 350); 
        status_prepare();

        addObject(new Bunnki1(), 430, 250); 

        addObject(new Huki1(), 430, 450); 

        showText( "", 450, 300 );
        showText( "", 450, 450 );

        addObject(new yaji(), 720, 100); 
        addObject(new R(), 600, 100); 
        
        //addObject(new Bunnki2(), 430, 220); //ここじゃない
        
        //addObject(new Huki2(), 430, 495); //ここじゃない
    }

        /*
        if(rure_count == 1)
        {
            if(rure == 1)
            {
               トラブルマスの処理 
            }
            else
            {
                ラッキーマスの処理
            }           
        }
        */


    
    //ハートを初期表示
    public void status_prepare()
    {
        int x = 70;    // 最初のX座標
        int deltaX = 130;     // X座標の増加分
        for(int i=0;i<3;i++){
            int xPos = x + (i * deltaX);
            HEART_X_POSITIONS[i] = xPos;
            addObject(new status_heart(),xPos, HEART_Y_POS);
        }
    }

    public void status_damage()
    {
        if(currentHp>0){
            currentHp--;// ダメージを受けるたび
            int targetIndexToChange = currentHp;
            
            if (targetIndexToChange >= 0 && targetIndexToChange < 3) {
                // 赤ハートを削除し、黒ハートを配置するメソッドを呼び出す
                replaceHeart(targetIndexToChange, "damage");
                if (currentHp == 0) {
                    System.out.println("Game Over!");
                    // ゲームオーバー処理
                }
            }
        }
    }
    //回復用
    public void status_heal()
    {
        if(currentHp <3){
            int targetIndexToChange = currentHp;
            currentHp++;
            if (targetIndexToChange >= 0 && targetIndexToChange < 3) {
                // 黒ハートを削除し、赤ハートを配置するメソッドを呼び出す
                replaceHeart(targetIndexToChange, "recover");
            }
        }
    }
    //ハートを置きえかるメソッド
    private void replaceHeart(int index, String type) {
        
        int targetX = HEART_X_POSITIONS[index];
        int targetY = HEART_Y_POS;

        if (type.equals("damage")) {
            removeObjects(getObjectsAt(targetX, targetY, null));
            addObject(new status_bw_heart(), targetX, targetY);
            }
            
        else if (type.equals("recover")) {
            removeObjects(getObjectsAt(targetX, targetY, null));
            addObject(new status_heart(), targetX, targetY);
            }
        }
    }
    
    
    


