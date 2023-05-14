package Demo1;

class StackList{
    public char[] val=new char[10];
    public int top=-1;

    public void addStack(char ch){
        this.top++;
        this.val[top]=ch;
    }

    public char getStack(){
        if(top>=0){
            return this.val[top];
        }
        return ' ';
    }

    public void delStack(){
        this.val[top]=0;
        this.top--;
    }
}

class Solution {
    public static boolean isValid(String s) {
        //初始化栈
        StackList stackList=new StackList();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stackList.addStack(s.charAt(i));
            }else {
                if(s.charAt(i)==')'){
                    if(stackList.getStack()!='('){
                        return false;
                    }
                    stackList.delStack();
                }else if(s.charAt(i)=='}'){
                    if(stackList.getStack()!='{'){
                        return false;
                    }
                    stackList.delStack();
                }else if(s.charAt(i)==']'){
                    if(stackList.getStack()!='['){
                        return false;
                    }
                    stackList.delStack();
                }else{
                    return false;
                }
            }
            i++;
        }
        if(stackList.top==-1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean flg=isValid("()");
        System.out.println(flg);
    }
}