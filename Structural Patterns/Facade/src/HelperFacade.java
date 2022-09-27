import java.sql.Connection;

public class HelperFacade {
    public static void generateReport(DBTypes dbType,ReportTypes reportType,String tableName){
        Connection con=null;
        switch (dbType) {
            case MYSQL:
                con = MysqlHelper.getMySqlDBConnection();
                MysqlHelper mysqlHelper = new MysqlHelper();
                switch (reportType) {
                    case HTML:
                        mysqlHelper.generateMysqlPDFReport(tableName, con);
                        break;
                    case PDF:
                        mysqlHelper.generateMySqlHTMLReport(tableName, con);
                        break;
                }
                break;
            case ORACLE:
                con = OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, con);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, con);
                        break;
                }
                break;
        }
    }
    public static enum DBTypes{
        MYSQL,ORACLE;
    }
    public static enum ReportTypes{
        HTML,PDF;

    }
}

