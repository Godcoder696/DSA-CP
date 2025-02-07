package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumII {
    public static void main(String[] args) {
        Set<List<Integer>> ans = new HashSet<>();

        int candidates[] = new int[] { 1, 1, 2, 2, 2 };
        int target = 5;

        Arrays.sort(candidates);

        solve(candidates, target, 0, 0, ans, new ArrayList<>());

        System.out.println("Ans: " + ans);
    }

    public static void solve(int[] candidates, int target, int i, int sum, Set<List<Integer>> ans, List<Integer> list) {
        int n = candidates.length;
        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int j = i; j < n; j++) {
            if (j > i && candidates[j] == candidates[j - 1])
                continue;
            if (sum + candidates[j] > target)
                break;
            list.add(candidates[j]);
            solve(candidates, target, j + 1, sum + candidates[j], ans, list);
            list.remove(list.size() - 1);
        }
    }
}
