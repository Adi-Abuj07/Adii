interface Vehicle{
    public void show();
}
class Bike implements Vehicle
{
    public void show()
    {
        System.out.println(" This is Bike");
    }
}

class Car implements Vehicle
{
    public void show()
    {
        System.out.println(" This is Car ");
    }
}

class Bus implements Vehicle
{
    public void show()
    {
        System.out.println(" This is Bus");
    }
}

class VehicleFactory
{
    public Vehicle getInstance(String str)
    {
        if(str.equalsIgnoreCase("Bike"))
        {
            return new Bike();
        }
        else if(str.equalsIgnoreCase("Car"))
        {
            return new Car();
        }
        else if(str.equalsIgnoreCase("Bus"))
        {
            return new Bus();
        }
        else
        {
            return null;
        }
    }
}

class div
{
    public static void main(String args[])
    {
        VehicleFactory vf = new VehicleFactory();

        Vehicle v1= vf.getInstance("bike");
        v1.show();

        Vehicle v2= vf.getInstance("car");
        v2.show();

        Vehicle v3= vf.getInstance("Bus");
        v3.show();
    }
}