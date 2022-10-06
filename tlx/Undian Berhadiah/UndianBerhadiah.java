import java.util.*;

public class UndianBerhadiah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, x;
        int selisih;
        ArrayList<Integer> listKupon = new ArrayList<>();

        n = input.nextInt();
        if (n >= 1 && n <= 99999) {
            x = input.nextInt();
            if (x >= 0 && x <= 99999) {
                int[] listInput = new int[n];

                for (int i = 0; i < n; i++) {
                    listInput[i] = input.nextInt();
                }

                selisih = Math.abs(listInput[0] - x);

                for (int i = 0; i < n; i++) {
                    if (Math.abs(listInput[i] - x) <= selisih) {
                        listKupon.add(listInput[i]);
                    }
                }

                for (int kupon : listKupon
                ) {
                    System.out.println(kupon);
                }
            }
        }

    }
}
