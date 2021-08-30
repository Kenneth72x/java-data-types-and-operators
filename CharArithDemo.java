//Character variables can be handled like integers. 

class CharArithDemo {
    public static void main(String args[]){
        char ch;

        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++; //increment ch <---a char can be incremented
        System.out.println("ch is now " + ch);

        ch = 90; //give ch the value Z <---a char can be assigned an integer value.
        System.out.println("ch is now " + ch);
    }
}
