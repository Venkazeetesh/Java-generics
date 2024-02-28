package Generics;

public class generic3 {
    public static void main(String[] args) {
    generics1<String,Integer> firstone =new generics1("jk",23);
        System.out.println(firstone);
    }
}
class generics1<K,V> {
    private final K name;
    private V value;

    public generics1(K name, V value) {
        this.name = name;
        this.value = value;
    }

    public K getName() {
        return name;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "generics{" +
                "name=" + name +
                ", value=" + value +
                '}';
    }
}
