package shapesclasses;

import interfaces.Iprinter;

import java.io.Console;

public class ConsolePrinter implements Iprinter {
    public void PrintValue(double value)
    {
        System.out.println(value);
    }
}