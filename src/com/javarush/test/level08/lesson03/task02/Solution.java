package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Map<String, String> hashset = new HashMap<String, String>();
        hashset.put("арбуз", "ягода");
        hashset.put("банан", "трава");
        hashset.put("вишня", "ягода");
        hashset.put("груша", "фрукт");
        hashset.put("дыня", "овощ");
        hashset.put("ежевика", "куст");
        hashset.put("жень-шень", "корень");
        hashset.put("земляника", "ягода");
        hashset.put("ирис", "цветок");
        hashset.put("картофель", "клубень");
        for ( Map.Entry<String, String> pair :
                hashset.entrySet()) {
            String key = pair.getKey();
            String val = pair.getValue();
            System.out.println(key+" - "+val);
        }

    }
}
