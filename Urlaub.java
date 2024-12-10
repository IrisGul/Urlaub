public class Urlaub
{
    private String ort;
    private int preis;
    private boolean allInclusive;
    
    public Urlaub (String ort,int preis, boolean allInclusive)
    {
        setOrt(ort);
        setPreis(preis);
        setAllInclusive(allInclusive);
    }
    public Urlaub(String ort,int preis )
    {
        setOrt(ort);
        setPreis(preis);
        setAllInclusive(false);
    }
    public Urlaub(String ort)
    {
        setOrt(ort);
        setPreis(1999);
        setAllInclusive(false);
    }
    public Urlaub()
    {
        setOrt("Wien");
        setPreis(1999);
        setAllInclusive(false);
    }
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
    public String getZielort()
    {
        int pos;
        String zielOrt;
        pos=ort.indexOf("-"); //5
        zielOrt=ort.substring(0,pos);
        return zielOrt;   
    }
    public String getLand()
    {
        int pos;
        String land;
        pos=ort.indexOf("-")+1;
        land=ort.substring(pos);
        return land;
    }
    public String getInitialen()
    {
        String initialen;
        int pos;
        initialen=ort.substring(0,1);
        pos=ort.indexOf("")+1;
        initialen=initialen + ort.substring(pos,pos+1);
        return initialen;
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
    public void printUrlaub()
    {
        if(allInclusive==true)
        {
        System.out.println( ort +" " + preis +" EUR  Allinclusive");
        }
        else
        {
        System.out.println( ort +" " + preis +" EUR  keine Verpflegung");
        }
    }
}
