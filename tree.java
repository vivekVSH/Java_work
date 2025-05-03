import java.util.*;

public class tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int indx = -1;
        public static Node buildTree(int nodes[]){
            indx++;
            if(nodes[indx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root){

        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root ==  null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root){   
        
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }

        int rootLeft = countNode(root.left);
        int rootRight  = countNode(root.right);

        return rootLeft + rootRight + 1;
    }

    public static int sumOfNodes(Node root){
        if(root ==  null){
            return 0;
        }

        int sumLeft = sumOfNodes(root.left);
        int sumRight = sumOfNodes(root.right);

        return sumLeft + sumRight + root.data;
    }

    public static int hight(Node root){
        if(root == null){
            return 0;
        }

        int leftHight = hight(root.left);
        int rightHight = hight(root.right);

        int myHeight = Math.max(leftHight , rightHight) + 1;

        return myHeight;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int dimtr1 = diameter(root.left);
        int dimtr2 = diameter(root.right);
        int dimtr3 = hight(root.left) + hight(root.right) + 1;

        return Math.max(dimtr3, Math.max(dimtr1 , dimtr2));
    }

    public static void main(String args[]){

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.print(root.data);
        System.out.println();

        preorder(root);
        System.out.println();

        inorder(root);
        System.out.println();

        postorder(root);
        System.out.println();

        levelOrder(root);
        System.out.println();

        int ak = countNode(root);
        System.out.println(ak);

        int bk = sumOfNodes(root);
        System.out.println(bk);

        int tk = hight(root);
        System.out.println(tk);

        int pk = diameter(root);
        System.out.println(pk);

    }
}
