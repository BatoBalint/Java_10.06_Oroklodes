package hu.petrik;

public class VisszavalthatoPalack extends Palack{
    private int palackdij;

    public int getPalackdij() {
        return palackdij;
    }

    public VisszavalthatoPalack(String nev, int maxUrtartalom, int jelenlegiurtartalom, int palackdij) {
        super(nev, maxUrtartalom, jelenlegiurtartalom);
        this.palackdij = palackdij;
    }

    @Override
    public String toString() {
        return String.format("Visszavalthato%s", super.toString());
    }
}
