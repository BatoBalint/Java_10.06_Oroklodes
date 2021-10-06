package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Test {
    private ArrayList<Rekesz> rekeszek;

    public Test() {
        rekeszek = new ArrayList<>();
        //elso();
        masodik();
    }

    public void elso() {
        Palack p1 = new Palack("tej", 1000, 1000);
        Palack p2 = new Palack("kakao", 500, 200);
        VisszavalthatoPalack vp1 = new VisszavalthatoPalack("Cola", 200, 200, 25);

        Rekesz r1 = new Rekesz(5000);
        rekeszek.add(r1);
        r1.ujPalack(p1);
        r1.ujPalack(p2);
        r1.ujPalack(vp1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(vp1);
        System.out.println("\n\n" + r1);
    }

    private void masodik() {
        Beolvas();
        for (int i = 0; i < rekeszek.size(); i++) {
            System.out.println((i + 1) + ". Rekesz\n" + rekeszek.get(i).toString());
        }
    }

    private void Beolvas() {

        try {
            rekeszek.add(new Rekesz(1000));
            FileReader fr = new FileReader("palackok.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                Palack p;
                String[] data = line.split(";");
                if (data.length == 2) {
                    p = new Palack(data[0], Integer.parseInt(data[1]));
                } else if (data.length == 3) {
                    p = new Palack(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                } else {
                    p = new VisszavalthatoPalack(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]));
                }
                boolean siker = rekeszek.get(rekeszek.size() - 1).ujPalack(p);
                if (!siker) {
                    rekeszek.add(new Rekesz(1000));
                    rekeszek.get(rekeszek.size() - 1).ujPalack(p);
                }
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
