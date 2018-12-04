

public class MedicalRecord extends Instance 
{

   public int PatientID; 
   public String Fname; 
   public String Lname; 
   public String Pconditions; 
   public String Mhistory; 
   public String Prescriptions; 
   public char Gender; 
   
public MedicalRecord(int id)
{
   super(id); 
}

public void setFname (String Fname)
{
  this.Fname = Fname; 
} 

public void setLname ( String Lname) 
{
  this.Lname = Lname; 
}

public void setPconditions( String Pconditions ) 
{ 
  this.Pconditions = Pconditions; 
}

public void setMhistory (String Mhistory)
{
  this.Mhistory = Mhistory; 
}

public void setPrescriptions ( String Prescriptions)
{
  this.Prescriptions = Prescriptions; 
}

public void setGender( char Gender)
{
 this.Gender = Gender; 
} 


 
public String getFname()
{ 
   return Fname;
}


public String getLname()
{
  return Lname; 
}

public String getPconditions()
{
 return Pconditions;
}

public String getMhistory()
{
  return Mhistory; 
}

public String getPrescriptions()
{
  return Prescriptions;
}

public char getGender()
{
  return Gender;
}


@Override 
public String toString()
{
   return( "("+getId()+","+ getFname()+","+ getLname()+","+ getPconditions()+","+ getMhistory()+","+ getPrescriptions()+","+ getGender()+")");
}

@Override
public boolean equals( Object o)
    {
        if( this == o)
            return true;

        if( o instanceof Patient)
        {
            Patient p = (Patient) o;
            return (this.getId() == p.getId());
        }

        else
            return false;
    }
}