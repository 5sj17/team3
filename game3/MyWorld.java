import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private boolean taroAdded = false;
    private boolean RAdded = false;
    private boolean bunnki1Added = false;
    private boolean bunnki2Added = false;
    private boolean start = false;
    private int currentHp = 3;//ハートの初期値,現在
    private final int MAX_HP = 3;//最大HP
    private title titleObj;//title
    private final int[] HEART_X_POSITIONS = new int[3]; 
    private final int HEART_Y_POS = 50; // 固定のY座標
    private int rouletteCount = 8;   // ルーレットを回した回数
    private final int MAX_ROULETTE = 10;
    private boolean huki1Added = false;
    private boolean huki2Added = false;
    private R roulette; //

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(851, 567, 1); 

        titleObj = new title();
        addObject(titleObj, 450, 250);
        
        Greenfoot.playSound("BGM.mp3");

        showText( "Spaceを押してスタート", 450, 450 );

    }

    public void act()
    {
        if (!start) {
            String key = Greenfoot.getKey();
            if ("space".equals(key)) {
                startGame();
            }
        }
    }

    private void startGame()
    {
        start = true;

        showText( "", 450, 300 );
        showText( "", 450, 450 ); 
        removeObject(titleObj);

        addObject(new Taro(), 430, 350); 
        status_prepare(currentHp);

        addObject(new yaji(), 720, 100); 
        
        roulette = new R();
        addObject(roulette, 600, 100);
    }

    public void bunki()
    {
        int rure_result = roulette.getRure(); 

        if(rouletteCount == 0)
        {
            if(rure_result <= 6)
            showText( "2以上でセーフ", 450, 450 );
        }
        if(rouletteCount == 1)
        {
            showText( "2以上でセーフ", 610, 190 );
            if(rure_result == 1)
            {
                unlucky_stage();
                showText( "遅刻した　ライフ-1", 450, 450 );
            }
            else if(rure_result <= 2)
            {
                taiho_stage();
                showText( "定時退社した　ライフ+1", 450, 450 );
            }           

        }else if(rouletteCount >=3 && rouletteCount <= MAX_ROULETTE)
        
        if(rouletteCount == 2)
        {
            showText( "3以上でセーフ", 610, 190 );
            if(rure_result <= 2)
            {
                unlucky_stage();
                showText( "校長に怒られた　ライフ-1", 450, 450 );
            }
            else
            {
                lucky_stage();
                showText( "校長に褒められた　ライフ+1", 450, 450 );
            }
        }
        if(rouletteCount == 3)
        {
            showText( "4以上でセーフ", 610, 190 );
            if(rure_result <= 3)
            {
                unlucky_stage();
                showText( "モンペに怒られた　ライフ-1", 450, 450 );
            }
            else
            {
                lucky_stage();
                showText( "モンペをうまく対処した　ライフ+1", 450, 450 );
            }
        }
        if(rouletteCount == 4)
        {
            if(rure_result <= 4)
            {
                unlucky_stage();
                showText( "テストが流出した　ライフ-1", 450, 450 );
            }
            else
            {
                lucky_stage();
                showText( "テストが完成した　ライフ+1", 450, 450 );
            }
        }
        if(rouletteCount == 5)
        {
            if(rure_result <= 5)
            {
                unlucky_stage();
                showText( "通勤中に事故にあった　ライフ-1", 450, 450 );
            }
            else
            {
                lucky_stage();
                showText( "譲った車が校長だった　ライフ+1", 450, 450 );
            }
        }
        if(rouletteCount == 6)
        {
            if(rure_result <= 5)
            {
                unlucky_stage();
                showText( "校長と激突した　ライフ-1", 450, 450 );
            }
            else
            {
                lucky_stage();
                showText( "校長に挨拶した　ライフ+1", 450, 450 );
            }
        }
        if(rouletteCount == 7)
        {
            if(rure_result <= 5)
            {
                unlucky_stage();
                showText( "減給された　ライフ-1", 450, 450 );
            }
            else
            {
                lucky_stage();
                showText( "ボーナスが入った　ライフ+1", 450, 450 );
            }
        }
        if(rouletteCount == 8)
        {
            if(rure_result <= 5)
            {
                unlucky_stage();
                showText( "休日出勤した　ライフ-1", 450, 450 );
            }
            else
            {
                lucky_stage();
                showText( "有給休暇を貰った　ライフ+1", 450, 450 );
            }
        }
        if(rouletteCount == 9)
        {
            if(rure_result <= 5)
            {
                unlucky_stage();
                showText( "タイに左遷になった　ライフ-1", 450, 450 );
            }
            else
            {
                lucky_stage();
                showText( "室蘭に出張した　ライフ+1", 450, 450 );
            }
        }
        if(rouletteCount == 10)
        {
            showText( "ラスト! 1が出たらGAME OVER", 610, 190 );
            if(rure_result >= 10)
            {
                taiho_stage();
                showText( "飲酒運転がバレた　ライフ-4", 450, 450 );
            }
            else
            {
                lucky_stage();
                showText( "校長と会食した　ライフ+1", 450, 450 );

            }
        }
    }

    //背景画像を更新するための補助メソッド
    private void updateStageView(String imageName) {
        GreenfootImage bg = new GreenfootImage(imageName);
        setBackground(bg);
    }

    public void lucky_stage()
    {        
        updateStageView("lucky.png"); 
        status_heal();
    }

    public void unlucky_stage()
    {
        updateStageView("アンラッキー.png"); 
        status_damage(); // ライフを1減らす
    }
    
    public void taiho_stage()
    {
        //updateStageView("逮捕.png"); 
        status_death(); // ライフを0にする
    }

    // 4. ダメージ処理（既存を整理）
    public void status_damage()
    {
        if (currentHp > 0) {
            currentHp--;
            replaceHeart(currentHp, "damage");
        }
        if(currentHp <= 0) {
            Greenfoot.setWorld(new EndingWorld(false));
        }
    }

    public void status_death()
    {
            Greenfoot.setWorld(new EndingWorld(false));
    }


    //ハートを初期表示
    public void status_prepare(int hp)

    {
        int x = 70;    // 最初のX座標
        int deltaX = 130;     // X座標の増加分

        for(int i=0;i<3;i++){
            int xPos = x + (i * deltaX);
            HEART_X_POSITIONS[i] = xPos;
            if(hp>i){
                addObject(new status_heart(),xPos, HEART_Y_POS);
            }else{
                addObject(new status_bw_heart(),xPos, HEART_Y_POS);
            }
        }   
    }

    public void rouletteSpin()
    {
        showText("年数：" + rouletteCount + " / " + MAX_ROULETTE + "年目", 700, 500);
        if (rouletteCount >= MAX_ROULETTE) {
            Greenfoot.setWorld(new EndingWorld(true));

        }
        rouletteCount++;
        bunki();
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
//R()
//act()
//startgame()
//R()
//rouletteSpin()
//bunki()
