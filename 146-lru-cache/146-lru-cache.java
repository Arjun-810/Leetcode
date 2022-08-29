class LRUCache {

    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key,int val){
            this.key = key;
            this.val = val;
            next = null;
            prev = null;
        }
    }
    
    Node head;
    Node tail;
    int c;
    HashMap<Integer,Node> map;
    
    public LRUCache(int capacity) {
        c = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node temp = map.get(key);
            remove(temp);
            insert(key, temp.val);
            return temp.val;
        }else return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }if(map.size() == c){
            remove(tail.prev);
        }
        insert(key, value);
    }
    
    public void remove(Node temp){
        map.remove(temp.key);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
    
    public void insert(int key,int value){
        Node temp = new Node(key,value);
        Node headNext = head.next;
        head.next = temp;
        temp.prev = head;
        headNext.prev = temp;
        temp.next = headNext;
        map.put(key,temp);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */