package com.example.task11;

public class General {

    /**
     * Проверка массива на одинаковые элементы в одном и том же порядке
     * @param one - Первый массив
     * @param two - Второй массив
     * */
    static<S> boolean isArrayCheck(S[] one, S[] two){
        S[] arrayOne;
        S[] arrayTwo;

        if (one.length > two.length) {
            arrayOne = two;
            arrayTwo = one;
        } else {
            arrayOne = one;
            arrayTwo = two;
        }

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i].equals(arrayTwo[i])) {
                System.out.println("Index: "+i+"\nЭлементы: "+one[i]+" = "+two[i]);
                return true;
            }
        }

        System.out.println("Одинаковые элементы в одном и том же порядке не найдены!");
        return false;
    }

    /**
     * Меняет элеметы местами
     * @param  array - Массив
     * @param  indexOne - Первый индекс
     * @param  indexTwo - Второй индекс
     * */
    static<S> S[] swap(S[] array, int indexOne, int indexTwo){
        if (array.length <= indexOne || array.length <= indexTwo){
            throw new ArithmeticException("индекс уходит за элемнты массива");
        }
        S n = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = n;
        return array;
    }
}
