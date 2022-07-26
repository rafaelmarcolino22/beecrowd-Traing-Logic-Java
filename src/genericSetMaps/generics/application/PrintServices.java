package genericSetMaps.generics.application;

import java.util.ArrayList;
import java.util.List;

public class PrintServices {

    private List<Integer> list = new ArrayList<>();

    public void addValue(Integer value){
        list.add(value);
    }

    public Integer first() {
        if(list.isEmpty()){
            throw  new IllegalStateException("list is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if(!list.isEmpty()){
            System.out.println(list.get(0));
        }
        for(int i =0; i< list.size(); i++){
            System.out.println(", " + list.get(i));
        }
        System.out.println("]");
    }

    public void addvalue(int value) {
    }
}
