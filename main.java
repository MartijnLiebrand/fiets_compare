import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        Fiets f1 = new Fiets("Gazelle", 1);
        Fiets f2 = new Fiets("Batavus", 6);
        Fiets f3 = new Fiets("A-merk", 4);

        ArrayList<Fiets> a1 = new ArrayList<>();

        a1.add(f1);
        a1.add(f2);
        a1.add(f3);
    }

}

class Fiets  {

    public String merk;
    public int id;

    Fiets(String f, int i){
        merk = f;
        id = i;

    }

    @Override
    public String toString(){
        return merk;
    }


}
