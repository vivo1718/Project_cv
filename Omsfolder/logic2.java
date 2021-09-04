public class logic2 {
    public static void main(String args[]){
        int arr[] = {12,22,3,67,99};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<10){
                arr[i] = arr[i]%10;
            }
            else if(arr[i]>10){
                arr[i] = (int)arr[i]/10;
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
    
}
