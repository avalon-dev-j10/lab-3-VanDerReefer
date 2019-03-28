package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        int summArray = 0;

        FibonacciInitializer fibo = new FibonacciInitializer();
        fibo.initialize(array);
        
        for (int element : array) summArray += element;
        
        System.out.println("Сумма элементов массива: " + summArray);
        
        RandomInitializer rand = new RandomInitializer(-50, 50);
        rand.initialize(array);
        
        BubbleSort buble = new BubbleSort();
        buble.sort(array);
        
        System.out.println("Отсортированный пузырьком массив: " + Arrays.toString(array));
        
        rand.initialize(array);
        
        SelectionSort sel = new SelectionSort();
        sel.sort(array);
        
        System.out.println("Отсортированный выбором массив: " + Arrays.toString(array));
        
        
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * +0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * +1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * +2. Найти сумму элементов массива.
	     *
	     * +3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * +4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * +5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
