import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        System.out.println(i + scan.nextInt());
        System.out.println(d + scan.nextDouble());
        String str = scan.nextLine();
        System.out.print(s);
        System.out.print(scan.nextLine());
        scan.close();
    }
}