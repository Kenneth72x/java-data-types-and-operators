//Demonstrate the % operator.


class ModDemo {
    public static void main(String arg[]){
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Result and remainder of 10 / 3: " + iresult + " " + irem);
        System.out.println("Result and remainder of 10.0 / 3.0: " + dresult + " " + drem);
    }
}
//As you can see, the % operator yields a remainder of 1 for both integer and floating-point operations. \