public class TestTemperatur
{
     public static void  testTemperaturSchwankung()
   {
       Temperatur temp=new Temperatur();
       System.out.println(temp.temperaturSchwankung()); //-999
       temp.fulleTestdaten();
       
       System.out.println("the Temperature difference between warmest and coldest day is: "+temp.temperaturSchwankung()); 
       
    }
    public static void  testAnzahlTageAnstieg()
   {
       Temperatur temp=new Temperatur();
        System.out.println(temp.anzahlTageAnstieg()); // 0
       temp.fulleTestdaten();
        System.out.println("the number of days which temperatur increase is: "+temp.anzahlTageAnstieg()); 
       
    }
   public static void  tesMaximalerAbfall()
   {
       Temperatur temp=new Temperatur();
       temp.fulleTestdaten();
       System.out.println("the maximum decrease is: "+temp.maximalerAbfall()); 
      
    }
    
    public static void testWarmstesterTage()
   {
       Temperatur temp=new Temperatur();
       temp.fulleTestdaten();
       System.out.println("the warmest day is: "+temp.warmstesterTage()); 
       //System.out.println("the coldest day is: "+temp.kaltesterTage());
       
    }
     public static void testKaltesterTage()
   {
       Temperatur temp=new Temperatur();
       temp.fulleTestdaten();
      System.out.println(temp.kaltesterTage());
     
    }
   public static void testAusGeben()
   {
       Temperatur temp=new Temperatur();
       temp.fulleTestdaten();
       temp.ausGeben();
    }
}

