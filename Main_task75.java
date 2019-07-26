package com.task75;

import java.util.ArrayList;

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
        list.add(new Entity("gg", 8));
        list.add(new Entity("ll", 9));

        System.out.print("List=");
        for (Entity obj : list)
            System.out.print(obj.getStr() + obj.getValue() + " ");
        System.out.println();

        ArrayList<Integer> list1 = new ArrayList<>();

        for (Entity obj : list)
            for (int i = 0; i < list.size(); i++) {
                if (obj.equals(list.get(i)) && obj.hashCode() != list.get(i).hashCode())
                    list1.add(i);
            }


        int index = 0;


        for (int i = 0; i < list.size(); i++) {
            for (int k = 0; k < list1.size(); k++) {
                index = list1.get(k);

                if (index < list.size()) {
                    if ((list.get(i).equals(list.get(index))) && (list.get(i).hashCode() != list.get(index).hashCode())) {
                        list.remove(index);
                    }
                }
            }
        }

        System.out.print("List=");
        for (Entity obj : list)
            System.out.print(obj.getStr() + obj.getValue() + " ");
    }
}
