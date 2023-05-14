package Demo1;

public class Solution {
    /**
     * 指定后序遍历和中序遍历构造二叉树
     */

    public int index=0;
    public TreeNode structTree(int[] inorder,int[] postorder,int poindex,int lastindex){
        if(poindex>lastindex)return null;
        TreeNode root=new TreeNode(inorder[index]);
        int tagindex=search(postorder,poindex,lastindex,inorder[index]); 
        if(tagindex==-1){
            return null;
        }
        index--;
        root.right=structTree(inorder,postorder,tagindex+1,lastindex);
        root.left=structTree(inorder,postorder,poindex,tagindex-1);

        return root;
    }
    public int search(int[] postorder,int poindex,int lastindex,int key){
        for(int i=poindex;i<=lastindex;i++){
            if(postorder[i]==key){
                return i;
            }
        }
        return -1;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null||postorder==null){
            return null;
        }
        index=postorder.length-1;
        return structTree(postorder,inorder,0,postorder.length-1);
    }
    /**
     * 指定前序遍历和中序遍历构造二叉树
     */
   /* public int index=0;
    public TreeNode structTree(int[] preorder,int[] inorder,int inindex,int lasesize){
        if(inindex>lasesize)return null;
        TreeNode root=new TreeNode(preorder[index]);
        int tagindex=search(inorder,inindex,lasesize,preorder[index]);
        if(tagindex==-1){
            return null;
        }
        index++;
        root.left=structTree(preorder,inorder,inindex,tagindex-1);
        root.right=structTree(preorder,inorder,tagindex+1,lasesize);

        return root;
    }
    public int search(int[] inorder,int inindex,int lasesize,int key){
        for(int i=inindex;i<=lasesize;i++){
            if(inorder[i]==key){
                return i;
            }
        }
        return -1;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||inorder==null)return null;

        return structTree(preorder,inorder,0,inorder.length-1);
    }*/
}
