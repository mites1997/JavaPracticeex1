import com.stackroute.pe1.Stringlastncharacters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringlastncharactersTest {
 Stringlastncharacters ob;
    @Before
    public void setUp() throws Exception {
        ob=new Stringlastncharacters();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void stringLastChar()
    {
        String result=ob.stringLastChar("Stackroute",2);
        assertEquals("Stackroutetete",result);
    }
    @Test
    public void stringLastChartwo()
    {
        String result=ob.stringLastChar("Stackroute",3);
        assertEquals("Stackrouteuteuteute",result);
    }
    @Test
    public void stringLastCharthree()
    {
        String result=ob.stringLastChar("Stackroute",4);
        assertEquals("Stackrouteouteouteouteoute",result);
    }
}