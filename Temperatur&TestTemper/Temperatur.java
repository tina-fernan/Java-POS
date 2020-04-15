
public class Temperatur
{
    private double[] temperatur;
    private int anzahlTage;

    public Temperatur()
    {

        temperatur=new double[10];
        
        anzahlTage=0;
    }

    public void fulleTestdaten()
    {
        temperatur[0]=15.2;
        temperatur[1]=18.3;
        temperatur[2]=22.2;
        temperatur[3]=19.3;
        temperatur[4]=14.1;
        temperatur[5]=8.9;
        temperatur[6]=14.5;
        temperatur[7]=22.5;
        temperatur[8]=0;
        temperatur[9]=0;
        anzahlTage=8;

    }

    public int getAnzahltage()
    {
        return anzahlTage;
    }

    
    public void ausGeben()
    {
       // System.out.println(" maximale anzahl "+ anzahlTage);
        for(int i=0;i<anzahlTage;i++)
        {
            System.out.print("Tag"+ i + ":" +temperatur[i]+ "\t");
            
            for(int j=1; j<temperatur[i];j++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
    }
    //Die Methode kaltesterTag() ermittelt jenen Tag, der den niedrigsten Wert
    //aufweist return 5
    public int kaltesterTage()
    {
        double min=999;
        int minTag=-1;
        for(int i=0;i<anzahlTage;i++)
        {
          
            
                if(temperatur[i] < min)
                {
                    min = temperatur[i];
                    minTag=i;
                }
            
        }
        return minTag;
    }
    //Die Methode warmstesterTag() ermittelt jenen Tag, der den höchsten Wert  return 7
    public int warmstesterTage()
    {
        double max=-999;
        int maxTag=-1;
        for(int i=0;i<anzahlTage;i++)
        {

            if(temperatur[i] > max)
            {
                max = temperatur[i];
                maxTag=i;
            }

        }
        return maxTag;
    }
    //Die Methode maximalerAbfall() ermittelt den höchsten Temperaturabfall. return -5.2
    public double maximalerAbfall()
    {
        double maxAbfall=999;

        for(int i=0;i<anzahlTage-1;i++)
        {
           

                if ((temperatur[i+1]-temperatur[i]) < maxAbfall) 
                {
                    maxAbfall = (temperatur[i+1]-temperatur[i]);
                }
            
        }
        return maxAbfall;
    }
    //Die Methode anzahlTageAnstieg() gibt die Anzahl der Tage zurück mit einem
    //Temperaturanstieg.
    public int anzahlTageAnstieg()
    {
       
        int anzahTage=0;
        for(int i=0;i<anzahlTage-1;i++)
        {
            
            if( temperatur[i+1]>temperatur[i])
            {
                anzahTage++;
            }
        
        }
        return anzahTage;
    }

    //Die Methode temperaturSchwankung() liefert die Differenz zwischen dem
    //wärmsten und dem kältesten Tag.
    public double temperaturSchwankung()
    {
        int kältestenPos=kaltesterTage();
        int wärmstenPos=warmstesterTage();
       
        
            if(wärmstenPos>=0 && kältestenPos>=0)
            {
             return temperatur[wärmstenPos]-temperatur[kältestenPos];
            } 
            else
            {
                return -999;
            }
       
    }
}
