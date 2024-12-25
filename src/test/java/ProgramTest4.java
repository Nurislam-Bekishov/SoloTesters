import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgramTest4 {

    @Test
    public void test1(){
        assertEquals(true, NurisEdaBitMain.isSameNum(2,2));
    }
    @Test
    public void test2(){
        assertEquals(false, NurisEdaBitMain.isSameNum(0, 6));
    }
    @Test
    public void test3(){
        assertEquals(false, NurisEdaBitMain.isSameNum(43, 32));
    }
}