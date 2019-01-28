package com.stepik.adaptive.task01_016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class task01_016_interface {
    public static void main(String[] args) {
        // put your code here
        new task01_016_interface().runApp();
    }
    private void runApp() {
        MathOperationWithOperands mathOp = new MathOperationWithOperands();

        try {
            double result = calculate(mathOp.getFirstOperand(), mathOp.getSecondOperand(), mathOp.getOperation());
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private double calculate(final double firstOperand, final double secondOperand, final String operation) throws Exception {
        double result;
        Set<String> setOfDivOperations = new HashSet<>(Arrays.asList("/", "mod", "div"));
        if ((setOfDivOperations.contains(operation)) && secondOperand == 0.0) throw new Exception("Division by 0!");

        switch (operation) {
            case "+":
                result = operate(firstOperand, secondOperand, ((a, b) -> a + b));
                break;
            case "-":
                result = operate(firstOperand, secondOperand, ((a, b) -> a - b));
                break;
            case "/":
                result = operate(firstOperand, secondOperand, ((a, b) -> a / b));
                break;
            case "*":
                result = operate(firstOperand, secondOperand, ((a, b) -> a * b));
                break;
            case "mod":
                result = operate(firstOperand, secondOperand, ((a, b) -> Math.floorMod((long) a, (long) b)));
                break;
            case "pow":
                result = operate(firstOperand, secondOperand, (Math::pow));
                break;
            case "div":
                result = operate(firstOperand, secondOperand, ((a, b) -> Math.floorDiv((long) a, (long) b)));
                break;
            default:
                throw new Exception("Operation " + operation + " not supported");
        }

        return result;
    }


    public class MathOperationWithOperands {
        private final double firstOperand;
        private final double secondOperand;
        private final String operation;

        public MathOperationWithOperands() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                firstOperand = Double.parseDouble(reader.readLine());
                secondOperand = Double.parseDouble(reader.readLine());
                operation = reader.readLine();


            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        public double getFirstOperand() {
            return firstOperand;
        }

        public double getSecondOperand() {
            return secondOperand;
        }

        public String getOperation() {
            return operation;
        }
    }

    @FunctionalInterface
    interface QuickMath {
        double operation(final double a, final double b);
    }

    public double operate(final double a, final double b, QuickMath quickMath) {
        return quickMath.operation(a, b);
    }
}
