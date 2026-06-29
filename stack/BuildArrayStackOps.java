// Problem: Build Array Where You Can Find The Maximum Exactly K Comparisons
// Pattern: Stack Operations (Push/Pop simulation)
// Difficulty: Medium
// Beats: 100% 🔥
// Independence: Guided thinking, self coded
// LeetCode: #1441

import java.util.ArrayList;
import java.util.List;

class BuildArrayStackOps {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            result.add("Push");
            if (i + 1 == target[count]) {
                count++;
                if (count == target.length)
                    break;
            } else
                result.add("Pop");
        }
        return result;
    }
}