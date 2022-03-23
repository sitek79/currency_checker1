package ru.dudeandrey.db;

import ru.dudeandrey.DateTime;

import java.sql.SQLException;
import java.util.List;

public class DBApp {
    public void dbapp() {
        try {
            // Создаем экземпляр по работе с БД
            DBHandler dbHandler = DBHandler.getInstance();
            // Добавляем запись
            dbHandler.addProduct(new Currency(' ', new DateTime().getDateTime(),"Rub", 200, "Crypto", "stock"));
            // Получаем все записи и выводим их на консоль
            List<Currency> currencies = dbHandler.getAllProducts();
            for (Currency currency : currencies) {
                System.out.println(currency.toString());
            }
            // Удаление записи с id = 8
            //dbHandler.deleteProduct(8);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("DBapp ERROR");
        }
    }
}
