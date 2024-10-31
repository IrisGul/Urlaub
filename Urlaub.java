public class Urlaub
{
    private String ort;
    private int preis;
    private boolean allInc;
    
    public String getOrt()
    {
        return ort;
    }
    public int getPreis()
    {
        return preis;
    }
    public boolean getAllInc()
    {
        return allInc;
    }
    public void setOrt( String neuOrt)
    {
        ort=neuOrt;
    }
    public void setPreis(int neuPreis)
    {
        preis=neuPreis;
    }
    public void setAllInc( boolean neuAllInc)
    {
        allInc=neuAllInc;
    }
}
