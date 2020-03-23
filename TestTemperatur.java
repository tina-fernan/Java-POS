public class TestTemperatur
{
     public static void  testTemperaturSchwankung()
   {
       Temperatur temp=new Temperatur();
       temp.fulleTestdaten();
       System.out.println("the number of days which temperature increase is: "+temp.anzahlTageAnstieg()); 
       System.out.println("the maximum decrease is: "+temp.maximalerAbfall()); 
       System.out.println("the warmest day is: "+temp.warmstesterTage()); 
       System.out.println("the coldest day is: "+temp.kaltesterTage());
       System.out.println("the Temperature difference between warmest and coldest day is: "+temp.temperaturSchwankung()); 
       temp.ausGeben();
    }
    public static void  testAnzahlTageAnstieg()
   {
       Temperatur temp=new Temperatur();
       temp.fulleTestdaten();
        System.out.println("the number of days which temperatur increase is: "+temp.anzahlTageAnstieg()); 
       System.out.println("the maximum decrease is: "+temp.maximalerAbfall()); 
       System.out.println("the warmest day is: "+temp.warmstesterTage()); 
       System.out.println("the coldest day is: "+temp.kaltesterTage());
       temp.ausGeben();
    }
   public static void  tesMaximalerAbfall()
   {
       Temperatur temp=new Temperatur();
       temp.fulleTestdaten();
       System.out.println("the maximum decrease is: "+temp.maximalerAbfall()); 
       System.out.println("the warmest day is: "+temp.warmstesterTage()); 
       System.out.println("the coldest day is: "+temp.kaltesterTage());
       temp.ausGeben();
    }
    
    public static void testWarmstesterTage()
   {
       Temperatur temp=new Temperatur();
       temp.fulleTestdaten();
       System.out.println("the warmest day is: "+temp.warmstesterTage()); 
       System.out.println("the coldest day is: "+temp.kaltesterTage());
       temp.ausGeben();
    }
     public static void testKaltesterTage()
   {
       Temperatur temp=new Temperatur();
       temp.fulleTestdaten();
      System.out.println(temp.kaltesterTage());
      temp.ausGeben();
    }
   public static void testAusGeben()
   {
       Temperatur temp=new Temperatur();
       temp.fulleTestdaten();
       temp.ausGeben();
    }
}
