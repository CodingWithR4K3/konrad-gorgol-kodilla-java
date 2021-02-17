package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT u.*, count(*) AS POST_QUANTITY " +
                "FROM USERS u, POSTS p " +
                "WHERE u.ID = p.USER_ID " +
                "GROUP BY u.ID " +
                "HAVING count(*) >= 2 " +
                "ORDER BY u.ID;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            int numberOfPosts = rs.getInt("POST_QUANTITY");
            Assertions.assertTrue(numberOfPosts >= 2);

            System.out.println(rs.getInt("ID") + " " + rs.getString("FIRSTNAME") + " " + rs.getString("LASTNAME") + ", " + rs.getInt("POST_QUANTITY") + " POSTS");

            counter++;
        }

        Assertions.assertEquals(2, counter);
    }
}