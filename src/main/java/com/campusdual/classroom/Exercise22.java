package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> a=new ArrayList<>();
        String[] s={"GKFFD",
                "TNANA",
                "MPMSL",
                "PSWME",
                "LZMLF",
                "JYEBV",
                "YELNT",
                "JSNKR",
                "JFESF",
                "TMJLL"};
        a.addAll(Arrays.asList(s));
        return a;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for(String s:customList){
            System.out.println(s);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        int cont=customList.size();
        customList.add(element);
        if(cont<customList.size()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

    }


}
