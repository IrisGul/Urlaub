public class Urlaub
{
    private String ort;   // eigenschaft ort
    private int preis;    // zeilen kommentar
    private boolean allInc;
    /*konstruktor
     * block kommentar
     */
    public Urlaub(String neuOrt, int neuPreis, boolean neuAllInc)
    {
        ort=neuOrt;
        preis=neuPreis;
        allInc=neuAllInc;
    }
    
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
    public void printUrlaub()
    {
        System.out.println( ort + " - " + preis + " EUR - Allinclusive: " + allInc);
    }
}
