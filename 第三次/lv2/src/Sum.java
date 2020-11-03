public class Sum implements Calculate{
    double sum;
    @Override
    public void calculate(double x, char operate, double y) {

        switch (operate) {
            case '+':
                sum = x + y;
                System.out.println(sum);
//                return sum;               不能有return
                break;
            case '-':
                sum = x - y;
                System.out.println(sum);
//                return sum;
                break;
            case '*':
                sum = x * y;
                System.out.println(sum);
//                return sum;
                break;
            case '/':
                sum = x / y;
                System.out.println(sum);
//                return sum;
                break;
            default:
                System.out.println("请输入正确的四则运算符号");
                break;
        }


    }
}
