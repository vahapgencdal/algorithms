package com.palindromenumbers;

import org.springframework.stereotype.Component;

@Component
public class Polindrom {


    boolean isPolindrom(Long polindromNumber){
        if(polindromNumber<=0){
            return false;
        }
        char[] chars = polindromNumber.toString().toCharArray();

        for (int i=0;i<chars.length/2;i++){
            if(chars[i]!=chars[chars.length-i-1])
                return false;
        }
        return true;

    }
}
