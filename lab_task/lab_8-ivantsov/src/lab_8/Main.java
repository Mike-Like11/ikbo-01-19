package lab_8;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try(FileWriter writer = new
                FileWriter("example.txt", false))
        {
            // запись всей строки
            String text = "dsfdsfdsfsfdsfdsfdsf";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('H');
            writer.append('\n');
            writer.append('E');
            writer.append('\n');
            writer.append('L');
            writer.append('\n');
            writer.append('L');
            writer.append('\n');
            writer.append('O');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

