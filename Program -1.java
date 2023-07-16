import java.util.Scanner;

class Calculator {
    private double a;
    private double b;
    private String operationType;

    public Calculator(double a, double b, String operationType) {
        this.a = a;
        this.b = b;
        this.operationType = operationType;
    }

    public double calculate() {
        double result = 0.0;
        switch (operationType) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "divide":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation type.");
                break;
        }
        return result;
    }
}
