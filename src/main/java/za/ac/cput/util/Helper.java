package za.ac.cput.util;
/*
 *Product:java
 *Product: Helper Class
 * Author: Zachariah Matsimella
 * Date: 21 March 2024
 */

import java.util.UUID;

public class Helper{
    public static boolean isNullOrEmpty(String s){
        if (s == null || s.isEmpty())
            return true;
        return false;
    }

    public  static String generateId(){
        return UUID.randomUUID().toString();
    }
}