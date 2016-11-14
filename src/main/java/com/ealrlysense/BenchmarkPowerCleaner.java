package com.ealrlysense;

/**
 * Created by Evegeny on 14/11/2016.
 */
public class BenchmarkPowerCleaner implements Cleaner {
    @InjectByType
    private PowerCleaner powerCleaner;
    @Override
    public void clean() {
        long start = System.nanoTime();
        powerCleaner.clean();
        long stop = System.nanoTime();
        System.out.println(stop-start);
    }
}
