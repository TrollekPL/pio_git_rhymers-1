package edu.kis.vh.nursery;

// Alt + strzałki powoduje zmianę karty aktualnie edytowanego kodu

/**
 * Podstawowa klasa Rhymer, posiada podstawowe metody, dziedziczą z niej inne klasy Rhymer
 */
public class DefaultCountingOutRhymer
{

    private static final int NUMBERS_TOTAL = 12;
    private static final int STARTING_TOTAL = -1;
    public static final int FULL_TOTAL = NUMBERS_TOTAL + STARTING_TOTAL;
    private int[] numbers = new int[NUMBERS_TOTAL];

    /**
     *
     * @return zwraca ilość przechowywanych przedmiotów
     */
    public int getTotal()
    {
        return total;
    }

    public int total = STARTING_TOTAL;

    /**
     *
     * @param in element dodawany do tablicy numbers
     */
    public void countIn(int in)
    {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     *
     * @return true gdy tablica jest pusta, w przeciwnym wypadku false
     */
    public boolean callCheck()
    {
        return total == STARTING_TOTAL;
    }
    /**
     *
     * @return true gdy tablica jest pełna, w przeciwnym wypadku false
     */
    public boolean isFull()
    {
        return total == FULL_TOTAL;
    }

    /**
     *
     * @return zwraca wartość ostatniego elementu tablicy numbers
     */
    protected int peekaboo()
    {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    /**
     *
     * @return zwraca wartość ostatniego elementu tablicy numbers i go usuwa
     */
    public int countOut()
    {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
