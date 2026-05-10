class MyCircularQueue {
    private int[] que;
    private int f;
    private int r;
    private int k;
    public MyCircularQueue(int k) {
        this.k=k;
        this.que=new int[k];
        this.f=-1;
        this.r=-1;
    }
    
    public boolean enQueue(int value) {
        if(this.isFull()){
            return false;
        }
        if(this.isEmpty()){
            f++;
        }
        r=(r+1)%k;
        que[r]=value;
        return true;

    }
    
    public boolean deQueue() {
        if(this.isEmpty()){
            return false;
        }
        if(f==r){
            r=-1;
            f=-1;
        }
        else{
            f=(f+1)%k;
        }
        return true;
    }
    
    public int Front() {
        if(this.isEmpty()){
            return -1;
        }
        return que[f];
    }
    
    public int Rear() {
        if(this.isEmpty()){
            return -1;
        }
        return que[r];
    }
    
    public boolean isEmpty() {
        return r==-1 && f==-1;
    }
    
    public boolean isFull() {
        return f==(r+1)%k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */