
public class Labor
{
    private Computer[] labor;

    public Labor()
    {
        labor= new Computer[8];
    }

  
    public void hineinstellen(Computer welchen)
    {
        int i;
        boolean fertig=false;
        if(welchen!=null)
        {

            if(welchen.getLabor()==null)
            {
                i=0;
                while(i<labor.length && fertig==false)
                {
                    if(labor[i]==null)
                    {
                        labor[i]=welchen; 
                        welchen.setLabor(this);
                        fertig=true;
                    }
                    i++;

                }
                if(fertig==false)
                {
                    System.out.println("fehler: kein labor");
                }
            }
            else
            {
                System.out.println("fehler: Computer schon im labor");
            }
        }
        else
        {
            System.out.println("fehler: kein Computer"); 
        }
    }

    public void herausnehmen(Computer welchen)
    {
        int i;
        boolean fertig;
        if(welchen!=null)
        {
            i=0;
            fertig=false;
            while(i<labor.length && fertig==false)
            {
                if(labor[i]==welchen)
                {
                    labor[i]=null;
                    welchen.setLabor(null);
                    fertig=true;
                }
                i++;
            }
            if(fertig==false)
            {
                System.out.println("Fehler: Computer ist nich im Labor");
            }
        }
        else
        {
            System.out.println("Fehler: Kein Computer!");
        }

    }

    public void printLabor()
    {
        for(int i=0; i<labor.length; i++)
        {
            if(labor[i]!=null)
            {
                labor[i].printComputer();
            }

        }

    }

    public int minPreis()
    {
        int min=999;
        for(int i=0; i<labor.length; i++)
        {
            if(labor[i]!=null)
            {
                if(labor[i].getPreis() < min)
                {
                    min=labor[i].getPreis();
                }
            }
        }
        return min;
    }

    public int anzahlLaptops()
    {
        int anz=0;
        for(int i=0; i<labor.length; i++)
        {
            if(labor[i]!=null)
            {
                if(labor[i].getLaptop()==true)
                {
                    anz++;
                }
            }
        }
        return anz;
    }

    public float  avgPreisLaptop()
    {
        int anz=0;
        int sum=0;

        for(int i=0; i<labor.length;i++)
        {
            if(labor[i]!=null)
            {

                anz++;
                sum += labor[i].getPreis();

            }
        }
        return  (float)sum/anz;
    }

    public void löcher(Computer welchen)
    {
        for(int i=0; i<labor.length; i++)
        {
           if(welchen==null)
           {
               labor[i]=welchen;
               welchen=null;
               
            }
            else
            {
                labor[i]=welchen;
            
            }

        }
    }

}
