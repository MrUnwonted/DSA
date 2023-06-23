package SAQ;

public class CustomStack {

    public int[] data;

    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        System.out.println("Added");
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()){
            throw new NullPointerException("Cannot pop");
        }
        System.out.println("Removed");
        return data[ptr--];
    }

    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an Empty stack!!!");
        }
        return data[ptr];
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    private boolean isFull() {
        return ptr == data.length-1;
    }


    public static void main(String[] args) throws Exception {

        CustomStack stack = new CustomStack(12);
        stack.push(103);
        stack.push(101);
        stack.push(105);


        stack.pop();
        stack.peek();
    }
}
