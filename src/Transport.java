public class Transport {
    private int HorsePower;
    private int MaxSpeed;
    private int Weight;
    private String Make;

    public int getHorsePower(){
        return HorsePower;
    }
    public void setHorsePower(int HorsePower) {
        this.HorsePower = HorsePower;

    }
    public int getMaxSpeed() {
        return MaxSpeed;
    }
    public void setMaxSpeed(int MaxSpeed) {
        this.MaxSpeed = MaxSpeed;
    }
    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;

    }
    public String getMake() {
        return Make;
    }
    public void setMake(String Make){
    this.Make = Make;
        }

    public Transport(int HorsePower, int MaxSpeed, int Weight, String Make) {

        this.HorsePower = HorsePower;
        this.MaxSpeed = MaxSpeed;
        this.Weight = Weight;
        this.Make = Make;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "HorsePower='" + HorsePower + '\'' +
                ", MaxSpeed=" + MaxSpeed +
                ", Weight=" + Weight +
                ", Make='" + Make +
                ", Power=" + calcul(HorsePower) + '\'' ;

    }

    public int calcul (int HorsePower) {
        return (int) (HorsePower * 0.74);
    }
}

