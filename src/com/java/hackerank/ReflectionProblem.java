package com.java.hackerank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Emp{
    private String name;
    public String getName() {
        return name;
    }
    public void setId(String id) {
    }
    public void setEmail(String email) {
    }
    public void anothermethod(){  }
    
    /*some more methods can be here*/
    
}

public class ReflectionProblem {
	public static void main(String[] args) throws ClassNotFoundException{
        @SuppressWarnings("rawtypes")
		Class emp =new Emp().getClass();
        Method[] methods = emp.getDeclaredMethods();
       

        ArrayList<String> methodList = new ArrayList<>();
        for(Method m : methods){
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}
