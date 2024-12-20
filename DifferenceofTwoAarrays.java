//the question is to remove the elements of array a that are present in array b.
//the two arrays given will be of unique elements and sorted in order.


import java.util.*;

public class Main {
    public static int[] solve(int m, int[] a, int n, int[] b) {
      int i = 0;
      int j = 0;

      ArrayList<Integer> ans = new ArrayList<>();
      
      while(i<m && j < n){

        if(a[i] == b[j]){ //if both the elements are same then move both the pointers without adding them into the list
          i++;
          j++;
        }
        if(a[i] > b[j]){  //there is a possibility that the element may occur further in b, so only move j
          j++;
        }
        else{ 
          ans.add(a[i]);
          i++;
        }
      }

      while(i < m){
        ans.add(a[i]);
        i++;
      }

      int[] res = new int[ans.size()];

      int k = 0;
      for(int ele : ans){
        res[k++] = ele;
      }

      return res;
      

    }
}
