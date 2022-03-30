package shapesclasses;

import interfaces.IWriter;

public class FileWriter implements IWriter {

    public FileWriter(String path)
    {
        System.out.println(path);
    }
    public void WriteValue(String value)
    {
        System.out.println("This is display shapes");
    }
}
