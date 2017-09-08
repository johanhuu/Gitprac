import org.testng.Assert;
import org.testng.annotations.Test;

public class ClosestToZeroTest {
	
  @Test
  public void closestToZero1() {
	  int[] testNumbers = {1,2,3,4,5,6,7,8,9};
	  Assert.assertEquals(Something.closestToZero(testNumbers), 1);
  }
  
  public void closestToZero2() {
	  int[] testNumbers = {-5,-3,-2,3,4,6,7,8,9,100};
	  Assert.assertEquals(Something.closestToZero(testNumbers), -2);
  }
  
  public void closestToZero3() {
	  int[] testNumbers = {Integer.MIN_VALUE, -5123, -23123, -21551, -125, 100, 151235, Integer.MAX_VALUE};
	  Assert.assertEquals(Something.closestToZero(testNumbers), 100);
  }
  
  
}
