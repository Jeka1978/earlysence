package com.ealrlysense;

/**
 * Created by Evegeny on 14/11/2016.
 */
@Benchmark
public final class PowerCleaner implements Cleaner {

    @InjectRandomInt(min = 3, max = 5)
    private int repeat;

    @Override
    public void clean() {

        for (int i = 0; i < repeat; i++) {
            System.out.println("Sssssssssssshhhhhhhhhhhhhhhh");
        }

    }
}
