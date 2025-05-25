import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.next();

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        System.out.println("The number of '" + c + "' in \"" + s + "\" is: " + countChar(s, c));

        System.out.println("The index of '" + c + "' in \"" + s + "\" is: " + searchChar(s, c));
        
        System.out.println("The number of uppercase letters: " + countUpperChar(s));
        
        System.out.println("String after filtering number is: " + filterNum(s));
        
        System.out.println("Reverse string: " + reverse(s));

        System.out.print("Enter the string to search: ");
        String s1 = sc.next();
        System.out.println("The index of '" + s1 + "' in \"" + s + "\" is: " + s.indexOf(s1.toLowerCase())); 
    }



    public static String filterNum(String s) {
        for (int i = 0; i < s.length(); i++) 
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') 
                s = s.replace(s.charAt(i--) + "", "");
        return s;
    }

    public static int countUpperChar(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                count++;
        return count;
    }

    public static String reverse(String s) {
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--)
            rev += s.charAt(i);
        return rev;
    }

    public static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == c)
                count++;
        return count;
    }

    public static int searchChar(String s, char c) {
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == c)
                return i;
        return -1;
    }
}