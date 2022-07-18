import java.util.Scanner;

public class Military extends Air {
    private boolean Ejection;
    private int Rockets;

    public boolean isEjection() {
        return Ejection;
    }
    public void setEjection(boolean Ejection) {
        this.Ejection = Ejection;
    }
    public int getRockets() {
        return Rockets;
    }
    public void setRockets(int Rockets){
        this.Rockets = Rockets;
    }
    public Military(int HorsePower, int MaxSpeed, int Weight, String Make, int WingSpan, int MinRWYDistance, boolean Ejection, int Rockets) {
        super(HorsePower, MaxSpeed, Weight, Make, WingSpan, MinRWYDistance);
        this.Ejection = Ejection;
        this.Rockets = Rockets;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", Ejection=" + isEjection() +
                ", Rockets=" + getRockets() +
                '}';
    }

    public void fire() {
        for (int a = 0; a < Rockets; a++) {
            System.out.println("Ракета пошла");
        }
        Rockets = 0;
        System.out.println("Боеприпасы отсутствуют");
        System.out.println();

    }

    public void EjectionGo() {
        if (Ejection == true) System.out.println("Катапультирование прошло успешно");
        else System.out.println("У вас нет такой системы");

    }

    public void shot() {
    }

    public void isHasEjectionSystem() {
    }
}
