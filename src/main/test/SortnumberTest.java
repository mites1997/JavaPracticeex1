import com.stackroute.pe1.Sortnumber;
import org.junit.Test;

import static org.junit.Assert.*;


public class SortnumberTest {
  Sortnumber ob;
    @org.junit.Before
    public void setUp() throws Exception {
        ob=new Sortnumber();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void numsort()
    {
        String result=ob.numberSort(12345678);
        assertEquals("true",result);
    }
    @Test
    public void numsorttwo()
    {
        String result=ob.numberSort(1234567892);
        assertEquals("true",result);
    }
    @Test
    public void numsortthree()
    {
        String result=ob.numberSort(1234);
        assertEquals("false",result);
    }
}