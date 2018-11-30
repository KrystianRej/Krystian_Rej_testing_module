package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.CompanyAndEmployeeFacade;
import com.kodilla.hibernate.manytomany.facade.FindingByPartOfTheNameException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.FactoryBeanNotInitializedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDabFacadeTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyAndEmployeeFacade companyAndEmployeeFacade;

    @Test
    public void testQueryFunctions() {
        //Given
        Employee employee1 = new Employee("Mark", "Skrzynia");
        Employee employee2 = new Employee("Maria", "Kosno");
        Employee employee3 = new Employee("Zenek", "Jakistam");

        Company nokia = new Company("Nokia");
        Company nokiaAcademy = new Company("NokiaAcademy");
        Company samsung = new Company("Samsung");

        nokia.getEmployees().add(employee1);
        nokia.getEmployees().add(employee2);
        nokiaAcademy.getEmployees().add(employee1);
        nokiaAcademy.getEmployees().add(employee3);
        samsung.getEmployees().add(employee1);
        samsung.getEmployees().add(employee2);
        samsung.getEmployees().add(employee3);

        employee1.getCompanies().add(nokia);
        employee1.getCompanies().add(nokiaAcademy);
        employee1.getCompanies().add(samsung);
        employee2.getCompanies().add(nokia);
        employee2.getCompanies().add(samsung);
        employee3.getCompanies().add(nokiaAcademy);
        employee3.getCompanies().add(samsung);

        //When
        companyDao.save(nokia);
        int id1 = nokia.getId();
        companyDao.save(nokiaAcademy);
        int id2 = nokiaAcademy.getId();
        companyDao.save(samsung);
        int id3 = samsung.getId();

        List<Company> companyList = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();
        try {
            companyList = companyAndEmployeeFacade.processCompanyFinding("cad");
            employeeList = companyAndEmployeeFacade.processEmployeeFinding("ark");

        } catch (FindingByPartOfTheNameException e) {

        }
        //Then
        try {
            Assert.assertEquals(1, companyList.size());
            Assert.assertEquals(1, employeeList.size());
            companyDao.delete(id1);
            companyDao.delete(id2);
            companyDao.delete(id3);
        } catch (Exception e) {
            //do nothing
        }
    }
}
