package violated.SRP;

public class Cat
{
    public String breed;
    public int age;
    public String name;
    public int height;
    public int weight;

    public boolean isHealthyWeight()
    {
        return this.weight >= this.height && this.weight <= 15;
    }

    public String calculateSize()
    {
        int size = this.height * this.weight;
        if (size > 20) { return "Big"; }
        else if (size < 10) { return "Small"; }
        return "Normal";
    }
}
