import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EndingWorld extends World
{
    /**
     * コンストラクタ
     * @param isClear trueならゲームクリア、falseならゲームオーバー
     */
    public EndingWorld(boolean isClear)
    {    
        // MyWorldと同じサイズで作成
        super(851, 567, 1); 

    
        getBackground().setColor(Color.BLACK);
        getBackground().fill();

        if (isClear) {
            addObject(new hanabi(),425,300);
            Greenfoot.playSound("hanabi.mp3");
            // ゲームクリア時の表示
            showText("Game Clear!", 425, 200);
            showText("おめでとう！定年を迎えました", 425, 280);
        } else {
            addObject(new bakuhatu(),425,300);
            Greenfoot.playSound("bakuhatu.mp3");
            // ゲームオーバー時の表示
            showText("Game Over...", 425, 200);
            showText("残念・・・、あなたは首です。", 425, 280);
        }

        showText("Rキーを押してタイトルへ戻る", 425, 450);
    }

    public void act()
    {
        // Rキーが押されたらタイトル（MyWorldの初期状態）に戻る
        if (Greenfoot.isKeyDown("r")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}