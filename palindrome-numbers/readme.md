##Polindrom Numbers  
Think a positive number when you read from start and end is same. This numbers is Polindrom numbers.  
###Question
Please implement a function that checks whether a positive number is a palindrome or not.   
For example, 121 is a palindrome, but 123 is not.  

###Solution  
add your number each character to a char array than.  
look i and n-i character of array.  
than i+1 n-(i+1) character of array.  
... 
Example:  
1234321  
charArr=['1','2','3',4','3','2','1'] ;  
int lngth=charArr.length/2;  


for i to  lngth    
if(charArr[i]!=charArr[charArr.length-1-i]) 
return false;  
end loop  
return true;

   




