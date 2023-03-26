package skypro.hw_spring;

public class CalcService {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return num1 + "+" + num2 + "=" + (num1 + num2);
    }

    public String minus(int num1, int num2) {
        return num1 + "-" + num2 + "=" + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + "*" + num2 + "=" + (num1 * num2);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "введите корректные значения";
        } else {
            return num1 + "/" + num2 + "=" + (num1 / num2);
        }
    }
}