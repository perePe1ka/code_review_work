public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Нельзя с нулём");
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver(int a, int b, char operator) {
        if (operator == '+') {
            return add(a, b);
        } else if (operator == '-') {
            return dif(a, b);
        } else if (operator == '*') {
            return times(a, b);
        } else if (operator == '/') {
            return div(a, b);
        } else {
            throw new IllegalArgumentException("Несуществующий оператор: " + operator);
        }
    }
}