package core.problems;

import java.util.ArrayList;
import java.util.Iterator;

import core.utils.Problem;

public class Runnner
{
    // Reference: https://projecteuler.net/problems
    protected static final int EULER_PROBLEM_COUNT = 467;

    protected static final String EULER_PROBLEM_PACKAGE = "core.problems";

    protected static final String EULER_PROBLEM_PREFIX = "Problem_";

    protected static final ArrayList<Problem> s_problems;

    static
    {
        s_problems = new ArrayList<Problem>(32);

        for (int i = 1; i < EULER_PROBLEM_COUNT; i++)
        {
            try
            {
                Class<?> problem = Class.forName(EULER_PROBLEM_PACKAGE + '.' + EULER_PROBLEM_PREFIX + i);

                s_problems.add((Problem)problem.newInstance());
            }
            catch (Exception e)
            {
                // Do nothing
            }
        }
    }

    public static void main(String[] args)
    {
        Iterator<Problem> itr = s_problems.iterator();

        while (itr.hasNext())
        {
            Problem problem = itr.next();
            problem.run();
        }
    }
}
