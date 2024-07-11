import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    //Constructor
    public Node(int val) {
        data = val;
    }

    //Pre-order traversal using recursion
    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //Post-order traversal using recursion
    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    //Inorder Traversal using recursion
    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //Level order traversal using recursion
    public void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (queue == null) {
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            Node n = queue.remove();
            System.out.print(n.data + " ");
            if (n.left != null) {
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);
            }

        }
    }

    //Pre-order traversal using iteration
    public void preorderIteration(Node root){
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node n=stack.pop();
            System.out.print(n.data+" ");
            if(n.right!=null){
                stack.push(n.right);
            }
            if(n.left!=null){
                stack.push(n.left);
            }
        }
    }

    //Inorder traversal using iteration
    public void inorderIteration(Node root){
      Stack<Node> stack=new Stack<>();
      ArrayList<Integer> list= new ArrayList<>();
        while(true){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                Node node=stack.pop();
                list.add(node.data);
                root=node.right;
            }
        }
      System.out.println(list);

    }

    //Post-order using Iteration
    public void postorderIteration(Node root){
        Stack<Node> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            Node node=stack1.pop();
            stack2.push(node.data);
            if(node.left!=null){
                stack1.push(node.left);
            }
            if(node.right!=null){
                stack1.push(node.right);
            }
        }
        System.out.print(stack2.reversed());
    }

    //Max depth/Height of Binary Tree
    public int heightOfBinary(Node root){
        if(root==null){
            return 0;
        }
        int lh=heightOfBinary(root.left);
        int rh=heightOfBinary(root.right);
        int maxHeight=1+Math.max(lh,rh);
        return maxHeight;
    }

    //Check given tree is balanced or not
    public int isBalancedTree(Node root){
        if(root==null){
            return 0;
        }
        int lh=isBalancedTree(root.left);
        int rh=isBalancedTree(root.right);
        if(lh==-1 || rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return (1+Math.max(lh,rh));

    }

    //Diameter of tree
    public int diameterOfTree(Node root,int maxi){
        if(root==null){
            return 0;
        }
        int lh=diameterOfTree(root.left,maxi);
        int rh=diameterOfTree(root.right,maxi);
        maxi=Math.max(maxi,lh+rh);
        return (1+Math.max(lh,rh));
    }

    //zigzag traversal
    public void zigzagTraversal(Node root){
       Queue<Node> queue=new LinkedList<>();
       ArrayList<ArrayList<Integer>> result=new ArrayList<>();
       boolean leftRight=true;
       queue.add(root);
       while(!queue.isEmpty()){
           int size=queue.size();
           ArrayList<Integer> queueItems=new ArrayList<>(Collections.nCopies(size, 0));
           for(int i=0;i<size;i++){
               Node n=queue.remove();
               int index=leftRight?i:size-1-i;
               //note use set to set the value at particular index
               queueItems.set(index,n.data);
               if(n.left!=null){
                   queue.add(n.left);
               }
               if(n.right!=null){
                   queue.add(n.right);
               }
           }
           result.add(queueItems);
           leftRight=!leftRight;
       }
       System.out.println("Zig-Zag: "+result);
    }

    //BOUNDARY FUNCTIONS-----------
    //isLeafNode function
    public boolean isLeafNode(Node node){
        return node.left == null && node.right == null;
    }
    //Add LEFT traversal
    public void leftTraversal(Node root,ArrayList<Integer> res){
        Node cur=root.left;
        while (cur!=null){
            if(!isLeafNode(cur)){
                res.add(cur.data);
            }
            if(cur.left!=null){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
    }
    //Add LEAF node
    public void leafTraversal(Node root,ArrayList<Integer> res){
        if(isLeafNode(root)){
            res.add(root.data);
            return;
        }
        if(root.left!=null){
            leafTraversal(root.left,res);
        }
        if(root.right!=null){
            leafTraversal(root.right,res);
        }

    }
    //Add Right traversal
    public void rightTraversal(Node root,ArrayList<Integer> res){
        ArrayList<Integer> rightNodes=new ArrayList<>();
        Node cur=root.right;
        while (cur!=null){
            if(!isLeafNode(cur)){
                rightNodes.add(cur.data);
            }
            if(cur.right!=null){
                cur=cur.right;
            }else {
                cur=cur.left;
            }
        }
        for(int i=rightNodes.size()-1;i>=0;i--){
            res.add(rightNodes.get(i));
        }
    }
    //Boundary Traversal
    public void boundaryTraversal(Node root){
        ArrayList<Integer> result=new ArrayList<>();
       if(!isLeafNode(root)){
           result.add(root.data);
       }
        //add left boundary
        leftTraversal(root,result);
        //add leaf node
        leafTraversal(root,result);
        //add right node
        rightTraversal(root,result);
        System.out.println("Boundary Traversal: "+result);
    }
    //---------------------------------------

    //Vertical traversal
    class Tuple{
        Node node;
        int col;
        int row;
        public Tuple(Node n,int c,int r){
            node=n;
            col=c;
            row=r;
        }
    }
    class TopViewTuple{
        Node node;
        int col;
        public TopViewTuple(Node n,int c){
            node=n;
            col=c;
        }
    }
    //Vertical Traversal
    public void verticalTraversal(Node root){
        Queue<Tuple> tupleQueue=new LinkedList<>();
        TreeMap<Integer,Map<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        tupleQueue.offer(new Tuple(root,0,0));
        while(!tupleQueue.isEmpty()){
            Tuple tuple=tupleQueue.poll();
            Node node=tuple.node;
            int c=tuple.col;
            int r=tuple.row;
            if(!map.containsKey(c)){
                map.put(c,new TreeMap<>());
            }
            if(!map.get(c).containsKey(r)){
                map.get(c).put(r,new PriorityQueue<>());
            }
            map.get(c).get(r).offer(node.data);
            if(node.left!=null){
                tupleQueue.offer(new Tuple(node.left,c-1,r+1));
            }
            if(node.right!=null){
                tupleQueue.offer(new Tuple(node.right,c+1,r+1));
            }
        }
        System.out.println("Treemap: "+map);
    }

    //Top view of a binary tree
    public void topViewTraversal(Node root){
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<TopViewTuple> topViewQueue=new LinkedList<>();
        topViewQueue.offer(new TopViewTuple(root,0));
        while (!topViewQueue.isEmpty()){
            TopViewTuple tvn=topViewQueue.poll();
            Node n=tvn.node;
            int c=tvn.col;
            if(!map.containsKey(c)){
                map.put(c,n.data);
            }
            if(n.left!=null){
                topViewQueue.add(new TopViewTuple(n.left,c-1));
            }
            if(n.right!=null){
                topViewQueue.add(new TopViewTuple(n.right,c+1));
            }
        }
        System.out.println("Top View Traversal :"+map);
    }

    //Bottom View of a binary tree
    public void bottomViewTraversal(Node root){
        Queue<TopViewTuple> queue=new LinkedList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        queue.add(new TopViewTuple(root,0));
        while (!queue.isEmpty()){
            TopViewTuple t=queue.poll();
            Node n=t.node;
            int c=t.col;
            if(!map.containsKey(c)){
                map.put(c,n.data);
            }else{
                map.put(c,n.data);
            }
            if(n.left!=null){
                queue.add(new TopViewTuple(n.left,c-1));
            }
            if(n.right!=null){
                queue.add(new TopViewTuple(n.right,c+1));
            }
        }
        System.out.println("Bottom view: "+map);
    }

    //Left view of a binary tree using Recursion
    //function for leftView(Root->Left->Right)
    public void lvt(Node root,int level,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        if(list.size()==level){
            list.add(root.data);
        }
        lvt(root.left,level+1,list);
        lvt(root.right,level+1,list);

    }
    public void rvt(Node root,int level,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        if(list.size()==level){
            list.add(root.data);
        }
        rvt(root.right,level+1,list);
        rvt(root.left,level+1,list);

    }
    public void leftViewTraversal(Node root){
        ArrayList<Integer> result=new ArrayList<>();
        lvt(root,0,result);
        System.out.println("leftViewTraversal: "+result);
    }
    public void rightViewTraversal(Node root){
        ArrayList<Integer> result=new ArrayList<>();
        rvt(root,0,result);
        System.out.println("rightViewTraversal: "+result);
    }

    //Function for checking Symmetric Binary Tree(do later)

    //Function to find path in a given node
    public boolean getPath(Node node,ArrayList<Integer> arr,int nodeVal){
        if(node==null){
            return false;
        }
        arr.add(node.data);
        if(node.data==nodeVal){
            return true;
        }
        boolean leftPath=getPath(node.left,arr,nodeVal);
        boolean rightPath=getPath(node.right,arr,nodeVal);
        if(leftPath||rightPath){
            return true;
        }
        arr.removeLast();
        return false;
    }
    public void findPath(Node root,int nodeValue){
        ArrayList<Integer> arr=new ArrayList<>();
        getPath(root,arr,nodeValue);
        System.out.println("Path to reach "+nodeValue+" follow this path "+arr);
    }

    //LCA( Lowest Common Ancestor) for pair of node lca(4,5)
    public Node lca(Node root,Node d1,Node d2){
        if(root==null || root==d1 ||root==d2){
            return root;
        }
        Node left=lca(root.left,d1,d2);
        Node right=lca(root.right,d1,d2);
        if(left==null){
            return right;
        }else if(right==null){
            return left;
        }else{
            return root;
        }
    }
    public boolean isNodePresent(Node root,Node val1){
        if(root==null){
            return false;
        }
        return root == val1 || isNodePresent(root.left, val1) || isNodePresent(root.right, val1);
    }
    public void findLca(Node root,Node val1,Node val2){
        if(isNodePresent(root,val1) && isNodePresent(root,val2)){
            Node lcaNode=lca(root,val1,val2);
            if (lcaNode != null) {
                System.out.println("Lowest common ancestor: " + lcaNode.data);
            } else {
                System.out.println("LCA not found.");
            }
        }else{
            System.out.println("One or both nodes are not present in the tree.");
        }

    }

    //Width of a binary tree
    class Pair{
        Node node;
        int indx;
        public Pair(Node n,int i){
            node=n;
            indx=i;
        }
    }
    public void widthOfBinaryTree(Node root){
        if(root==null)return;
        Queue<Pair> pairQueue=new LinkedList<>();
        int width=0;
        pairQueue.offer(new Pair(root,0));
        while(!pairQueue.isEmpty()){
            int size=pairQueue.size();
            //to make the id starting from zero
            int getNodeIndx=pairQueue.peek().indx;
            int first=0,last=0;
            for(int i=0;i<size;i++){
                //cur_id just to get value of i so that we can use Left:2i+1 | Right: 2i+2
                int cur_id=pairQueue.peek().indx-getNodeIndx;
                Node n=pairQueue.peek().node;
                pairQueue.poll();
                if(i==0){
                    first=cur_id;
                }
                if(i==size-1){
                    last=cur_id;
                }
                if(n.left!=null){
                    pairQueue.offer(new Pair(n.left,2*cur_id+1));
                }
                if(n.right!=null){
                    pairQueue.offer(new Pair(n.right,2*cur_id+2));
                }
            }
            width=Math.max(width,last-first+1);
        }
        System.out.println("Width: "+width);

    }

    //Children Sum Property
    public void changeTree(Node root){
        if(root==null){
            return;
        }
        int child=0;
        if(root.left!=null){
            child+=root.left.data;
        }
        if(root.right!=null){
            child+=root.right.data;
        }
        if(child>=root.data){
            root.data=child;
        }else{
            if(root.left!=null){
                root.left.data=root.data;
            }else if(root.right!=null){
                root.right.data=root.data;
            }
        }
        changeTree(root.left);
        changeTree(root.right);
        int tot=0;
        if(root.left!=null){
            tot+=root.left.data;
        }
        if(root.right!=null){
            tot+=root.right.data;
        }
        if(root.left!=null || root.right!=null){
            root.data=tot;
        }
    }

}
public class MyBinaryTree {
    public static void main(String[] args) {
        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.right.left=new Node(4);
        node.right.right=new Node(5);
        node.right.right.left=new Node(6);
        node.right.right.right=new Node(7);
        System.out.print("Pre-order using recursion: ");
        node.preorder(node);
        System.out.println();
        System.out.print("Post-order using recursion: ");
        node.postorder(node);
        System.out.println();
        System.out.print("In-order using recursion: ");
        node.inorder(node);
        System.out.println();
        System.out.print("Levelorder using recursion: ");
        node.levelOrder(node);
        System.out.println();
        System.out.print("Pre-order using iteration: ");
        node.preorderIteration(node);
        System.out.println();
        System.out.print("Inorder using iteration: ");
        node.inorderIteration(node);
        System.out.print("Postorder using iteration: ");
        node.postorderIteration(node);
        System.out.println();
        System.out.print("Height of BinaryTree: ");
        int height=node.heightOfBinary(node);
        System.out.println(height);
        System.out.print("iSBalanced BinaryTree: ");
        int isBinaryTree=node.isBalancedTree(node);//-1->not a balanced binary tree
        System.out.println(isBinaryTree);
        System.out.print("Diameter of BinaryTree: ");
        int diameter=node.diameterOfTree(node,0);
        System.out.println(diameter);
        node.zigzagTraversal(node);
        node.boundaryTraversal(node);
        node.verticalTraversal(node);
        node.topViewTraversal(node);
        node.bottomViewTraversal(node);
        node.leftViewTraversal(node);
        node.rightViewTraversal(node);
        node.findPath(node,4);
        Node n1=node.right.left;
        Node n2=node.right.right.right;
        node.findLca(node,n1,n2);
        node.widthOfBinaryTree(node);
        node.changeTree(node);
        System.out.println("After changing element(Children Sum Property: "+node.data);
    }
}
