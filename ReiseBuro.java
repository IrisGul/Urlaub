
public class ReiseBuro
{
   private Urlaub urlaub0;
   private Urlaub urlaub1;
   private Urlaub urlaub2;
   
   public void loschen(Urlaub welcher)
   {
       if(welcher!=null)
       {
          if(urlaub0==welcher)
          {
              urlaub0=null;
              welcher.setReiseBuro(null);
          }
          if(urlaub1==welcher)
          {
              urlaub1=null;
              welcher.setReiseBuro(null);
          }
          if(urlaub2==welcher)
          {
              urlaub2=null;
              welcher.setReiseBuro(null);
          }
          else
          {
              System.out.println("Fehler:nicht in diesem Reise Buro Angeboten");
          }
        }
   }
   public void hinzufugen(Urlaub welcher)
   {
       if(welcher !=null)
       {
           if(welcher.getReiseBuro()==null)
           {
               if(urlaub0==null)
               {
                   urlaub0=welcher;
                   welcher.setReiseBuro(this);
               }
               else
               {
                   if(urlaub1==null)
                   {
                       urlaub1=welcher;
                       welcher.setReiseBuro(this);
                   }
                   else
                   {
                       if(urlaub2==null)
                       {
                           urlaub2=welcher;
                           welcher.setReiseBuro(this);
                       }
                       else
                       {
                           System.out.println("Fehler keine weitere Angebot möglich");
                       }
                   }
               }
            }
            else
            {
                 System.out.println("Fehler:Urlaub wird schon Angeboten");
            }
        }
        else
        {
             System.out.println("Fehler:kein Urlaub");
            
        }
    }  
   public Urlaub gunstigsterUrlaub()
   {
       int min;
       min = 999999;
       Urlaub urlaub;
       urlaub =null;
       
       if(urlaub0!=null)
       {
           if(urlaub0.getPreis()<min)
           {
               min=urlaub0.getPreis();
               urlaub=urlaub0;
           }
       }
       if(urlaub1!=null)
       {
           if(urlaub1.getPreis()<min)
           {
               min=urlaub1.getPreis();
               urlaub=urlaub1;
           }
       }
       if(urlaub2!=null)
       {
           if(urlaub2.getPreis()<min)
           {
               min=urlaub2.getPreis();
               urlaub=urlaub2;
           }
       }
       return urlaub ;
   }
}