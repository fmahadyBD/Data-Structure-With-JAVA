import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1{

    void hash(){
        HashMap <String, Integer> em=new HashMap<>();
        em.put("Mahady",1);
        em.put("Fahim",2);
        em.put("Hasan",3);
        em.put("Sa",4);
        em.put("dark",5);
        em.put("Light",6);
        // it is way to added the value..
        System.out.println(em);

        System.out.println(em.get("Fahim"));//  it will show id
        System.out.println(em.containsKey("Fahim"));// contain korele true
        em.putIfAbsent("Tumi", 6);
        System.out.println(em);
        for(Map.Entry<String,Integer> e:em.entrySet()){

            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        System.out.println("Set:");

        Set<String>keys=em.keySet();

        for(String key:keys){
            System.out.println(keys+ " "+em.get(keys));
        }



    }

}