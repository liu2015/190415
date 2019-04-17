public class ExtendsDemo {

    public ExtendsDemo(){
        System.out.println("继承方法");

        C a=new C();

    }


}

class A{

    public  A(){

        System.out.println("测试继承A");
    }
}
class B extends A{

}
class  C extends  B{


}
