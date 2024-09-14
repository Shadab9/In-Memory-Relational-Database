package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Table {
    private String tableName;
    private List<Map<String, Object>> records;
    
    public Table(final String tableName) {
        this.tableName = tableName;
        this.records = new ArrayList<>();
    }

    public String getTableName(){
        return this.tableName;
    }
}
