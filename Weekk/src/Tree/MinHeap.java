package Tree;

public class MinHeap {

    public Integer[] heap;

    public int n;

    public int size(){
        return n;
    }
    public boolean isEmpty(){
        return n == 0;
    }

    public MinHeap(int capacity) {
        heap = new Integer[capacity+1];
        n = 0;
    }

    public void insert(int x){
        if (n == heap.length){
            resize(2*heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);

    }

    private void swim(int k) {
        while (k>1 && heap[k/2]<heap[k]){
            int temp = heap[k/2];

        }
    }

    private void resize(int i) {
    }


    public static void main(String[] args) {
        MinHeap mn = new MinHeap(3);
        System.out.println(mn.size());
        System.out.println(mn.isEmpty());

        mn.insert(3);
    }

}
