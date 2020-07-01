import java.util.*;

public class Parkplatz
{
    private ArrayList<Auto> platze;

    public Parkplatz()
    {
        platze = new ArrayList<Auto>(5);
    }

    public void einparken(Auto neu)
    {

        if(neu != null)
        {
            if(neu.getParkplatz()== null)
            {
                if(platze.size()<5)
                {
                    platze.add(neu);
                    neu.setParkplatz(this);
                }
                else
                {
                    System.out.println("Fehler:kein platz mehr!");
                }

            }
            else
            {
                System.out.println("Fehler : Auto steht schon auf einem parkpltz");
            }
        }
        else
        {
            System.out.println("Fehler : kein Auto! ");

        }
    }

    public void printParkplatz()
    {
        for (Auto a: platze)
        {
            
              a.printAuto();
            
        }
    }

    public int anzahlAutomatik()
    {
        int anz=0;
        for(Auto a: platze)
        {
            
            
                if(a.getAutomatik() == true)
                {
                    anz++;

                }
            
        }
        return anz;
    }

    public double avgBaujahrAutomatik()
    {
        int sum=0;
        int anz=0;
        for(Auto a: platze)
        {
            
            
                if(a.getAutomatik() == true)
                {
                    sum+=a.getBaujahr();
                    anz++;

                }
            
        }
        if(anz>0)
        {
            return (double)sum/anz;
        }
        else
        {
            System.out.println("Fehler:kein automatik Auto!");
            return 0;
        }
    }

    public int minBaujahr()
    {
        int min=9999;
        for(Auto a: platze)
        {
            
                if(a.getBaujahr()<min)
                {
                    min=a.getBaujahr();
                }
            
        }
        return min;
    }

    public void ausparken(Auto wer)
    {
        
        if(wer!=null)
        {
           if(platze.remove(wer)) // ==true
           {
               
               wer.setParkplatz(null);
            
               
            }
            else
            {
                System.out.println("Fehler: Auto nicht am Parkplatz");
            }
        }
        else
        {
            System.out.println("Fehler: kein Auto!");
        }
    }
}

