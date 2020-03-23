public class Baum
{
  
     public static void printBaumRahmen(int hohe)
     {
         if ((hohe>=1) && (hohe<=10))
         {
             for (int z=0; z<hohe; z++)
             {
                 for (int s=0; s<((hohe*2)-1); s++)
                 {
                     if (((z+s) >= (hohe-1)) && ((z+hohe-1) >= s))
                     {
                         if ((z == hohe-1) || (z+s == hohe-1) || (s-z ==
hohe-1))
                         {
                             System.out.print("*");
                         }
                         else
                         {
                             if (z%2 == 1)
                             {
                                 System.out.print("o");
                             }
                             else
                             {
                                 System.out.print(" ");
                             }
                         }
                     }
                     else
                     {
                         System.out.print(" ");
                     }
                 }
                 System.out.println();
             }
         }
         else
         {
             System.out.println("Fehler: ungültige Höhe!");
         }
     }
     public static void printBaum(int hohe)
     {
         if ((hohe>=1) && (hohe<=10))
         {
             for (int z=0; z<hohe; z++)
             {
                 for (int s=0; s<((hohe*2)-1); s++)
                 {
                     if (((z+s) >= (hohe-1)) && ((z+hohe-1) >= s))
                     {
                         System.out.print("*");
                     }
                     else
                     {
                         System.out.print(" ");
                     }
                 }
                 System.out.println();
             }
         }
         else
         {
             System.out.println("Fehler: ungültige Höhe!");
         }
     }
         public static void printQuadrat(int hohe)
     {
         if ((hohe >= 1) && (hohe <= 10))
         {
             for (int z=0; z<hohe; z++)
             {
                 for (int s=0; s<hohe; s++)
                 {
                     System.out.print("*");
                 }
                 System.out.println();
             }
         }
         else
         {
             System.out.println("Fehler: ungültige Höhe!");
         }
     }
      public static void printQuadratRahmen(int hohe)
     {
         if ((hohe >= 1) && (hohe <= 10))
         {
             for (int z=0; z<hohe; z++)
             {
                 for (int s=0; s<hohe; s++)
                 {
                     if ((z==0) || (s==0) || (z==hohe-1) || (s==hohe-1))
                     {
                         System.out.print("*");
                     }
                     else
                     {
                         System.out.print(" ");
                     }
                 }
                 System.out.println();
             }
         }
         else
         {
             System.out.println("Fehler: ungültige Höhe!");
         }
     }
       public static void printRechteck(int  breite, int hohe)
     {
         if ((breite >= 1) && (breite <= 10) && (hohe >= 1) && (hohe <=
10) && (hohe != breite))
         {
             for (int z=0; z<hohe; z++)
             {
                 for (int s=0; s<breite; s++)
                 {
                     System.out.print("*");
                 }
                 System.out.println();
             }
         }
         else
         {
             System.out.println("Fehler: ungültige Höhe oder Breite!");
         }
     }
}


    

