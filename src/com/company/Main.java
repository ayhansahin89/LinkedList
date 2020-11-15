package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("test");
        LinkedList <Integer> sayilar = new LinkedList<Integer>();

        Integer i;

        Instant start = Instant.now();
        long startTime = (long) Instant.now().getNano();
        for (i = 1; i <=1000000; i++) {
            sayilar.add(i);
        }

        Instant end = Instant.now();
        long estimated = (long)Instant.now().getNano() - startTime;
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Dizi Oluşturulma Süresi : milisaniye : " + timeElapsed.toMillis() + " milisaniye");
        System.out.println("Dizi Oluşturulma Süresi : nanosaniye : " + estimated + " nanosaniye");

         start = Instant.now();
        long startTime2 = System.currentTimeMillis();
         startTime = (long) Instant.now().getNano();
         sayilar.addFirst(-1);
         end = Instant.now();
        long endTime = System.currentTimeMillis();
        long estimatedTime2 = endTime - startTime;
         estimated = (long)Instant.now().getNano() - startTime;
        timeElapsed = Duration.between(start, end);



        System.out.println("1. eleman ekleme  Süresi : milisaniye : " + timeElapsed.toMillis() + " milisaniye");
        System.out.println("1. eleman ekleme : nanosaniye : " + estimated + " nanosaniye");


        start = Instant.now();
        startTime = (long) Instant.now().getNano();
        sayilar.removeFirst();
        end = Instant.now();
        estimated = (long)Instant.now().getNano() - startTime;
        timeElapsed = Duration.between(start, end);
        System.out.println("1. eleman çıkarma  Süresi : milisaniye : " + timeElapsed.toMillis() + " milisaniye");
        System.out.println("1. eleman çıkarma : nanosaniye : " + estimated + " nanosaniye");

        start = Instant.now();
        startTime = (long) Instant.now().getNano();
        sayilar.addLast(-1);
        end = Instant.now();
        estimated = (long)Instant.now().getNano() - startTime;
        timeElapsed = Duration.between(start, end);
        System.out.println("Sona  ekleme  Süresi : milisaniye : " + timeElapsed.toMillis() + " milisaniye");
        System.out.println("Sona  eleman ekleme : nanosaniye : " + estimated + " nanosaniye");

        start = Instant.now();
        startTime = (long) Instant.now().getNano();
        sayilar.removeLast();
        end = Instant.now();
        estimated = (long)Instant.now().getNano() - startTime;
        timeElapsed = Duration.between(start, end);
        System.out.println("Sondan  eleman çıkarma  Süresi : milisaniye : " + timeElapsed.toMillis() + " milisaniye");
        System.out.println("sondan  eleman çıkarma : nanosaniye : " + estimated + " nanosaniye");



        start = Instant.now();
        startTime = (long) Instant.now().getNano();
        sayilar.add(500000,-2);
        end = Instant.now();
        estimated = (long)Instant.now().getNano() - startTime;
        timeElapsed = Duration.between(start, end);
        System.out.println("Ortaya  eleman çıkarma  Süresi : milisaniye : " + timeElapsed.toMillis() + " milisaniye");
        System.out.println("Ortaya  eleman çıkarma : nanosaniye : " + estimated + " nanosaniye");

        start = Instant.now();
        startTime = (long) Instant.now().getNano();
        sayilar.remove(500000);
        end = Instant.now();
        estimated = (long)Instant.now().getNano() - startTime;
        timeElapsed = Duration.between(start, end);
        System.out.println("Ortadan   eleman çıkarma  Süresi : milisaniye : " + timeElapsed.toMillis() + " milisaniye");
        System.out.println("Ortadan  eleman çıkarma : nanosaniye : " + estimated + " nanosaniye");
        //System.out.println("Sayı "+ sayilar.indexOf(0) );

        /*for (Integer num : sayilar)
        {
            System.out.println("Sayı "+ num);
        }*/



    }
}
