package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("n1", "f1");
        map.put("n11", "f1");
        map.put("n12", "f1");
        map.put("n13", "f1");
        map.put("n14", "f1");
        map.put("n15", "f1");
        map.put("n16", "f1");
        map.put("n17", "f1");
        map.put("n18", "f1");
        map.put("n19", "f1");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int coun=0;
        String prevName=null;
        for ( Map.Entry<String, String> pair : map.entrySet()) {
            if(pair.getValue().equals(prevName)){
                coun++;
            }
            prevName = pair.getValue();

        }
        return coun;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int coun=0;
        String prevName=null;
        for ( Map.Entry<String, String> pair : map.entrySet()) {
            if(pair.getKey().equals(prevName)){
                coun++;
            }
            prevName = pair.getKey();

        }
        return coun;
    }
}
