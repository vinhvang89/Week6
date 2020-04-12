package Colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[2];
        squares[0] = new Square(23);
        squares[1] = new Square(12);
        squares[0].howToColorable();
        squares[1].howToColorable();

    }
}
