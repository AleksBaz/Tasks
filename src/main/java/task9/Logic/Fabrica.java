package task9.Logic;

import task9.Horses.*;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    public String fabricate() {
        Horse nag = new NagHorse();
        int nagResult = nag.speedResult();

        Horse darkHorse = new DarkHorse();
        int darkResult = darkHorse.speedResult();

        Horse warHorse = new WarHorse();
        int warResult = warHorse.speedResult();

        Horse stallion = new Stallion();
        int stallionResult = stallion.speedResult();

        Horse fury = new Fury();
        int furyResult = fury.speedResult();

        Map<String, Integer> map = new HashMap<>();
        map.put("Nag Horse", nagResult);
        map.put("Dark Horse", darkResult);
        map.put("War Horse", warResult);
        map.put("Stallion Horse", stallionResult);
        map.put("Furry Horse", furyResult);

        int totalSpeed2 = 0;
        String winner = "";
        for(Map.Entry<String, Integer> res : map.entrySet()) {
            if(res.getValue() > totalSpeed2) {
                totalSpeed2 = res.getValue();
                winner = res.getKey();
            }
        }
        System.out.println("Winner in this race " + winner + " with speed: " + totalSpeed2);
        return winner;
    }
}
