public class Fitbyte {
    private int age;
    private int heartRateRested;

    public Fitbyte(int age, int heartRateRested){
        this.age=age;
        this.heartRateRested=heartRateRested;
    }
    public double targetHeartRate(double percentageOfMaximum){
        double heartRateMaximum=206.3-(0.711*this.age);
        return ((heartRateMaximum-heartRateRested)*(percentageOfMaximum)+heartRateRested);
    }
}
