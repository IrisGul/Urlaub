public class Urlaub
{
    private String ort;
    private int preis;
    private boolean allInclusive;
    private ReiseBuro reiseBuro;
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
    // public String getZielort()
    // {
        // int pos;
        // String zielOrt;
        // pos=ort.indexOf("-"); //5
        // zielOrt=ort.substring(0,pos);
        // return zielOrt;   
    // }
    // public String getLand()
    // {
        // int pos;
        // String land;
        // pos=ort.indexOf("-")+1;
        // land=ort.substring(pos);
        // return land;
    // }
    // public String getInitialen()
    // {
        // String initialen;
        // int pos;
        // initialen=ort.substring(0,1);
        // pos=ort.indexOf("")+1;
        // initialen=initialen + ort.substring(pos,pos+1);
        // initialen=initialen.toLowerCase(); //kleine bushstaben
        // return initialen;
    // }
    public String getZielOrt()
    {
        int pos;
        String ZielOrt;
        
        pos=ort.indexOf("-");
        ZielOrt=ort.substring(0,pos);
        return ZielOrt;
        //"ibiza-spanien"  -> "ibiza"
    }
    public String getLand()
    {
        int pos;
        String land;
        
        pos=ort.indexOf("-")+1;
        land=ort.substring(pos);
        return land;
        // "ibiza-spanien" -> "spanien"
    }
    //backreference 
    public ReiseBuro getReiseBuro()
    {
        return reiseBuro;
    }
    public void setReiseBuro(ReiseBuro reiseBuro)
    {
        this.reiseBuro=reiseBuro;
    }
    public void setOrt(String ort)
    {
        this.ort=ort;
    }
    public void setPreis(int preis)
    {
        //preis>=500 und preis<=3000
        if((preis>=500)&&(preis<=3000))
        {
            this.preis=preis;
        }
        else
        {
            System.out.println("Fehler:ungültiges Preis.Muss zw. 500 und 3000 sein");
            this.preis=1999;
        }
    }
    public void setAllInclusive(boolean allInclusive)
    {
        this.allInclusive=allInclusive;
    }
    //Urlaub seite schreiben (this)
    public void hinzufugen(ReiseBuro wo)
    {
        if(wo!=null)
        {
            wo.hinzufugen(this);
        }
        else
        {
            System.out.println("Fehler:kein Reise Buro");
        }
    }
    public void loschen(ReiseBuro wo)
    {
        if(wo!=null)
        {
            wo.loschen(this);
        }
        else
        {
            System.out.println("Fehler");
        }
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
