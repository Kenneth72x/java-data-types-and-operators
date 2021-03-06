//Demonstrate the short-circuit operators

class SCops {
    public static void main(String args[]){
        int n, d, q;

        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
        
        d = 0; //now, set d to zero
        
        //since d is zero, the second operand is not evaluated. 
        if(d != 0 && (n % d) == 0) //<---The short-circuit operator prevents a division by zero.
            System.out.println(d + " is a factor of " + n);
        
        //Now, try same thing without short-circut operator. This will cause a divide-by-zero error. 
        if(d != 0 & (n % d) == 0) //<---Now both expressions are evaluated, alllowing a division by zero to occur. 
            System.out.println(d + " is a factor of " + n);    
    }
}
