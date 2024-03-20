package solved.SRP;

public class CatWeightEvaluator
{
    public boolean isHealthyWeight(Cat cat)
    {
        return cat.weight >= cat.height && cat.weight <= 15;
    }
}
