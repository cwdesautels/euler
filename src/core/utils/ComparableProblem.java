package core.utils;

public abstract class ComparableProblem<T> implements Problem
{
    final protected String m_sName;

    public ComparableProblem(String name)
    {
        m_sName = name;
    }

    protected abstract T generateActual();

    protected abstract T generatedExpected();

    protected abstract boolean compare(T actual, T expected);

    public void run()
    {
        T m_actual;
        T m_expected;

        if (compare(m_actual = generateActual(), m_expected = generatedExpected()))
        {
            System.out.println("Passed: " + m_sName);
        }
        else
        {
            System.out.println("Failed: " + m_sName);
            System.out.print("Expected: <" + m_expected + '>');
            System.out.println(" Actual: <" + m_actual + '>');
        }
    }

}
