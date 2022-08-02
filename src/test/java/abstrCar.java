public abstract class abstrCar {

    private String model;
    public String color;
    private int maxSpeed;

    public abstract void gas();

    public abstract void brake();

    public String getModel() {
        return model
    }

    public String getColor() {
        return color
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
