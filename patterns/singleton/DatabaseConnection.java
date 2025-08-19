package singleton;
class Database {
    private static Database database;

    private Database() {}

    public static Database getInstance() {
        if (database == null) {
            return database = new Database();
        }
        return database;
    }
}

class DatabaseConnection {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        System.out.println(db);

        Database db1 = Database.getInstance();
        System.out.println(db1);
    }
}