package backend;

public class Robot {

    public String roboType;
    private double fValue;
    private RoboSpeed speed;
    private RoboPosition position;

    public Robot() {
        super();
    }

    public Robot(double fValue, RoboSpeed speed, RoboPosition position, String roboType) {
        super();
        this.fValue = fValue;
        this.speed = speed;
        this.position = position;
        this.roboType = roboType;
    }

    public String getRoboType() {
        return roboType;
    }

    public void setRoboType(String roboType) {
        this.roboType = roboType;
    }

    public double getfValue() {
        fValue = FunctionalMethods.calculatefitness(position);
		return fValue;
    }

    public void setfValue(double fValue) {
        this.fValue = fValue;
        
    }

    public RoboSpeed getSpeed() {
        return speed;
    }

    public void setSpeed(RoboSpeed speed) {
        this.speed = speed;
    }

    public RoboPosition getPosition() {
        return position;
    }

    public void setPosition(RoboPosition position) {
        this.position = position;
    }

}
