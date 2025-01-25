package jan2025;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayManipulation {
    public static void main(String [] arg) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            arr.add(s.nextInt());
        }

        int numOperation = s.nextInt();

        for(int i=0; i<numOperation; i++){
            String operation = s.next();

            if(operation.equals("Insert")){
                int index = s.nextInt();
                int value = s.nextInt();
                arr.add(index,value);
            }else if(operation.equals("Delete")){
                int index = s.nextInt();
                arr.remove(index);
            }
        }

        for(int val : arr) {
            System.out.print(val + " ");
        }

    }
}


/*5
        0 1 2 3 4
        1
        Insert
        5 5
        0 1 2 3 4 5 */