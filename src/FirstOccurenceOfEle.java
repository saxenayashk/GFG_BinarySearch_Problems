

public class FirstOccurenceOfEle {
    public static int Method(int arr[],int n,int x)
    {
        int low=0;
        int high=n-1;

        while (low<=high)
        {
            int mid=high+(low-high)/2;

            if(arr[mid]<x)
            {
                low=mid+1;
            }
            else if(arr[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                if(mid==0 || arr[mid]!=arr[mid-1])
                {
                    return mid;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
       return -1;
    }
    public static void main(String[] args)
    {
      int arr[]={12,23,23,23,34,34,34,34,45,45,45,45};
      System.out.println(Method(arr,arr.length,45));
    }
}
