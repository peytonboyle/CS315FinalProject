import java.util.Scanner;

public class InstanceCreator
{
    public static Instance create(String type)
    {
        Instance instance = null;
        if( type == "patient")
        {
        }
        if( type == "MedicalRecord")
        {
            instance = new MedicalRecord();
        }
        return instance;
    }
}
