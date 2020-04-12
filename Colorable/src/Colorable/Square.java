package Colorable;

import java.awt.*;

public class Square  implements Colorable {
    private double side;
    public Square(double side){
        this.side = side;
    }

    @Override
    public void howToColorable() {
        System.out.println("Color all four sides");
    }
}
