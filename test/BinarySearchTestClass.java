import org.junit.jupiter.api.Test;
import static main.Main.binarySearch;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinarySearchTestClass {

    @Test
    public void test_emptyArray(){
        int[] array=new int[0];
        binarySearch(array);
        assertArrayEquals(new int[0],array);
    }

    @Test
    public void test_singletonArray(){
        int[] array= {1};
        binarySearch(array);
        assertArrayEquals(new int[]{1},array);
    }
}
