package Hotel&TestHotel;

public class TestHotel
{
     public static void testSortSelection()
    {
      Hotel hotel;
      hotel = new Hotel();
     
     hotel.testDaten(); // 25 12 19 22 5 9 7 30 30 30 9 12 0 5 0
     hotel.sortSelection(); // 0 0 5 5 7 9 9 12 12 19 22 25 30 30 30
     hotel.printHotel();
    }
     public static void testSortBubble()
    {
      Hotel hotel;
      hotel = new Hotel();
     
     hotel.testDaten(); // 25 12 19 22 5 9 7 30 30 30 9 12 0 5 0
     hotel.sortBubble(); // 
     hotel.printHotel();
    }
    public static void testEinfugen1()
    {
      Hotel hotel;
      hotel = new Hotel();
     
     hotel.testDaten(); // 25 12 19 22 5 9 7 30 30 30 9 12 0 5 0
     hotel.einfugen(0,15); // ungültige tag!
     hotel.printHotel();
     hotel.einfugen(-1,6); // ungültige tag!
    
    
     hotel.printHotel();
    }
    public static void testEinfugen()
    {
      Hotel hotel;
      hotel = new Hotel();
     
     hotel.testDaten(); // 25 12 19 22 5 9 7 30 30 30 9 12 0 5 0
     hotel.einfugen(6);
     hotel.einfugen(-1); // ungültige tag!
    
    
     hotel.printHotel();
    }
     public static void testStornVonBis()
    {
      Hotel hotel;
      hotel = new Hotel();
     
      hotel.testDaten();
     hotel.stornVonBis(2,4);
     hotel.stornVonBis(10,12); // Fehler keine Buchung vorhanden!
     hotel.stornVonBis(5,8); 
    
     hotel.printHotel();
    }
     public static void testBuchenVonBis()
    {
      Hotel hotel;
      hotel = new Hotel();
     
      hotel.testDaten();
     hotel.buchenVonBis(3,6);
     hotel.buchenVonBis(6,9);
     hotel.buchenVonBis(-1,4); //Fehler
     hotel.buchenVonBis(3,-1); //Fehler
     hotel.buchenVonBis(3,15); //Fehler
     hotel.buchenVonBis(15,3); //Fehler
 
     hotel.printHotel();
    }
     public static void testStornie()
    {
      Hotel hotel;
      hotel = new Hotel();
     
      hotel.testDaten();
     hotel.stornie(6);
     hotel.stornie(12);
     hotel.stornie(15);
     hotel.stornie(-1);
     hotel.printHotel();
    }
     public static void testBuchen()
    {
      Hotel hotel;
      hotel = new Hotel();
     
      hotel.testDaten();
     hotel.buchen(5);
     hotel.buchen(4);
     hotel.buchen(15);
     hotel.buchen(-1);
     hotel.printHotel();
    }
     public static void testVollBelegt()
    {
      Hotel hotel;
      hotel = new Hotel();
      System.out.println(hotel.vollbelegt());
      hotel.testDaten();
      System.out.println(hotel.vollbelegt());
      hotel.testDaten2();
      System.out.println(hotel.vollbelegt());
      hotel.printHotelVerk();
        
    }
    
    public static void testTageUber80Prozent()
    {
      Hotel hotel;
      hotel = new Hotel();
      System.out.println(hotel.tageUber80Prozent());
      hotel.testDaten();
      System.out.println(hotel.tageUber80Prozent());
      hotel.printHotelVerk();
        
    }
    public static void testTageUnter50Prozent()
    {
      Hotel hotel;
      hotel = new Hotel();
      System.out.println(hotel.tageUnter50Prozent());
      hotel.testDaten();
      System.out.println(hotel.tageUnter50Prozent());
      hotel.printHotelVerk();
        
    }
    public static void testPrintHotelVerk()
  {
      Hotel hotel;
      hotel = new Hotel();
      hotel.testDaten();
      hotel.printHotelVerk();
    }
  public static void testPrintHotel()
  {
      Hotel hotel;
      hotel = new Hotel();
      hotel.testDaten();
      hotel.printHotel();
    }
}
