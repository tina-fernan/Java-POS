
public class Test
{
 
   public void testEinparken()
    {
        Parkplatz platz, platz2;
        Auto a0, a1, a2, a3, a4, a5, a6;

        a0 = new Auto("W-123456",  2000, true);
        a1 = new Auto("WN-456789", 1990, false);
        a2 = new Auto("MD-987654", 2010, true);
        a3 = new Auto("BN-654321", 1980, false);
        a4 = new Auto("BN-12345",  1980, false);
        a5 = new Auto("BN-67891",  1980, false);
        a6 = new Auto("BN-12313",  1980, false);
        platz = new Parkplatz();
        platz2 = new Parkplatz();
        platz.einparken(a0);
        platz.einparken(a1);
        platz.einparken(a2);
        platz.einparken(a3);
        platz.einparken(a1);  /*FEHLER schon auf einem Parkplatz!*/
        platz2.einparken(a2); /*FEHLER schon auf einem Parkplatz!*/
        platz2.einparken(null); /*FEHLER kein Auto!*/
        platz.einparken(a4);
        platz.einparken(a5); /*FEHLER kein parkplatz!*/
        platz.printParkplatz();
    }
    public void testAnzahlAutomatik()
    {
        Parkplatz platz;
        Auto a0, a1, a2;

        a0 = new Auto("W-123456", 2000, true);
        a1 = new Auto("WN-456789", 1990, false);
        a2 = new Auto("MD-987654", 2010, true);
        platz = new Parkplatz();
        System.out.println(platz.anzahlAutomatik()); /*0*/
        platz.einparken(a0);
        System.out.println(platz.anzahlAutomatik()); /*1*/
        platz.einparken(a1);
        System.out.println(platz.anzahlAutomatik()); /*1*/
        platz.einparken(a2);
        System.out.println(platz.anzahlAutomatik()); /*2*/
    }
    public void testAvgBaujahrAutomatik()
    {
        Parkplatz platz;
        Auto a0;
        Auto a1;
        Auto a2;

        a0 = new Auto("W-123456", 2000, true);
        a1 = new Auto("WN-456789", 1990, false);
        a2 = new Auto("MD-987654", 2009, true);
        platz = new Parkplatz();
        System.out.println(platz.avgBaujahrAutomatik());
        platz.einparken(a0);
        System.out.println(platz.avgBaujahrAutomatik());
        platz.einparken(a1);
        System.out.println(platz.avgBaujahrAutomatik());
        platz.einparken(a2);
        System.out.println(platz.avgBaujahrAutomatik());
    }
     public void testMinBaujahr()
    {
        Parkplatz platz;
        Auto a0;
        Auto a1;
        Auto a2;

        a0 = new Auto("W-123456", 2000, true);
        a1 = new Auto("WN-456789", 1990, false);
        a2 = new Auto("MD-987654", 2010, true);
        platz = new Parkplatz();
        System.out.println(platz.minBaujahr()); /*9999*/
        platz.einparken(a0);
        System.out.println(platz.minBaujahr()); /*2000*/
        platz.einparken(a1);
        System.out.println(platz.minBaujahr()); /*1990*/
        platz.einparken(a2);
        System.out.println(platz.minBaujahr()); /*1990*/
    }
     public void testAusparken()
    {
        Parkplatz platz;
        Parkplatz platz2;
        Auto a0;
        Auto a1;
        Auto a2;

        a0 = new Auto("W-123456", 2000, true);
        a1 = new Auto("WN-456789", 1990, false);
        a2 = new Auto("MD-987654", 2010, true);
        platz = new Parkplatz();
        platz2 = new Parkplatz();
        platz.einparken(a0);
        platz.einparken(a1);
        platz.einparken(a2);
        platz2.ausparken(a1);   /*Fehler: Auto steht nicht auf diesem Parlplatz!*/
        platz.printParkplatz(); /*W,WN,MD*/
        System.out.println("----------");
        a2.ausparken();
        platz.printParkplatz(); /*W,WN*/
        System.out.println("----------");
        a0.ausparken();
        platz.printParkplatz(); /*WN*/
        System.out.println("----------");
        a1.ausparken();
        platz.printParkplatz(); /**/
        System.out.println("----------");
        a2.ausparken();         /*Fehler: auf keinem Parkplatz!*/
        platz.ausparken(null);  /*Fehler: kein Auto!*/

    }



}
