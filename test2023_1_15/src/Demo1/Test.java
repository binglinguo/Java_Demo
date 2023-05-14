package Demo1;

public class Test {
    public static void main(String[] args){
        Object o=new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }
    public String name="abc";
    public static void main2(String[] args){
        Test test=new Test();
        Test testB=new Test();
        System.out.println(test.equals(testB)+","+test.name.equals(testB.name));
    }
    public static void main1 (String[] args) {
        int i=0;
        Integer j = new Integer(0);
        System.out.println(i==j);//发生了自动拆箱
        System.out.println(j.equals(i));//发生了自动装箱
    }
    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode root = null;
    /**
     * 查找二叉搜索树中指定的val值
     * @param val
     * @return
     */
    public TreeNode find(int val) {
        TreeNode cur=root;
        while(cur!=null){
            if(cur.val==val){
                return cur;
            }else if(cur.val<val){
                cur=cur.right;
            }else {
                cur=cur.left;
            }
        }
        return null;
    }
    public void insert(int val){
        if(root==null){
            root=new TreeNode(val);
            return ;
        }
        TreeNode cur=root;
        TreeNode prev=null;
        while(cur!=null){
            if(cur.val<val){
                prev=cur;
                cur=cur.right;
            }else if(cur.val>val){
                prev=cur;
                cur=cur.left;
            }else {
                return ;
            }
        }
        cur=new TreeNode(val);
        if(cur.val<prev.val){
            prev.left=cur;
        }else {
            prev.right=cur;
        }
    }
}
