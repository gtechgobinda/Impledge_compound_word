import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LongestCompoundedWord {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("input_02.txt");
        Scanner sc = new Scanner(input);

        List<String> words = new ArrayList<>();
        Set<String> set = new HashSet<>();

        int n = 0;
        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            words.add(word);
            set.add(word);
            n++;
        }
        words.sort(Comparator.comparingInt(a -> -a.length()));
        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            String word = words.get(i);
            boolean val = isACompoundedWord(word, set);
            if (val) {
                count++;
                if (count == 1) {
                    System.out.println("Longest Compound Word: " + word);
                } else {
                    System.out.println("Second Longest Compound Word: " + word);
                }
            }
            if (count >= 2)
                break;
        }
        long end = System.currentTimeMillis();
        System.out.println("Time Taken : " + (end - start) + "ms");
    }

    private static boolean isACompoundedWord(String word, Set<String> set) {
        int len = word.length();
        int[] dp = new int[len];
        Arrays.fill(dp, -1);
        return solRec(0, word, len, set, dp);
    }

    private static boolean solRec(int index, String word, int len, Set<String> set,
            int[] dp) {
        if (index >= len)
            return true;
        if (dp[index] != -1)
            return dp[index] == 1;
        StringBuilder str = new StringBuilder();
        for (int ind = index; ind < ((index == 0) ? len - 1 : len); ind++) {
            str.append(word.charAt(ind));
            if (!set.contains(str.toString()))
                continue;
            boolean val = solRec(ind + 1, word, len, set, dp);
            if (val) {
                dp[index] = 1;
                return true;
            }
        }
        dp[index] = 0;
        return false;
    }
}