public class clear {
    public static int clearIBtsinRange( int n, int i, int j){
        int  a= ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask=a| b;
        return n &bitMask;
    }
    public static void main(String args[]){

    
      //  clearIBtsinRange(2, 04, 06);
       System.out.println(clearIBtsinRange(1, 02, 03));
    }
    
}

