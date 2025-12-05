public class Calculator {

    public static  int  sum(int a,int b){
        return a + b;
    }


    public static  int sub(int a,int b){
        return a - b;
    }


    public static  int mul(int a,int b){
        return a * b;
    }


    public static  int div(int a,int b){
        return a / b;
    }


    public static  int mod(int a,int b){
        return a % b;
    }


    public static  int pow(int a,int b){
        int k = a ;
        for (int i = 1; i < b; i++){
            a = a * k;
        }
        return a;
    }


    public static  int jok(int a,int b){
        if ( b > a ){
            return b + jok(a ,b-1);
        }else{
            return b ;
        }
    }

    public static int factorial(int n){
        if ( n > 1){
            return n * factorial(n-1);
        }else {
            return 1;
        }
    }

}
