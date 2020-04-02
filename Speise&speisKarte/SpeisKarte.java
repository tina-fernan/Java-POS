package Speise&speisKarte;


public class SpeisKarte {
    private Speise speis0;
    private Speise speis1;
    private Speise speis2;

    public SpeisKarte()
    { 
    }
    //Die Methode anbieten fügt eine neue Speise der Karte hinzu.
    public void anbieten(Speise neu)
    {
        if(neu!=null)
        {
            if(neu.getSpeisKarte()==null)
            {
                if(speis0== null)
                {
                    speis0=neu;
                    neu.setSpeisKarte(this);
                }
                else
                {
                    if(speis1== null)
                    {
                        speis1=neu;
                        neu.setSpeisKarte(this);
                    } 
                    else
                    {
                        if(speis2== null)
                        {
                            speis2=neu;
                            neu.setSpeisKarte(this);
                        }
                        else
                        {
                            System.out.println("Es gibt keine neu speise");
                        }
                    }

                }
            }else
            {
            System.out.println("Fehler: schon aufgenommen");
        }
        }
    }
    //Die Methode grosseSpeise ermittelt die größte Speise (Gramm).
    public int grosseSpeise ()
    {
        int größteSpeise=0;
        if(speis0!=null)
        {
            if(speis0.getGramm()>größteSpeise)
            {
                größteSpeise=speis0.getGramm();
            }
        }
        if(speis1!=null)
        {
            if(speis1.getGramm()>größteSpeise)
            {
                größteSpeise=speis1.getGramm();
            }
        }
        if(speis2!=null)
        {
            if(speis2.getGramm()>größteSpeise)
            {
                größteSpeise=speis2.getGramm();
            }
        }
        return größteSpeise;
    }
    //Die Methode grosseSpeise ermittelt die größte Speise (Gramm), welche unter dem
    //übergebenen Preis liegt.
    public int grosseSpeise (int maxPreis) 
    { 
        int größteSpeise=0;
        int kleinPreis=0;
        if(speis0!=null)
        {
            if((speis0.getGramm()>größteSpeise)&&(speis0.getPreis()<maxPreis))
            {
                größteSpeise=speis0.getGramm();
                kleinPreis=speis0.getPreis();

            }
        }
        if(speis1!=null)
        {
            if((speis1.getGramm()>größteSpeise)&&(speis1.getPreis()<maxPreis))
            {
                größteSpeise=speis1.getGramm();
                kleinPreis=speis1.getPreis();

            }
        }
        if(speis2!=null)
        {
            if((speis2.getGramm()>größteSpeise)&&(speis2.getPreis()<maxPreis))
            {
                größteSpeise=speis2.getGramm();
                kleinPreis=speis2.getPreis();

            }
        }
        return größteSpeise;
    }
    //Die Methode grosseSpeise ermittelt die größte Speise (Gramm), welche je nach
    //Parameterwert vegetarisch ist oder nicht.
    public int grosseSpeise (boolean vegetarisch) 
    {   int größteSpeise=0;
        int vege=0;
        if(speis0!=null)
        {
            if((speis0.getGramm()>größteSpeise)&&(speis0.getVegetarisch()==vegetarisch))
            {
                größteSpeise=speis0.getGramm();
                vege++;
            }
        }
        if(speis1!=null)
        {
            if((speis1.getGramm()>größteSpeise)&&(speis1.getVegetarisch()==vegetarisch))
            {
                größteSpeise=speis1.getGramm();
                vege++;
            }
        }
        if(speis2!=null)
        {
            if((speis2.getGramm()>größteSpeise)&&(speis2.getVegetarisch()==vegetarisch))
            {
                größteSpeise=speis2.getGramm();
                vege++;
            }
        }
        return größteSpeise;
    }
    //Die Methode anzSpeisen ermittelt die Anzahl an Speisen, die unter dem übergebenen
    //Preis liegen.
    public int anzSpeisen (int maxPreis) 
    {

        int kleinPreis=0;
        if(speis0!=null)
        {
            if(speis0.getPreis()<maxPreis)
            {

                kleinPreis=speis0.getPreis();

            }
        }
        if(speis1!=null)
        {
            if(speis1.getPreis()<maxPreis)
            {

                kleinPreis=speis1.getPreis();

            }
        }
        if(speis2!=null)
        {
            if(speis2.getPreis()<maxPreis)
            {

                kleinPreis=speis2.getPreis();

            }
        }
        return kleinPreis;
    }
    //Die Methode printSpeiseKarte gibt sämtliche Speisen aus. Verwenden Sie die
    //zugehörige printSpeise Methode.
    public void printSpeiseKarte()
    {
        if(speis0!=null)
        {
            speis0.printSpeise();
        }
        if(speis1!=null)
        {
            speis1.printSpeise();
        }
        if(speis2!=null)
        {
            speis2.printSpeise();
        }
    }
    //Die Methode verkleinerePortion verkleinert sämtliche Portionen um den übergebenen
    //Parameter.
    public void verkleinerePortion(int gramm)
    {
        int verkleinert=0;
        if(speis0!=null)
        {
            if(speis0.getGramm()>gramm)
            {
                verkleinert=speis0.getGramm()-gramm;
                speis0.setGramm(verkleinert);
            }
        }
        if(speis1!=null)
        {
            if(speis1.getGramm()>gramm)
            {
                verkleinert=speis1.getGramm()-gramm;
                speis1.setGramm(verkleinert);
            }
        }
        if(speis2!=null)
        {
            if(speis2.getGramm()>gramm)
            {
                verkleinert=speis2.getGramm()-gramm;
                speis2.setGramm(verkleinert);
            }
        }

    }

}