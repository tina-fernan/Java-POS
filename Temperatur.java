public class Temperatur
{
    private double[] temperatur;
    private int anzahlTage;

    public Temperatur()
    {

        temperatur=new double[10];
        setAnzahltage(365);

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

    }

    public int getAnzahltage()
    {
        return anzahlTage;
    }

    public void setAnzahltage(int anzahlTage)
    {
        if(anzahlTage >= 0 && anzahlTage<=365)
        {
            this.anzahlTage=anzahlTage;

        }
        else
        {
            System.out.print("Fehler:ungültige anzahlTage!");
            this.anzahlTage=100;
        }
    }

    public void ausGeben()
    {
        System.out.println(" maximale anzahl "+ anzahlTage);
        for(int i=0;i<temperatur.length;i++)
        {
            System.out.println("Tag"+ i + ":" +temperatur[i]+ " Tage Temperatur ");
        }
    }
    //Die Methode kaltesterTag() ermittelt jenen Tag, der den niedrigsten Wert
    //aufweist return 5
    public int kaltesterTage()
    {
        double min=temperatur[0];
        int minTag=0;
        for(int i=0;i<temperatur.length;i++)
        {
            if(temperatur[i]!=0)
            {
                if(temperatur[i] < min)
                {
                    min = temperatur[i];
                    minTag=i;
                }
            }
        }
        return minTag;
    }
    //Die Methode warmstesterTag() ermittelt jenen Tag, der den höchsten Wert  return 7
    public int warmstesterTage()
    {
        double max=temperatur[0];
        int maxTag=0;
        for(int i=0;i<temperatur.length;i++)
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
        double maxAbfall=(temperatur[1]-temperatur[0]);

        for(int i=0;i<(temperatur.length-1);i++)
        {
            if(temperatur[i+1]!=0) {

                if ((temperatur[i+1]-temperatur[i]) < maxAbfall) {
                    maxAbfall = (temperatur[i+1]-temperatur[i]);
                }
            }
        }
        return maxAbfall;
    }
    //Die Methode anzahlTageAnstieg() gibt die Anzahl der Tage zurück mit einem
    //Temperaturanstieg.
    public int anzahlTageAnstieg()
    {
       
        int anzahTage=0;
        for(int i=0;i<temperatur.length-1;i++)
        {
            if(temperatur[i+1]!=0){
            if( temperatur[i+1]-temperatur[i] > 0)
            {
                anzahTage++;
            }
        }
        }
        return anzahTage;
    }

    //Die Methode temperaturSchwankung() liefert die Differenz zwischen dem
    //wärmsten und dem kältesten Tag.
    public double temperaturSchwankung()
    {
        double kältesten=0;
        double wärmsten=0;
        double differenz=0;
        for(int i=0;i<temperatur.length;i++)
        {
            if(i==kaltesterTage())
            {
                kältesten=temperatur[i];
            }

            if(i==warmstesterTage()) 
            {
                wärmsten=temperatur[i];

            }

        }  
        differenz = (wärmsten-kältesten);
        return differenz;
    }  

}
