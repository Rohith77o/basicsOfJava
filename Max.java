public class Max{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
       int max=arr[0];
       int max2 =arr[0];
      
       for(int i =0;i<arr.length;i++){
           if(arr[i]>max)
           max = arr[i];
       }
       System.out.println("The largest element in the array : "+max);
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max2&&arr[i]<max)
           max2=arr[i];
       }
       System.out.println("The second largest element in the array :"+max2);
    }
}