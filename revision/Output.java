class recursion 
    {
        int func (int n) 
        {
            int result;
            if (n == 1)
                return 1;
            result = func (n - 1);
            return result;
        }
    } 
    class Output 
    {
        public static void main(String args[]) 
        {
            // recursion obj = new recursion() ;
            // System.out.println(obj.func(5));
            Integer i = new Integer(512);  
            byte x = i.byteValue();
            System.out.print(x);
        }
    }