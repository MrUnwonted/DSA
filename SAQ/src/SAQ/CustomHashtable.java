package SAQ;

import java.util.Hashtable;
import java.util.Map;

public class CustomHashtable {

    public static void main(String[] args) {

//        Hashtable<Integer, String> table = new Hashtable<>(10);
        Hashtable<String,Integer> mapp = new Hashtable<>(10);

        mapp.put("Age",22);
        mapp.put("Age",22);
        mapp.put("Age",22);


        for(String key : mapp.keySet()){
            System.out.println(key + "\t" + mapp.get(key));
        }

        System.out.println(mapp);




    }




}