package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetSumII {

    public static void main(String[] args) {
        Set<List<Integer>> ans = new HashSet<>();

        int candidates[] = new int[] { 1, 2, 3 };

        Arrays.sort(candidates);

        solve(candidates, 0, 0, ans, new ArrayList<>());

        System.out.println("Ans: " + ans);
    }

    private static void solve(int[] candidates, int i, int sum, Set<List<Integer>> ans, List<Integer> list) {
        int n = candidates.length;

        ans.add(new ArrayList<>(list));

        for (int j = i; j < n; j++) {
            if (j > i && candidates[j] == candidates[j - 1])
                continue;
            list.add(candidates[j]);
            solve(candidates, j + 1, sum + candidates[j], ans, list);
            list.remove(list.size() - 1);
        }
    }
}