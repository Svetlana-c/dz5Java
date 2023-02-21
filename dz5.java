import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class dz5 {
    public static void main(String[] args) throws IOException{
// 1. Создать словарь HashMap. Обобщение <Integer, String>.

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Black"); //2.Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
         map.put(2, "Green");
         map.put(3, "Pink");
         System.out.println(map);
         
         System.out.println(map.put(1, "Black!")); //3.Изменить значения дописав восклицательные знаки.
         System.out.println(map.put(2, "Green!"));
         System.out.println(map.put(3, "Pink!"));
         System.out.println(map);
         
//4.Создать TreeMap, заполнить аналогично.
    TreeMap<Integer, String> map2 = new TreeMap<>();
    map2.put(4, "Red!");
    map2.put(5, "Orange!");
    map2.put(6, "White!");
    System.out.println(map2);
//5/*Увеличить количество элементов до 1000 случайными ключами и общей строкой.
for (int i = 0; i < 1000; i ++){
    map.put(i, " ");
}
for (int k = 0; k < 1000; k ++){
    map2.put(k, " ");
}
System.out.println(map);
System.out.println(map2);


//**Сравнить время последовательного и случайного перебора тысячи элементов словарей.
long start1 = System.currentTimeMillis();
for (Integer key: map.keySet())
    map.get(key);
long end1 = System.currentTimeMillis();
long start2 = System.currentTimeMillis();
for (Integer key: map2.keySet())
    map2.get(key);
    long end2 = System.currentTimeMillis();
System.out.println("Время перебора map: " + (end1 - start1));
System.out.println("Время перебора map2: " + (end2 - start2));

    }
}