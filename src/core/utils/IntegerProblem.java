package core.utils;

public abstract class IntegerProblem extends ComparableProblem<Integer>
{
    public IntegerProblem(String name)
    {
        super(name);
    }

    protected abstract int getActual();

    protected abstract int getExpected();

    protected Integer generateActual()
    {
        return new Integer(getActual());
    }

    protected Integer generatedExpected()
    {
        return new Integer(getExpected());
    }

    protected boolean compare(Integer actual, Integer expected)
    {
        if (actual != null && expected != null)
        {
            return actual.intValue() == expected.intValue();
        }

        return false;
    }
}
