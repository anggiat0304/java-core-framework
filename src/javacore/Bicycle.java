package javacore;

public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;


    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }
    public void setCadence(int cadence) {
        this.cadence = cadence;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }
    public void applyBrake(int decrement) {
        this.speed = this.speed - decrement;
    }
    public void speedUp(int increment) {
        speed = this.speed + increment;
    }
}
