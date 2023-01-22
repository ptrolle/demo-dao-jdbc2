package model.dao;


import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj); //para inserir no banco de dados obj passado como parametro
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id); //para consultar no banco de dados um ID se existir vai retornar, se nao retorna nulo
    List<Seller> findAll();
}
