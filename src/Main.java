public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 54.8;
        double height = 1.63;
        double index = service.calculate(mass, height);
        System.out.println(index);
    }
}
