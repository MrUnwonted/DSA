package Tree;

import java.util.ArrayList;

public class MaxHeap {

    private Integer[] heap;

    private int n;

    public MaxHeap(int capacity) {
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }

    public void insert(int x){
        if (n == heap.length -1){
            resize(2*heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    private void swim(int k) {
        while (k>1 && heap[k/2] < heap[k]){
            int temp = heap[k/2];
            heap[k/2] = heap[k];
            heap[k] = temp;
            k= k/2;
        }
    }

    private void resize(int capacity) {
            Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void print(){
        for (int i = 1; i <n ; i++) {
            System.out.println(heap[i]+ " ");
        }
    }


    public static void main(String[] args) {
        MaxHeap pq = new MaxHeap(3);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());

        pq.insert(2);
        pq.insert(4);
        pq.insert(1);
        pq.insert(6);
        pq.insert(3);
        pq.insert(7);

        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
        pq.print();
    }
}
