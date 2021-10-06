package hu.petrik;

public class Palack {

    private String nev;
    private int maxUrtartalom;
    private int jelenlegiUrtartalom;

    public int getJelenlegiUrtartalom() {
        return jelenlegiUrtartalom;
    }

    public void setJelenlegiUrtartalom(int jelenlegiUrtartalom) {
        if (jelenlegiUrtartalom > this.maxUrtartalom) this.jelenlegiUrtartalom = this.maxUrtartalom;
        else this.jelenlegiUrtartalom = jelenlegiUrtartalom;
        if (this.jelenlegiUrtartalom == 0) this.nev = null;
    }

    public Palack(String nev, int maxUrtartalom, int jelenlegiUrtartalom) {
        this.nev = nev;
        this.maxUrtartalom = maxUrtartalom;
        this.jelenlegiUrtartalom = jelenlegiUrtartalom;
    }

    public Palack(String nev, int maxUrtartalom) {
        this.nev = nev;
        this.maxUrtartalom = maxUrtartalom;
        this.jelenlegiUrtartalom = 1;
    }

    public double suly() {
        return this.maxUrtartalom / 35 + this.jelenlegiUrtartalom;
    }

    @Override
    public String toString() {
        return String.format("Palack, benne levo ital: $s, jelenleg: %d ml van benne, maximum %d ml fer bele.",
                this.nev, this,jelenlegiUrtartalom, this,maxUrtartalom);
    }
}
