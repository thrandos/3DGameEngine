package com.thrandos.engine;

public class Time 
{
    public static final long SECOND = 1000000000L;

    private static double delta;

    public static long getTime()
    {
        return System.nanoTime();   
    }

    public static double getDelta()
    {
        return delta;
    }

    public static void setDelta(double delta)
    {
        Time.delta = delta; // I still don't have a 100% understanding of how this works. Good to check.
    }
}
