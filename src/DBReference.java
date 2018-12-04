public class DBReference
{
    private Tuple<DBTable,DBTable> tables;
    private Tuple<String, String> keys;

    public Tuple<DBTable, DBTable> getTables()
    {
        return tables;
    }

    public Tuple<String, String> getKeys()
    {
        return keys;
    }

    public DBReference(DBTable dbTable1, DBTable dbTable2, String key1, String key2)
    {
        this.tables = new Tuple(dbTable1,dbTable2);
        this.keys = new Tuple(key1, key2);
    }
}
