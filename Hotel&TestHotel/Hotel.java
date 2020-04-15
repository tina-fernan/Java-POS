package Hotel&TestHotel;

public class Hotel
{
    private String name;
    private int maxZimmer;
    private int[] belegt;

    public Hotel()
    {
        setName("Schlaf gut");
        setMaxZimmer(30);
        belegt=new int[15];
    }

    public void testDaten2()
    {
        belegt[0]=25;
        belegt[1]=12;
        belegt[2]=19;
        belegt[3]=22;
        belegt[4]=28;
        belegt[5]=30;
        belegt[6]=7;
        belegt[7]=29;
        belegt[8]=30;
        belegt[9]=27;
        belegt[10]=9;
        belegt[11]=12;
        belegt[12]=0;
        belegt[13]=5;
        belegt[14]=0;
    }

    public void testDaten()
    {
        belegt[0]=25;
        belegt[1]=12;
        belegt[2]=19;
        belegt[3]=22;
        belegt[4]=5;
        belegt[5]=9;
        belegt[6]=7;
        belegt[7]=30;
        belegt[8]=30;
        belegt[9]=30;
        belegt[10]=9;
        belegt[11]=12;
        belegt[12]=0;
        belegt[13]=5;
        belegt[14]=0;
    }

    public String getName()
    {
        return name;
    }

    public int getMaxZimmer()
    {
        return maxZimmer;
    }

    public void setName(String name)
    {
        if(name!=null)
        {
            this.name=name;

        }
        else
        {
            System.out.print("Fehler:ungültiger Name!");
            this.name="schlaf gut!";
        }
    }

    public void setMaxZimmer(int maxZimmer)
    {
        if(maxZimmer>4 && maxZimmer<=200)
        {
            this.maxZimmer=maxZimmer;

        }
        else
        {
            System.out.print("Fehler:ungültige zimmerAnzahl!");
            this.maxZimmer=100;
        }
    }
    
    public void sortSelection()
    {
        int minVal;
        int minPos;
        
        for(int a=0; a<belegt.length-1;a++)
        {
            minVal=999;
             minPos=-1;
            for(int i=a; i<belegt.length;i++)
            {
                if(minVal>belegt[i])
                {
                    minVal=belegt[i];
                    minPos=i;
                    
                }
                
            }
                belegt[minPos]=belegt[a];
                belegt[a]=minVal;
        }
    }
     public void sortBubble()
    {int hilfe;
     boolean sort=false;
     int a=0;
        
        while(sort==false)
        {
            sort=true;
        for (int i=0; i< belegt.length-1-a;i++)
        {
            if(belegt[i]>belegt[i+1])
            {
                hilfe=belegt[i+1];
                belegt[i+1]=belegt[i];
                belegt[i]=hilfe;
                sort=false;
            }
        }
        a++;
    }
}
   /* public void sortBubble()
    {int hilfe;
        
        for(int a=0;a<belegt.length-1;a++)
        {
        for (int i=0; i< belegt.length-1-a;i++)
        {
            if(belegt[i]>belegt[i+1])
            {
                hilfe=belegt[i+1];
                belegt[i+1]=belegt[i];
                belegt[i]=hilfe;
                
            }
        }
    }
    }*/
    public void löschen(int tag)
    {
         if(tag>0 && tag<belegt.length)
      {
        for(int i=tag+1; i<belegt.length;i++)
        {
            belegt[i-1]=belegt[i];
        }
        belegt[belegt.length-1]=0;
    }
    else
    {
       System.out.println("Fehler:ungültige Tag!"); 
    }
    
    }
    public void einfugen(int tag,int buchungen)
    {
        if(buchungen>0 && buchungen<maxZimmer)
        {
            if(tag>0 && tag<belegt.length)
            {
                for(int i=belegt.length-2; i>= tag;i--)
                {
                    belegt[i+1]=belegt[i];
                }
                belegt[tag]=buchungen;
            }
            else
            {
                System.out.println("Fehler:ungültige Tag!");
            }
        }
        else
        {
            System.out.println("Fehler:ungültige zimmer anzahl!");
        }
    }

    public void einfugen(int tag)
    {
        if(tag>0 && tag<belegt.length)
        {
            for(int i=belegt.length-2; i>= tag;i--)
            {
                belegt[i+1]=belegt[i];
            }
            belegt[tag]=0;
        }
        else
        {
            System.out.println("Fehler:ungültige Tag!");
        }
    }

