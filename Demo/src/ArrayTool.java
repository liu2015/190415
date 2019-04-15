/**
 * 这是针对数组进行操作的工具类
 * @author fqy
 * @version V1.0
 */

public class ArrayTool {
//把构造方法私有
    /**
     * 这是私有构造方法
     */
    private  ArrayTool (){ }
    /**
     * 遍历数组，格式是：[元素1, 元素2, ...]
     * @param arr 需要被遍历的数组
     */
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

    /**
     * 获取数组中的最大值
     * @param arr 被获取最大值的数组
     * @return int 返回数组中的最大值
     */

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

/**
 * 获得数组中的最小值
 * @param  arr 参数数组
 * @return int 返回数组最小值
 */

public  static  int  getMx(int [] arr){
    int getMx=arr[0];
    for (int i=1;i<arr.length;i++)
    {
        if (arr[i]<getMx)
        {
            getMx=arr[i];
        }
    }
    return  getMx;
}
}
