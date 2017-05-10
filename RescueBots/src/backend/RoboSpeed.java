package backend;

public class RoboSpeed {

    private double vMin;
    private double vMax;

    public RoboSpeed(double vMin, double vMax) {
        super();
        this.vMax = vMax;
        this.vMin = vMin;
    }

    public double getvMin() {
        return vMin;
    }

    public void setvMin(double vMin) {
        this.vMin = vMin;
    }

    public double getvMax() {
        return vMax;
    }

    public void setvMax(double vMax) {
        this.vMax = vMax;
    }
    

}
