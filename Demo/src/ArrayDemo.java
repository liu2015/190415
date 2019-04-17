//因为这个数组的工具类并没有使用非静态的成员。
//为了方便调用，我们就把这个方法改进为静态修饰的
/*
	制作一个说明书的过程：
		A:写代码
		B:加入文档注释
		C:通过javadoc工具生成说明书
			格式：javadoc -d 目录 -author -version ArrayTool.java
				  javadoc -d doc -author -version ArrayTool.java
			注意：javadoc: 错误 - 找不到可以文档化的公共或受保护的类。
				说明类的权限不够大，用public修饰即可
*/


public class ArrayDemo extends Fu {
public static  void main(String [] args){


        int [] arr={56,38,91,72,42};

        ArrayTool.printArray(arr);
       int a= ArrayTool.getMax(arr);
//需求：遍历数组
    //ArrayTool at = new ArrayTool();
    //at.printArray(arr);

    ArrayTool.printArray(arr);

    //需求：我要获取数组中的最大值


        System.out.println("输出最大数"+a);

        int[] b={221,442,113,44,55};

        int bx;
        bx=ArrayTool.getMx(b);
        System.out.println("最小单据"+bx);

//        dierye
    GuessNumberDemo gu=new GuessNumberDemo();
    gu.GuessNumberDemo();

    //随机数
    /**
     * @ 返回数字
     */

    MathDemo mat=new MathDemo();
    mat.MathDemo();

//    ExtendsDemo dds=new ExtendsDemo();

    ArrayDemo Arr=new ArrayDemo();
    Arr.show2();

    Son so=new Son();
    so.show();

    Student s=new Student();
    s.setName("王祖贤");
    s.setAge(27);
    System.out.println(s.getName()+"  ---"+s.getAge());
    s.eat();
    s.sleep();
    System.out.println("-------");



    Student s2=new Student();
    s2.setName("强哥");
    s2.setAge(25);
    System.out.println(s2.getName()+"  ---"+s2.getAge());
    s2.eat();
    s2.sleep();
    System.out.println("-------");

    Teacher t=new Teacher();
    t.setName("xingming");
    t.setAge(33);
    System.out.println(t.getName()+"  ---"+t.getAge());
    t.eat();
    t.sleep();





}
}
