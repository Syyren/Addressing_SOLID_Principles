package solved.SRP;

public class CatSizer
{
    public String calculateSize(Cat cat)
    {
        int size = cat.height * cat.weight;
        if (size > 20) { return "Big"; }
        else if (size < 10) { return "Small"; }
        return "Normal";
    }
}
