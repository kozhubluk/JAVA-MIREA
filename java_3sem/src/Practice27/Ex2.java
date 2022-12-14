package Practice27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    private Map<String, ArrayList<String>> map;

    public Ex2(){
        map = new HashMap<>();
    }

    public void addRecord(String key, String value) {
        if(map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            map.put(key, new ArrayList<>());
            map.get(key).add(value);
        }
    }
    public void createMap()
    {
        this.addRecord("Иванов", "Иван");
        this.addRecord("Смирнов", "Сергей");
        this.addRecord("Петров", "Петр");
        this.addRecord("Петров", "Иван");
        this.addRecord("Смирнов", "Иван");
        this.addRecord("Попов", "Иван");
        this.addRecord("Смирнов", "Александр");
        this.addRecord("Иванов", "Петр");
        this.addRecord("Попов", "Сергей");
        this.addRecord("Попов", "Олег");

    }

    public int getSameLastNameCount(String key) {
        if(map.containsKey(key))
            return map.get(key).size();
        return 0;
    }
    public int getSameFirstNameCount(String value) {
        int count = 0;
        for(Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            for (String name : item.getValue()) {

                if (name.equals(value))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Ex2 map = new Ex2();
        map.createMap();
        System.out.println(map.getSameFirstNameCount("Иван"));
        System.out.println(map.getSameLastNameCount("Попов"));
    }
}
