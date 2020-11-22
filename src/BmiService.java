public class BmiService {
    public int calculate(int weight, int growth) {
        int bmi = weight * 100 * 100 / growth / growth;
        return bmi;
    }

}
