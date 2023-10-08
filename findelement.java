
import java.util.ArrayList;

public class findelement {
    public static void main(String[] args) {
        int arr[]={1,3,52,5,28,9,9};
        
        
        // System.out.println(findindex(arr, 9,0));
        // System.out.println(find(arr, 9, 0));
        // findallindex(arr, 9, 0);
        // System.out.println(list);
        System.out.println(findallindexlist(arr, 9, 0, list));

    }
    static int find(int arr[],int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
           return find(arr, target, index +1);

        }
        
        
    }
    static boolean findindex(int arr[],int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || findindex(arr, target, index +1);
        
        
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void findallindex(int arr[],int target,int index){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index) ;
        }
        
        findallindex(arr, target, index +1);

        
    }
    static ArrayList<Integer> findallindexlist(int arr[],int target,int index,ArrayList <Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index) ;
        }
        
        return findallindexlist(arr, target, index +1, list);

        
    }
}
