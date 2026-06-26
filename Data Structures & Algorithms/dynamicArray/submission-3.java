
class DynamicArray {
    private int capacity;
    private int[] array;
    private int size;

    public DynamicArray(int capacity){
        this.capacity=capacity;
        array=new int[this.capacity];}

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        this.array[i]=n;

    }

    public void pushback(int n) {
        if (size==capacity){
            resize();
        }
        array[size] = n;
        size++;

        

    }
    public int popback() {
        size--;
        return this.array[size];
    }

    private void resize() {
        capacity*=2;
        int[] newArray= new int[capacity];
        
    
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

    }

    public int getSize() {
        return size;

    }

    public int getCapacity() {
        return capacity;

    }

}