package com.task75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Есть List объектов у каждого из которых 2 поля: int и String.
// Удалить те у которых значения int повторяются(оставить по одному из дубликатов).

public class Main {

    public static void main(String[] args) {
        ArrayList<Entity> list = new ArrayList<>();

        list.add(new Entity("aa", 1));
        list.add(new Entity("bb", 2));
        list.add(new Entity("cc", 3));
        list.add(new Entity("dd", 4));
        list.add(new Entity("ee", 5));
        list.add(new Entity("AA", 1));
        list.add(new Entity("ff", 6));
        list.add(new Entity("hh", 7));
        list.add(new Entity("CC", 3));


        System.out.print("List=");
        for (Entity obj : list) {
            System.out.print(obj.getStr() + obj.getValue() + " ");
        }
        System.out.println();

        Set<Entity> set = new HashSet<>();

        for (Entity obj : list) {
            set.add(obj);
        }


        list = new ArrayList<>(set);

        System.out.print("List=");
        for (Entity obj : list) {
            System.out.print(obj.getStr() + obj.getValue() + " ");
        }
        System.out.println();

    }
}
