package lab_3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Plate p=new Plate(false,10,30);
        Plug pl=new Plug(false,20,100);
        System.out.println(p);
        System.out.println(pl);
        p.breaken();
        pl.breaken();
        System.out.println(p);
        System.out.println(pl);
    }
}
