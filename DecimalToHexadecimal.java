package SignimusTechnologyTask;

public class DecimalToHexadecimal {
    public static void main(String []args){
        int n = 496;
        String res = " ";
        while (n !=0){
            int r = n %16;
            switch(r){

                case10 : res ="A" + res; 
                break;

                case11 : res ='B' + res;
                break;

                case12 : res = 'C' + res;
                break;

                case13 : res = 'D' + res;
                break;

                case14 : res = 'E' +  res;
                break;

                case15 : res = 'F' + res;
                default :
                res = r + res;

            }
                  n = n/16;
        System.out.println(res);
        }
    }

}
