package estructurales.facade;

import java.sql.Connection;
// reducir la complejida del codigo cliente
public class ImplementacionFachada {
    public static void main(String[] args) {
        String tableName="Employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);

        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFachada.generateReport(HelperFachada.DBTypes.MYSQL,
                HelperFachada.ReportTypes.HTML, tableName);
        HelperFachada.generateReport(HelperFachada.DBTypes.ORACLE,
                HelperFachada.ReportTypes.PDF, tableName);
    }
}
