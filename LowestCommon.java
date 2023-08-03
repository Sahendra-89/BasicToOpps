import java.util.*;
public class LowestCommon {
    public static boolean getpath(Node root, int n, ArrayList<Node> path){
        if(root.data==n){
            return true;
        }
        boolean foundLeft  = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return true;

    }
    public static Node lac(Node root, int n1, int n2 ){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root,n2, path2);
        //last common ancestor
        int i =0;
        for( i <path1.size() &&i< path2.size();i++){
           if(path.get(i) !=path2.get(i)){
            break;
           }
        }
    }

    public static void  main(String args[]){
        

    }
    
}
