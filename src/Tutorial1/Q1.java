package Tutorial1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] telephone = new String[5];
        for(int i=0;i<5;i++){
            String areaCode = s.next();
            String number = s.next();
            Telephone a = new Telephone(areaCode, number);
            System.out.println(a.makeFullNumber());
        }
    }
}
