import com.stackroute.pe1.Numberpattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberpatternTest {
 Numberpattern ob;
    @Before
    public void setUp() throws Exception {
        ob=new Numberpattern();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }


    @Test
    public void checkpattern()
    {
        String result=ob.pattern(5);
        assertEquals("122333444455555",result);
    }
    @Test
    public void checksecondpattern()
    {
        String result=ob.pattern(6);
        assertEquals("122333444455555666666",result);
    }
    @Test
    public void checkthirdpattern()
    {
        String result=ob.pattern(7);
        assertEquals("1223334444555556666667777777",result);
    }
}