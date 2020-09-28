package pract_10;

public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("Магия сделала свое дело");
    }

    @Override
    public String toString() {
        return "MagicChair{}";
    }
}
