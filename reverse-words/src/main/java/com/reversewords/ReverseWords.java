package com.reversewords;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ReverseWords {

    public String reverse(String sentence){
        StringBuffer strb=new StringBuffer();
        if(StringUtils.isEmpty(sentence)){
            return sentence;
        }
        String[] strs = sentence.split(" ");
        for (int i=strs.length-1;i>=0;i--) {
            strb.append(strs[i]+" ");
        }
        return strb.toString().substring(0,strb.toString().length()-1);
    }
}
