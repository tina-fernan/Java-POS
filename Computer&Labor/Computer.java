
public class Computer
{
    private String hersteller;
    private int preis;
    private boolean laptop;
    private Labor labor;

    public Computer(String neuHersteller,boolean neuLaptop,int neuPreis)
    {
        setHersteller(neuHersteller);
        setLaptop(neuLaptop);
        setPreis(neuPreis);

    }
     public Computer(String neuHersteller,boolean neuLaptop)
    {
        setHersteller(neuHersteller);
        setLaptop(neuLaptop);
        setPreis(789);

    }
     public Computer(String neuHersteller,int neuPreis)
    {
        setHersteller(neuHersteller);
        setLaptop(true);
        setPreis(neuPreis);

    }
     public Computer()
    {
        setHersteller("Lenovo");
        setLaptop(true);
        setPreis(789);

    }

    public String  getHersteller()
    {
        return hersteller;
    }

    public boolean  getLaptop()
    {
        return laptop;

    }

    public int getPreis()
    {
        return preis;
    }

    public void  setHersteller(String neuHersteller)
    {
        if (neuHersteller!= null)
        {
            this.hersteller=neuHersteller;
        }
        else
        {
            System.out.println("Fehler: kein hersteller!");
            this.hersteller = "Lenovo";
        }
    }
    public Labor getLabor()
    {
        return labor;
    }

    public void setLaptop(boolean neulaptop)
    {
        this.laptop=neulaptop;
    }

    public void setPreis(int neuPreis)
    {
        this.preis=neuPreis;
    }
    public void setLabor(Labor labor)
    {
        this.labor=labor;
    }
    public void printComputer()
    {
        if(laptop==true)
        {
            System.out.println( hersteller +"-" + preis + " Laptop!");
        }
        else
        {
            System.out.println( hersteller +"-" + preis + " Keine Laptop!");
        }
    }
    public void herausnehmen()
    {
        if(labor!=null)
        {
            labor.herausnehmen(this);
        }
        else
        {
             System.out.println("Fehler: stehe auf keinem labor");
        }
    }

}
