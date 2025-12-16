import greenfoot.*;

public class R extends Actor
{
    private GreenfootImage baseImg;
    private int rure;
    // コンストラクタ（最初に一度だけ実行される）
    public R() {
        baseImg = new GreenfootImage("publicdomainq-0007601btydle.png");
        baseImg.scale(150,150);   // ←  最初から縮小しておく
        setImage(baseImg);        // ← 初期表示も正しい大きさになる
        rure = 0;
    }

    public void act()
    {
        // Spaceキーが押されたら動作
        if (Greenfoot.isKeyDown("space")) {

            // 1〜6 の乱数を取得
            int n = Greenfoot.getRandomNumber(6) + 1;
            
            
            switch (n) 
            {
                case 1: setRotation(420); rure = 1; break;
                case 2: setRotation(360); rure = 2; break;
                case 3: setRotation(300); rure = 3; break;
                case 4: setRotation(240); rure = 4; break;
                case 5: setRotation(180); rure = 5; break;
                case 6: setRotation(120); rure = 6; break;
                
            }
        }
    }
    public int getRure() 
    {
        return rure;
    }
}
