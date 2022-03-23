package ru.dudeandrey.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DBHandler {
    // Константа, в которой хранится адрес подключения
    //private static final String CON_STR = "jdbc:sqlite:D:/myfin.db";
    private static final String CON_STR = "jdbc:sqlite:currency.db";

    // Используем шаблон одиночка, чтобы не плодить множество
    // экземпляров класса DbHandler
    private static DBHandler instance = null;

    public static synchronized DBHandler getInstance() throws SQLException {
        if (instance == null)
            instance = new DBHandler();
        return instance;
    }

    // Объект, в котором будет храниться соединение с БД
    private Connection connection;

    private DBHandler() throws SQLException {
        // Регистрируем драйвер, с которым будем работать
        // в нашем случае Sqlite
        // Нужно ли регистрировать Драйвер?
        //DriverManager.registerDriver(new JDBC());
        // Выполняем подключение к базе данных
        this.connection = DriverManager.getConnection(CON_STR);
    }

    public List<Currency> getAllProducts() {

        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = this.connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<Currency> products = new ArrayList<Currency>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, date_time, name, price, category, in_stock FROM products");
            // Проходимся по нашему resultSet и заносим данные в products
            while (resultSet.next()) {
                products.add(new Currency(resultSet.getInt("id"),
                        resultSet.getString("date_time"),
                        resultSet.getString("name"),
                        resultSet.getDouble("price"),
                        resultSet.getString("category"),
                        resultSet.getString("in_stock")));
            }
            // Возвращаем наш список
            return products;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }

    // Добавление продукта в БД
    public void addProduct(Currency product) {
        // Создадим подготовленное выражение, чтобы избежать SQL-инъекций
        try (PreparedStatement statement = this.connection.prepareStatement(
                "INSERT INTO Products(`date_time`, `name`, `price`, `category`, `in_stock`) " +
                        "VALUES(?, ?, ?, ?, ?)")) {
            statement.setObject(1, product.date_time);
            statement.setObject(2, product.name);
            statement.setObject(3, product.price);
            statement.setObject(4, product.category);
            statement.setObject(5, product.in_stock);
            // Выполняем запрос
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Удаление продукта по id
    public void deleteProduct(int id) {
        try (PreparedStatement statement = this.connection.prepareStatement(
                "DELETE FROM Products WHERE id = ?")) {
            statement.setObject(1, id);
            // Выполняем запрос
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
