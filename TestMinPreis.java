

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMinPreis
{
  @Test
  public void testLeer()
  {
      ReiseBuro r;
      r=new ReiseBuro();
      assertEquals(r.gunstigsterUrlaub(),null);
  }
  @Test
  public void test1Reise()
  {
      ReiseBuro r;
      Urlaub a;
      
      r=new ReiseBuro();
      a=new Urlaub("Rom",666,false);
      
      r.hinzufugen(a);
      assertEquals(r.gunstigsterUrlaub(),a);
  }
  @Test
  public void test2Reise()
  {
    
      ReiseBuro r;
      Urlaub a, b;
      
      r=new ReiseBuro();
      a=new Urlaub("Rom",666,false);
      b=new Urlaub("Paris",555,false);
      
      r.hinzufugen(a);
      r.hinzufugen(b);
      assertEquals(r.gunstigsterUrlaub(),b);
  }
   @Test
  public void testPos1()
  {
    
      ReiseBuro r;
      Urlaub a, b;
      
      r=new ReiseBuro();
      a=new Urlaub("Rom",600,false);
      b=new Urlaub("Paris",888,false);
      
      r.hinzufugen(a);
      r.hinzufugen(b);
      assertEquals(r.gunstigsterUrlaub(),a);
  }
  @Test
  public void testPos2()
  {
    
      ReiseBuro r;
      Urlaub a, b;
      
      r=new ReiseBuro();
      a=new Urlaub("Rom",666,false);
      b=new Urlaub("Paris",555,false);
      
      r.hinzufugen(a);
      r.hinzufugen(b);
      assertEquals(r.gunstigsterUrlaub(),b);
  }
}
