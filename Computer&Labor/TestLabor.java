
public class TestLabor
{
      public void testlöcher()
    {
      
       Computer pc0,pc1,pc2,pc3,pc4,pc5,pc6,pc7,pc8;
       pc0= new Computer("HP",true,789);
       pc1= new Computer("Lenevo",true,650);
       pc2= new Computer("Dell",false,820);
       pc3= new Computer("Apple",true,1200);
       pc4= new Computer("Toshiba",true,500);
       pc5= new Computer();
       pc6= new Computer("Apple",false,1400);
       pc7= new Computer("Apple",false,1400);
      // pc8= new Computer("Apple",false,1400);
       Labor labor=new Labor();
       //Labor labor1=new Labor();
       //labor.löcher();//0
       //labor.hineinstellen(pc0);
       //labor.hineinstellen(pc1);
       //labor.hineinstellen(pc2);
       //labor.hineinstellen(pc3);
       //labor.hineinstellen(pc4);
      //labor.hineinstellen(pc5);
      //labor.hineinstellen(pc6);
      //labor.hineinstellen(pc7);
      //labor.hineinstellen(pc8);
       labor.löcher(pc0);
       labor.löcher(null);
       labor.löcher(pc5);
       labor.printLabor();
        
    }
     public void testavgPreisLaptop()
    {
      
      Computer pc0,pc1,pc2,pc3;
        pc0= new Computer("HP",true,789);
        pc1= new Computer("Lenevo",true,650);
        pc2= new Computer("Dell",false,820);
        pc3= new Computer("Apple",true,1200);
        Labor labor=new Labor();
        Labor labor1=new Labor();
        System.out.println(labor.avgPreisLaptop());//0
        
        labor.hineinstellen(pc0);
         System.out.println(labor.avgPreisLaptop());//789.0
         
         labor.hineinstellen(pc1);
         System.out.println(labor.avgPreisLaptop());//719.5
         labor.hineinstellen(pc2);
         System.out.println(labor.avgPreisLaptop());//753
        }
    public void testanzahlLaptops()
    {
      
      Computer pc0,pc1,pc2,pc3;
        pc0= new Computer("HP",true,789);
        pc1= new Computer("Lenevo",true,650);
        pc2= new Computer("Dell",false,820);
        pc3= new Computer("Apple",true,1200);
        Labor labor=new Labor();
        Labor labor1=new Labor();
        System.out.println(labor.anzahlLaptops());//0
        
        labor.hineinstellen(pc0);
         System.out.println(labor.anzahlLaptops());//1
         
         labor.hineinstellen(pc1);
         System.out.println(labor.anzahlLaptops());//2
         labor.hineinstellen(pc2);
         System.out.println(labor.anzahlLaptops());//2
        }
    public void testMinPreis()
    {/*

       */
      
        Computer pc0,pc1,pc2,pc3;
        pc0= new Computer("HP",true,789);
        pc1= new Computer("Lenevo",true,650);
        pc2= new Computer("Dell",true,820);
        pc3= new Computer("Apple",true,1200);
        Labor labor=new Labor();
        Labor labor1=new Labor();
        System.out.println(labor.minPreis());//999
        
        labor.hineinstellen(pc0);
         System.out.println(labor.minPreis());// 789
        
        labor.hineinstellen(pc2);
        System.out.println(labor.minPreis());//789
        
       labor.hineinstellen(pc1); 
       System.out.println(labor.minPreis());//650
    }
     public void testHerausnehmen()
    {

      
        Computer pc0,pc1,pc2,pc3;
        pc0= new Computer("HP",true,789);
        pc1= new Computer("Lenevo",true,650);
        pc2= new Computer("Dell",true,820);
        pc3= new Computer("Apple",true,1200);
        Labor labor=new Labor();
        Labor labor1=new Labor();
        labor.hineinstellen(pc0);
        labor.hineinstellen(pc1);
        labor.hineinstellen(pc2); 
        labor1.herausnehmen(pc0);//Fehler: Computer ist nich im Labor!
        labor.printLabor();
        System.out.println("=================");
        pc1.herausnehmen();
        labor.printLabor();
        System.out.println("=================");
        pc2.herausnehmen();
        labor.printLabor();
        System.out.println("=================");
        pc0.herausnehmen();
        labor.printLabor();
        System.out.println("=================");
        pc1.herausnehmen();
        labor.printLabor();//Fehler: stehe auf keinem labor
        
    }
    public void testHineinstellen()
    {/*

       */
      
        Computer pc0,pc1,pc2,pc3;
        pc0= new Computer("HP",true,789);
        pc1= new Computer("Lenevo",true,650);
        pc2= new Computer("Dell",true,820);
        pc3= new Computer("Apple",true,1200);
        Labor labor=new Labor();
        Labor labor1=new Labor();
        labor.hineinstellen(pc1);
        labor.hineinstellen(pc2);
        labor.hineinstellen(pc1);//Fehler:  Computer schon im labor!!  
        labor.hineinstellen(null);// Fehler: kein Computer!
        labor1.hineinstellen(pc0);//Fehler: kein Labor! 
        labor.printLabor();
    }
   
}
