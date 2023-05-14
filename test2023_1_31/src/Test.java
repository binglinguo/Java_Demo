/**
 * @Author: guo bing lin
 * @Date: 2023-01-31 20:26
 **/
class TreeNode {
    //节点值域
    public int val;
    //左子树地址
    public TreeNode left;
    //右子树地址
    public TreeNode right;

    //构造方法
    public TreeNode(int val){
        this.val=val;
    }
}

public class Test {
    public static void main (String[] args) {
        Test test = new Test();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.left = b;
        a.right = c;
        //System.out.println(test.getSize2(a));
        //test.getLeafSize1(a);
        //System.out.println(leafSize);
        //System.out.println(test.getLeafSize2(a));
        //System.out.println(test.getKLevelSize(a,2));
        //System.out.println(test.getHeight(a));
        System.out.println(test.find(a,1).val);
    }

    // 前序遍历
    void preOrderTraversal (TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    void inOrderTraversal (TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    // 后序遍历
    void postOrderTraversal (TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    // 遍历思路-求结点个数
    static int size = 0;

    void getSize1 (TreeNode root) {
        if (root == null) {
            return;
        }
        size++;
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    // 子问题思路-求结点个数
    int getSize2 (TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right) + 1;
    }

    // 遍历思路-求叶子结点个数
    static int leafSize = 0;

    void getLeafSize1 (TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leafSize++;
        }
        if (root.left != null) {
            getLeafSize1(root.left);
        }
        if (root.right != null) {
            getLeafSize1(root.right);
        }
    }

    // 子问题思路-求叶子结点个数
    int getLeafSize2 (TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    // 子问题思路-求第 k 层结点个数
    int getKLevelSize (TreeNode root , int k) {
        if (k < 0 || root == null) {
            return 0;
        }
        if (k - 1 == 1) {
            int size = 0;
            if (root.left != null) {
                size++;
            }
            if (root.right != null) {
                size++;
            }
            return size;
        }
        return getKLevelSize(root.left , k - 1) + getKLevelSize(root.right , k - 1);
    }

    // 获取二叉树的高度
    int getHeight (TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftn = getHeight(root.left);
        int rightn = getHeight(root.right);
        return leftn > rightn ? leftn + 1 : rightn + 1;
    }

    // 查找 val 所在结点，没有找到返回 null
// 按照 根 -> 左子树 -> 右子树的顺序进行查找
// 一旦找到，立即返回，不需要继续在其他位置查找
    TreeNode find(TreeNode root, int val){
        if(root==null) {
            return null;
        }
        if(root.val==val) {
            return root;
        }
        TreeNode left = find(root.left,val);
        if(left!=null){
            return left;
        }
        TreeNode right = find(root.right,val);
        if(right!=null){
            return right;
        }
        return null;
    }
}

