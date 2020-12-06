

class Solution {
    public Node connect(Node root) {
        
        if(root==null)
            return root;
        
        root.next=null;
        
        ArrayList<Node> simp=new ArrayList<Node>();
        simp.add(root);
        while(!simp.isEmpty())
        {
            ArrayList<Node> dumb=new ArrayList<Node>();
            for(Node a:simp)
            {
                if(a.left!=null)
                    dumb.add(a.left);
                if(a.right!=null)
                    dumb.add(a.right);
            }
            for(int i=0;i<dumb.size()-1;i++)
            {
                Node a=new Node();
                a=dumb.get(i);
                a.next=dumb.get(i+1);
            }
            Node a=new Node();
            if(!dumb.isEmpty())
            {    
                a=dumb.get(dumb.size()-1);
                a.next=null;
            }
            simp=dumb;
                
        }
        return root;
    }
}