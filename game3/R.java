import greenfoot.*;

public class R extends Actor
{
    private GreenfootImage baseImg;

    private boolean enterPressed = false;

    private int rure;

    // コンストラクタ（最初に一度だけ実行される）
    public R() {
        baseImg = new GreenfootImage("Roulette.png");
        baseImg.scale(150,150);   // ←  最初から縮小しておく
        setImage(baseImg);        // ← 初期表示も正しい大きさになる
        rure = 0;
    }

    public void act()
    {
        String key = Greenfoot.getKey();

        if ("enter".equals(key)) {

            int n = Greenfoot.getRandomNumber(6) + 1;

            switch (n) {
                case 1: setRotation(420); break;
                case 2: setRotation(360); break;
                case 3: setRotation(300); break;
                case 4: setRotation(240); break;
                case 5: setRotation(180); break;
                case 6: setRotation(120); break;
            }

            MyWorld world = (MyWorld)getWorld();
            world.rouletteSpin();
        }
    }
    public int getRure() 
    {
        return rure;
    }
}
