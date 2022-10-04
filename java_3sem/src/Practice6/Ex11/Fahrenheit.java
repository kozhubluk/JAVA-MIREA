package Practice6.Ex11;

public class Fahrenheit implements Convertable{
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Fahrenheit(double temperature) {
        this.temperature = temperature;
    }

    public double convert() {
        return temperature*9/5 + 32;
    }
}
