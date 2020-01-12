package javaoyunum7;

/**
 *
 * @author user
 */
public class TargetSmall extends Source {

    public TargetSmall(int x, int y) {
        super(x, y);
        initTargetSmall();
    }

    private void initTargetSmall() {
        loadImage("src/javaoyunum7/sepet2-2.png");
        getImageDimensions();
    }

    public void move() {

        if (y > 650) {
            //visible=false;
            y = 0;
        }
        y++;

    }
}
