import greenfoot.*;  

public class lucky_stage extends World
{
    private int returnHp;
    private int returnCount;

    public lucky_stage(int hp,int Count)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground("lucky.png");
        this.returnHp =hp;
        this.returnCount =Count;
        //回復処理
        if (currentHp < 3) {
            currentHp++;
        }

        // 回復後のハートを表示（MyWorldのロジックを流用）
        status_prepare(currentHp);
        
        showText("ライフが1回復した！", 425, 300);
        showText("Spaceキーで次へ", 425, 450);
    }

    public void act() {
        // Spaceキーが押されたら、HPとカウントを引き継いでMyWorldに戻る
        if (Greenfoot.isKeyDown("space")) {
            // MyWorldに現在のHPとカウントを渡す仕組みが必要（下記MyWorld修正参照）
            Greenfoot.setWorld(new MyWorld(currentHp, rouletteCount));
        }
    }

    // MyWorldからコピーしたハート表示メソッド
    public void status_prepare(int hp) {
        int x = 70;
        int deltaX = 130;
        for(int i=0; i<3; i++) {
            int xPos = x + (i * deltaX);
            if(hp > i) {
                addObject(new status_heart(), xPos, 50);
            } else {
                addObject(new status_bw_heart(), xPos, 50);
            }
        }
    }
}
