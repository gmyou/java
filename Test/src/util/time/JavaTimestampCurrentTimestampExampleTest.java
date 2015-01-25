package util.time;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class JavaTimestampCurrentTimestampExampleTest {

	@Test
	public void testGetConnection() throws ClassNotFoundException {
		JavaTimestampCurrentTimestampExample currentTimestamp = new JavaTimestampCurrentTimestampExample();
		
		assertNotNull(currentTimestamp.getConnection());
	}

	@Test
	public void testGetTimeStmap() {
		JavaTimestampCurrentTimestampExample currentTimestamp = new JavaTimestampCurrentTimestampExample();
		
		assertNotNull(currentTimestamp.getTimeStmap());
	}

//	@Test
	public void testInsertTime() {
		JavaTimestampCurrentTimestampExample currentTimestamp = new JavaTimestampCurrentTimestampExample();
		
//		Assert(currentTimestamp.insertTime(currentTimestamp.getConnection(), currentTimestamp.getTimeStmap()));
	}

}
