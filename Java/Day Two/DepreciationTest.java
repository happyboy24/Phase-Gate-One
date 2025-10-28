import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class DepreciationTest {


	@Test
	 
	public void testThatThePriceIsFixedAndDepreciating () {
	
	Depreciation depreciation = new Depreciation ();

	int result = depreciation.totalNumberOfItems ();

	assertEquals(result, 0);


}

	@Test
	 
	public void testThatOneItemWasAdded () {
	
	Depreciation depreciation = new Depreciation ();

	int result = depreciation.totalNumberOfItems ();

	assertEquals(result, 1);


}


}