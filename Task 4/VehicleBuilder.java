interface Vehicle
{
    void setPrice(double price);
}

interface Movable
{
    void start();
    void stop();
}

interface Flyable
{
    void fly();
}

class Car implements Vehicle, Movable
{
    double price;

    @Override
    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public void start()
    {
        System.out.println("start");
    }

    @Override
    public void stop()
    { 
        System.out.println("stop");
    }
}

class Aeroplane implements Vehicle, Movable, Flyable
{
    double price;

    @Override
    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public void start()
    {
        System.out.println("start");
    }

    @Override
    public void stop()
    {
        System.out.println("stop");
    } 

    @Override
    public void fly()
    {
        System.out.println("flying");
    }
}

public class VehicleBuilder
{
    public static Car buildCar()
    {
        Car car = new Car();
        car.setPrice(15.00);
        car.start();
        car.stop();
        return car;
    }
        
    public static Aeroplane buildAeroplane()
    {
        Aeroplane aeroplane = new Aeroplane();
        aeroplane.setPrice(25.00); 
        aeroplane.start();
        aeroplane.fly();
        aeroplane.stop();
        return aeroplane;
    }
}
class VehicleTest{
    public static void main(String[] args) {

        VehicleBuilder.buildCar();
        VehicleBuilder.buildAeroplane();
    }
    
}