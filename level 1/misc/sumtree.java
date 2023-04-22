import java.util.Stack;

public class sumtree {

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node con(Integer arr[]){
        
        Node root = new Node(arr[0], null, null);
        Pair node = new Pair(root, 1);
        Stack<Pair>st = new Stack<>();
        st.push(node);
        int ind =0;
        while(st.size()>0){
            Pair p = st.peek();
            if(p.state==1){
                ind++;
                if(arr[ind]!=null){
                    p.node.left = new Node(arr[ind], null, null);
                    st.push(new Pair(p.node.left, 1));

                }
                else{
                    p.node.left=null;
                }
                p.state++;
            }
            else if(p.state==2){
                ind++;
                if(arr[ind]!=null){
                    p.node.right = new Node(arr[ind], null, null);
                    st.push(new Pair(p.node.right, 1));
                }
                else{
                    p.node.right=null;
                }
                p.state++;
            }
            else{
                st.pop();
            }
        }
        
        return root;
    }

    public static Boolean sumt(Node root){
        if(root==null||(root.left==null&&root.right==null)) return true;

        int ls = sum(root.left);
        int rs = sum(root.right);

        return (root.val==ls+rs)&&sumt(root.left)&&sumt(root.right);

        
    }
    public static int sum(Node node) {
        if(node==null) return 0;
        return node.val+sum(node.left)+sum(node.right);


    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.val + "";
        str += " <- " + node.val + " -> ";
        str += node.right == null ? "." : node.right.val + "";
        System.out.println(str);

        display(node.left);

        display(node.right);

    }

    public static void main(String[] args) {
        Integer arr[] ={26,10,5,null,null,5,null,null,7,null,null};
        Node root = con(arr);
        display(root);
        boolean ans = sumt(root);
        System.out.println(ans);
        

    }
}
