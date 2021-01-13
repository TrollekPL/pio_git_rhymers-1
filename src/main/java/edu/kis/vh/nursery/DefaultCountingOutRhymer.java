package edu.kis.vh.nursery;

// Alt + strzałki powoduje zmianę karty aktualnie edytowanego kodu

public class DefaultCountingOutRhymer
{

    private static final int numbersTotal = 12;
    private int[] numbers = new int[numbersTotal];

    public int getTotal()
    {
        return total;
    }

    public int total = -1;

    public void countIn(int in)
    {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck()
    {
        return total == -1;
    }

    public boolean isFull()
    {
        return total == 11;
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
