package Trees;

public class InOrderTraversal {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value){
            this.value = value;
            this.left = this.right = null;
        }
    }
    public static void inOrderTraversal(TreeNode node){
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.println("value is "+node.value);
        inOrderTraversal(node.right);
    }
    public static void main(String[]args){


        TreeNode root = new TreeNode(100);
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(200);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(150);
        TreeNode node6 = new TreeNode(250);
        TreeNode node7 = new TreeNode(3);
        TreeNode node8 = new TreeNode(7);
        TreeNode node9 = new TreeNode(12);
        TreeNode node10 = new TreeNode(18);
        TreeNode node11 = new TreeNode(130);
        TreeNode node12 = new TreeNode(170);
        TreeNode node13 = new TreeNode(240);
        TreeNode node14 = new TreeNode(260);



        root.left = node1;
        root.right = node2;


        node1.left = node3;
        node1.right = node4;


        node2.left = node5;
        node2.right = node6;


        node3.left = node7;
        node3.right = node8;

        node4.left = node9;
        node4.right = node10;


        node5.left = node11;
        node5.right = node12;


        node6.left = node13;
        node6.right = node14;
        inOrderTraversal(root);
    }
}
