package com.singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SingletonApplicationTests {

    @Test
    public void eagerTest() {
        Eager eager = Eager.getInstance();
        System.out.println(eager.toString());
        //Eager eager1=new Eager(); private access error will throw
    }

    @Test
    public void lazyTest() {
        Lazy lazy = Lazy.getInstance();
        System.out.println(lazy.toString());
      //  Lazy lazy1=new Lazy(); private access error will throw
    }

    @Test
    public void staticBlockTest() {
        StaticBlock staticBlock=StaticBlock.getInstance();
        System.out.println(staticBlock.toString());
       // StaticBlock st=new StaticBlock(); private access error will throw
    }

}
