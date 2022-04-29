public class PeakEle {
    public static int Method(int arr[],int n)
    {
        int low=0;
        int high=n-1;

        while (low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]<arr[mid+1])
            {
                low=mid+1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args)
    {
      int arr[]={12,23,34,23,12};
      System.out.println(Method(arr,arr.length));
    }
}
