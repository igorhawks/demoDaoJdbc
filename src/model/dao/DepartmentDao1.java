package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao1 {
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
