public class Ground extends Transport {
    private int Wheels;
    private int Consumption;

    public int getWheels() {
        return Wheels;
    }
    public void setWheels(int Wheels) {
        this.Wheels = Wheels;
    }

    public int getConsumption() {
        return Consumption;
    }
    public void setConsumption(int Consumption) {
        this.Consumption = Consumption;


    }

    public Ground(int HorsePower, int MaxSpeed, int Weight, String Make, int Wheels, int Consumption) {
        super(HorsePower, MaxSpeed, Weight, Make);
        this.Wheels = Wheels;
        this.Consumption = Consumption;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Wheels='" + getWheels() +
                ", Consumption=" + getConsumption() +
                '\'' ;
    }
}

