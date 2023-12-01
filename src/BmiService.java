public class BmiService {
    public int calculate(int weightKilos, double heightMeters) {
        double height = Math.pow(heightMeters, 2);
        double bmi = weightKilos / height;
        return (int) bmi;
    }
}
