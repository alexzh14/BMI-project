public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
             int index = service.calculate(50, 1.6);
        System.out.println("Индекс массы тела:" + index);
    }
}
