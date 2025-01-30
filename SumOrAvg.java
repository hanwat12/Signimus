package Task8;

public class SumOrAvg {

    public static void main(String[] args) {
        
        int [] arr =  {10, 20 , 30 , 40 , 50};

        int len = arr.length;

        int sum =0;
        int count =0;

        for(int i =0; i< len; i++){
            sum = sum + arr[i];
            count++;
        }
        int Avg = sum / count ;

        System.out.println("Sum of All elements :"+sum);

        System.out.println("Average of All elements : "+ Avg);
    }

}
