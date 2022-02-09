public class IoC{

    public static void main(String[] args) {
        System.out.println("Hi, there!");
        IoC container = new IoC();
        MySQLDatabase mySQLDatabaseInstance = container.new MySQLDatabase();
        OracleDatabase oracleDatabaseInstance = container.new OracleDatabase();

        User user = container.new User(oracleDatabaseInstance);
        User user2 = container.new User(mySQLDatabaseInstance);
        user.add("hello");
        user2.add("world");
    }

    public class User{
        Database databaseInstance;
        public User(Database databaseInstance){
            this.databaseInstance = databaseInstance;
        }
        public void add(String data){
            databaseInstance.persist(data);
        }
    }

    public interface Database{
        public void persist(String data);
    }

    public class MySQLDatabase implements Database{
        public void persist(String data){
            System.out.println("The data \"" + data + "\" is persisted in the MySQL database!");
        }
    }

    public class OracleDatabase implements Database{
        public void persist(String data){
            System.out.println("The data \"" + data + "\" is persisted in the Oracle  database!");
        }
    }
}