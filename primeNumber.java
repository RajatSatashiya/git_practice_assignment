import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checkPrime(n));
    }

    public static boolean checkPrime(int n) {
        if (n <= 1)
            return false;
        
        if (n <= 3)
            return true;

        for (int i = 4; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
    }
}