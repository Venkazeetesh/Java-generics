package Generics;



import java.util.LinkedList;
import java.util.List;

public class genric1 {
    public static void main(String[] args) {
        List<names<Object>> a=new LinkedList();
        a.add(new names(23));
        a.add(new names(46));
        a.add(new names(245));
        System.out.println(a.get(2));
    }

}
class names<T>{
    public T name;

    public names(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
