package com.eyang.framework.stars.LeetCode;

import java.util.HashMap;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(){};
	TreeNode(int val){this.val = val;};
	TreeNode(int val,TreeNode left,TreeNode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	
}
public class TwoSumBST {
	public static boolean findTwoSumBst(TreeNode t,int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		if(t==null) return false;
		int result= k -t.val;
		if (map.containsKey(result)) return true;
		else map.put(result, k);
		return findTwoSumBst(t.left,result) || findTwoSumBst(t.right,result) ;
	}

}
