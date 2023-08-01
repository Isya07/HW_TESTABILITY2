public class BmiService {
    public double calculate(double height_metres, double weight_kilograms) {
        double bmi = weight_kilograms / (height_metres * height_metres);
        return bmi;
    }
}
