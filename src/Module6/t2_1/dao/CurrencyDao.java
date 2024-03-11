package Module6.t2_1.dao;

import java.sql.*;

import Module6.t2_1.datasource.MariaDbConnection;

import java.util.*;

public class CurrencyDao {


    public double getExchangeRate(String abbreviation) throws SQLException {

        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT conversionrate FROM currencies WHERE abbreviation = ?";

        int count = 0;
        double conversionRate = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, abbreviation);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                count++;
                conversionRate = rs.getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        if (count == 1) {
            return conversionRate;
        } else {
            return 0;
        }
    }

    public ArrayList<String> getCurrencyAbbreviations() throws SQLException {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT abbreviation FROM currencies";

        ArrayList<String> abbreviations = new ArrayList<>();

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            abbreviations.add(rs.getString(1));
        }

        return abbreviations;
    }
}