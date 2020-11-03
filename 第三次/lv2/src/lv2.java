import java.util.Scanner;

public class lv2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=in.nextDouble();
        String oper=in.next();           // 不能直接输入一个char，用string转换一下
        char operate=oper.charAt(0);
        double y= in.nextDouble();

        Sum sum=new Sum();
        sum.calculate(x,operate,y);

    }
}
