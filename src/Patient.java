public class Patient extends Instance
{

    private String fName;
    private String lName;
    private String phone;
    private String address;
    private String emergencyName;
    private String emergencyPhone;
    private String DOB;
    private boolean admitted;
    private int primaryDoctorID=0;

    public Patient( int id)
    {
      super(id);
    }


    ///Setters and Getters

    public String getfName()
    {
        return fName;
    }

    public void setfName(String fName)
    {
        this.fName = fName;
    }

    public String getlName()
    {
        return lName;
    }

    public void setlName(String lName)
    {
        this.lName = lName;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmergencyName()
    {
        return emergencyName;
    }

    public void setEmergencyName(String emergencyName)
    {
        this.emergencyName = emergencyName;
    }

    public String getEmergencyPhone()
    {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone)
    {
        this.emergencyPhone = emergencyPhone;
    }

    public String getDOB()
    {
        return DOB;
    }

    public void setDOB(String DOB)
    {
        this.DOB = DOB;
    }

    public boolean isAdmitted()
    {
        return admitted;
    }

    public void setAdmitted(boolean admitted)
    {
        this.admitted = admitted;
    }

    public int getPrimaryDoctorID()
    {
        return primaryDoctorID;
    }

    public void setPrimaryDoctorID(int primaryDoctorID)
    {
        this.primaryDoctorID = primaryDoctorID;
    }

    //Returns a CSV string of values in SQL format
    @Override
    public String toString()
    {
        int admittedInt = isAdmitted() ? 1: 0;

        return( "("+getId()+","+ getfName()+","+ getlName()+","+ getPhone()+","+ getAddress()+","+ getEmergencyName()+","+
                getEmergencyPhone()+","+ getDOB()+","+ admittedInt+"," +getPrimaryDoctorID()+")");
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