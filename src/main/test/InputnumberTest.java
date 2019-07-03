import com.stackroute.pe1.Inputnumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputnumberTest {
Inputnumber ob;
    @Before
    public void setUp() throws Exception {
        ob=new Inputnumber();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void checknumfound()
    {
        String result=ob.numberinputcheck("1 2 3 4 5 6");
        assertEquals("sum 21",result);
    }
    @Test
    public void checkspecialcharfound()
    {
        String result=ob.numberinputcheck("1 2 3 4 5 #");
        assertEquals("special character",result);
    }
    @Test
    public void checkcharfound()
    {
        String result=ob.numberinputcheck("1 2 3 4 5 a");
        assertEquals("character found",result);
    }
}