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

        // 背景を真っ黒にする（画像を用意している場合は setBackground("image.jpg") に書き換えてください）
        getBackground().setColor(Color.BLACK);
        getBackground().fill();

        if (isClear) {
            // ゲームクリア時の表示
            showText("Game Clear!", 425, 200);
            showText("無事にゴールしました！", 425, 280);
        } else {
            // ゲームオーバー時の表示
            showText("Game Over...", 425, 200);
            showText("体力がなくなってしまいました。", 425, 280);
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