package lab_9;

import java.util.Objects;

public class ThrowDemo {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    public String getDetails(String key) {
        if(Objects.equals(key, "")) {
            throw new NullPointerException( "0 в getDetails" );
        }
        return "data for" + key;
    }
}
