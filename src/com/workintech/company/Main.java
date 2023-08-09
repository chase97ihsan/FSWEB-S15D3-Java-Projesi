package com.workintech.company;

import java.util.*;

public class Main {

    public static void working(){
        Employee employee1=new Employee(1,"Ali","Veli");
        Employee employee2=new Employee(2,"Mehmet","Kel");
        Employee employee3=new Employee(3,"Hasan","Geri");
        Employee employee4=new Employee(2,"Mehmet","Kel");
        List<Employee> arraytekrar=new LinkedList<>();
        List<Employee> array=new LinkedList<>();
        array.add(employee1);
        array.add(employee2);
        array.add(employee3);
        array.add(employee4);

        Map<Integer,Employee> map=new HashMap<>();
        Iterator iterator=array.iterator();

        while (iterator.hasNext()){
            Employee employee= (Employee)iterator.next();
            if(map.containsKey(employee.getId())){
                arraytekrar.add(employee);
            } else {
                map.put(employee.getId(),employee);
            }
        }
        System.out.println(arraytekrar);
        array.removeAll(arraytekrar);
        System.out.println(array);

    }
    public static void main(String[] args) {

        working();


    }
}