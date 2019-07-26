package com.task73;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Задана строка с датой вида "22.01.2019 19:15:00". Написать метод который преобразовывает ее в формат "22 Jan, 7:15 PM".
// Предусмотреть обработку ситуации если входящая дата в недопустимом формате.


public class Main {

    public static void main(String[] args) {

        String str = "22.05.2019 20:15:00";

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyy' 'HH:mm:ss", Locale.ENGLISH);
            Date a = sdf.parse(str);
            sdf.applyPattern("dd MMM',' hh:mm a");
            System.out.println(sdf.format(a));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
