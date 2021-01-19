package edu.kis.vh.nursery;

// Alt + strzałki powoduje zmianę karty aktualnie edytowanego kodu

public class DefaultCountingOutRhymer
{

    private static final int NUMBERS_TOTAL = 12;
    private static final int STARTING_TOTAL = -1;
    public static final int FULL_TOTAL = NUMBERS_TOTAL + STARTING_TOTAL;
    private int[] numbers = new int[NUMBERS_TOTAL];

    public int getTotal()
    {
        return total;
    }

    public int total = STARTING_TOTAL;

    public void countIn(int in)
    {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck()
    {
        return total == STARTING_TOTAL;
    }

    public boolean isFull()
    {
        return total == FULL_TOTAL;
    }

    protected int peekaboo()
    {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut()
    {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
