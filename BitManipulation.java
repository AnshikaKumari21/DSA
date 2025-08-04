import java.util.Scanner;
public class BitManipulation{
    public static void main(String args[]){
        //Get Bit
        Scanner sc= new Scanner (System.in);
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
        int m=5;
        int position=1;
        int Bitmask=1<<position;
        int  newNum=Bitmask | m;
        System.out.println(newNum);

        //Clear Bit
        int p=5;
        int post=2;
        int bitmask=1<<post;
        int notBitmask=~(bitmask);
        int newNumber=notBitmask&p;
        System.out.println(newNumber);

        //Update Bit
        int oper=sc.nextInt();   //update bit o 1 else pdate bit to 0
        //oper=1 : set, oper=0 : clear
        int q=5;   //0101
        int pOs=1;

        //set bit
        if(oper==1){
            int bitMask=1<<pOs;
            int newnum=bitMask | q;
            System.out.println(newnum);
        }

        else{
            int BiTmask=1<<pOs;
            int NotBitmask=~(BiTmask);
            int newnumber=notBitmask&q;
            System.out.println(newnumber);

        }
        
        




    }
}