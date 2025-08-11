package L;

public class Client {
    public static void main(String[] args) {
        Vehicle v = new Car();
        CarDekho cd = new CarDekho(v);
        Vehicle v1 = new Cycle();
        CarDekho cd12 = new CarDekho(v1);

    }

    
}
