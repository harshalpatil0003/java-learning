import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        int rev=0;
        int num=new Scanner(System.in).nextInt();
         while(num>0 || num<0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
         }
         System.out.println(rev);
    }
}