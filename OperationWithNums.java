package Recursion;

public class OperationWithNums {

    public static void main(String[] args){

        // int answer = add(123456);
        // System.out.println(answer);
        
        int solution = product(44);
        System.out.println(solution);
    }

    // Addition of numbers
    public static int add(int a){
        if(a == 0){
            return 0;
        }

        return (a % 10)  +  add(a / 10);
    }


    // Product of Numbers
    
    public static int product(int a){
        if(a%10 == a){
            return a;
        }
        return (a % 10) * (a / 10);
    }

    

   
    
}
