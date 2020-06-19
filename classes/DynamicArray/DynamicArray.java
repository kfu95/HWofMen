import java.util.*;
// what does a dynamic array need
// needs an array

class DynamicArray <T> {
    int size;
    int index;
    Object[] a;
    DynamicArray(){}

    DynamicArray(int num){
        this.size = num;
        this.a = new Object[size];
    }
    public void resize(){
        Object[] bigger = new Object[size*2];
        for(int i = 0; i < size; i++){
            bigger[i] = a[i];
        }
        size = size*2;
        a = bigger;

    }
    // add to head
    public void addObj(T obj){
        if(index+1 > size){
            resize();
        }
        a[index] = obj;
        this.index++;
    }

    public Object get(int num){
        return a[num];
    }

    // needs to move everything in
    public Object remove(int num){
        Object removed = a[num];

        slideLeft(num);
        this.index--;
        return removed;

    }

    public void addtoHead(Object head){
        if(index+1> size)
            resize();
        slideRight(0);
        a[0] = head;
        index++;
    }

    public void insert(Object head, int place){

    }
    // would use for removals
    // [0,1,2,3,4,6,7,8]
    // [0,1,2,3,4,7,8,0]

    // if it's the last element then don't set to null. set to null?
    public void slideLeft(int num){
        // if length of 5 items, then it'll go to 4 and try to add in [5] which will be out of length
        for(int i = num; i < a.length-1;i++){
            a[i] = a[i+1];
        }
        a[a.length-1] = null;
        //
        //
    }
    // use for insertions
    //[0,1,2,3]
    //[0,1,2,3,_,_]
    // have to check if it's been 2x or normal size. can optimize by checking. will work anyways
    public void slideRight(int num){
        for(int i = size-1;i>0;i--) {
            a[i] = a[i - 1];
        }

    }

    public static void main(String[] args){

        DynamicArray item = new DynamicArray(4);
        item.addObj(34);
        item.addObj(24);
        item.addObj(42);
        item.addObj(8989);
        item.remove(3);
        for (int i =0;i<item.size;i++){
            System.out.println(item.get(i));
        }


    }
}

