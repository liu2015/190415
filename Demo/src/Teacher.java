public class Teacher extends Person{

    private  String name;
    private  int age;
    public Teacher(){}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public Teacher (String name, int age){

        this.name=name;
        this.age=age;

    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }


}
