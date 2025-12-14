package com.program.training.algorithm.printinorder;

import java.util.concurrent.CompletableFuture;

/**
 * The same instance of Foo will be passed to three different threads.
 * Design a mechanism and modify the program to ensure that second() is executed after first(), and third() is executed after second().
 *
 * <a href="https://leetcode.com/problems/print-in-order/description/">...</a>
 *
 * @author naletov
 */
public class PrintInOrderAlgorithm
{
    private final CompletableFuture<Void> firstDone   = new CompletableFuture<>();
    private final CompletableFuture<Void> secondDone  = new CompletableFuture<>();
    // Wait and NotifyAll approach
    private boolean isFirstDone;
    private boolean isSecondDone;

    public PrintInOrderAlgorithm()
    {
        // Wait and NotifyAll approach
        isFirstDone = false;
        isSecondDone = false;
    }

    /**
     * Completable Future approach
     */
    public void first_2(Runnable printFirst) throws InterruptedException
    {
        printFirst.run();
        // notify other Threads
        firstDone.complete(null);
    }

    public void second_2(Runnable printSecond) throws InterruptedException
    {
        // Wait the first Thread and run the second one
        firstDone.join();   // blocked till finishing
        printSecond.run();
        secondDone.complete(null);
    }

    public void third_2(Runnable printThird) throws InterruptedException
    {
        // Wait the second Thread and run the third one
        secondDone.join();
        printThird.run();
    }

    /**
     * Wait and NotifyAll approach
     */
    public synchronized void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        isFirstDone = true;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {

        while (!isFirstDone)
        {
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        isSecondDone = true;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {

        while (!isSecondDone)
        {
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    /**
     * Getters and Setters
     */
    public void setSecondDone(boolean secondDone)
    {
        isSecondDone = secondDone;
    }

    public void setFirstDone(boolean firstDone)
    {
        isFirstDone = firstDone;
    }
}
