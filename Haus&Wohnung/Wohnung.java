public class Wohnung
{
    private String ort;
    private boolean balkoon;
    private int preise;
    private int anzZimmer;
    private Haus haus;
    

    public Wohnung(String neuOrt,boolean neuBalkoon,int neuPreise,int neuZimmer)
    { setOrt(neuOrt);
        setBalkoon(neuBalkoon);
        setPreise(neuPreise);
        setAnzZimmer(neuZimmer);
    }

    public Wohnung(String neuOrt,boolean neuBalkoon,int neuPreise)
    { setOrt(neuOrt);
        setBalkoon(neuBalkoon);
        setPreise(neuPreise);
        setAnzZimmer(4);
    }

    public Wohnung(String neuOrt,boolean neuBalkoon)
    { setOrt(neuOrt);
        setBalkoon(neuBalkoon);
        setPreise(200000);
        setAnzZimmer(4);
    }

    public Wohnung(String neuOrt)
    { setOrt(neuOrt);
        setBalkoon(true);
        setPreise(200000);
        setAnzZimmer(4);
    }

    public Wohnung()
    {
        setOrt("wien");
        setBalkoon(true);
        setPreise(200000);
        setAnzZimmer(4);
    }

    public String getOrt()
    {return ort;
    }  

    public boolean getBalkoon()
    {return balkoon;
    }    

    public int getPreise()
    {return preise;
    }   

    public int getZimmer()
    {return anzZimmer; 
    } 
    public Haus getHaus()
    {
        return haus;
    }

    public void setOrt(String neuOrt)
    {
        this.ort= neuOrt;  
    }

    public void setBalkoon(boolean neuBalkoon)
    {
        this.balkoon=neuBalkoon;   
    }

    public void setPreise(int neuPreise)
    {
        if(balkoon==true)
        {//150000 und 500000
            if((neuPreise>=150000)&&(neuPreise<=500000))
            {
                this.preise=neuPreise;
            }else
            {
                if(neuPreise<150000)
                {
                    System.out.println("Die preise ist zu klein");

                    this.preise=150000;

                }else
                {
                    System.out.println("die Preise zu Grüß");
                    this.preise=500000;
                }

            }
        }
        else
        //100000 und 300000
        {
            if((neuPreise>=100000)&&(neuPreise<=300000))
            {
                this.preise=neuPreise;
            }else
            {
                if(neuPreise<100000)
                {
                    System.out.println("kein balkoon.Die preise ist zu klein");
                    this.preise=100000;

                }else
                {
                    System.out.println("kein balkoon.Die preise ist zu Grüß");
                    this.preise=300000;
                }

            }
        }
    }

        //von 200000 muss die Wohnung mindestens 4 Zimmer haben.
        public void setAnzZimmer(int neuZimmer)
        {
       // if(preise>=200000)
        //{
            //System.out.println("von 200000 muss die Wohnung mindestens 4 Zimmer haben");
           // this.anzZimmer=4;
       // }else
        //{
            this.anzZimmer=neuZimmer;
       // }
    }
    
    public void setHaus(Haus haus)
    {
        this.haus=haus;
    }
    
    

    public void printWohnung()
    {
        if(balkoon == true)
        {
            System.out.println("Wohnung ort is " + ort + "-"+ anzZimmer
                +"-"+preise+"-"+"balkoon!");
        }else
        {
            System.out.println("Wohnung ort is " + ort + "-"+ anzZimmer
                +"-"+preise+"-"+" kein balkoon!");
        }    
    } 
}  
