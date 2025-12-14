package com.program.training.test.data;

/**
 * Class with test data for the Print in Order algorithm
 *
 * @author naletov
 */
public final class PrintInOrderAlgorithmData
{
    private PrintInOrderAlgorithmData()
    {
        // do nothing
    }

    public static final String RESULT = "firstsecondthird";

    private static String output;

    public static Runnable printFirst()
    {
        return () -> output = "first";
    }

    public static Runnable printSecond()
    {
        return () -> output = output + "second";
    }

    public static Runnable printThird()
    {
        return () -> output = output + "third";
    }

    public static String getOutput()
    {
        return output;
    }

    public static void setOutput(String output)
    {
        PrintInOrderAlgorithmData.output = output;
    }
}
