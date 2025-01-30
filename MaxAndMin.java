package Task8;

public class MaxAndMin {

    public static void main(String[] args) {
        
        int [] a = {5, 9, 4, 8, 2 ,3};

        int  len = a.length ;

        int max = a[0] ;
        int min = a[0];

        for (int i=0; i<len ; i++){

            if(a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }
        }

        System.out.println("Maximum Value is the Array :"+ max);
        System.err.println("Minimum Value is the Array :"+min);
    }

}
