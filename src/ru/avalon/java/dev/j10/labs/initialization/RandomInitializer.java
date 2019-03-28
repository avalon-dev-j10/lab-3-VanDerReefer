package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */

public class RandomInitializer implements Initializer {
    
    private final int lowLimit;
    private final int hiLimit;

    public RandomInitializer(int lowLimit, int hiLimit) {
        this.lowLimit = lowLimit;
        this.hiLimit = hiLimit;
    }
    
    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    
    @Override
    public void initialize(int[] array) {
        
        for (int i = 0; i < array.length; i++){
            
            array[i] = new Random().nextInt(hiLimit-lowLimit) - Math.abs(lowLimit);
            
            System.out.println(array[i]);
        }
        
        
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
    }
   
}
