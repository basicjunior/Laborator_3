package ro.mta.facc.selab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> carti;

    public Biblioteca() {
        carti = new ArrayList<Carte>();
    }

    public void add(Carte c){
        carti.add(c);
    }

    public void sort(){
        Collections.sort(carti);
    }

    @Override
    public String toString() {
        StringBuilder builder;
        builder = new StringBuilder();
        builder.append("Biblioteca contine: \n");

        for (Carte c : carti)
        {
            builder.append(c);
            builder.append("\n");

        }
        return builder.toString();

    }
}
