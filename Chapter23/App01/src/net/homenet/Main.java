package net.homenet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] cars = new String[]{"Tico", "Sonata", "BMW", "Benz", "Lexus", "Mustang", "Grandeure", "The Beetle"
            , "Mini Cooper", "i30", "BMW", "Lexus", "Canibal", "SM5", "SM7", "SM3", "Tico"};

        Main app = new Main();
        app.hashSetSample(cars);
    }

    private void hashSetSample(String[] cars) {
        if (cars == null) return;

        Set<String> carSet = new HashSet<>();

        //# 1.Add
        //for (String car : cars) {
        //    carSet.add(car);
        //}

        //# 2.Add
        Collections.addAll(carSet, cars);

        //# 1.Iterator
        for (String car : carSet) {
            System.out.print(car + " ");
        }

        //# 2.Iterator
        //Iterator<String> iterator = carSet.iterator();
        //while (iterator.hasNext()) {
        //    System.out.print(iterator.next() + " ");
        //}

        System.out.println();
        System.out.println("Size=" + carSet.size());
    }
}
