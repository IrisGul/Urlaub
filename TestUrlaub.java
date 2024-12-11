import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestUrlaub
{
    @Test
    public void testBillig()
    {
        Urlaub rom;
        rom=new Urlaub("Rom",499,false);
        assertEquals(rom.getPreis(),1999);
    }
    @Test
    public void testOk()
    {
        Urlaub paris;
        paris=new Urlaub("Paris",600,true);
        assertEquals(paris.getPreis(),600);
    }
    @Test
    public void testTeuer()
    {
        Urlaub dubai;
        dubai=new Urlaub("Dubai", 6000,true);
        assertEquals(dubai.getPreis(),1999);
    }
}
