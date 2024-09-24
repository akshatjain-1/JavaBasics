import java.util.*;

public class JavaBasics {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
        
    }

    //sum of 2 nos
    public static int sum(int a , int b) {
        return a+b;
        
    }
    //sum of 3 nos
    public static int sum(int a , int b, int c) {
        return a+b+c;
        
    }

    //check prime number

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void BinToDec(int BinNum) {
        int myNum= BinNum;
        int pow= 0;
        int decNum= 0;

        while (BinNum > 0) {
            decNum = decNum + (BinNum % 10) * (int)Math.pow(2, pow);
            BinNum = BinNum / 10;
            pow++;
        }

        System.out.println("Decimal of " + myNum + " is" + decNum);
        
    }
    public static void main(String[] args) {
       BinToDec(111100011);
            
            
        
    }

}

