package jan2025;

import java.util.HashSet;
import java.util.Scanner;

public class UniquePairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_Left = new String[t];
        String[] pair_right = new String[t];

        for(int i=0;i<t;i++) {
            pair_Left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Hashset to store a unique pairs

        HashSet<String> uniquePairs = new HashSet<>();

        for(int i=0;i<t;i++){
            String pair = (pair_Left[i].compareTo(pair_right[i]) < 0)
            ? pair_Left[i] + " " + pair_right[i]
            : pair_right[i] + " " + pair_Left[i];
            uniquePairs.add(pair);
            System.out.println(uniquePairs.size());
        }
        s.close();
    }
}
/*
input
5
john tom
john mary
john tom
mary anna
mary anna

output
1
2
2
3
3

 */