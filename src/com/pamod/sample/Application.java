package com.pamod.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {  //psvm

        /*
        List<String> students=new ArrayList<>(); // type List and enter for include java list automatically

        students.add("Jana");
        students.add("Adi");
        students.add("Amanda");
        students.add("Nisansa");
        students.add("Deepika");  //arry list maintaince the same order as we enter
        System.out.println(students);

        List<String> filereddata=students.stream().filter(s->s.length()>5).collect(Collectors.toList());// filter data length longer than 5

        System.out.println(filereddata); // then print filter list
        */

        /*Sensor sensor= new Sensor();
        sensor.setName("Door");
        sensor.setValue(32);*/

        List<Sensor> sensors=new ArrayList<>();

        Sensor sensor1 = new Sensor("Living Room",32);
        sensors.add(sensor1);
        Sensor sensor2 = new Sensor("Bed Room",36);
        sensors.add(sensor2);
        Sensor sensor3 = new Sensor("BathRoom",23);
        sensors.add(sensor3);
        Sensor sensor4 = new Sensor("Office Room",28);
        sensors.add(sensor4);
        Sensor sensor5 = new Sensor("Kitchen",30);
        sensors.add(sensor5);

        List<Sensor> filteredsensors=sensors.stream().filter(sensor->sensor.getValue()>28).collect(Collectors.toList());

        System.out.println(filteredsensors);
    }

}
