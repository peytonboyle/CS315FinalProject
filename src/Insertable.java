import java.sql.SQLException;

public interface Insertable<T>
{
    //Inserts values into a Database Table
    void insert( T data) throws SQLException;
}
