public class logic {
    public static void main(String args[]){
        int arr[] = new int[3];
        int num = 915;
        int n = num;
        int r=0,s=0;
        int i=0;
        while(n>0 && i<arr.length){
            r = n%10;
            s = 2*r+1;
            arr[i] = s;
            i++;
            n=n/10;
        }
        for(int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
        //System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" ");
        int c = 12%10;
        System.out.println(c);
    }
    
}
