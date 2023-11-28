public class BmiService {
    public int calculate(int weightKilos, double heightMeters) {
        double doubleHeight = heightMeters*heightMeters;
        double bmi = weightKilos/doubleHeight;
        int index = (int) bmi;
        return index;
    }
}
