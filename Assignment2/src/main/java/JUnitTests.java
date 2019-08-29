import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JUnitTests {
    @Test
    public void test_arrayMax() {
        int[] maxArray = new int[]{1, 2, 3, 5, 4};
        int expectedMax = 5;
        int max = Finder.findMax(maxArray);
        assertEquals(expectedMax, max);
    }

    @Test
    public void test_arrayMin() {
        int[] minArray = new int[]{1, 2, 3, 5, 4};
        int expectedMin = 1;
        int min = Finder.findMin(minArray);
        assertEquals(expectedMin, min);
    }

    @Test
    public void test_arrayMaxNull() {
        int[] maxArray = null;
        Integer expectedMax = null;
        Integer max = Finder.findMax(maxArray);
        assertEquals(expectedMax, max);
    }

    @Test
    public void test_arrayMaxEmpty() {
        int[] minArray = new int[]{};
        Integer expectedMin = null;
        Integer min = Finder.findMax(minArray);
        assertEquals(expectedMin, min);
    }

    @Test
    public void test_arrayMinNull() {
        int[] minArray = null;
        Integer expectedMin = null;
        Integer min = Finder.findMin(minArray);
        assertEquals(expectedMin, min);
    }

    @Test
    public void test_arrayMinEmpty() {
        int[] minArray = new int[]{};
        Integer expectedMin = null;
        Integer min = Finder.findMin(minArray);
        assertEquals(expectedMin, min);
    }
}
