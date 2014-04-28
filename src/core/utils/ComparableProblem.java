package core.utils;

public abstract class ComparableProblem<T> implements Problem
{
    final protected String m_sName;

    public ComparableProblem()
    {
        m_sName = this.getClass().getName();
    }

    protected abstract T generateActual();

    protected abstract T generatedExpected();

    protected abstract boolean compare(T actual, T expected);

    public void run()
    {
        T m_actual;
        T m_expected;

        try
        {
            long elapsed = System.nanoTime();
            m_actual = generateActual();
            elapsed = System.nanoTime() - elapsed;

            if (compare(m_actual, m_expected = generatedExpected()))
            {
                System.out.println("Passed: " + m_sName + " [Time: " + elapsed + " ns]");
            }
            else
            {
                System.out.println("Failed: " + m_sName + " [Time: " + elapsed + " ns, Expected: <" + m_expected + ">, Actual: <" + m_actual + ">]");
            }
        }
        catch (Throwable t)
        {
            System.out.print("Failed: " + m_sName + " Error: ");
            t.printStackTrace();
        }
    }
}
