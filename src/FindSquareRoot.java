public class FindSquareRoot {
    public static int getSquareRoot(int n)
    {
        int low=0;
        int high=n;

        int ans=-1;
        while (low<=high)
        {
            int mid=(low+high)/2;

            if(mid*mid<=n)
            {
                ans=mid;
                low=mid+1;
            }
            else if(mid*mid>n)
            {
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
      System.out.println(getSquareRoot(38));
    }
}
