public class TestSchool
{
    public void TestabAnmelden()
{
   School spg;
   Student s0,s1,s2,s3,s4,s5;
   s0 = new Student("Fritz",14,true);
   s1 = new Student("Franc",25,true);
   s0.printStudent();
   spg=new School();
   spg.aufnehemen(s0);
   spg.printSchool();
   spg.aufnehemen(s1);
   spg.printSchool();
   
   
}
}