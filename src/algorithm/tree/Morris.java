package algorithm.tree;

import leetcode.TreeNode;

public class Morris {
    // https://www.jianshu.com/p/484f587c967c
    // Morris遍历法，能以O(1)的空间复杂度实现二叉树的中序遍历。
    /**
     *
     * 给定某个节点，在中序遍历中，直接排在它前面的节点，我们称之为该节点的前序节点，例如节点5的前序节点就是4，同理，节点10的前序节点就是9.
     *
     * 在二叉树中如何查找一个节点的前序节点呢？如果该节点有左孩子，那么从左孩子开始，沿着右孩子指针一直想有走到底，得到的节点就是它的前序节点，例如节点6的左孩子是4，沿着节点4的右指针走到底，那就是节点5，节点9的左孩子是7，沿着它的右指针走到底对应的节点就是8.
     *
     * 如果左孩子的右节点指针是空，那么左孩子就是当前节点的前序节点。
     *
     * 如果当前节点没有左孩子，并且它是其父节点的右孩子，那么它的前序节点就是它的父节点，例如8的前序节点是7，10的前序节点是9.
     *
     * 如果当前节点没有左孩子，并且它是父节点的左孩子，那么它没有前序节点，并且它自己就是首节点，例如节点1.
     *
     * 值得注意的是，前序节点的右指针一定是空的。
     *
     * Morris遍历算法的步骤如下：
     *
     * 1， 根据当前节点，找到其前序节点，如果前序节点的右孩子是空，那么把前序节点的右孩子指向当前节点，然后进入当前节点的左孩子。
     *
     * 2， 如果当前节点的左孩子为空，打印当前节点，然后进入右孩子。
     *
     * 3，如果当前节点的前序节点其右孩子指向了它本身，那么把前序节点的右孩子设置为空，打印当前节点，然后进入右孩子。
     *
     * */

    public void morrisInorder(TreeNode root) {

    }


}
