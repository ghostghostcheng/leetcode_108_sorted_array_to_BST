package leetcode_108_sorted_array_to_BST;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        
        return bulidTree(nums, 0, nums.length - 1);
    }
    
    public TreeNode bulidTree(int[] nums, int startIdx, int endIdx) {
        if (startIdx > endIdx) {
            return null;
        } else {
            int midIdx = (startIdx + endIdx) / 2;
            TreeNode root = new TreeNode(nums[midIdx]);
            root.left = bulidTree(nums, startIdx, midIdx - 1);
            root.right = bulidTree(nums, midIdx + 1, endIdx);
            return root;
        }
    }
}