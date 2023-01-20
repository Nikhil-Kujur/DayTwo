package task;

import java.util.*;
public class Binary{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();
        System.out.println("Decimal number:" + n);
        System.out.println("Binary: -");
         num(n);
    }
    static void num(int n){
        int[] ar = new int[1000];
        int i = 0;
        while (n>0)
        {
            ar[i] = n%2;
            n = n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--)
        System.out.print(ar[j]);
    }
    
}
