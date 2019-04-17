public class X {

    Y b=new Y();

    X(){
        System.out.println( "diyi 1 x");
    }
}
    class  Y{
        Y(){
            System.out.println("dier2 y");
        }
    }

    class  Z extends X{
    Y y=new Y();

    Z(){
        System.out.println("di san 3z");
    }

    public static void main(String [] args){

        new Z();

//        先执行 class X , 在执行
//        执行 在执行Z的 对象Y
//        在执行Z（）的方法


    }

    }

