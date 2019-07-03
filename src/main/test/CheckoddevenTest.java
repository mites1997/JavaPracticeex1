
import com.stackroute.pe1.Checkoddeven;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckoddevenTest {
Checkoddeven ob;
    @Before
    public void setUp() throws Exception {
        ob=new Checkoddeven();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void checkoddeven()
    {
        String result=ob.oddeven(21);
        assertEquals("Jerry",result);
    }
    @Test
    public void checkoddeventwo()
    {
        String result=ob.oddeven(22);
        assertEquals("Tom",result);
    }
    @Test
    public void checkoddeventhree()
    {
        String result=ob.oddeven(23);
        assertEquals("Jerry",result);
    }
}