import java.util.Scanner;

public class Passenger extends Ground {
    private String Body;
    private int Passengers;

    public Passenger(int HorsePower, int MaxSpeed, int Weight, String Make, int Wheels, int Consumption, String Body, int Passengers) {
        super(HorsePower, MaxSpeed, Weight, Make, Wheels, Consumption);
        this.Body = Body;
        this.Passengers = Passengers;
    }

    public String getBody(){
        return Body;
    }

    public void setBody (String Body) {
        this.Body = Body;

    }
    public int getPassengers() {
        return Passengers;
    }
    public void setPassengers(int Passengers){
        this.Passengers = Passengers;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", Body='" + getBody() +
                ", Passengers=" + getPassengers() +
                + '\'' +
                '}';
    }

    private double countfluel(double time){
        return (time * this.getMaxSpeed())/100.0;
    }
    public void method1(double time){
        System.out.println("�� ����� " + time+" �, ���������� "+ getMake()+"\n" +
                "�������� � ������������ ��������� "+ getMaxSpeed()+ " ��/�\n" +
                "������� " +time * this.getMaxSpeed()+" �� � ����������� "+countfluel(time)+" ������ �������.");

    }
}


