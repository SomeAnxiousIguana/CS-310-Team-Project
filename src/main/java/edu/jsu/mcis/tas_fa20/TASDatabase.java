package edu.jsu.mcis.tas_fa20;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class TASDatabase {
    public TASDatabase(){
        Connection conn = null;
		PreparedStatement pstUpdate = null;
        PreparedStatement pstSelect = null,	
        ResultSet resultset = null;
        ResultSetMetaData metadata = null;

        String query;
        boolean hasresults;
        int resultCount, columnCount = 0;   
        try {
            String username = "tasuser";
            String password = "Password123#@!";
			String server = ("jdbc:mysql://localhost/tas");
            System.out.println("Connecting to " + server);
            conn = DriverManager.getConnection(server, username, password);
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
            if (conn.isValid(0)) {
                System.out.println("Connected!");
            }
			
        }catch (Exception z) {
            System.err.println(z.toString());
        } 
    }
}
