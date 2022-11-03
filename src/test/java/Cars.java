public class Cars {
    private String car;
    private String colour;
    public Cars(String getCar, String getColour) {
        this.car = getCar;
        this.colour = getColour;
    }
    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car: " + this.car + " — Colour: " + this.colour;
    }
}