    public boolean buchenMöglich(int tagVon,int tagBis)
    {
        if(tagVon>=0 && tagVon<belegt.length && tagBis>=0 && tagBis<belegt.length )
        {
            if(tagVon<tagBis)
            {
                for(int i=tagVon; i<=tagBis;i++)
                {
                    if(belegt[i]>= maxZimmer)
                    {
                        return false;
                    }

                }
                return true;

            }    
            else
            {

                System.out.println("Fehler: ungültige Tag!");
                return false;
            }
        }
        else
        {

            System.out.println("Fehler: ungültige Tag!");
            return false;
        }

    }

    public void buchenVonBis(int tagVon,int tagBis)
    {
        if(tagVon>=0 && tagVon<belegt.length && tagBis>=0 && tagBis<belegt.length )
        {
            if(tagVon<tagBis)
            {
                if(buchenMöglich(tagVon,tagBis)==true)
                {
                    for(int i=tagVon; i<=tagBis;i++)
                    {
                        belegt[i]++;
                    }
                }
                else
                {
                    System.out.println("Fehler: es gibt keine zimmer frei!");
                }
            }
            else
            {
                System.out.println("Fehler: ungültige Tag!");
            }
        }
        else
        {
            System.out.println("Fehler: ungültige Tag!");
        }
    }

    public boolean gebucht(int tagVon,int tagBis)

    {
        if(tagVon>=0 && tagVon<belegt.length && tagBis>=0 && tagBis<belegt.length )
        {
            if(tagVon<tagBis)
            {
                for(int i=tagVon; i<=tagBis;i++)
                {
                    if(belegt[i]<= 0)
                    {
                        return false;
                    }

                }
                return true;
            }
            else
            {

                System.out.println("Fehler:ungültige Zeitraum!");
                return false;
            }
        }
        else
        {

            System.out.println("Fehler:es gibt kein frei Tag!");
            return false;
        }

    }

    public void stornVonBis(int tagVon,int tagBis)
    {
        if(tagVon>=0 && tagVon<belegt.length && tagBis>=0 && tagBis<belegt.length )
        {
            if(tagVon<tagBis)
            {
                if(gebucht(tagVon,tagBis)== true)
                {
                    for(int i=tagVon; i<=tagBis;i++)
                    {
                        belegt[i]--;

                    }
                }
                else
                {
                    System.out.println("Fehler:keine Buchung vorhanden!");
                }
            }
            else
            {

                System.out.println("Fehler:ungültige Zeitraum!");

            }
        }
        else
        {

            System.out.println("Fehler:es gibt kein frei Tag!");

        }

    }

    public void stornie(int tag)
    {
        if(tag >= 0 && tag < belegt.length)
        {
            if(belegt[tag]>0)
            {
                belegt[tag]=belegt[tag]-1; 
            }
            else
            {
                System.out.println("Fehler: noch keine buchung vorhanden!");
            }
        }
        else
        {
            System.out.println("Fehler:ungültige Tag!");
        }
    }

    public void buchen(int tag)
    {
        if(tag >= 0 && tag < belegt.length)
        {
            if(belegt[tag] < maxZimmer)
            {
                belegt[tag]=belegt[tag]+1; 
            }
            else
            {
                System.out.println("Fehler: es gibt kein zimmer verfügbar!");
            }
        }
        else
        {
            System.out.println("Fehler:ungültige Tag!");
        }
    }

    public int vollbelegt()
    {
        for(int i=0;i<belegt.length;i++)
        {
            if(belegt[i]== maxZimmer)
            {
                return i;
            }
        }
        {
            return -1;
        }
    } 

    public int tageUber80Prozent()
    {
        int anz=0;
        for(int i=0;i<belegt.length;i++)
        {
            if(belegt[i] >((maxZimmer*80)/100))
            {
                anz++;
            }
        }
        return anz;
    }

    public int maxBelegt()
    {
        int max=-999;
        int maxTag=-999;
        for(int i=0;i<belegt.length;i++)
        {
            if(belegt[i] > max)
            {
                max=belegt[i];
                maxTag=i;
            }
        }
        return maxTag;
    }

    public int tageUnter50Prozent()
    {
        int anz=0;
        for(int i=0;i<belegt.length;i++)
        {
            if(belegt[i] < (maxZimmer/2))
            {
                anz++;
            }
        }
        return anz;
    }

    public void printHotel()
    {
        System.out.println(name +" maximale anzahl "+ maxZimmer);
        for(int i=0;i<belegt.length;i++)
        {
            System.out.println("Tag"+ i + ":" +belegt[i]+ " zimmer belegt "+ (maxZimmer-belegt[i])+" frei ");
        }
    }

    public void printHotelVerk()
    {  System.out.println(name +" maximale anzahl "+ maxZimmer);
        for(int i=belegt.length-1;i>=0;i--)
        {
            System.out.println("Tag"+ i + ":" +belegt[i]+ " zimmer belegt "+ (maxZimmer-belegt[i])+" frei ");
        }

    }

}
