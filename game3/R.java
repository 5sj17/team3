import greenfoot.*;

public class R extends Actor
{
    private GreenfootImage baseImg;

    private boolean spinning = false;
    private boolean counted = false;

    private float speed;
    private final float DECEL = 0.97f;
    private int rure;

    // 🔊 効果音
    private GreenfootSound spinSound = new GreenfootSound("karakara.wav");
    private GreenfootSound stopSound = new GreenfootSound("kachi.wav");

    public R()
    {
        baseImg = new GreenfootImage("Roulette.png");
        baseImg.scale(150,150);
        setImage(baseImg);

        spinSound.setVolume(70);
        stopSound.setVolume(90);
    }

    public void act()
    {
        // 回転開始
        if (Greenfoot.isKeyDown("enter") && !spinning) {
            startSpin();
        }

        if (spinning) {
            setRotation(getRotation() + Math.round(speed));
            speed *= DECEL;

            if (speed < 0.5f) {
                spinning = false;
                spinSound.stop();   // 🔊 回転音停止
                stopSound.play();  // 🔊 カチッ
                decideResult();
            }
        }
        else {
            if (!counted) {
                MyWorld world = (MyWorld)getWorld();
                world.rouletteSpin();
                counted = true;
            }
        }
    }

    private void startSpin()
    {
        spinning = true;
        counted = false;

        speed = Greenfoot.getRandomNumber(20) + 25;

        // 🔊 回転音開始（ループ）
        spinSound.playLoop();
    }

    private void decideResult()
    {
        int n = Greenfoot.getRandomNumber(6) + 1;
        rure = n;

        switch (n) {
            case 1: setRotation(420); break;
            case 2: setRotation(360); break;
            case 3: setRotation(300); break;
            case 4: setRotation(240); break;
            case 5: setRotation(180); break;
            case 6: setRotation(120); break;
        }
    }

    public int getRure()
    {
        return rure;
    }
}
