package DPshiyan;

/**
 * Created by user on 2017/12/23.
 */
public class Q04 {
    public static void main(String[] args) {
        DatabaseFactory databaseFactory = (DatabaseFactory)XMLUtil.getBean("DatabaseFactory");
        databaseFactory.produceConnection().connect();
        databaseFactory.produceStatement().execute();
    }
}
interface Connection {
    void connect();
}
class MysqlConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Mysql connect success");
    }
}
class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Oracle connect success");
    }
}
interface Statement {
    void execute();
}
class MysqlStatement implements Statement{
    @Override
    public void execute() {
        System.out.println("Mysql statement execute success");
    }
}
class OracleStatement implements Statement{
    @Override
    public void execute() {
        System.out.println("Oracle statement execute success");
    }
}
interface DatabaseFactory {
    Connection produceConnection();
    Statement produceStatement();
}
class MysqlDatabaseFactory implements DatabaseFactory {
    @Override
    public Connection produceConnection() {
        return new MysqlConnection();
    }

    @Override
    public Statement produceStatement() {
        return new MysqlStatement();
    }
}
class OracleDatabaseFactory implements DatabaseFactory {
    @Override
    public Connection produceConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement produceStatement() {
        return new OracleStatement();
    }
}
