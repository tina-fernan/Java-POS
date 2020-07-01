
public class Auto
{
    private String kennzeichen;
    private int baujahr;
    private boolean automatik;
    private Parkplatz parkplatz;
    
    public Auto(String kennzeichen,int baujahr, boolean automatik )
    {
        setKennzeichen(kennzeichen);
        setBaujahr(baujahr);
        setAutomatik(automatik);
        
    }
     public Auto(String kennzeichen)
    {
        setKennzeichen(kennzeichen);
        setAutomatik(false);
        setBaujahr(2007);
    }

    public Auto(String kennzeichen, boolean automatik)
    {
        setKennzeichen(kennzeichen);
        setAutomatik(automatik);
        setBaujahr(2007);
    }

    public Auto()
    {
        setKennzeichen("BMW");
        setAutomatik(false);        
        setBaujahr(2007);
    }
     public Parkplatz getParkplatz()
    {
        return parkplatz;
    }
    
    public void  setKennzeichen(String kennzeichen)
    {
        this.kennzeichen=kennzeichen;
    }
    
    public void setBaujahr(int baujahr)
    {
        this.baujahr=baujahr;
    }
    public void setAutomatik(boolean automatik)
    {
        this.automatik=automatik;
    }
    
    public String getKennzeichen()
    {
        return kennzeichen;
    }
    public int getBaujahr()
    {
        return baujahr;
    }
    public boolean getAutomatik()
    {
        return automatik;
    }
    public void setParkplatz(Parkplatz parkplatz)
    {
        this.parkplatz = parkplatz;
    }

    public void printAuto()
    {
        if (automatik == true)
        {
            System.out.println(kennzeichen + " - " + baujahr + " (AUTOMATIK)");
        }
        else
        {
            System.out.println(kennzeichen + " - " + baujahr + " (kein AUTOMATIK)");
        }
    }
     public void ausparken()
    {
        if (parkplatz != null)
        {
            parkplatz.ausparken(this);
        }
        else
        {
            System.out.println("Fehler: stehe auf keinem Parkplatz!");
        }
    }
}
