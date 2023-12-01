public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println("Индекс массы тела:" + service.calculate(50, 1.6));
    }
}
