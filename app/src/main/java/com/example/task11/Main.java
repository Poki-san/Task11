package com.example.task11;

public class Main {
    public static void main(String[] args){
        System.out.println("Проверка первых массивов");
        Integer[] a = {1,2,3};
        Integer[] b = {0,2,7,6,5,6};
        System.out.println(General.isArrayCheck(a,b));

        System.out.println("\nПроверка вторых массивов");
        String[] strOne = {"key", "car", "disk","key"};
        String[] strTwo = {"car","apple","disk"};
        System.out.println(General.isArrayCheck(strOne,strTwo));

        System.out.println("\nЗамена элементов в массиве");
        String[] array = {"car","apple","disk"};
        String[] arrayTwo = General.swap(array, 2,0);
        for (String n:arrayTwo) {
            System.out.print(n+" ");
        }
    }
}
