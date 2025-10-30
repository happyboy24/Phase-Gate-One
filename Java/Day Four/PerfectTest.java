import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PerfectTest {


	@Test

	public void testThatTheGivenArrayIsEmpty() {
	
	Perfect perfect = new Perfect ();

	int result = perfect.totalNumberInTheArray();

	assertEquals(result, 0);

}

	@Test

	public void testThatTheGivenArrayIsNotTypeString() {

	Perfect perfect = new Perfect ();

	String response = perfect.addWord("Four");

	assertEquals(response, "Invalid Input");

}
	@Test

	public void testThatTheGivenArrayDoesntTakeNegativeValue() {

	Perfect perfect = new Perfect ();

	int result = perfect.addNumber();

	assertEquals(result, 0);

}	


}