import java.util.Map;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};

        System.out.println(nextGreatestLetter(letters, 'e'));
        System.out.println(nextGreatestLetter(letters, 'c'));
        System.out.println(nextGreatestLetter(letters, 'd'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int leftLimit = 0;
        int rightLimit = letters.length - 1;
        int temp = (leftLimit + rightLimit) / 2;

        while (true) {
            if(letters[leftLimit] > target) {
                return letters[leftLimit];
            }

            if(letters[leftLimit] == target && letters[leftLimit + 1] != target) {
                return letters[leftLimit + 1];
            }

            if (rightLimit - leftLimit == 1) {
                if(letters[rightLimit] > target) {
                    return letters[rightLimit];
                }
                else {
                    return letters[0];
                }
            }

            if (letters[temp] == target) {
                if(letters[temp + 1] != target) {
                    return letters[temp + 1];
                }else {
                    leftLimit = temp;
                    temp = (leftLimit + rightLimit) / 2;
                }
            } else if (letters[temp] < target) {
                leftLimit = temp;
                temp = (leftLimit + rightLimit) / 2;
            } else {
                rightLimit = temp;
                temp = (leftLimit + rightLimit) / 2;
            }
        }
    }
}
