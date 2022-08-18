package ajb3;

public class Truck extends Car {
    private Double cargo;
    public Truck(){
        super();
        this.cargo=0.0;
    }
    void loadCargo(Double cargo){
        this.cargo+=cargo;
    }
    void emptyCargo(Double cargo){
        if(this.cargo<cargo){
            System.out.println("Not enough cargo to empty");
        }
        else{
            this.cargo-=cargo;
        }
    }
}
