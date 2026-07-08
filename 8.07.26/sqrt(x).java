class Solution 
{
    public int mySqrt(int x) 
    {
       for(int i =0;i<=x;i++){
           long a = (long) i*i;
           if(a==x){
               return i;
           }
           if (a>x){
               return i-1;
           }
       }
       return x;
    }
}
