package com.stepik.adaptive.task01_016;

//task01_016_generic
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class task01_016_generic {

    private final Map<String, ArithmeticOperation> operations = new HashMap<>();

    public task01_016_generic() {
        initOperationsMap();
    }

    public static void main(String[] args) throws Exception {
        task01_016_generic app = new task01_016_generic();
        app.run();
    }

    private void initOperationsMap() {
        this.operations.put("+", ArithmeticOperation.ADDITION);
        this.operations.put("-", ArithmeticOperation.SUBSTRACTION);
        this.operations.put("*", ArithmeticOperation.MULTIPLICATION);
        this.operations.put("/", ArithmeticOperation.DIVISION);
        this.operations.put("pow", ArithmeticOperation.EXPONENTIATION);
        this.operations.put("div", ArithmeticOperation.DIV);
        this.operations.put("mod", ArithmeticOperation.MOD);
    }

    private void run() {
        double arg1, arg2;
        ArithmeticOperation op;
        try (Scanner in = new Scanner(System.in)) {
            in.useLocale(Locale.US);
            arg1 = in.nextDouble();
            arg2 = in.nextDouble();
            in.nextLine();
            op = this.operations.get(in.nextLine());
        }
        try {
            System.out.println(op.calculate(arg1, arg2));
        } catch (ArithmeticException e) {
            System.out.println("Division by 0!");
        }
    }
}

enum ArithmeticOperation {

    ADDITION {
        @Override
        public <T extends Number> double calculate(T arg1, T arg2) {
            return arg1.doubleValue() + arg2.doubleValue();
        }
    },

    SUBSTRACTION {
        @Override
        public <T extends Number> double calculate(T arg1, T arg2) {
            return arg1.doubleValue() - arg2.doubleValue();
        }
    },

    MULTIPLICATION {
        @Override
        public <T extends Number> double calculate(T arg1, T arg2) {
            return arg1.doubleValue() * arg2.doubleValue();
        }
    },

    DIVISION {
        @Override
        public <T extends Number> double calculate(T arg1, T arg2) {
            if (Double.compare(arg2.doubleValue(), 0.0) == 0) {
                throw new ArithmeticException();
            } else {
                return arg1.doubleValue() / arg2.doubleValue();
            }
        }
    },

    EXPONENTIATION {
        @Override
        public <T extends Number> double calculate(T arg1, T arg2) {
            return Math.pow(arg1.doubleValue(), arg2.doubleValue());
        }
    },

    DIV {
        @Override
        public <T extends Number> double calculate(T arg1, T arg2) {
            return Math.floorDiv(arg1.intValue(), arg2.intValue());
        }
    },

    MOD {
        @Override
        public <T extends Number> double calculate(T arg1, T arg2) {
            return Math.floorMod(arg1.intValue(), arg2.intValue());
        }
    };

    private ArithmeticOperation() {
    }

    protected abstract <T extends Number> double calculate(T arg1, T arg2);
}