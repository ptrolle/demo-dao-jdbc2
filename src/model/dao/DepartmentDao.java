package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj); //para inserir no banco de dados obj passado como parametro
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id); //para consultar no banco de dados um ID se existir vai retornar, se nao retorna nulo
    List<Department> findAll();
}
