A class follows the singleton pattern if it can have one instance at most    
###Where to use  
Think a Logger class every class using logger.  if every class create new instance of logger  
our projects memory be full maybe and logger always doing samething  
in this case if you use one instance this will be better than.  

And Frameworks example.  
For example this is spring project. when you use @Component annotation  
spring say you want single instance of this class okey I will create for  
you dont create your self. 


You can find many implementation of it in google.  
But I will define only eager,static block and lazy implementations.  

###Eager  
This is the basic one  
create a private static final class instance
create a private constructor for not create an instance of class.  
and create an public static method for get which instance you defined private static final.  

###static block  
The main different from eager just create instance of object  
static blocks works before the constructor. and you will create it in there.  
then you call it with static method.  

###Lazy  
I dont like this implementation but you can use even so.  
you control instance when call it if instance there get it if not create one.  




