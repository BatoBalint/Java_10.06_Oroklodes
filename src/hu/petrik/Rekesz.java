package hu.petrik;

import java.util.ArrayList;

public class Rekesz {
    private int maxTeherbiras;
    private ArrayList<Palack> palackok;

    public Rekesz(int maxTeherbiras) {
        this.maxTeherbiras = maxTeherbiras;
        this.palackok = new ArrayList<>();
    }

    public int suly() {
        int suly = 0;
        for (Palack p: palackok) {
            suly += p.suly();
        }
        return suly;
    }

    public boolean ujPalack(Palack p) {
        boolean b = false;
        if (this.suly() + p.suly() <= maxTeherbiras) {
            palackok.add(p);
            b = true;
        }
        return b;
    }

    public int osszesPenz() {
        int ossz = 0;
        for (Palack p : palackok) {
            if (p instanceof VisszavalthatoPalack) ossz += ((VisszavalthatoPalack) p).getPalackdij();
        }
        return ossz;
    }

    @Override
    public String toString() {
        String s = "";
        for (Palack p : palackok) {
            s += p.toString() + "\n";
        }
        return s;
    }
}
