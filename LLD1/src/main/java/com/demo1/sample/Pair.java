package com.demo1.sample;

import java.util.List;

public class Pair<K> {
    List<K> list;
    Pair(List<K> list){
        this.list = list;
    }
    public  K getFirstElement(){
        return list.get(0);
    }
}
