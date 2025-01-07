package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumI {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();

        int candidates[] = new int[] { 1, 2, 3, 4 };
        int target = 5;

        solve(candidates, target, 0, 0, ans, new ArrayList<>());

        System.out.println("Ans: " + ans);
    }

    public static void solve(int[] candidates, int target, int i, int sum, List<List<Integer>> ans,
            List<Integer> list) {
        int n = candidates.length;
        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (i >= n || sum > target)
            return;

        // not take
        solve(candidates, target, i + 1, sum, ans, list);

        // take
        list.add(candidates[i]);
        solve(candidates, target, i, sum + candidates[i], ans, list);
        list.remove(list.size() - 1);
    }
}
