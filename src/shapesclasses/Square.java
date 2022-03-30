package shapesclasses;

import interfaces.Iprinter;
import interfaces.Ishapes;

public class Square implements Ishapes,Iprinter{
    private final double Length;
    public Square(double Length)
    {
        this.Length=Length;
        System.out.println("This is square");
        System.out.println(CalculateArea());
    }
    public double getLength() {
        return Length;
    }
    public double CalculateArea()
    {
        return Length*Length;
    }

    @Override
    public void PrintValue(double value) {
        System.out.println(value);
    }
}
