

public class FindPivotEle {
    public static int Method(int arr[],int n)
    {
        int low=0;
        int high=n-1;

        while (low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=arr[0])
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
          int arr[]={8,12,13,1,3};
          System.out.println(Method(arr,arr.length));
    }
}
