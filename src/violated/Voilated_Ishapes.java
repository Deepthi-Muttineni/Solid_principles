package violated;

import java.lang.Math;
public interface Voilated_Ishapes {
    public int CalculateArea();
    public int CalCircumference();
    public int CalHypo();
}

class Circle implements Voilated_Ishapes{
    int area,circumference,hypo;
    public int CalculateArea(){
        return area;
    }
    public int CalCircumference()
    {
        return circumference;
    }
    public int CalHypo()
    {
        return hypo;
    }
}
class Triangle implements Voilated_Ishapes{
    int area,circumference,hypo,side1,side2;
    public int CalculateArea(){
        return area;
    }
    public int CalCircumference()
    {
        return circumference;
    }
    public int CalHypo()
    {
        return hypo;
    }


    public int equilateral(int side1,int side2)
    {
        this.side1=side1;
        this.side2=side2;
        System.out.println(Calequiarea());
        return side1;
    }
    public int Calequiarea(){
        return side1*side2/2;
    }
    public int Scalene(int side1,int side2)
    {
        this.side1=side1;
        this.side2=side2;
        System.out.println(Calequiarea());
        return side1;
    }
    public double Calrightarea(){
        return Math.sqrt(side1*side1+side2*side2);
    }
}

abstract class Rectangle implements Voilated_Ishapes{
    int area,circumference,hypo;
    private double length;
    private double breadth;

    public double getlength() {
        return length;
    }

    public void setlength(double length) {
        this.length = length;
    }

    public double getbreadth() {
        return breadth;
    }

    public void setbreadth(double breadth) {
        this.breadth = breadth;
    }
    public int CalculateArea(){
        return area;
    }
    public int CalCircumference()
    {
        return circumference;
    };
    @Override
    public int CalHypo()
    {
        return hypo;
    }

}
class Square extends Rectangle{

    @Override
    public void setlength(double length) {
        super.setlength(length);
        super.setbreadth(length);
    }

    @Override
    public void setbreadth(double breadth) {
        super.setbreadth(breadth);
        super.setlength(breadth);
    }

}


