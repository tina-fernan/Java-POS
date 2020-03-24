public class TestSchool
{
    public void testAbmeldenStudent()
    {
        School spg;
        Student s0, s1, s2, s3, wer;
        
        s0 = new Student("Franz Berger", 19, true);
        s1 = new Student("Susi Muller",  35, false);
        s2 = new Student("Fritz Badi",   25, true);
        s3 = new Student("Max Badi",     25, true);
        wer = null;
        spg = new School();
        spg.anmelden(s0);   
        spg.anmelden(s1);   
        spg.anmelden(s2);   // Franz Berger   Susi Muller   Fritz Badi
        spg.printSchool();  // Franz Berger   Susi Muller   Fritz Badi
        System.out.println("==========");
        spg.abmelden((Student)null); // Fehler
        spg.abmelden(wer);           // Fehler
        spg.printSchool();  // Franz Berger   Susi Muller   Fritz Badi
        System.out.println("==========");
        spg.abmelden(s3);           // Fehler
        spg.printSchool();  // Franz Berger   Susi Muller   Fritz Badi
        System.out.println("==========");
        spg.abmelden(s2);
        spg.printSchool();  // Franz Berger   Susi Muller
        System.out.println("==========");
        spg.abmelden(s0);
        spg.printSchool();  // Susi Muller
        System.out.println("==========");
        spg.abmelden(s1);
        spg.printSchool();  // 
        System.out.println("==========");
    }
    
    public void testAbmeldenInitialen()
    {
        School spg;
        Student s0, s1, s2;
        
        s0 = new Student("Franz Berger", 19, true);
        s1 = new Student("Susi Muller",  35, false);
        s2 = new Student("Fritz Badi",   25, true);
        spg = new School();
        spg.anmelden(s0);   
        spg.anmelden(s1);   
        spg.anmelden(s2);   // Franz Berger   Susi Muller   Fritz Badi
        spg.printSchool();  // Franz Berger   Susi Muller   Fritz Badi
        System.out.println("==========");
        spg.abmeldenInitialen(null);   // Fehler
        spg.printSchool();  // Franz Berger   Susi Muller   Fritz Badi
        System.out.println("==========");
        spg.abmeldenInitialen("H");    // Fehler
        spg.printSchool();  // Franz Berger   Susi Muller   Fritz Badi
        System.out.println("==========");
        spg.abmeldenInitialen("HB");
        spg.printSchool();  // Franz Berger   Susi Muller   Fritz Badi
        System.out.println("==========");
        spg.abmeldenInitialen("FB");
        spg.printSchool();  // Susi Muller
        System.out.println("==========");
    }
    
    public void testAnmelden()
    {
        School spg;
        Student s0, s1, s2, s3;
        
        s0 = new Student("Franz", 19, true);
        s1 = new Student("Susi",  35, false);
        s2 = new Student("Karl",  25, true);
        s3 = new Student("Max",   25, true);
        spg = new School();
        spg.anmelden(null); // Fehler
        spg.anmelden(s0);   // ref null null
        spg.printSchool();  // Franz
        System.out.println("==========");
        spg.anmelden(s0);   // Fehler
        spg.anmelden(s1);   // ref ref null
        spg.printSchool();  // Franz Susi
        System.out.println("==========");
        spg.anmelden(s2);   // ref ref ref
        spg.printSchool();  // Franz Susi Karl
        System.out.println("==========");
        spg.anmelden(s3);   // Fehler
        spg.printSchool();  // Franz Susi Karl
        System.out.println("==========");
    }
}