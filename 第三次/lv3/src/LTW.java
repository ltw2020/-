public class LTW implements ProductConsumer {
    @Override
    public void getProduct(Object objecttt) {
        System.out.println("ltw已经收到了她的"+objecttt.name);
    }
}
