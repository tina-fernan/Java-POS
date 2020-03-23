public class Haus
{

    private Wohnung wohnung0;
    private Wohnung wohnung1;
    private Wohnung wohnung2;

    public Haus()
    {
    }

    public void dazubauen(Wohnung neu)
    {  
        if(neu.getHaus()==null)
        {
            if(wohnung0 == null)
            {  
                wohnung0=neu;
                neu.setHaus(this);

            }
            else
            {
                if(wohnung1 == null)
                {
                    wohnung1 = neu;
                }
                else
                {
                    if(wohnung2 == null)
                    {
                        wohnung2=neu;
                    }else
                    {
                        System.out.println("Fehler: Es gibt kein Platz");
                    }
                }

            }
        }
        else
        {
            System.out.println("Fehler: schon aufgenommen");
        }
        
    }

    public int teuersteWohnung()
    {int teuerste=0;

        if(wohnung0!= null)

        { if(wohnung0.getPreise()> teuerste)
            { 
                teuerste=wohnung0.getPreise();
            }
        }if(wohnung1!=null)
        {
            if(wohnung1.getPreise()> teuerste)
            {

                teuerste=wohnung1.getPreise(); 
            }
        } 
        if(wohnung2!= null)
        { if(wohnung2.getPreise()> teuerste)
            { 
                teuerste=wohnung2.getPreise();
            }
        }
        return teuerste;
    }

    public int maxZimmer() 
    { int maxZimmer=0;

        if(wohnung0!= null)
        {
            if(wohnung0.getZimmer()>maxZimmer)
            {
                maxZimmer=wohnung0.getZimmer();
            }
        } if(wohnung1!= null)
        {
            if(wohnung1.getZimmer()>maxZimmer)
            {
                maxZimmer=wohnung1.getZimmer();
            }
        } if(wohnung2!= null)
        {
            if(wohnung2.getZimmer()>maxZimmer)
            {
                maxZimmer=wohnung2.getZimmer();
            }
        }

        return maxZimmer;
    }

    public void printHaus() 
    {
        if(wohnung0!=null)
        {   
            wohnung0.printWohnung();

        }
        if(wohnung1!=null)
        {
            wohnung1.printWohnung();
        }
        if(wohnung2!=null)
        {
            wohnung2.printWohnung();
        }
    }
    //Die Methode maxZimmer liefert die Zimmeranzahl der größten Wohnung, dessen Preis
    //kleiner ist als der maxPreis. 
    public int maxZimmer(int maxPreise) 
    { 
        int maxZimmer=0;
        int kleinerPreise = 0;
        if(wohnung0!= null)
        {
            if((wohnung0.getZimmer()>maxZimmer)&&(wohnung0.getPreise()<maxPreise))
            {
                maxZimmer=wohnung0.getZimmer();
                kleinerPreise=wohnung0.getPreise();
            }
        } if(wohnung1!= null)
        {
            if((wohnung1.getZimmer()>maxZimmer)&&(wohnung1.getPreise()<maxPreise))
            {
                maxZimmer=wohnung1.getZimmer();
                kleinerPreise=wohnung1.getPreise();
            }
        } if(wohnung2!= null)
        {
            if((wohnung2.getZimmer()>maxZimmer)&&(wohnung2.getPreise()<maxPreise))
            {
                maxZimmer=wohnung2.getZimmer();
                kleinerPreise=wohnung1.getPreise();
            }

        }
        return maxZimmer;

    }   
    //Die Methode anzWohnung liefert Anzahl an Wohnungen, die einen Balkon aufweisen oder
    //nicht (je nach Parameter).
    public int anzWohnung(boolean balkon)
    {
        int anzBalkon=0;
        if(wohnung0!=null)
        {
            if( wohnung0.getBalkoon()==balkon)
            {
                anzBalkon++;
            }
        } if(wohnung1!=null)
        {
            if( wohnung1.getBalkoon()==balkon)
            {
                anzBalkon++;
            } if(wohnung0!=null)
            {
                if( wohnung2.getBalkoon()==balkon)
                {
                    anzBalkon++;
                }
            }
        }
        return anzBalkon;
    }
    //Die Methode preisHaus liefert die Summe der Verkaufspreise.
    public int preisHaus() 
    {int summePreise=0;
        if(wohnung0!=null)
        {
            summePreise=wohnung0.getPreise();
        }if(wohnung1!=null)
        {
            summePreise=summePreise+wohnung1.getPreise();
        }if(wohnung2!=null)
        {
            summePreise=summePreise+wohnung2.getPreise();
        }
        return summePreise;
    }
    //Die Methode zwischenwand errichtet in jeder Wohnung eine neue Zwischenwand.
    //Dadurch erhöht sich die Anzahl an Zimmer um 1.
    public void zwischenwand()
    { 
        int wand=0;
        if(wohnung0!=null)
        {
            wand=wohnung0.getZimmer()+1;
            wohnung0.setAnzZimmer(wand);
        } if(wohnung1!=null)
        {
            wand=wohnung1.getZimmer()+1;
            wohnung1.setAnzZimmer(wand);
        } if(wohnung2!=null)
        {
            wand=wohnung2.getZimmer()+1;
            wohnung2.setAnzZimmer(wand);
        }
    }

}

