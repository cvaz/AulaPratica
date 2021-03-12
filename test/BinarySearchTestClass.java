import org.junit.jupiter.api.Test;
import static main.Main.binarySearch;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTestClass {

    @Test
    public void test_emptyArray(){
        int[] array=new int[0];
        assertEquals(-1,binarySearch(array,0,-1,1));
    }

    @Test
    public void test_singletonArray(){
        int[] array= {1};
        assertEquals(0,binarySearch(array,0,0,1));
    }
}
