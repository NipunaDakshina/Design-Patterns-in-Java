import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleDBConnection(){
        //get mysql DB connection using connection paramenters
        System.out.println("get oracle DB connection");
        return null;
    }
    public void generateOraclePDFReport(String tableName, Connection con){
        System.out.println("generate oracel PDF report");
        //get data from table and generate pdf report
    }
    public void generateOracleHTMLReport(String tableName,Connection con){
        System.out.println("generate oracle HTML report");
        //get data from table and generate pdf report
    }
}
