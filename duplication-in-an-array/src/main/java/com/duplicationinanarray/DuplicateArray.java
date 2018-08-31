package com.duplicationinanarray;

import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.stereotype.Component;

@Component
public class DuplicateArray {

    int duplicate(int numbers[]) throws NotFound {
        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j])
                    return numbers[j];
            }
        }
        throw new NotFound();
    }
}
