package CalculateExpression;

/*
1. Просмотреть пару роликов про JUnit
2. Создать свой гит-репо (!), который будет содержать мавен-проект, в котором будут зависимости JUnit
3. Решить задание https://acmp.ru/index.asp?main=task&id_task=14
   использовать ломбок и junit (чтобы найти описание зависимость нужно загуглить например junit maven)
4. запушить в свой репо, скинуть мне ссылку (сделайте пж задание)
 */
public class Expression {

    private String expression;

    public Expression(String s) {
        this.expression = s;
    }

    public Double getX() {
        Double firstNumber = getNumberFromString(0, 3);
        Double secondNumber = getNumberFromString(6, 9);

        switch (expression.charAt(3)) {
            case '+' :
                return secondNumber - firstNumber;
            case '-' :
                return firstNumber - secondNumber;
            case '*' :
                return secondNumber / firstNumber;
            case '/' :
                return firstNumber / secondNumber;
        }

        return (double) 0;
    }

    private Double getNumberFromString(int left, int right) {
        return Double.parseDouble(expression.substring(left, right));
    }
}
