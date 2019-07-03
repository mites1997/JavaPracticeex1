import com.stackroute.pe1.Checkinput;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckinputTest {
    Checkinput ob;
    @Before
    public void setUp() throws Exception {
        ob=new Checkinput();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void checkvowelfound()
    {
        String result=ob.inputcheck("ab");
        assertEquals("aVowel\nbConsonant\n",result);
    }
    @Test
    public void checkconsonantfound()
    {
        String result=ob.inputcheck("bc");
        assertEquals("bConsonant\ncConsonant\n",result);
    }
    @Test
    public void checkothercharfound()
    {
        String result=ob.inputcheck("a5");
        assertEquals("Other output",result);
    }


}