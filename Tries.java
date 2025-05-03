public class Tries {
    static class Node{
        Node[] children;
        boolean eOw;

        public Node(){
            children = new Node[26]; //a to z

            for(int i=0; i<26; i++){
                children[i] = null;
            }
            eOw = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){

        Node curr = root;

        for(int i=0; i<word.length(); i++){

            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            if(i == word.length() -1){
                curr.children[idx].eOw = true;
            }

            curr = curr.children[idx];
        }
    }

    public static boolean search(String key){

        Node curr = root;

        for(int i=0; i<key.length(); i++){

            int idx = key.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }
            
            if(i == key.length() - 1 && curr.children[idx].eOw == false){
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0,i);
            String sendPart = key.substring(i);

            if(search(firstPart) && wordBreak(sendPart)){
                return true;
            }
        }
        return false;
    }

    public static boolean startWith(String prefix){
        Node curr = root;

        for(int i=0; i<prefix.length(); i++){

            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }
        return true;
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count+= countNode(root.children[i]);
            }
        }

        return count+1;
    }
    
    public static void main(String args[]){
        String words[] = {"the","a","there","their","any"}; 

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));

        String key = "athethere";
        System.out.println(wordBreak(key));

        String prefix = "the";
        System.out.println(startWith(prefix));

        String str = "ababa";
        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            System.out.println(suffix);
            insert(suffix);
        }
        System.out.println(countNode(root));

    }
}
