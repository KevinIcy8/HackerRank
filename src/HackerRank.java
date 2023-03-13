
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class HackerRank {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("abcdefgh",3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        ArrayList<String> substrings = new ArrayList<>();
        for(int i = 0; i < s.length()-k+1; i++){
            String sub = s.substring(i,i+k);
            substrings.add(sub);
        }
        for(int i = 0; i < substrings.size()-1; i++){
            String sub = substrings.get(0);
            for(int j = 0; j < substrings.size()-1; j++){
                if(sub.compareTo(substrings.get(j+1)) > 0){
                    String temp = substrings.get(j);
                    substrings.set(j,substrings.get(j+1));
                    substrings.set(j+1, temp);
                }
            }
        }
        smallest = substrings.get(0);
        largest = substrings.get(substrings.size()-1);
        return smallest + "\n" + largest;
    }

}
