package jan2025;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        HashMap<String, String> phoneBook = new HashMap<>();

        for(int i=0; i<n; i++) {
            String name = s.nextLine();
            String phoneNumber = s.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        while(s.hasNextLine()) {
            String query = s.nextLine();

            if(phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            }else {
                System.out.println("Not found");
            }
        }

         s.close();

    }
}
/*
input
3
amma my
237538
md faizuu
76396252
aeyisha siddiqa
85848366

 */