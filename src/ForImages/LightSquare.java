package ForImages;

import NotForImages.Const;

public class LightSquare extends Model{

    public LightSquare(int x, int y) {
        super(x,y,"Images\\light.png");
    }
    public void stepX(int x){
        x += this.getX();
        this.setX(x);
        if(x >= Const.W)
            this.setX(0);
        if(x<0)
            this.setX(Const.W - Const.STEP);
    }

    public void stepY(int y){
        y += this.getY();
        this.setY(y);
        if(y >= Const.H)
            this.setY(0);
        if(y<0)
            this.setY(Const.H - Const.STEP);
    }
}
