public class Speise
{
    
   
    private String name;
    private boolean vegetarisch;
    private int preis;
    private int gramm;
    private SpeisKarte speisKarte;
    
    public Speise(String name,boolean vegetarisch,int preis,int gramm)
    {   setName( name);
        setVegetarisch(vegetarisch);
        setPreis(preis);
        setGramm(gramm);
       
    }
     public Speise(String name,boolean vegetarisch,int preis)
    {   setName( name);
        setVegetarisch(vegetarisch);
        setPreis(preis);
        setGramm(300);
       
    }
    public Speise()
    {   setName("Schnitzel");
        setVegetarisch(false);
        setPreis(500);
        setGramm(300);
       
    }
     public String getName()
    {
        return name;
    }
     public boolean getVegetarisch()
    {
        return vegetarisch;
    }
     public int getPreis()
    {
        return preis;
    }
     public int getGramm()
    {
        return gramm;
    }
    public SpeisKarte getSpeisKarte()
    {
        return speisKarte;
    }
     public void setName(String name)
    {
        this.name=name;
    }
     public void setVegetarisch(boolean vegetarisch)
    {
        this.vegetarisch=vegetarisch;
    }
    public void setPreis(int preis)
    {
        this.preis=preis;
    }
     public void setGramm(int gramm)
    {
        this.gramm=gramm;
    }
    public void setSpeisKarte(SpeisKarte speisKarte)
    {
        this.speisKarte = speisKarte;
    }
    public void printSpeise() 
    {
        System.out.println("unsere Speise ist :" +name+","+ vegetarisch+","+preis+","+gramm);
    }
}