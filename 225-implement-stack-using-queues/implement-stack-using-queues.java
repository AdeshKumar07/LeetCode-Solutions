class MyStack {
    Queue<Integer> qu1;
    Queue<Integer> qu2;
    public MyStack() {
        qu1=new LinkedList<>();
        qu2=new LinkedList<>();
    }
    
    public void push(int x) {
        qu2.offer(x);
        while(!qu1.isEmpty()){
            qu2.offer(qu1.poll());
        }
        Queue<Integer> temp=qu1;
        qu1=qu2;
        qu2=temp;
    }
    public int pop() {
        return qu1.poll();
    }
    
    public int top() {
        return qu1.peek();
    }
    
    public boolean empty() {
        return qu1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */