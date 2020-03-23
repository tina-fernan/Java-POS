public class Schleife
{
    public void countUp()
    {
        int i=1;

        while(i <= 10)
        {
            System.out.println(i);
            i++;
           
     
        }
    }

    public void countUpGerade()
    {
        int i=2;

        while(i <= 20)
        {
            System.out.println(i);
            i = i+2;
        }
    }
     public void countDown(int start)
     {
         int i = start;
         while(i >= 0)
         {
             System.out.println(i);
             i--;
            }
         
        }
        public void countFromTo(int from,int to)
        {
            int i;
            if(from<to)
            {
                i=from;
                while(i <= to)
                {
                    System.out.println(i);
                    i++;
                }
            }
            else
            {
                i=from;
                
                while(i >= to)
                {
                    System.out.println(i);
                    i--;
                }
                
            }
        }
        public void countUpDown(int bis)
        {
            int i=1;
            
            while(i<=bis)
            {
                System.out.println(i);
                i++;
            }
            i=bis-1;
            while(i >= 0)
            {
                System.out.println(i);
                i--;
            }
        }
        
        public int sum(int bis)
        {
            int i=1;
            int sum=0;
            while(i<=bis)
            {
                sum=sum+i;
                i++;
            }
            return sum;
        }
        
}


    

