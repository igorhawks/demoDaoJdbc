package Application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: Seller findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);


        System.out.println("\n=== Test 2: Seller findAll ===");
        List<Department> list = departmentDao.findAll();
        for(Department obj: list )
        {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller insert =====");
        Department newDepartment = new Department(null,"Foods");
        departmentDao.insert(newDepartment);
        System.out.println("Inserido: " + newDepartment.getId());


        System.out.println("\n=== TEST 4: department update =====");
        department = departmentDao.findById(3);
        department.setName("bijuterias");
        departmentDao.update(department);
        System.out.println("Update Realizado!");


        System.out.println("\n=== TEST 5: seller delete =====");
        System.out.println("Digite um id para deletar um department: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");

        sc.close();

    }
}
