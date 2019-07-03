import com.stackroute.pe1.Typeofcharacter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeofcharacterTest {
    Typeofcharacter ob;

    @Before
    public void setUp() throws Exception
    {
        ob=new Typeofcharacter();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void characterCheckone() {
        String result=ob.characterCheck('a');
        assertEquals("small letter",result);

    }
    @Test
    public void characterChecktwo() {
        String result=ob.characterCheck('A');
        assertEquals("Capital",result);

    }
    @Test
    public void characterCheckthree() {
        String result=ob.characterCheck('1');
        assertEquals("number",result);

    }
    @Test
    public void characterCheckfour() {
        String result=ob.characterCheck('#');
        assertEquals("special char",result);

    }
}