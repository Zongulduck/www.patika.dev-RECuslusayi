import java.util.Scanner;
public class RECuslusayi {
    public static int pow(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * pow(base, exp - 1);

        }
    }
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("Taban değeri girin: ");
            int base = inp.nextInt();
            System.out.print("Üs değeri girin: ");
            int exp = inp.nextInt();
            System.out.println("Yanıt: " + pow(base, exp));


        }
    }

