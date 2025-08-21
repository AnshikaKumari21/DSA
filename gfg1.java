//Given a positive integer n, determine whether it is odd or even. Return true if the number is even and false if the number is odd.
class gfg1 {
    static boolean isEven(int n) {
        // code here
        if(n%2==0){
            return true;
}
        return false;
    }

    public static void main(String[] args) {
        int n = 7; // test input
        System.out.println(isEven(n));
}
}