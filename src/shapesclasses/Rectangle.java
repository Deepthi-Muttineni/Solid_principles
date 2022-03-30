package shapesclasses;

import interfaces.Iprinter;
import interfaces.Ishapes;


public class Rectangle implements Ishapes,Iprinter {
    public double length;
    public double breadth;
    public Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
        System.out.println("This is rectangle");
        System.out.println(CalculateArea());
    }

    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

    public double CalculateArea()
    {
        return length*breadth;
    }

    @Override
    public void PrintValue(double value) {
        System.out.println(value);
    }
}
