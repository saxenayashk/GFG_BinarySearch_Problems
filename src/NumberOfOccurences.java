public class NumberOfOccurences {
    public static int Method(int arr[],int n,int x)
    {
        int res=LastOccurenceOfEle.Method(arr,n,x) - FirstOccurenceOfEle.Method(arr, n, x)+1;
        return res;
    }
    public static void main(String[] args)
    {
        int arr[]={12,23,23,23,34,34,34,34,45,45,45,45,45};
        System.out.println(Method(arr,arr.length,45));
    }
}
