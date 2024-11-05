package Trees;


public class TreeImplement {

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(100);

        //child node
        TreeNode nodeA = new TreeNode(10);
        TreeNode nodeB = new TreeNode(20);

        //child node for a
        TreeNode childAR = new TreeNode(39);
        TreeNode childAL = new TreeNode(9);
        // child node for B
        TreeNode childBR = new TreeNode(89);
        TreeNode childBL = new TreeNode(90);

        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = childAL;
        nodeA.right = childAR;

        nodeB.left = childBL;
        nodeB.right = childBR;

        System.out.println(root.left.right.value);
    }
}
