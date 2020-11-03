public class Jing implements ProductMaker{
    private ProductConsumer ltw;
    public void setProductConsumer(ProductConsumer productConsumer){ //前面那个set没有联想，说明跟之前的东西没关系，括号里都有联想
        this.ltw=productConsumer;
    }

    @Override
    public void getOrder() {
        Object object=new Object("ipad pro");
        System.out.println("已收到您的"+object.name+"订单");
    }

    @Override
    public void sendProduct() {
        System.out.println("您的订单正在准备发货....");
    }

    @Override
    public void callConsumer() {
        Object object2=new Object("ipad pro"); //之前在别的方法里实例的对象不能用
        ltw.getProduct(object2);  //这里是通过传参数的方法把实例的对象传走了，其实如在LTW类中直接实例就用不到括号里的东西了


    }
}
