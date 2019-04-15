import java.util.Scanner;

public class GuessNumberDemo {

    public void GuessNumberDemo(){
        int number=(int)(Math.random()*100)+1;

        System.out.println("jieguo "+number);

        while (true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入一个数据： 100-1");
            int guess=sc.nextInt();

            if (guess>number)
            {
                System.out.println("ni caicaide shuju "+guess+"大");
            }
            else  if (guess<number)
            {
                System.out.println("nicaide shuju "+guess+"小");

            }
            else  {
                System.out.println("恭喜你相等");
                break;
            }

        }

    }

}
