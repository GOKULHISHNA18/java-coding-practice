public class Scondlargestelement {

    public static void main(String[] args){

        int[] arr = {100,130,150,200,60,85,96,180};

        int max = arr[0];
        int secmax = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secmax = max;
                max=arr[i];
            }
            else if (arr[i] > secmax && arr[i] != max) {
                secmax = arr[i];
            }
        }

        System.out.println(secmax);
    }
    
}
