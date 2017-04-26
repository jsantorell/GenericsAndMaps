/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.Labs;

import java.util.*;

/**
 *
 * @author jerem
 */
public class Practice0 {
    
    public static void main(String[] args) {
        Map mymap = new HashMap();
        
        mymap.put("small", 5);
        mymap.put("medium", 10);
        mymap.put("large", 20);
        
        Integer i = (Integer) mymap.get("medium");
        System.out.println(i);
        
        Map mymap1 = new HashMap();
        
        mymap1.put(1, "Jan");
        mymap1.put(2, "feb");
        mymap1.put(3, "mar");
        
        String i1 = (String) mymap1.get(1);
        System.out.println(i1);
        
        Set keys = mymap1.keySet();
        
        for (Object key : keys){
        
        String i2 = (String) mymap1.get(key);
            System.out.println(i2);
        
        }
        
        Collection col = mymap1.values();
        
        for (Object c : col){
        
        String i3 = (String) c;
            System.out.println(i3);
        }
        //End Not Generic<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
        
        Map<String, Integer> mymap3 = new HashMap<>();
        
        mymap3.put("bob", 12);
        mymap3.put("Don", 50);
        mymap3.put("Rage", 10);
        
        
        
    }
    
}
