package task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class CatsCollision {
    private String name;
    private int id;

    private CatsCollision() {

    }

    private CatsCollision(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CatsCollision)) return false;
        CatsCollision that = (CatsCollision) o;
        return name == that.name;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    private void catAdds() {
        HashMap<CatsCollision, String> mapCat = new HashMap<>();
        CatsCollision cat1 = new CatsCollision(1, "Murzic");
        CatsCollision cat2 = new CatsCollision(1, "Barsic");
        CatsCollision cat3 = new CatsCollision(1, "Masya");

        System.out.println("Put" + cat1.toString());
        mapCat.put(cat1, "Murzic");
        System.out.println("Put" + cat2.toString());
        mapCat.put(cat2, "Barsic");
        System.out.println("Put" + cat3.toString());
        mapCat.put(cat3, "thirdValue");

        for(CatsCollision key : mapCat.keySet()) {
            System.out.println(key.hashCode());
        }
    }

    public static void main(String[] args) {
        new CatsCollision().catAdds();
    }
}



