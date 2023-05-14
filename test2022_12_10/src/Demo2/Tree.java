package Demo2;
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
     * 给定二叉树寻找最近的祖先节点LCA问题 使用二叉搜索树的思路
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null)return null;

        //1.如果p和q有一共节点为root，则为最近的公共节点
        if(p==root||q==root){
            return root;
        }

        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left!=null&&right!=null){
            return root;

        }

        if(left!=null){
            return left;
        }

        if(right!=null){
            return right;
        }

        return null;
        // //如果p<root&&q>root(两者互换)，则root节点便是最近祖先
        // if(p.val<root.val&&q.val>root.val||p.val>root.val&&q.val<root.val){
        //     return root;
        // }
        // //如果p<root&&q<root则代表都在root的左子树中
        // if(p.val<root.val&&q.val<root.val){
        //     return lowestCommonAncestor(root.left,p,q);
        // }
        // //如果p>root&&q>root则代表都在root的右子树中
        // if(p.val>root.val&&q.val>root.val){
        //     return lowestCommonAncestor(root.left,p,q);
        // }

    }
    /**
     * 找公共节点使用寻找链表公共节点
     */
    public boolean gethup(TreeNode root,TreeNode node,Stack<TreeNode> stack){
        if(root==null||node==null)return false;
        stack.push(root);
        if(root==node)return true;
        boolean fly=gethup(root.left,node,stack);
        if(fly){
            return fly;
        }
        fly=gethup(root.right,node,stack);
        if(fly){
            return fly;
        }
        stack.pop();
        return false;
    }
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> stack1=new Stack<>();
        gethup(root,p,stack1);
        Stack<TreeNode> stack2=new Stack<>();
        gethup(root,q,stack2);
        int pn=stack1.size();
        int qn=stack2.size();
        if(pn<qn){
            int size=qn-pn;
            while(size>0){
                stack2.pop();
                size--;
            }
        }else {
            int size=pn-qn;
            while(size>0){
                stack1.pop();
                size--;
            }
        }
        while(!stack1.isEmpty()&&!stack2.isEmpty()){
            if(stack1.peek()==stack2.peek()){
                return stack1.pop();
            }else {
                stack1.pop();
                stack2.pop();
            }
        }
        return null;
    }
    /**
     * 层序遍历二叉树
     * @param root
     */
    public void levelOrder1(TreeNode root) {
        if(root==null)return ;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            System.out.print(cur.val+" ");
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
            }
        }
    }
    //进阶版，使用顺序表返回
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null)return arr;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            while(size>0){
                TreeNode cur=queue.poll();
                list.add(cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
                size--;
            }
            arr.add(list);
        }
        return arr;
    }
    /**
     * 判断一棵树是否是对称树
     * @param leftroot
     * @param rightroot
     * @return
     */
    private boolean rootisSymmetric(TreeNode leftroot,TreeNode rightroot){
        if(leftroot==null&&rightroot==null){
            return true;

        }
        if(leftroot==null||rightroot==null){
            return false;

        }
        if(leftroot.val!=rightroot.val){
            return false;
        }
        return rootisSymmetric(leftroot.left,rightroot.right)&&
                rootisSymmetric(leftroot.right,rightroot.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return rootisSymmetric(root.left,root.right);
    }
    /**
     * 判断一颗树是不是平衡二叉树
     * 二叉树的定义：一个二叉树每个节点的左右两个子树的高度差的绝对值不超过1
     * 时间复杂度O(N^2)
     * @param root
     * @return
     */
    public boolean isBalanced1(TreeNode root) {
        if(root==null){
            return true;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        return Math.abs(left-right)<=1&&
                isBalanced1(root.left)&&
                isBalanced1(root.right);
    }
    //优化 时间复杂度O(N)
    //二叉树的高度
    private int getHeightisBalanced(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=getHeightisBalanced(root.left);
        int right=getHeightisBalanced(root.right);
        if(left==-1||right==-1){
            return -1;
        }
        if(Math.abs(left-right)<=1){
            return left>right?left+1:right+1;
        }
        return -1;
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        return getHeightisBalanced(root)>=0;
    }
    /**
     * 是否是另一棵树的子树
     * 时间复杂度O(n*m)
     */
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //如果有一颗走到为空 则不是另一棵树的子树
        if(root==null||subRoot==null){
            return false;
        }
        //判断是不是当前树的子树
        if(isSameTree(root,subRoot)){
            return true;
        }
        //判断是不是左子树或右子树的子树
        if(isSubtree(root.left,subRoot)||
                isSubtree(root.right,subRoot)){
            return true;
        }
        //如果都不是则返回flase
        return false;
    }
    /**
     * 判断两颗二叉树是否相同
     * 时间复杂度O(n)
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return (isSameTree(p.left,q.left))&&
                (isSameTree(p.right,q.right));
    }

    /**
     * 构建二叉树
     * 穷举法
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
     * 时间复杂度O(N)
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
     * 时间复杂度O(N)
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
     * 时间复杂度O(N)
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
     * 时间复杂度O(N)
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
     * 时间复杂度O(N)
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
     * 时间复杂度O(N)
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
     * 时间复杂度O(N)
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
     * 时间复杂度O(N)
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
     * 时间复杂度O(N)
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