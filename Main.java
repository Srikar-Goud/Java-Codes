import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0)
        System.out.println("This is a even :" +n);
        if(n%2 != 0)
        System.out.println("odd number :" +n);
    }
}