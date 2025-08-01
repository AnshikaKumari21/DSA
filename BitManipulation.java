public class BitManipulation{
    public static void main(String args[]){
        //Get Bit
        int n=5;
        int pos=2;
        int BitMask=1<<pos;
        if((BitMask & n)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }

        //Set Bit
        
    }
}