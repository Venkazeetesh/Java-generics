package Generics;

import java.util.ArrayList;
import java.util.List;

class generics3{
    public static void main(String[] args) {
        List<n<Object>> a=new ArrayList<>();
        a.add(new n("b",3));
        a.add(new n("s",23));
        System.out.println(a);
    }
}
class n<T>{
    private T name;
    private T no;

    public n(T name, T no) {
        this.name = name;
        this.no = no;
    }

    public T getName() {
        return name;
    }

    public T getNo() {
        return no;
    }

    @Override
    public String toString() {
        return  name + ""+ no ;
    }
}