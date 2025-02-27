package Calc;

public class Calc {
    private double firstNum;
    private int secondNum;

    public void decision(String example) {
        try {
            String[] exampleArray = example.split(" ");
            switch (exampleArray[1]) {
                case "+":
                    System.out.println(addiction(Double.parseDouble(exampleArray[0]), Double.parseDouble(exampleArray[2])));
                    break;
                case "-":
                    System.out.println(subtraction(Double.parseDouble(exampleArray[0]), Double.parseDouble(exampleArray[2])));
                    break;
                case "/":
                    System.out.println(division(Double.parseDouble(exampleArray[0]), Double.parseDouble(exampleArray[2])));
                    break;
                case "*":
                    System.out.println(multiplication(Double.parseDouble(exampleArray[0]), Double.parseDouble(exampleArray[2])));
                    break;
                default:
                    System.out.println("Ошибка: введенного действия не существует");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат ввода");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка, введите пример в формате (2 + 3)");
        }
    }

    public static double addiction(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public static double subtraction(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public static double division(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }

    public static double multiplication(double firstNum, double secondNum) {
        if (secondNum == 0) {
            System.out.println("Ошибка! Деление на 0");
            return 0;
        } else return firstNum * secondNum;
    }
}
