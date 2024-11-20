package exe_1_2024_3.exe_1_2024_3;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	question4 tester=new question4();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test1() {
        String Expected_results="A";
        int a= 28, b= 24;
        String mod="regular";
        String actual_result=tester.compare(a,b,mod);
        assertEquals(Expected_results,actual_result);
    }
    
    @Test
    public void Test2() {
        String Expected_results="B";
        int a= -28, b= -24;
        String mod="regular";
        String actual_result=tester.compare(a,b,mod);
        assertEquals(Expected_results,actual_result);
    }
    @Test
    public void Test3() {
        String Expected_results="B";
        int a= -20, b= -24;
        String mod="negative";
        String actual_result=tester.compare(a,b,mod);
        assertEquals(Expected_results,actual_result);
    }
    @Test
    public void Test4() {
        String Expected_results="A";
        int a= -5, b= -3;
        String mod="negative";
        String actual_result=tester.compare(a,b,mod);
        assertEquals(Expected_results,actual_result);
    }
}
