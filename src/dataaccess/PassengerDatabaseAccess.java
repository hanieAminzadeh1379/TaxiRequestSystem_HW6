package dataaccess;
import model.Passenger;
import java.sql.*;

public class PassengerDatabaseAccess extends DatabaseAccess {
    public PassengerDatabaseAccess() throws SQLException, ClassNotFoundException {
        if (getConnection() != null) {
            DatabaseMetaData metaData = getConnection().getMetaData();
            ResultSet tables = ((DatabaseMetaData) metaData).getTables(null, null, "userprofile", null);
            if (tables.next()) {
                System.out.println("table passenger exist");
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

    public int save(Passenger passenger) throws SQLException {
        if (getConnection() != null) {
            Statement statement = getConnection().createStatement();
            String sqlQuery = String.format("INSERT INTO userprofile(firstName, lastName, nationalCode, birthDate, phoneNumber, gender)" +
                    " VALUES('%s','%s','%d','%s','%s','%s')"
            ,passenger.getFirstName(), passenger.getLastName(), passenger.getNationalCode(), passenger.getBirthDate(), passenger.getPhoneNumber());
            int i = statement.executeUpdate(sqlQuery);
            return i;
        }
        return 0;
    }
}
