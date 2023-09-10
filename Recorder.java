import java.util.HashMap;
import java.util.Map;

public class Recorder{
    Map<String,String> prefs = new HashMap<String, String>();

    public void put(String key, String value){
        prefs.put(key, value);
        System.out.println(key + "=" + value);
    }

    public void get(String key){
        if(prefs.containsKey(key)){
            System.out.println(prefs.get(key));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void delete(String key){
        if(prefs.containsKey(key)){
            System.out.println("deleted: "+ key);
            prefs.remove(key);            
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void delete(){
        prefs.clear();
        System.out.println("deleted all");
    }

}

