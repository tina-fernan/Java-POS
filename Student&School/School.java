public class School
{
    private Student sessel0;
    private Student sessel1;
    private Student sessel2;

    public void abmeldenName(String name)
    {
        if(name != null)
        {
            if(sessel0.getName().equals(name))
          {
                String theName = sessel0.getName();
                theName=null;
                sessel0.setName(theName);

            }
            
            else
            {
                if(sessel1.getName().equals( name))

                {
                    String theName = sessel1.getName();
                    theName=null;
                    sessel1.setName(theName);

                }
                else
                {
                    if(sessel2.getName().equals( name))

                    {
                        String theName = sessel2.getName();
                        theName=null;
                        sessel2.setName(theName);

                    }
                }

            }
        }
        else
        {
            System.out.println("Es gibt keine Name ");
        }

    }

    public void abmelden(Student wer)
    {
        if(wer != null)
        {
            if(wer.getSchool() == this)
            {
                if(sessel0 == wer)
                {
                    sessel0 = null;
                    wer.setSchool(null);

                }
                else
                {
                    if(sessel1 == wer)
                    {
                        sessel1 = null;
                        wer.setSchool(null);

                    }
                    else
                    {
                        if(sessel2 == wer)
                        {
                            sessel2 = null;
                            wer.setSchool(null);

                        }

                    }

                }

            }
            else
            {
                System.out.println("feher:es gibt keine Studen in der schule!");
            }
        }
        else
        {
            System.out.println("feher:es gibt keine Student!");
        }
    }

    public void aufnehemen(Student neu)
    {

        if(neu != null)
        {
            if(neu.getSchool()== null)
            {
                if(sessel0 == null)
                {
                    sessel0=neu;
                    neu.setSchool(this);
                }
                else
                {
                    if(sessel1 == null)
                    {
                        sessel1=neu;
                        neu.setSchool(this);
                    }
                    else
                    {
                        if(sessel2 == null)
                        {
                            sessel2=neu;
                            neu.setSchool(this);
                        }

                        else
                        {
                            System.out.println("Fehler:kein Platz!");
                        }
                    }
                }

            }
            else
            {
                System.out.println("Fehler:schon angemeldet!");
            }
        }
    }

    public int anzahlDamen()
    {
        int anz;

        anz = 0;
        if (sessel0 != null)
        {
            if (sessel0.getMannlich() == false)
            {
                anz = anz+1;
            }
        }
        if (sessel1 != null)
        {
            if (sessel0.getMannlich() == false)
            {
                anz = anz+1;
            }
        }
        if (sessel2 != null)
        {
            if (sessel2.getMannlich() == false)
            {
                anz = anz+1;
            }
        }
        return anz;
    }

    public int anzahlUber()
    {   int anzahlUber;

        anzahlUber=0;

        if(sessel0!= null)
        {
            if(sessel0.getAlter()>20)
            {
                anzahlUber=anzahlUber+1;
            }
        }
        if(sessel1!= null)
        {
            if(sessel1.getAlter()>20)
            {
                anzahlUber=anzahlUber+1;
            }
        }
        if(sessel2!= null)
        {
            if(sessel2.getAlter()>=20)
            {
                anzahlUber=anzahlUber+1;
            }

        }
        return anzahlUber;
    }

    public int maxAlter()
    {//27 33 24 => 33
        //find maximum ag
        int max=0;
        if(sessel0 != null)
        {
            if(sessel0.getAlter()>max)
                max=sessel0.getAlter();
        }
        if(sessel1 != null)
        {
            if(sessel1.getAlter()>max)
                max=sessel1.getAlter();
        }
        if(sessel2 != null)
        {
            if(sessel2.getAlter()>max)
                max=sessel2.getAlter();
        }
        return max;
    }
    public void printSchool()
    {
        if (sessel0 != null)
        {
            sessel0.printStudent();
        }
        if (sessel1 != null)
        {
            sessel1.printStudent();
        }
        if (sessel2 != null)
        {
            sessel2.printStudent();
        }
    }

}

