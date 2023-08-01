public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height_metres = 1.8;
        double weight_kilograms = 75;
        double bmi = service.calculate(height_metres, weight_kilograms);
        int totalBmi = (int) bmi;
        System.out.println("Ваш ИМТ равен " + totalBmi);
    }
}