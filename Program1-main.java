public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Enter the type of operation (add, subtract, multiply, divide): ");
        String operationType = scanner.next().toLowerCase();

        Calculator calculator = new Calculator(a, b, operationType);

        double result = calculator.calculate();
        System.out.println("Result: " + result);

        scanner.close();
    }
}
