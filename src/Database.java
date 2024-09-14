package src;

import java.util.HashMap;

public class Database {
    private String name;
    private HashMap<String, Table> dataBase;

    Database(final String name) {
        this.name = name;
        this.dataBase = new HashMap<>();
    }

    public HashMap<String, Table> getDatabase() {
        return this.dataBase;
    }

    public void addDatabase(final Table table) {
        dataBase.put(table.getTableName(), table);
    }

}
