public class Urlaub
{
    private String ort;
    private int preis;
    private boolean allInclusive;
    
    public String getOrt()
    {
        return ort;
    }
    public int getPreis()
    {
        return preis;
    }
    public boolean getAllInclusive()
    {
        return allInclusive;
    }
    public void setOrt(String ort)
    {
        this.ort=ort;
    }
    public void setPreis(int preis)
    {
        this.preis=preis;
    }
    public void setAllInclusive(boolean allInclusive)
    {
        this.allInclusive=allInclusive;
    }
}
