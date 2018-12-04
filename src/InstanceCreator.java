public class InstanceCreator
{
    public static Instance create(String type)
    {
        Instance instance = null;
        if( type == "patient")
        {
            instance = new Patient();
        }
        return instance;
    }
}
