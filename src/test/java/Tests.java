import org.junit.Test;
import problems.algoexpert.easy.BinarySearch;

import static org.junit.Assert.assertEquals;

public class Tests {

        @Test
        public void TestCase1() {
            assertEquals(3, BinarySearch.Program.binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33));
        }

}
