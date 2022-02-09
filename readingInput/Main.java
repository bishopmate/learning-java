import java.io.*;
import java.util.*;
/*
hello
1 2 3
aks21!
*/
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        int x = cin.nextInt();
        long y = cin.nextLong();
        float f = cin.nextFloat();
        System.out.println(str);
        System.out.println(x + " " + y + " " + f);
    }
}
