package com.jst.bdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Arnaud
 */
public class EventsBDD {
    public static int addEvent(int status, String redactor, int notePMS, String label, String description,
                               String date, String time, String service, int room, int humor) {
        try {
            Connection connectionBDD = null;
            PreparedStatement statement = connectionBDD.prepareStatement("INSERT INTO evenement VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, date);
            statement.setString(2, "11:00:01");
            statement.setString(3, label);
            statement.setString(4, description);
            statement.setString(5, redactor);
            statement.setInt(6, notePMS);
            statement.setInt(7, status);
            statement.setInt(8, 2); // Catégorie
            statement.setInt(9, 4); // Cause
            statement.setInt(10, room);
            statement.setInt(11, 1); // ID client
            statement.setInt(12, 1); // ID hôtel
            statement.setInt(13, humor);
            int evenementID = statement.executeUpdate();
            return (evenementID);
        }
        catch (SQLException error) {
            System.out.println("Error while trying to add an event in the database ! " +error);
        }
        return (-1);
    }
}