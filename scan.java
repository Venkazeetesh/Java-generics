package Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import  java.util.List;
import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        List<Integer> a=new LinkedList<>();
        a.sort(null);
        System.out.println(a);
        new prop().listop(a);
        Integer[] arr={1,2,3};
        new prop().arrayop(arr);
    }
}

class prop{
    public <E> void listop(List<E> list){
        for (E element:list) {
            System.out.println(element);}
    }
    public <E> void arrayop(E[] arr){
        for (E e:arr) {
            System.out.println(e);
        }
    }
}