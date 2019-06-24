
package epamtask;

import java.util.*;

public class Epamtask {

    static String remove(String str)
    {
        String result = "";
        if(str.length() < 2)
        {
            if(str.length() != 0 && str.charAt(0) != 'A')
                return str;
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        if(sb.charAt(0) == 'A' && sb.charAt(1) == 'A')
            sb.delete(0,2);
        else if(sb.charAt(0) == 'A')
            sb.delete(0,1);
        else if(sb.charAt(1) == 'A')
            sb.delete(1,2);
        result = sb.toString();
        
        return result;
    }

 }
    


