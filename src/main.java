package src;

public class main {
    public static void main(String[] args) {
        System.out.println("shadab");
        Table t1 = new Table("shadab");
        System.out.println(t1.getTableName());
        Database d1 = new Database("inbound");
        d1.addDatabase(t1);
        System.out.println(d1.getDatabase());
    }
}
