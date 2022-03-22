package ru.dudeandrey.db;

public class Currency {
    // Поля класса
    public int id;
    public String good;
    public double price;
    public String category_name;

    // Конструктор
    public Currency(int id, String good, double price, String category_name) {
        this.id = id;
        this.good = good;
        this.price = price;
        this.category_name = category_name;
    }

    // Выводим информацию по продукту
    @Override
    public String toString() {
        return String.format("ID: %s | Товар: %s | Цена: %s | Категория: %s",
                this.id, this.good, this.price, this.category_name);
    }
}
