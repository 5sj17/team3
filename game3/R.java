import greenfoot.*;

public class R extends Actor
{
    private GreenfootImage baseImg;

    private boolean spinning = false;
    private float speed;
    private final float DECEL = 0.97f;
    private int rure;

    // 効果音
    private GreenfootSound spinSound = new GreenfootSound("karakara.wav");
    private GreenfootSound stopSound = new GreenfootSound("kachi.wav");

    public R()
    {
        baseImg = new GreenfootImage("Roulette.png");
        baseImg.scale(150, 150);
        setImage(baseImg);

        spinSound.setVolume(70);
        stopSound.setVolume(90);
    }

    public void act()
    {
        // Enterキーを「押した瞬間だけ」判定
        String key = Greenfoot.getKey();
        if ("enter".equals(key) && !spinning) {
            startSpin();
        }

        if (spinning) {
            setRotation(getRotation() + Math.round(speed));
            speed *= DECEL;

            if (speed < 0.5f) {
                spinning = false;
                spinSound.stop();
                stopSound.play();

                decideResult();

                // ★ 回転が止まった瞬間に1回だけ結果処理
                MyWorld world = (MyWorld)getWorld();
                world.rouletteSpin();
            }
        }
    }

    private void startSpin()
    {
        spinning = true;
        speed = Greenfoot.getRandomNumber(20) + 25;

        spinSound.playLoop();
    }

    private void decideResult()
    {
        rure = Greenfoot.getRandomNumber(6) + 1;

        switch (rure) {
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
