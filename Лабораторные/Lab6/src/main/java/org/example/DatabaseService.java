package org.example;
import org.jetbrains.annotations.NotNull;
import java.sql.*;

public class DatabaseService {

    public void exec() {
        DBProperties properties = DBProperties.getProperties();
        try(Connection connection = DriverManager.getConnection(
                properties.getUrl(),
                properties.getUser(),
                properties.getPassword()
        )) {
             updateStudent(connection);

             addStudent(connection);

             transaction(connection);

             deleteStudent(connection);

             getStudents(connection);

        } catch (SQLException e) {
           // LOGGER.info(e.getMessage(), e);
        }
    }

    private void deleteStudent(@NotNull Connection connection) throws SQLException{
        String query = "DELETE FROM student WHERE id = ?";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setLong(1, 1);
            statement.execute();

        }
    }

    private void getStudents(@NotNull Connection connection) throws SQLException {
        String query = "SELECT * FROM student";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet result = statement.executeQuery();
            while (result.next()) {
                System.out.println("id : " + result.getInt("id"));
                System.out.println("name : "+result.getString("name"));
                System.out.println("surname : "+result.getString("surname"));
                System.out.println("group_id : "+result.getInt("group_id"));
                System.out.println();
            }
    }

    private void addStudent(@NotNull Connection connection) throws SQLException {
        String query = "INSERT INTO student (name, surname, group_id) VALUES (?, ?, ?)";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "Александр");
            statement.setString(2, "Петров");
            statement.setLong(3, 1);
            statement.executeUpdate();
        }
    }

    private void updateStudent(@NotNull Connection connection) throws SQLException {
        String query = "UPDATE student SET name = ? WHERE id = ?";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "Александр Третий");
            statement.setLong(2, 3);
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void transaction(@NotNull Connection connection) throws SQLException {
        String query = "UPDATE student SET name = ? WHERE id = ?";
        connection.setAutoCommit(false);
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "Сергей непонятный");
            statement.setLong(2, 2);
            statement.execute();


            connection.commit();
        } catch (RuntimeException e) {
            System.out.println("error");
            connection.rollback();
        } finally {
            System.out.println("ok");
            System.out.println();
            connection.setAutoCommit(true);
        }
    }

}