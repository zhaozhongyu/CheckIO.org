package leetcode.swordToOffer;

import java.util.ArrayList;

public class problem32 {
    /**
     * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
     *
     *  
     *
     * 例如:
     * 给定二叉树: [3,9,20,null,null,15,7],
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回：
     *
     * [3,9,20,15,7]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * */
    public int[] levelOrder(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(root);
        ArrayList<Integer> res = new ArrayList<>();
        while (!list.isEmpty()) {
            TreeNode node = list.remove(0);
            if (node == null) continue;
            res.add(node.val);
            list.add(node.left);
            list.add(node.right);
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
