package Practice6.Ex11;

public class Kelvin implements Convertable {
    double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Kelvin(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double convert() {
        return 273.15 + temperature;
    }
}
