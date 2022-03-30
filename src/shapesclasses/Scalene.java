package shapesclasses;

import interfaces.IRightAngledTriangle;
import interfaces.Iprinter;

public class Scalene extends Triangle implements IRightAngledTriangle,Iprinter {
    double Base;
     double Height;

    public Scalene(double Height,double Base) {
        super(Height,Base);
        System.out.println("This is scalene");
        System.out.println(GetAllSides());
    }

    public double GetAllSides()
    {
       return CalculateHypotenuse( Height, Base / 2);
    }
    public double CalculateHypotenuse(double side1, double side2)
    {
        return (Math.sqrt( side1 * side1 + side2 * side2));
    }

    @Override
    public void PrintValue(double value) {
        System.out.println(value);
    }
}
