import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(6);

        /*list.add(1);
        list.add(7);

        System.out.println(list);

        System.out.println(list.contains(7));

        list.set(0,78);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);*/

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
        System.out.println((list.get(i)));
        }
    }
}
