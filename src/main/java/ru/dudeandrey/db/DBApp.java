package ru.dudeandrey.db;

import java.sql.SQLException;
import java.util.List;

public class DBApp {
    public void dbapp() {
        try {
            // Создаем экземпляр по работе с БД
            DBHandler dbHandler = DBHandler.getInstance();
            // Добавляем запись
            //dbHandler.addProduct(new Product("Музей", 200, "Развлечения"));
            // Получаем все записи и выводим их на консоль
            List<Currency> products = dbHandler.getAllProducts();
            for (Currency product : products) {
                System.out.println(product.toString());
            }
            // Удаление записи с id = 8
            //dbHandler.deleteProduct(8);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
