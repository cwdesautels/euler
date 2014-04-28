package core.problems;

import java.util.ArrayList;
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
        List<Integer> factors = getFactors(600851475143L);

        int temp, i;

        for (i = factors.size(), temp = 0; i > 0; i--)
        {
            if (isPrime(temp = factors.get(i).intValue()))
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
