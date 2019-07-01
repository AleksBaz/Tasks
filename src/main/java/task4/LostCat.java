package task4;

import java.util.HashMap;
import java.util.Objects;

public class LostCat {
    private String name;
    private int id;

    LostCat() {

    }

    private LostCat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostCat lostCat = (LostCat) o;
        return id == lostCat.id &&
                Objects.equals(name, lostCat.name);
        }


    void catLost() {
        HashMap<LostCat, String> lostCat = new HashMap<>();
        LostCat cat4 = new LostCat(1, "Snejok");
        LostCat cat5 = new LostCat(2, "Snejanna");
        LostCat cat6 = new LostCat(3, "Poteriashka");

        lostCat.put(cat4, "Snejok");
        lostCat.put(cat5, "Snejanna");
        lostCat.put(cat6, "Poteriashka");

        cat6.id++;
        String cat6Name = lostCat.get(cat6);
        System.out.println(cat6Name);

        HashMap<LostCat, String> newCats = new HashMap<>(lostCat);
        String cat6Name2 = newCats.get(cat6);
        System.out.println(cat6Name2);
    }
}
