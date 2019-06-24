package epamtask;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class NewEmptyJUnitTest {
    Epamtask ob;
    @Before
    public void setUp()
    {
        ob = new Epamtask();
    }
    
    @Test
    public void emptyString()
    {
        assertEquals("",ob.remove(""));
    }
    
    @Test
    public void oneChar()
    {
        assertEquals("",ob.remove("A"));
    }
    
    @Test
    public void twoChar()
    {
        assertEquals("B",ob.remove("AB"));
    }
    
    @Test
    public void threeChar()
    {
        assertEquals("A",ob.remove("AAA"));
    }
    
    @Test
    public void NChar()
    {
        assertEquals("BCDEFGH",ob.remove("ABCDEFGH"));
    }

    @Test
    public void noA()
    {
        assertEquals("BCDAAAA",ob.remove("BCDAAAA"));
    }
   
}
