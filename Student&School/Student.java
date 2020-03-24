public class Student
{
    private String name;
    private int alter;
    private boolean mannlich;
    private School school;

    public Student(String name, int alter, boolean mannlich)
    {
        setName(name);
        setAlter(alter);
        setMannlich(mannlich);
    }
    
    public Student()
    {
        setName("Thomas Gr");
        setAlter(40);
        setMannlich(true);
    }

    

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public void setMannlich(boolean mannlich)
    {
        this.mannlich = mannlich;
    }
    public void setSchool(School school)
    {
        this.school=school;
    }

    public String getName()
    {
        return name;
    }

    public int getAlter()
    {
        return alter;
    }

    public boolean getMannlich()
    {
        return mannlich;
    }
   public School getSchool()
   {
       return school;
    }
    
     public void printStudent()
    {
        if (mannlich == true)
        {
            System.out.println(name + " (" + alter + " Jahre) - " + "Mann");
        }
        else
        {
            System.out.println(name + " (" + alter + " Jahre) - " + "Frau");            
        }
    }
    public String getInitialen()
    {
        int pos;
        String erg;
        //Thomas griesMayer
        
        erg = name.substring(0, 1); //t
        pos = name.indexOf(" ")+1;  // 6 + 1
        erg = erg + name.substring(pos, pos+1);// t + name(7 , 7+1) => t + g
        return erg;
    }
      //01234567
     //Thomas G  (8)
     public String getAccount()
     {
         String erg;
         int pos;

         if ((name.contains(" ") == true) &&
             (name.length() >= name.indexOf(" ")+3))
         {
             erg = name.substring(0, 3);
             pos = name.indexOf(" ")+1;
             erg = erg + name.substring(pos, pos+2);
             return erg;
         }
         else
         {
             System.out.println("Fehler: kein Vor- und Nachname!");
             return null;
         }
     }
    public String getAccountt()
    { int pos;
        String erg;
        if((name.contains(" ")== true)&&(name.length()>= name.indexOf(12,15)))
        {                         //01234567891011121314  
        erg = name.substring(2,5);//Tina Fernanades
        pos = name.indexOf(" ")+8;
        erg = erg + name.substring(pos,pos+2);
        return erg;
    }
    else
    {
        return null;
    }
    }
}
