package zadaniaRekrutacyjne;

public class Stack {

    int [] value;
    int size;
    int top;

    public Stack(int Size) {
        value = new int [Size];
        size=Size;
        top=size;
    }

    void push(int x){
        value[top-1] = x;

    }
    int pop (){
        if (!stackIsEmpty())
        return value[top+1];
        else return -1;
    }

    boolean stackIsEmpty(){
        return top==size;
    }

    boolean stackIsFull(){
        return top==0;
    }

}
