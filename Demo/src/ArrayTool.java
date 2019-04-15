

public class ArrayTool {

    private  ArrayTool (){ }
    public static void printArray(int [] arr){

        System.out.println("[");
        for (int x=0;x<arr.length;x++)
        {
            if(x==arr.length-1){
                System.out.println(arr[x]);
            }
            else {
                System.out.println(arr[x]+",");
            }
        }
        System.out.println("]");
    }

    public static int getMax(int [] arr)
    {
        int max=arr[0];
        for (int x=1;x<arr.length;x++)
        {
            if (arr[x]>max)
            {
                max=arr[x];
            }
        }
        return  max;

    }

}
