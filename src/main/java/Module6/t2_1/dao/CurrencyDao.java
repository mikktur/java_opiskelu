package Module6.t2_1.dao;

import java.sql.*;
import Module6.t2_1.entity.Currency;
import jakarta.persistence.EntityManager;
import Module6.t2_1.datasource.MariaDbConnection;
import jakarta.persistence.TypedQuery;

import java.util.*;

public class CurrencyDao {
    public Currency findByAbbreviation(String abbreviation) throws SQLException {
        EntityManager em = MariaDbConnection.getInstance();
        Currency currency = em.find(Currency.class, abbreviation);
        return currency;
    }



    public List<String> findAllAbbreviations() throws SQLException{
        EntityManager em = MariaDbConnection.getInstance();
        TypedQuery<String> query = em.createNamedQuery("Currency.findAllAbbreviations", String.class);

        List<String> abbreviations = query.getResultList();

        return abbreviations;
    }

    public void addCurrency(Currency currency) throws SQLException, SQLIntegrityConstraintViolationException{
        EntityManager em = MariaDbConnection.getInstance();
        Currency existingCurrency = em.find(Currency.class, currency.getAbbreviation());
        if (existingCurrency != null) {
            throw new SQLException("Currency already exists", "duplicate");
        }
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();

    }
}