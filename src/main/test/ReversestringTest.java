import com.stackroute.pe1.Reversestring;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversestringTest {
Reversestring ob;
    @Before
    public void setUp() throws Exception {
        ob=new Reversestring();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void reversestring()
    {
        String result=ob.stringReverse("London");
        assertEquals("nodnoL",result);
    }
    @Test
    public void reversestringtwo()
    {
        String result=ob.stringReverse("Mites");
        assertEquals("setiM",result);
    }
    @Test
    public void reversestringthree()
    {
        String result=ob.stringReverse("Reverse");
        assertEquals("esreveR",result);
    }
}