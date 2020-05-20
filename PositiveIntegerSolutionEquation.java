
import java.util.*;

// Time Complexity :O(X + Y ) for Linear Approach , O((xlogy) for Binary Approach
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes Both Approaches Worked
//
class CustomFunction {

        abstract public int f(int x, int y){

        }
};
public class PositiveIntegerSolutionEquation {

    public List<List<Integer>> findSolution1(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<>();
        int x = 1, y = 1000;
        while (x <= 1000 && y > 0) {
            int v = customfunction.f(x, y);
            if (v > z) --y;
            else if (v < z) ++x;
            else res.add(Arrays.asList(x++, y--));
        }
        return res;
    }
    public List<List<Integer>> findSolution2(CustomFunction customfunction, int z) {

        List<List<Integer>> ans = new ArrayList<>();
        for (int x = 1; x < 1001; ++x) {
            int l = 1, r = 1001;
            while (l < r) {
                int y = (l + r) / 2;
                if (customfunction.f(x, y) < z) {
                    l = y + 1;
                }else {
                    r = y;
                }
            }
            if (customfunction.f(x, l) == z) {
                ans.add(Arrays.asList(x, l));
            }
        }
        return ans;
    }
}