package Utils;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class DBUtils {

    private static ResultSet rset;
    static Connection conn = null;
    static Statement statement = null;


    public static ResultSet getResultSet(String sqlQuery) {
        try {
            conn = DriverManager.getConnection(
                    ConfigReader.getValueOfProperty("dburl"),
                    ConfigReader.getValueOfProperty("dbUsername"),
                    ConfigReader.getValueOfProperty("dbPassword"));

            statement = conn.createStatement();
            rset = statement.executeQuery(sqlQuery);
        } catch (SQLException e) {
            e.getStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rset;
    }


    // comback to finish it later today is 6/24/23
}
