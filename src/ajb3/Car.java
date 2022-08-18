package ajb3;

public class Car extends Vehicle {
    private double steeringAngle;
    private int gear;

    public Car(){
        super();
        this.steeringAngle=0;
        this.gear=1;
    }

    void steer(Double angle){
        if(this.steeringAngle+angle<-90.0){
            this.steeringAngle=-90.0;
        }
        else if(this.steeringAngle+angle>90.0){
            this.steeringAngle=90.0;
        }
        else{
            this.steeringAngle +=angle;
        }
    }

    void currentSteering(){
        System.out.println(this.steeringAngle);
    }
    void shift(int gear){
        if(1<=gear&&gear<=5){
            this.gear=gear;
        }
        else{
            System.out.println("Do not break the gearbox!");
        }
    }

    void currentGear(){
        System.out.println(this.gear);
    }
}

