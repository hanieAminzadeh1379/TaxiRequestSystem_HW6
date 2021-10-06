package dataaccess;
import model.Driver;
import model.UserProfile;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverDatabaseAccess extends DatabaseAccess {
    public DriverDatabaseAccess() throws SQLException, ClassNotFoundException {
        if (getConnection() != null) {
            DatabaseMetaData metaData = getConnection().getMetaData();
            ResultSet tables = ((DatabaseMetaData) metaData).getTables(null, null, "userprofile", null);
            if (tables.next()) {
                System.out.println("table driver exist");
            } else {
                createTable();
            }
        }
    }

    private void createTable() throws SQLException {
        Connection connection = getConnection();
        Statement statement = ((Connection) connection).createStatement();
        statement.executeUpdate("CREATE TABLE userprofile(\n" +
                "id INT NOT NULL AUTO_INCREMENT,\n" +
                "firstName VARCHAR(45),\n" +
                "lastName VARCHAR(45),\n" +
                "nationalCode int,\n" +
                "birthDate VARCHAR(10),\n" +
                "phoneNumber VARCHAR(11),\n" +
                "gender VARCHAR(6),\n" +
                "PRIMARY KEY (id)");
    }

    public int save(Driver driver) throws SQLException {
        if (getConnection() != null) {

            Statement statement = getConnection().createStatement();
            String sqlQuery = String.format("INSERT INTO userprofile(firstName, lastName, nationalCode, birthDate, phoneNumber, gender)" +
                            " VALUES('%s','%s','%d','%s','%s','%s')"
                    , driver.getFirstName(), driver.getLastName(), driver.getNationalCode(), driver.getBirthDate(), driver.getPhoneNumber(), driver.getGender());
            int i = statement.executeUpdate(sqlQuery);
            return i;
        }
        return 0;
    }

    public List<UserProfile> findAllUserProfile() throws SQLException {
        if (getConnection() != null) {
            List<UserProfile> UserProfile = new ArrayList<>();
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from userProfile");
            while (resultSet.next()) {
                UserProfile userProfile = new UserProfile();
                userProfile.setFirstName(resultSet.getString("firstName"));
                userProfile.setLastName(resultSet.getString("lastName"));
                userProfile.add(userProfile);
            }
            List<model.UserProfile> userProfile = null;
            return userProfile;
        } else {
            return Collections.emptyList();
        }
            }
        }


