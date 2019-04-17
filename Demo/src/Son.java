public class Son extends Father{

    public  int num=100;
    public int age=20;
    public void show (){
        int age=60;
        System.out.println("jubu"+age);
        System.out.println("本成员类"+this.age);
        System.out.println("父类成员"+super.age);
        System.out.println(num);


    }
}
