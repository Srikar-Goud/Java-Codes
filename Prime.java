import java.util.Scanner;

public class Prime {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for(int i = 2;i<=n/2;i++)
        {
            if(n%i == 0)
            {
                sum += i;
                break;
            }
            System.out.println(sum == 1 ? "Prime":"Not prime");
        }
        
    }
}
