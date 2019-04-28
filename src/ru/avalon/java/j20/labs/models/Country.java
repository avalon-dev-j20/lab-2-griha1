package ru.avalon.java.j20.labs.models;

import java.text.ParseException;
import java.util.Objects;

/**
 * Модель представления о стране.
 */
public class Country {

    /**
     * Код страны.
     */
    private final String code;
    /**
     * Название страны.
     */
    private final String name;

    /**
     * Основное конструктор класса.
     *
     * @param code код страны
     * @param name название страны
     */
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Возвращает код страны.
     *
     * @return строковый код страны
     */
    public String getCode() {
        return code;
    }

    /**
     * Возвращает название страны.
     *
     * @return название страны
     */
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object otherObj) {
        if (otherObj instanceof Country) {
            Country otherCountry = (Country) otherObj;
            return code.equals(otherCountry.code) && name.equals(otherCountry.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    /*
     * TODO(Студент): для класса Country переопределить методы equals и hashCode
     */
    /**
     * Возвращает экземпляр страны созданный из переданного текста в формате
     * 'Код:Название'.
     *
     * @param text тектс в формате 'Код:Название'
     * @return новый экземпляр типа {@Link Country}.
     * @throws ParseException в случае, если переданная строка имеет неверный
     * формат.
     */
    public static Country valueOf(String text) throws ParseException {
        int index = text.indexOf(':');
        String code = text.substring(0, index).trim();
        String name = text.substring(index + 1).trim();
        return new Country(code, name);
    }
}
