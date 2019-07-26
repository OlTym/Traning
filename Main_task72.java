package com.task72;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

//Задан текстовый файл. Вывести сколько в нём: a) строк b) слов c) символов

public class Main {
    public static void main(String[] args) {
        int countString = 0;
        int numbChar = 0;
        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Sample.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                countString++;
                for (String str : line.split(" ")) {
                    list.add(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String str : list)
            numbChar += str.length();

        System.out.println("String number=" + countString);
        System.out.println("World number=" + list.size());
        System.out.println("Character number=" + numbChar);


    }
}
