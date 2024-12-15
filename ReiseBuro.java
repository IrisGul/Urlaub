

public class ReiseBuro
{
    private Urlaub urlaub0;
    private Urlaub urlaub1;
    private Urlaub urlaub2;
    
    private void hinzufugen(Urlaub welcher)
    {
        if(urlaub0==null)
        {
            urlaub0=welcher;
            
        }
        else
        {
            if(urlaub1==null)
            {
                urlaub1=welcher;
            }
            else
            {
                if(urlaub2==null)
                {
                    urlaub2=welcher;
                }
                else
                {
                    System.out.println("Fehler: keine weitere Angebote möglich");
                    
                }
            }
        }
    }
}
