import static org.junit.Assert.*;

import org.junit.Test;

import com.av.Calculator;

public class CalTest {

	@Test
	public void calTest()
	{

		assertEquals("error in add()", 3 ,Calculator.add(1,2));
		assertEquals("error in add()", -3 ,Calculator.add(-1,-2));
		assertEquals("error in add()", 9 ,Calculator.add(9,0));
		
		
	}
	
public void calcTestAddFail()
{
	assertEquals("error in add()", 0 ,Calculator.add(1,2));
	
}

public void calcTestSubPass()
{
	assertEquals("error in sub()", 1,Calculator.add(1,2));
	assertEquals("error in sub()", -1,Calculator.add(-1,-2));
	assertEquals("error in sub()", 0,Calculator.add(2,1));
}

public void calcSubFail()
{
	assertEquals("error in add()", 0 ,Calculator.add(2,1));
}

}
