import java.sql.Connection;
0

public class FacadePatternTest {
    public static void main(String[] args) {
        String tableName="Employee";
        Connection con=MysqlHelper.getMySqlDBConnection();
        MysqlHelper mysqlHelper=new MysqlHelper();
        mysqlHelper.generateMySqlHTMLReport(tableName,con);

        Connection con1=OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper=new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName,con1);
        HelperFacade.ge



    }
}
