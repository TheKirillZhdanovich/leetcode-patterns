import java.util.*;


public class YandexPrivateKey {
    public static void main(String[] args) {
        System.out.println(countPrivateKey(5, 10));
        System.out.println(countPrivateKey(10, 11));
        System.out.println(countPrivateKey(527, 9486));
        System.out.println(countPrivateKey(1, 7));
    }

    public static int countPrivateKey(int nod, int nok) {
        int size = primeFactors(nok / nod);

        if(nok % nod != 0) {
            return 0;
        }else {
            return (int) (2 * Math.pow(2, size - 1));
        }

    }

    public static int primeFactors(int number) {
        Set<Integer> set = new HashSet<>();

        if(number == 1 || number == 2) {
            return 1;
        }

        for(int i = 2; i < number; i++) {
            while(number % i == 0) {
                set.add(i);
                number = number / i;
            }
        }

        if(number > 2) {
            set.add(number);
        }

        return set.size();
    }
}
