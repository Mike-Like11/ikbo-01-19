package lab_1;

import java.util.Scanner;

public class Main {
public static long fact(int a){
    long b=1;
    for(int i=1;i<a+1;i++) {
    b=b*i;
    }
    return b;
}
    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Factorial: "+fact(a));


    }
}
