package java_;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

// https://www.hackerrank.com/challenges/java-reflection-attributes/problem
public class JavaReflectionAttributes {
    public static void main(String[] args){
        Class student = Students.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}

class Students {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anothermethod(){}
}