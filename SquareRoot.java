package Recursion;

public class SquareRoot {

    public static void main(String[] args){
        int N = 25;
        System.out.println(sqrt(N, 0, N));
    }

    public static int sqrt(int start,int stop, int N){

        if(stop <= start){
            int mid = (start + stop)/2;
        
         if((mid * mid <= N)&&((mid + 1) * (mid +1)> N)){
            return mid;

        }
        else if(mid * mid < N){
          return sqrt(start, mid + 1, N);
        }
        else{
            return sqrt(mid - 1, stop, N);
        }
    }
    return stop;
    }

   
        

 }

    

