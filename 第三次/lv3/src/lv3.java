public class lv3 {
    public static void main(String[] args) {
        LTW ltw=new LTW();
        Jing jing=new Jing();
        jing.setProductConsumer(ltw);
        jing.getOrder();
        jing.sendProduct();
        jing.callConsumer();
    }
}

