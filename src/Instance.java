public abstract class Instance
{
    private int id;
    public Instance(int id)
    {
      this.id = id;
    }
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object o);
}