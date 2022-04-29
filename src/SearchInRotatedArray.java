public class SearchInRotatedArray {
    public static int getPivot(int arr[],int n)
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

    public static int binarySearch(int arr[],int low,int high,int x)
    {
        while (low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]<x)
            {
                low=mid+1;
            }
            else if(arr[mid]>x)
            {
                high=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static int findPosition(int arr[],int n,int x)
    {
        int pivot=getPivot(arr,n);
        if((x<=arr[pivot])&&(x>=arr[n-1]))
        {
            return binarySearch(arr,pivot,n-1,x);
        }
        else
        {
            return binarySearch(arr,0,pivot-1,x);
        }
    }
    public static void main(String[] args)
    {
        int arr[]={7,8,9,1,2,3,4};
        int n=arr.length;
        int x=8;
        System.out.println(findPosition(arr,n,x));
    }
}
