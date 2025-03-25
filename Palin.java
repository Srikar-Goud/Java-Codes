import java.util.*;
public class Palin {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        boolean isPalindrome = true;
        for(int i = 0,j=n.length()-1;i<j;i++,j--)
        {
            if(n.charAt(i) == n.charAt(j))
            {
                continue;
            }
            else
            {
                isPalindrome = false;
                break;
            }
        }System.out.print(isPalindrome ? "Palindrome" : "Not palindrome");
    }
}
