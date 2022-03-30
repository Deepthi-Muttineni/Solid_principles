package shapesclasses;

public class DevicesWithEngine<Engine> extends TransportationDevice
    {
        Engine engine;
        Engine getEngine() {
            return engine;
        }
        void setEngine(Engine e) {
            System.out.println("Engine");
        }
        void startEngine() {
            System.out.println("start Engine");
        }
    }


