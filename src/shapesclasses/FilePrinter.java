package shapesclasses;

import interfaces.IWriter;
import interfaces.Iprinter;

public class FilePrinter implements Iprinter, IWriter {

    public FilePrinter(IWriter writer)
    {
        System.out.println(writer);
    }
    public void PrintValue(double value)
    {
        System.out.println(value);
    }
    @Override
    public void WriteValue(String value) {
        System.out.println(value);
    }
}
