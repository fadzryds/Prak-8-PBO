public class DatabaseConnection {
    private static DatabaseConnection instance = null; 
    private DatabaseConnection() {
    System.out.println("Database connection created."); 
}
    public static DatabaseConnection getInstance() { if (instance == null) {
    instance = new DatabaseConnection(); 
}
    return instance; 
    }
       public static void main(String[] args) {
            DatabaseConnection db1 = DatabaseConnection.getInstance();
            DatabaseConnection db2 = DatabaseConnection.getInstance();
            System.out.println(db1 == db2);
        }
    }