import java.util.*;
public class Bwno {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        while(n<1 || n>10)
        {
            System.out.print(n+" is not bw 1 and 10!Try Again:");
            n = sc.nextInt();
        }
        System.out.print(n+" is bw 1 and 10");
    }
}
        