package Generics;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class generics {
    public static void main(String[] args) {
        List a=new LinkedList();
        a.add(new data(23));
        a.add(new data("he"));
        a.add(new data("heot"));
        a.add(new data(new Name("Get")));
        System.out.println(a);
        data x=new data(new Name("D"));
        System.out.println(x);
    }

}
class data{
    private Object obj;
    data(Object obj){
        this.obj=obj;
    }
    public Object getobj(){
        return  obj;
    }
    @Override
    public String toString(){
        return obj.toString();
    }

}
class  Name{
    public String name;

    @Override
    public String toString() {
        return  name ;
    }

    public Name(String name) {
        this.name = name;
    }
}
