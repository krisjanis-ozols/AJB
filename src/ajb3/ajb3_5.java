package ajb3;
//5) Vehicle
// Create a base class of a Vehicle,
// then create a Car class which inherits from the Vehicle class.
// Also, create another class, a specific type of Car that inherits from the Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.
public class ajb3_5 {
    public static void main(String[] args){
        Truck a = new Truck();
        a.currentSpeed();
        a.changeSpeed(50.0);
        a.currentSpeed();
    }
}
