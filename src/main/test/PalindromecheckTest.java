import com.stackroute.pe1.Palindromecheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromecheckTest {
  Palindromecheck ob;
    @Before
    public void setUp() throws Exception {
        ob=new Palindromecheck();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void checkpalingreater()
    {
        String result=ob.palindromecheck(12121);
        assertEquals("palindromesmaller than 25",result);
    }
    @Test
    public void checknotpalin()
    {
        String result=ob.palindromecheck(121216);
        assertEquals("not palindrome",result);
    }
    @Test
    public void checkpalinneg()
    {
        String result=ob.palindromecheck(-101);
        assertEquals("wrong input",result);
    }

}