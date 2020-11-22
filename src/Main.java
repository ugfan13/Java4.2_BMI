public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int growth = 176;
        int weight = 66;
        int bmi = service.calculate (weight, growth);
        System.out.println(bmi);
    }
}
