package pract_12;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a="+104289652211";
        System.out.print('+');
        if(a.charAt(0)=='+'){
            System.out.print('<'+a.substring(1,a.length()-10)+">-<"
                    +a.substring(a.substring(1,a.length()-10).length()+1,a.length()-7)
                    +">-<"+a.substring(a.length()-7,a.length()-4)
                    +">-<"+a.substring(a.length()-4,a.length())+">");
        }
        else {
            System.out.print("<7>"+"-<"
                    +a.substring(a.substring(1,a.length()-10).length()+1,a.length()-7)
                    +">-<"+a.substring(a.length()-7,a.length()-4)
                    +">-<"+a.substring(a.length()-4,a.length())+">");
        }
    }
}
