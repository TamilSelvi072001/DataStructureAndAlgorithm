package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Union {
    public static void main(String[] args) {
        int arr1[]={4,2,3,4,1,0,2};
        int arr2[]={9,0,3,6,3};
        ArrayList<Integer> ans=findUnion(arr1, arr2, arr1.length,arr2.length);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
     public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(arr1[i]);
        }
         for(int i=0;i<m;i++){
            hs.add(arr2[i]);
        }
        Iterator i=hs.iterator();
        while(i.hasNext()){
            ans.add((int)i.next());
        }
        Collections.sort(ans);
        return ans;
    } 
}
