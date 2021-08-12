package com.example.FuckApi.controller;

import java.util.*;

public class HashMapTest4 {

    public static void main(String[] args) {

    String[] data= {"A","B","C","A","B","C","D"};

        TreeMap map = new TreeMap();

        for(int i=0; i<data.length; i++){
            if(map.containsKey(data[i])){
                //키에 해당하는 값이 있으면  밸류값+1을 해준다.
                Integer value=(Integer)map.get(data[i]);
                map.put(data[i],new Integer(value.intValue()+1));

                //키 값에해당하는 값이 없으면 추가한다.
            }else{
                map.put(data[i],new Integer(1));
            }
        }
        Iterator it= map.entrySet().iterator();

        System.out.println("=기본정렬");
        while(it.hasNext()){
            Map.Entry entry= (Map.Entry)it.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey()+":"+printBar('#',value)+" "+value);
        }// 기본 정렬 끝 // Map(treeMap이라 자동정렬) ->Set 읽기



        //Map -> set -> ArrayList -> Collections(List list, comparator c) 시작
        System.out.println();
        //map을 ArrayList로 변환후 Collections.sort()로 정렬
        Set set= map.entrySet();
        List list= new ArrayList(set);

        //Collections.sort(List list, Collections c)
        Collections.sort(list,new ValueComparator());

        System.out.println("=값의 크기가 큰 순서로 정렬");
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            int value= ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey()+":"printBar('#',value)+" "+value);

        }
    }

    static class ValueComparator implements Comparator{
        public int compare(Object o1, Object o2){
            if(o1 instanceof Map.Entry && o2 instanceof Map.Entry){
                Map.Entry e1 =(Map.Entry)o1;
                Map.Entry e2=(Map.Entry)o2;

                int v1=((Integer)e1.getValue()).intValue();
                int v2=((Integer)e2.getValue()).intValue();

                return v2-v1;
            }
            return -1;
        }
    }

    public static String printBar(char ch, int value){
        char[] bar= new char[value];

        for(int i =0; i<bar.length; i++){
            bar[i] =ch;
        }
        return new String(bar);
    }
}

