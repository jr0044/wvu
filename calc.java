public class Calculator {
    public enum Operation {
        add, minus, multiply, divide , xpowerofy 
    }

private Double calculate() {
        if (mode == Operation.normal) {
            return num2;
        }
        if (mode == Operation.add) {
            return num1 + num2;
        }
        if (mode == Operation.minus) {
            return num1 - num2;
        }
        if (mode == Operation.multiply) {
            return num1 * num2;
        }
        if (mode == Operation.divide) {
            return num1 / num2;
        }
        if (mode == Operation.xpowerofy) {
            return pow(num1,num2);
        }

