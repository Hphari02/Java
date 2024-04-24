class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        char []arr=new char[n];
        int i=0,j=0;
        while(i<n)
        {
            //checking and inserting opening parenthesis->c1
            if(s.charAt(i)=='(' || s.charAt(i)=='['|| s.charAt(i)=='{')
            {
                arr[j]=s.charAt(i);
                j++;
            }
            //checking and pushing closing parenthesis and checking if j>0 beacause in case of closing parenthesis at start of string it is not valid->c2    
            else if((s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}') && j>0)
            {
              //[j-1]+1 for ) and [j-1]+2 for for ] and }  
                if((s.charAt(i)==arr[j-1]+1 || s.charAt(i)==arr[j-1]+2))
                {
                arr[j-1]=0;
                j--;
                }
                 //this  in case of cases like (]) 
                else
                {
                    return false;
                }
            }
            //->c2 fail  
            else
            {
                return false;
            }

            i++;
        }
        if(j!=0)
        {
            return false;
        }
        return true;
    }
}
