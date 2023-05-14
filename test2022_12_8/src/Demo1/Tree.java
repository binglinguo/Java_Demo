package Demo1;
import java.util.*;
class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val){
        this.val=val;
    }
}
public class Tree {
    public static void main(String[] args) {
        Tree t=new Tree();
        TreeNode Root=t.initalization();
        System.out.println(t.size(Root));
//        System.out.println(t.size(Root));
//        System.out.println(t.size(Root));
//        System.out.println(t.size(Root));
        System.out.println(t.getLeafNodeCount(Root));
        System.out.println(t.getKLevelNodeCount(Root, 3));
        System.out.println(t.getHeight(Root));
        TreeNode ret=t.find(Root,111);
        if(ret==null){
            System.out.println("null");
        }else {
            System.out.println(ret.val);
        }
        System.out.println(t.isCompleteTree(Root));
    }

    /**
     * 构建二叉树
     */
    public TreeNode initalization(){
        TreeNode A=new TreeNode('A');
        TreeNode B=new TreeNode('B');
        TreeNode C=new TreeNode('C');
        TreeNode D=new TreeNode('D');
        TreeNode E=new TreeNode('E');
        TreeNode F=new TreeNode('F');
        TreeNode G=new TreeNode('G');
        TreeNode H=new TreeNode('H');
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.left=F;
        C.right=G;
        E.right=H;

        return A;
    }
    /**
     * 前序遍历
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(null==root){
            return list;
        }

        list.add(root.val);
        List<Integer> lefttree=preorderTraversal(root.left);
        list.addAll(lefttree);
        List<Integer> righttree=preorderTraversal(root.right);
        list.addAll(righttree);

        return list;
    }
    /**
     * 中序遍历
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(null==root){
            return list;
        }

        List<Integer> lefttree=inorderTraversal(root.left);
        list.addAll(lefttree);
        list.add(root.val);
        List<Integer> righttree=inorderTraversal(root.right);
        list.addAll(righttree);

        return list;
    }
    /**
     * 后序遍历
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(null==root){
            return list;
        }

        List<Integer> lefttree=postorderTraversal(root.left);
        list.addAll(lefttree);

        List<Integer> righttree=postorderTraversal(root.right);
        list.addAll(righttree);

        list.add(root.val);

        return list;
    }
    /**
     * 获取二叉树中节点的个数
     */
    public int size1(TreeNode root){
        int count=0;
        if(root==null){
            return count;
        }
        count++;
        count = size1(root.left)+count;
        count = size1(root.right)+count;
        return count;

    }
    public int size(TreeNode root){
        if(root==null){
            return 0;
        }
        return size(root.left)+size(root.right)+1;
    }

    /**
     * 计算二叉树有多少个叶子节点
     * @return
     */
    public int getLeafNodeCount1(TreeNode root){
        if(root.left==null&&root.right==null){
            return 1;
        }
        return (root.left!=null?getLeafNodeCount1(root.left):0)+
                (root.right!=null?getLeafNodeCount1(root.right):0);
    }
    public int getLeafNodeCount(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return getLeafNodeCount(root.left)+getLeafNodeCount(root.right);
    }
    /**
     * 计算二叉树第k层有多少个节点
     */
    public int getKLevelNodeCount(TreeNode root,int k){
        if(root==null){
            return 0;
        }
        if(k==1) {
            return 1;
        }
        return getKLevelNodeCount(root.left,k-1)+getKLevelNodeCount(root.right,k-1);
    }
    /**
     * 获取二叉树的高度
     */
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftcount=getHeight(root.left);
        int rightcount=getHeight(root.right);
        return leftcount>rightcount?leftcount+1:rightcount+1;
    }
    /**
     * 查找二叉树中是否存在val值的节点 ，如果有 返回节点 ，如果没有返回null
     */
    TreeNode find(TreeNode root, int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        TreeNode cur=find(root.left,val);
        if(cur!=null){
            return cur;
        }
        cur=find(root.right,val);
        if(cur!=null){
            return cur;
        }
        return null;
    }

    /**
     * 判断一棵树是不是完全二叉树
     * @param root
     * @return
     */
    boolean isCompleteTree(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        while(root!=null){
            queue.offer(root.left);
            queue.offer(root.right);
            root=queue.poll();
        }
        while(!queue.isEmpty()){
            if(queue.poll()!=null){
                return false;
            }
        }
        return true;
    }
}
