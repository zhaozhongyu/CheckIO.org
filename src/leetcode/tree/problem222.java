package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class problem222 {

    /**
     * 给出一个完全二叉树，求出该树的节点个数。
     *
     * 说明：
     *
     * 完全二叉树的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含 1~ 2h 个节点。
     *
     * 示例:
     *
     * 输入:
     *     1
     *    / \
     *   2   3
     *  / \  /
     * 4  5 6
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/count-complete-tree-nodes
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * */
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int count = 0;
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<TreeNode> temp = new LinkedList<>();
        stack.push(root);
        int n = 0;
        while(!stack.isEmpty()) {
            TreeNode last = stack.peekLast();
            count += Math.pow(2, n++);
            // 把下一层的非null孩子节点加进来
            while(! stack.isEmpty()) {
                TreeNode node = stack.pollFirst();
                if (node.left != null) {
                    temp.addLast(node.left);
                }
                if (node.right != null) {
                    temp.addLast(node.right);
                }
            }
            stack = temp;
            temp = new LinkedList<>();
            if (last.right == null) {
                count += stack.size();// 到达最后一层
                break;
            }
        }
        return count;
    }

//    public static void main(String[] args) {
//        Integer[] nums = new Integer[]{1,2,3,4,5,6};
//        TreeNode node = TreeNode.createTreeNode(nums);
//        new problem222().countNodes(node);
//    }
}