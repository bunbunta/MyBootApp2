package jp.te4a.spring.boot.myapp2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{

    @Test
    public void Test_taro()
    {
        HelloController helloController = new HelloController();
        String expect = "Taro desu!";
        String actual = helloController.taro();
        assertEquals(expect, actual);;
    }

    @Test
    public void Test_index()
    {
        HelloController helloController = new HelloController();
        String expect = "Hello World!";
        String actual = helloController.index();
        assertEquals(expect, actual);;
    }
}
