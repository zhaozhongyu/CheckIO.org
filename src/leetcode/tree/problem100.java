package leetcode.tree;

public class problem100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ( (p != null && q == null) || (p == null && q != null) ) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        if (! isSameTree(p.left, q.left)) {
            return false;
        }
        if (! isSameTree(p.right, q.right)) {
            return false;
        }
        return true;
    }
}
