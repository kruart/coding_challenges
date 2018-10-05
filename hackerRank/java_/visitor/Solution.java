package java_.visitor;

import java.util.*;

public class Solution {
    private static int nodeValues[];
    private static Color nodeColors[];
    private static Map<Integer, Set<Integer>> nodesMap = new HashMap<>();

    public static Tree solve() {
        Scanner in = new Scanner(System.in);

        int numberOfNodes = in.nextInt();

        nodeValues = new int[numberOfNodes];
        for(int index = 0; index < numberOfNodes; index++) {
            nodeValues[index] = in.nextInt();
        }

        nodeColors = new Color[numberOfNodes];
        for(int index = 0; index < numberOfNodes; index++) {
            nodeColors[index] = (in.nextInt() == 0) ? Color.RED : Color.GREEN;
        }

        Tree rootNode;
        if(numberOfNodes == 1) {
            rootNode = new TreeLeaf(nodeValues[0], nodeColors[0], 0);
        }
        else {
            for(int index = 0; index < (numberOfNodes - 1); index++) {
                int u = in.nextInt();
                int v = in.nextInt();
                Set<Integer> uEdges = nodesMap.get(u);
                if(uEdges == null) {
                    uEdges = new HashSet<>();
                }
                uEdges.add(v);
                nodesMap.put(u, uEdges);
                Set<Integer> vEdges = nodesMap.get(v);
                if(vEdges == null) {
                    vEdges = new HashSet<>();
                }
                vEdges.add(u);
                nodesMap.put(v, vEdges);
            }

            rootNode = new TreeNode(nodeValues[0], nodeColors[0], 0);
            Set<Integer> rootEdges = nodesMap.get(1);
            Iterator<Integer> rootIterator = rootEdges.iterator();
            while (rootIterator.hasNext()) {
                Integer nodeIdentifier = rootIterator.next();
                nodesMap.get(nodeIdentifier).remove(1);
                createEdge(rootNode, nodeIdentifier);
            }
        }

        return rootNode;
    }

    private static void createEdge(Tree parentNode, Integer nodeIdentifier) {
        Set<Integer> nodeEdges = nodesMap.get(nodeIdentifier);
        boolean hasChild = false;
        if(nodeEdges != null && !nodeEdges.isEmpty())
            hasChild = true;

        if(hasChild) {
            TreeNode node = new TreeNode(nodeValues[nodeIdentifier - 1], nodeColors[nodeIdentifier - 1], parentNode.getDepth() + 1);
            ((TreeNode) parentNode).addChild(node);
            Iterator<Integer> nodeIterator = nodeEdges.iterator();
            while(nodeIterator.hasNext()) {
                Integer neighborNodeIdentifier = nodeIterator.next();
                nodesMap.get(neighborNodeIdentifier).remove(nodeIdentifier);
                createEdge(node, neighborNodeIdentifier);
            }
        }
        else {
            TreeLeaf leaf = new TreeLeaf(nodeValues[nodeIdentifier - 1], nodeColors[nodeIdentifier - 1], parentNode.getDepth() + 1);
            ((TreeNode) parentNode).addChild(leaf);
        }
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
