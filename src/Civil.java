import java.util.Scanner;

public class Civil extends Air {
    private int Passengers;
    public boolean BusinessClass;

    public int getPassengers() {
        return Passengers;
    }
    public void setPassengers(int Passengers) {
        this.Passengers = Passengers;
    }
    public boolean isBusinessClass() {
        return BusinessClass;
    }
        public void setBusinessClass (boolean BusinessClass){
            this.BusinessClass = BusinessClass;
    }
    public Civil(int HorsePower, int MaxSpeed, int Weight, String Make, int WingSpan, int MinRWYDistance, int PassengersAm, boolean BusinessClass) {
        super(HorsePower, MaxSpeed, Weight, Make, WingSpan, MinRWYDistance);
        this.Passengers = PassengersAm;
        this.BusinessClass = BusinessClass;
    }

    @Override
    public String toString() {
        return super.toString() +
                "PassengersAm=" + getPassengers() +
                ", BusinessClass=" + isBusinessClass() +
                '}';
    }

    public void PassangersAm (int PassengersAm){
        if (PassengersAm>getPassengers()){
            System.out.println("Вам нужен самолёт побольше");
        }else {
            System.out.println("Самолёт загружен");
        }
    }

    public void passengerСapacity(int i) {
    }
}
