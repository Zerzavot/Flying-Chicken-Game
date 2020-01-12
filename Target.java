package javaoyunum7;

public class Target extends Source {

    public Target(int x, int y) {
        super(x, y);
        initTarget();
        //initTargetSmall();
    }

    private void initTarget() {
        loadImage("src/javaoyunum7/sepet.png");
        getImageDimensions();
    }

    public void move() {
        y++;

        if (y > 650) {
            y = 0;
        }
    }

}
