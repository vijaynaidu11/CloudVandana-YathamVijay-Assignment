import java.util.*;
class JavaArray
{
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        Random ran = new Random();
        for(int i = n-1; i > 0;i--)
        {
            int ranNum = ran.nextInt(i+1);
            System.out.print(ranNum);
            int temp = arr[i];
            arr[i] = arr[ranNum];
            arr[ranNum]= temp;
        }

      System.out.print("After Suffled : [");
      for(int element:arr)
      {
        System.out.print(element+" ");
      }
      System.out.print("]");
        
        
       
    }
}