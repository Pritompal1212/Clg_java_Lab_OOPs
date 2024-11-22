public class weektwo1 {
    int BinarySearch(int arr[], int l,int r, int x){
        while (l<=r){
            int mid=(l+r)/2;
            if (arr[mid]==x){
                return mid;
            }
            else if (arr[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        weektwo1 ob=new weektwo1();
        int arr[]={1,2,3,4,5,79,90};
        int n=arr.length;
        int x=90;
        int result=ob.BinarySearch(arr,0,n-1,x);
        if (result == -1){
            System.out.println("element not present ");
        }
        else{
            System.out.println("element is found at index : "+ result);
        }
    }
}
