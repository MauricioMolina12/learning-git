package tablakendry;

import java.util.*;

public class Tablakendry {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num;

        System.out.println("Digite un número");
        num = leer.nextInt();

        for (int i = 1; i <= 10; i++) {
             
             if (num>0&&num<=10) {
                 System.out.println(num + "x" + i + "=" + i * num);
            }
             else {
                 System.out.println("Mire bien");
                
             
            }
      

        }
    }
}
