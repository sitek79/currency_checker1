package ru.dudeandrey.db;

public class Currency {
    // Поля класса
    public int id;
    public String date_time;
    public String name;
    public double price;
    public String category;
    public String in_stock;

    // Конструктор
    public Currency(int id, String date_time, String name, double price, String category, String in_stock) {
        this.id = id;
        this.date_time = date_time;
        this.name = name;
        this.price = price;
        this.category = category;
        this.in_stock = in_stock;
    }

    // Выводим информацию по продукту
    @Override
    public String toString() {
        return String.format("ID: %s | Date: %s | Товар: %s | Цена: %s | Категория: %s | stock: %s",
                this.id, this.date_time, this.name, this.price, this.category, this.in_stock);
    }
}
