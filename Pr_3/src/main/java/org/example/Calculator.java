package org.example;

public class Calculator {

    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public double sub(double num1, double num2) {
        return num1 - num2;
    }
    public double mul(double num1, double num2) {
        return num1 * num2;
    }
    public double div(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Ділення на нуль не допускається.");
        }
        return num1 / num2;
    }
    public double squareRoot(double num1) throws InvalidInputException {
        if (num1 < 0) {
            throw new InvalidInputException("Не можна обчислити квадратний корінь з від'ємного числа.");
        }
        return Math.sqrt(num1);
    }
}
