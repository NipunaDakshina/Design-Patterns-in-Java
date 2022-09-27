import java.sql.Connection;

public class MysqlHelper {
    public static Connection getMySqlDBConnection(){
        System.out.println("get MYSQL DB connection");
        //get mysql DB connection using connection paramenters
        return null;
    }
    public void generateMysqlPDFReport(String tableName, Connection con){
        System.out.println("generate MYSQL PDF report");
        //get data from table and generate pdf report
    }
    public void generateMySqlHTMLReport(String tableName,Connection con){
        System.out.println("generate MYSQL HTML report");
        //get data from table and generate pdf report
    }
}
