import sun.java2d.pipe.OutlineTextRenderer;

import java.util.Random;
import java.util.Scanner;

class lead extends lv1dad{
    public lead(){
        super();
    }
}

class monster extends lv1dad{
    public monster(){
        super();
    }

}


public class lv1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        lead a=new lead();
        System.out.println("请输入主人公的昵称、生命值");
        a.setName(in.nextLine());
        a.setVitality(in.nextInt());
        monster b[]=new monster[3];
        b[0]=new monster();
        b[1]=new monster();
        b[2]=new monster();
        b[0].setName("洛基");b[0].setVitality(1000);
        b[1].setName("海拉");b[1].setVitality(3000);
        b[2].setName("灭霸");b[2].setVitality(5000);
        int ran=(int)(0+Math.random()*(2-0+1));
        System.out.println("你抽到的boss是："+b[ran].getName());

        int zv=a.getVitality();
        int gv=b[ran].getVitality();
        String zn=a.getName();
        String gn=b[ran].getName();
//        int za=a.getAttack();
//        int ga=b[ran].getAttack();
        A:
        for (int i=1;i<=4;i++){
            System.out.println();
            System.out.println("ROUND"+i);
            for (int j=1;j<=6;j++){
                a.setAttack((int)(10+Math.random()*(130-10+1)));
                b[0].setAttack((int)(10+Math.random()*(50-10+1)));
                b[1].setAttack((int)(20+Math.random()*(60-20+1)));
                b[2].setAttack((int)(30+Math.random()*(100-30+1)));
                int za=a.getAttack();
                int ga=b[ran].getAttack();
                if (j==1|j==3|j==5){
                    gv=gv-za;
                    System.out.print(zn+"的第"+(j+1)/2+"个包袱攻击值为"+za+"-----");
                    System.out.println(gn+"遭受"+za+"点暴击，"+gn+"生命力为"+gv);
                }
                else {
                    System.out.print(gn + "的第" + j / 2 + "个包袱攻击值为" + ga + "-----");
                    int def = (int) (0 * Math.random() * (10 - 0 + 1));
                    zv = zv - ga + def;
                    System.out.println(zn + "遭受" + ga + "点暴击，" + zn + " 生命力为" + zv);
                }
                if (zv<=0){
                    System.out.println(zn+"与"+gn+"大战"+i+"回合,不幸牺牲。BUT！正义可能会迟到但不会缺席！下次再战吧！");
                    break A;
                }
                else if (gv<=0){
                    System.out.println(zn+"与"+gn+"大战"+i+"回合,恭喜"+zn+"拯救了世界！！");
                    break A;
                }
                if (i == 4&j==6){
                     if (zv>gv){
                            System.out.println();
                            System.out.println("恭喜"+zn+"拯救了世界！！");
                            System.out.println("\n\n\n");
                            System.out.println("へ　　　　　／|"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println("/＼7　　∠＿/"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println("/　│　　 ／　／"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println("│　Z ＿,＜　／　　 /`ヽ"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println("│　　　　　ヽ　　 /　　〉"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println("Y　　　　　`　 /　　/"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println("ｲ●　､　●　　⊂⊃〈　　/"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println("()　 へ　　　　|　＼〈"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println(">ｰ ､_　 ィ　 │ ／／"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println("/ へ　　 /　ﾉ＜| ＼＼"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println("ヽ_ﾉ　　(_／　 │／／"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println("7　　　　　　　|／"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println("＞―r￣￣`ｰ―＿"+"恭喜"+zn+"拯救了世界！！");
                            System.out.println("恭喜"+zn+"拯救了世界！！");

                        }
                        else {
                            System.out.println();
                            System.out.println(zn+"与"+gn+"大战4回合,惜败。");
                            System.out.println("\n");
                            System.out.println("					_ooOoo_                   ");
                            System.out.println("				   o8888888o                  ");
                            System.out.println("				   88\" . \"88                  ");
                            System.out.println("				   (| -_- |)                  ");
                            System.out.println("				   O\\  =  /O                  ");
                            System.out.println("				____/`---'\\____               ");
                            System.out.println("			  .'  \\|     |//  `.             ");
                            System.out.println("			 /  \\\\|||  :  |||//  \\            ");
                            System.out.println("			/  _||||| -:- |||||-  \\           ");
                            System.out.println("			|   | \\\\\\  -  /// |   |           ");
                            System.out.println("			| \\_|  ''\\---/''  |   |           ");
                            System.out.println("			\\  .-\\__  `-`  ___/-. /           ");
                            System.out.println("		  ___`. .'  /--.--\\  `. . __          ");
                            System.out.println("	   .\"\" '<  `.___\\_<|>_/___.'  >'\"\".       ");
                            System.out.println("	  | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |     ");
                            System.out.println("	  \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /     ");
                            System.out.println(" ======`-.____`-.___\\_____/___.-`____.-'======");
                            System.out.println("                    `=---='                   ");
                            System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                            System.out.println("			   佛祖保佑		 永无BUG                 ");
                            System.out.println("                                              ");
                            System.out.println("			 佛曰: 我佛慈悲                             ");
                            System.out.println();
                            System.out.println("             ltw曰：佛若不渡，那就由我来渡                                 ");
                            System.out.println("----------------------------------------------");

                        
                }
            }

            }
        }



    }
}
