//convert given given roman intgers to java
class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        int sum=0;
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)=='V')
            {
                if(i!=0 && s.charAt(i-1)=='I')
                {
                    sum=sum+4;
                    i-=1;
                }
                else
                {
                    sum=sum+5;
                }

            }
            else if(s.charAt(i)=='X')
            {
                if(i!=0 && s.charAt(i-1)=='I')
                {
                    sum=sum+9;
                    i-=1;

                }
                else
                {
                    sum=sum+10;
                }
            }
            else if(s.charAt(i)=='C')
            {
                if(i!=0 && s.charAt(i-1)=='X')
                {
                    sum=sum+90;
                    i-=1;
                }
                else
                {
                    sum=sum+100;
                }
                
            }
            else if(s.charAt(i)=='I')
            {
                sum=sum+1;
            }
            else if(s.charAt(i)=='L')
            {
                if(i!=0 && s.charAt(i-1)=='X')
                {
                    sum=sum+40;
                    i-=1;
                }
                else
                {
                sum=sum+50;
                }
            }
            else if(s.charAt(i)=='D')
            {
                if(i!=0 && (s.charAt(i-1)=='C'))
                {
                    sum=sum+400;
                    i-=1;
                }
                else
                {
                    sum=sum+500;
                }
            }
            else if(s.charAt(i)=='M')
            {
                if(i!=0 && s.charAt(i-1)=='C')
                {
                    sum=sum+900;
                    i-=1;
                }
                else
                {
                    sum=sum+1000;
                }
            }
           // System.out.print(sum+" ");
        }
        return sum;
    }
}
