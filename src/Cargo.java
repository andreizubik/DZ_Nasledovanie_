import java.util.Scanner;

public class Cargo extends Ground{
    private int Capacity;

    public int getCapacity(){
    return Capacity;

    }
    public void setCapacity(int Capacity){
        this.Capacity = Capacity;
    }
    public Cargo(int HorsePower, int MaxSpeed, int Weight, String Make, int Wheels, int Consumption, int Capacity) {
        super(HorsePower, MaxSpeed, Weight, Make, Wheels, Consumption);
        this.Capacity = Capacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Capacity=" + getCapacity() +
                '}';
    }

    public void Load (int Load){
        if (Load>getCapacity()){
            System.out.println("Вам нужен грузовик побольше");
        }else {
            System.out.println("Грузовик загружен");
        }
    }

    public void cargoPower(int i) {
    }
}

