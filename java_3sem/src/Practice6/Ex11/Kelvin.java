package Practice6.Ex11;

public class Kelvin implements Convertable {
    @Override
    public double convert(double temperature) {
        return 273.15 + temperature;
    }
}
