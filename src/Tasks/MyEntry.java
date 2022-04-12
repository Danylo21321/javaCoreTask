package Tasks;

import java.util.HashMap;
import java.util.Map;

public class MyEntry<K, V> {
    Map<K, V> map = new HashMap<>();

    public void put(K key, V value){
        map.put(key, value);
    }
    public void removeByKey(K key){
        map.remove(key);
    }
    public void remove(K key, V value){
        map.remove(key, value);
    }
    public void showKey(){
        System.out.println(map.keySet());
    }
    public void showValue(){
        System.out.println(map.entrySet());
    }
    public void sowAllMyEntry(){
        for (Map.Entry<K, V> m : map.entrySet()){
            System.out.println(m);
        }
    }
}
