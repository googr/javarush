package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        HashSet<String> hashset = new HashSet<>();
        hashset.add("арбуз");
        hashset.add("банан");
        hashset.add("вишня");
        hashset.add("груша");
        hashset.add("дыня");
        hashset.add("ежевика");
        hashset.add("жень-шень");
        hashset.add("земляника");
        hashset.add("ирис");
        hashset.add("картофель");
        for (String t :
                hashset) {
            System.out.println(t);
        }

    }
}
