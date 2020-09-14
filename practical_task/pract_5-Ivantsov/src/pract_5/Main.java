package pract_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(razvorot_10(34456987,0));
        System.out.println(kolvo_1_11());
        nechet_12();

    }
    public static int razvorot_10(int a,int b){
        if(a>0){
            b=10*b+a%10;
            a/=10;
            return razvorot_10(a,b);
        }
        else{
            return b;
        }
    }
    public static int kolvo_1_11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return kolvo_1_11() + 2;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return kolvo_1_11() +2;
                } else {
                    return 1;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                // Шаг рекурсии / рекурсивное условие
                return kolvo_1_11() +1;
            } else {
                return 0;
            }
        }
    }
    public static void nechet_12() {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n!=0){
           if(n%2==1) {
                System.out.println(n);
           }
           nechet_12();
        }

    }


}
