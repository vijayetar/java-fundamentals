package basiclibrary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListsImportsTest {
    @Test
    public void testSomeLibraryMethod() {
        ArrayListsImports classUnderTest = new ArrayListsImports();
        assertTrue("true", classUnderTest.someLibraryMethod());
    }
    @Test public void testRoll(){
        ArrayListsImports arrayListsImports= new ArrayListsImports();
        int n = 10;
        int[] arrayExpected = arrayListsImports.roll(n);
        boolean numIsLessThanSix = true;
        for (int num: arrayExpected){
            numIsLessThanSix = num<=6? true: false;
            if (!numIsLessThanSix){
                break;
            }
        }
        assertTrue("numbers are less than or equal to 6", numIsLessThanSix);
        assertEquals(n, arrayExpected.length);

    }
    @Test public void testContainsDuplicatesTrue(){
        ArrayListsImports arrayListsImports= new ArrayListsImports();
        int[] inputArray = {1,2,3,4,5,5};
        assertTrue("There are duplicates found", arrayListsImports.containsDuplicates(inputArray));
    }
    @Test public void testContainsDuplicatesFalse(){
        ArrayListsImports arrayListsImports= new ArrayListsImports();
        int[] inputArray = {1,2,3,4,5};
        assertFalse("There are no duplicates", arrayListsImports.containsDuplicates(inputArray));
    }
    @Test public void testisEven(){
        ArrayListsImports arrayListsImports= new ArrayListsImports();
        int num = 5;
        assertFalse("false", arrayListsImports.isEven(num));
    }
    @Test public void testAvgOfArray(){
        ArrayListsImports arrayListsImports= new ArrayListsImports();
        int[] testArray = {1,3};
        int num = 2;
        assertEquals(num, arrayListsImports.avgOfArray(testArray));
    }
    @Test public void testFindLowestAvgArray(){
        ArrayListsImports arrayListsImports= new ArrayListsImports();
        int[][] testMatrix = {{7,7},{10,14},{1,1,1,1}};
        int[] expectedArray = {1,1,1,1};
        assertArrayEquals(expectedArray, arrayListsImports.findLowestAvgArray(testMatrix));
    }
    @Test public void testFindLowestAvgEmptyArray(){
        ArrayListsImports arrayListsImports= new ArrayListsImports();
        int[][] testMatrix = {{7,7},{},{1,1,1,1}};
        int[] expectedArray = {1,1,1,1};
        assertArrayEquals(expectedArray, arrayListsImports.findLowestAvgArray(testMatrix));
    }

}
