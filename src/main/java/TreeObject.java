import java.util.ArrayList;

public class TreeObject {
    private Tree tree;

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {

        this.tree = tree;
    }

    public ArrayList<Integer> countBranches() {
        ArrayList <Integer> result = new  ArrayList<>();
        for ( Node node : tree.getNodes()){
            if(isLeaf(node)){
                int branchValue =  countBranchFor(node, tree.getNodes());
                result.add( branchValue);
            }
        }
        return  result;
    }

    private int countBranchFor(Node node, Node[] nodes) {
        int result = 0;
        result +=node.getValue();
        if(isNotRoot(node)){
            Node parent = findParent(node, nodes);
            result+= countBranchFor(parent, nodes);

        }
        return  result;
    }

    private Node findParent(Node node, Node[] nodes) {
        for(Node nodeFromArray : nodes) {
            if(nodeFromArray.getLeft().equals(node.getId())
                    || nodeFromArray.getRight().equals(node.getId())){
                return  nodeFromArray;
            }
        }
        return  null;

    }

    private boolean isNotRoot(Node node) {
        return !tree.getRoot().equals(node.getId());
    }

    private boolean isLeaf(Node node) {
        return  node.getRight() == null
                && node.getLeft() == null;
    }
}