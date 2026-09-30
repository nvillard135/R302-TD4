public class Arbre{


    private static class Node {

        private String element;
        private Node next;

        public Node(String s, Node n){
            element = s;
            next = n;
        }

        public String getElement() { return element; }

        public String getNext () { return next; }

        public void setElement (String newElement) { element = newElement; }

        public void setNext (Node newNext) {next = newNext; }



        public static String toString() {
            return element.toString();
            
        }


    }



    private Arbre (){
        private Node head;
        private long size;

        public Arbre (){
            head = null;
            size = 0;
        }
    }

    







    private long size;

    
    
    
/*  private Arbre(){
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
        header.setNext(trailer);
        size = 0;
    }  */


    public static void main(String[] args){

    }
}