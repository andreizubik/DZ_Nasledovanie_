public class Air extends Transport {
    private int WingSpan;
    private int MinRWYDistance;

    public int getWingSpan(){
    return WingSpan;
    }
    public void setWingSpan(int wingSpan){
        this.WingSpan = WingSpan;

    }
    public int getMinRWYDistance() {
        return MinRWYDistance;
    }
    public void setMinRWYDistance(int MinRWYDistance){
        this.MinRWYDistance = MinRWYDistance;

    }
    public Air(int HorsePower, int MaxSpeed, int Weight, String Make, int WingSpan, int MinRWYDistance) {
        super(HorsePower, MaxSpeed, Weight, Make);
        this.WingSpan = WingSpan;
        this.MinRWYDistance = MinRWYDistance;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", WingSpan=" + getWingSpan() +
                ", MinRWYDistance=" + getMinRWYDistance() +
                '\'' ;
    }
}


