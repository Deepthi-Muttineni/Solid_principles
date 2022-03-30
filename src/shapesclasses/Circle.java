package shapesclasses;

import interfaces.ICircle;
import interfaces.Iprinter;

public class Circle implements ICircle,Iprinter {
    public double Radius=2.5;
    public Circle()
    {
        System.out.println("This is circle");
    }
    public double CalculateArea()
    {
        System.out.println(
                3.14f * Radius * Radius);
        return 0;
    }
    public void CalculateCircumference()
    {
        System.out.println(
                3.14f * 2 * Radius);
    }

    @Override
    public void PrintValue(double value) {
        System.out.println(value);

    }
}
