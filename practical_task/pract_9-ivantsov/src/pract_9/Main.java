package pract_9;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {

   static void proverka(Map<String,Integer> bank_user,String name, int inn){
        int inn2=bank_user.get(name);
        if(inn!=(inn2)){
            throw new NoSuchElementException("wrong INN");
        }
        else{
            System.out.println("данные введены правильно");
        }
    }
    public static void main(String[] args) {
	// write your code here
         Map<String,Integer> bank_user=new HashMap<String, Integer>();
         bank_user.put("Mike",55555);
         bank_user.put("Dan",123245);
         bank_user.put("Victor",111111);
         try {
             proverka(bank_user,"Mike",55555);
         } catch (NullPointerException e) {
            System.out.println(e);
         }
        try {
            proverka(bank_user,"Dan",12345);
        } catch (NoSuchElementException  e) {
            System.out.println(e);
        }

    }
}
