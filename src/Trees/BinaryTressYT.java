package Trees;

public class BinaryTressYT {
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class BinaryTree{
        static int index = -1;
        public static TreeNode buildTree(int[] nodex){
            return  null;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1};
        BinaryTree tree = new BinaryTree();



        TreeNode root = BinaryTree.buildTree(nodes);
        TreeNode treeNode = new TreeNode(76);

    }
}
