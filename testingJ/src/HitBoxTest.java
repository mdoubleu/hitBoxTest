import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

public class HitBoxTest extends TestCase {
	public void testBoolean(){
		HitBox t=new HitBox("hey",3,4,3,1);
		assertEquals("Test", false, t.collidable(true));
		
	}
}
