package ajb3;

public class Vehicle {
    private double speed;
    public Vehicle(){
        this.speed=0.0;
    }


    void changeSpeed(Double amount){
        if(this.speed+amount<0.0){
            this.speed=0.0;
        }
        else {
            this.speed += amount;
        }

    }
    void currentSpeed(){
        System.out.println(this.speed);
    }
}
