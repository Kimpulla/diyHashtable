// Generated by ComTest BEGIN
import java.util.Arrays;
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2022.04.20 23:51:56 // Generated by ComTest
 *
 */
@SuppressWarnings({ "all" })
public class hajautusTest {


  // Generated by ComTest BEGIN
  /** testMain88 */
  @Test
  public void testMain88() {    // hajautus: 88
    Object[] testArray = { 2, 5, 6, 4, 1} ; 
    Object[] testArray2 = { 2, "vapaa", "null", "poistettu", 1} ; 
    assertEquals("From: hajautus line: 98", "[2, vapaa, 333, poistettu, 1]", Arrays.toString(hajautus.add(testArray2, 2, 333)));
    assertEquals("From: hajautus line: 99", "[2, 12, 333, poistettu, 1]", Arrays.toString(hajautus.add(testArray2, 0, 12)));
    assertEquals("From: hajautus line: 100", "[2, 12, 333, 222, 1]", Arrays.toString(hajautus.add(testArray2, 3, 222)));
    assertEquals("From: hajautus line: 105", "[2, 5, poistettu, 4, 1]", Arrays.toString(hajautus.remove(testArray, 2, 6)));
    assertEquals("From: hajautus line: 106", "[2, 5, poistettu, poistettu, 1]", Arrays.toString(hajautus.remove(testArray, 0, 4)));
    assertEquals("From: hajautus line: 107", "[2, 5, poistettu, poistettu, poistettu]", Arrays.toString(hajautus.remove(testArray, 1, 1)));
  } // Generated by ComTest END
}