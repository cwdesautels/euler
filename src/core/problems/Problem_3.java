package core.problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import core.utils.IntegerProblem;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143
 */
public class Problem_3 extends IntegerProblem
{
    private boolean isPrime(int n)
    {
        return false;
    }

    private List<Integer> getFactors(long n)
    {
        return new ArrayList<Integer>();
    }

    protected int getActual()
    {
        int temp = 0;

        Iterator<Integer> itr = getFactors(600851475143L).iterator();

        while (itr.hasNext())
        {
            if (isPrime(temp = itr.next()))
            {
                break;
            }
        }

        return temp;
    }

    protected int getExpected()
    {
        return 6857;
    }
}
