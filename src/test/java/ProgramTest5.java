import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ProgramTest5 {

        @Test
        public void test1() {
            assertEquals(true, Challenge_Aidin.isEqual(2, 2));
        }

        @Test
        public void test2() {
            assertEquals(true, Challenge_Aidin.isEqual(88, 88));
        }

        @Test
        public void test3() {
            assertEquals(false, Challenge_Aidin.isEqual(36, 35));
        }

        @Test
        public void test4() {
            assertEquals(true, Challenge_Aidin.isEqual(1, 1));
        }

        @Test
        public void test5() {
            assertEquals(false, Challenge_Aidin.isEqual(5, 6));
        }
    }

