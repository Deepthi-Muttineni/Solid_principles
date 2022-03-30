package shapesclasses;

import interfaces.Iprinter;

public class Equilateral extends Triangle implements Iprinter {
    public Equilateral(double height,double base)
    {
        super(height, base);
        System.out.println("This is Equilateral");
        System.out.println(GetAllSides());
    }
    public double GetAllSides()
    {
        return 0;
    }

    @Override
    public void PrintValue(double value) {
        System.out.println(value);
    }
}
