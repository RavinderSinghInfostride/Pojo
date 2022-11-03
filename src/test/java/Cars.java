public class Cars {
    private String car;
    private String colour;
    private String model;

    public Cars(String getCar, String getColour, String getModel) {
        this.car = getCar;
        this.colour = getColour;
        this.model = getModel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        return "Car: " + this.car + " — Colour: " + this.colour + "Model: " + this.model;
    }
}