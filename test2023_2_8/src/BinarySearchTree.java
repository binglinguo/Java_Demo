/**
 * @Author: guo bing lin
 * @Date: 2023-02-08 22:55
 **/
public class BinarySearchTree {
    static class TreeNode {
        public int key;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int key) {
            this.key = key;
        }
    }

    public TreeNode root;

    /**
     * 插入一个元素
     * @param key
     */
    public boolean insert(int key) {
        TreeNode cur = root;
        TreeNode curPrev = null;
        while(cur != null){
            curPrev = cur;
            if(key < cur.key){
                cur = cur.left;
            }else if(key > cur.key){
                cur = cur.right;
            }else {
                return false;
            }
        }
        TreeNode node = new TreeNode(key);
        if(curPrev != null){
            if(key < curPrev.key){
                curPrev.left = node;
            }else {
                curPrev.right = node;
            }
        }else {
            root = node;
        }

        return true;
    }
    //查找key是否存在
    public TreeNode search(int key) {
        TreeNode cur = root;
        while(cur != null){
            if(key == cur.key){
                return cur ;
            }else if(key < cur.key){
                cur = cur.left;
            }else {
                cur = cur.right;
            }
        }
        return null;
    }
    //删除key的值
    public boolean remove(int key) {
        TreeNode cur = root;
        TreeNode curPrev = null;
        while(cur != null){
            if(cur.key == key){
                break;
            }else if(cur.key < key){
                curPrev = cur;
                cur = cur.left;
            }else {
                curPrev = cur;
                cur = cur.right;
            }
        }
        if(cur == null){
            return false;
        }
        if(cur == curPrev.left && cur.right == null){
            curPrev.left = cur.left;
            return true;
        } else if (cur == curPrev.left && cur.left == null) {
            curPrev.left = cur.right;
        }else if(cur == curPrev.right && cur.right == null){
            curPrev.right = cur.left;
        }else if(cur == curPrev.right && cur.left == null){
            curPrev.right = cur.right;
        }else {
            //左右都不为空的情况
            TreeNode cur1 = cur.left;
            TreeNode cur1Prev = null;
            while(cur1.right!=null){
                cur1Prev =cur1;
                cur1 = cur1.right;
            }

            int t = cur1.key;
            cur1.key = cur.key;
            cur.key = t;

            cur1Prev.right = null;
        }
        return true;
    }


}
