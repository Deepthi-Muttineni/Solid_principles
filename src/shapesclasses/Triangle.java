package shapesclasses;

import interfaces.Iprinter;
import interfaces.Ishapes;


public abstract class Triangle implements Ishapes,Iprinter {
    public double Height;
    public double Base;
    public Triangle(double Height,double Base)
    {
        this.Height=Height;
        this.Base=Base;
        System.out.println("This is Triangle");
        System.out.println(CalculateArea());
    }
    public double CalculateArea()
    {
        return ((Height * Base) / 2);
    }
    @Override
    public void PrintValue(double value) {
        System.out.println(value);
    }
    public abstract double GetAllSides();
}
