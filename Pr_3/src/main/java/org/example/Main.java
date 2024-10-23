package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Calculator calculator = new Calculator();  //може
            System.out.print("Введіть перше число: ");
            double firstNumber = scanner.nextDouble();

            System.out.print("Введіть друге число: ");
            double secondNumber = scanner.nextDouble();

            System.out.print("Введіть операцію (add, subtract, multiply, divide, sqrt): ");
            String operation = scanner.next().toLowerCase();

            double result;

            switch (operation) {
                case "add":
                    result = calculator.add(firstNumber, secondNumber);
                    break;
                case "subtract":
                    result = calculator.sub(firstNumber, secondNumber);
                    break;
                case "multiply":
                    result = calculator.mul(firstNumber, secondNumber);
                    break;
                case "divide":
                    result = calculator.div(firstNumber, secondNumber);
                    break;
                case "sqrt":
                    result = calculator.squareRoot(firstNumber);
                    break;
                default:
                    System.err.println("Невідома операція.");
                    return;
            }

            System.out.println("Результат: " + result);

        } catch (ArithmeticException | InvalidInputException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Сталася помилка: " + e.getMessage());
        } finally {
            System.out.println("Обробка запиту завершена.");
        }
    }
}
