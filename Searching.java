public class Searching{
    public static void main(String[] args) {
        /*int[] arr={45,78,22,3,90,12};
        int target=22;
        int ans=linearSearch(arr,target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }

        }
        return -1;*/


//Searching for String
String str="Anshika";
char target='s';
System.out.println(SearchStr(str,target));


    }
static boolean SearchStr(String str,char target){
    if(str.length()==0){
        return false;
    }
    for(int i=0;i<str.length();i++){
        if(target==str.charAt(i)){
            return true;
        }
    }
    return false;

}

}
