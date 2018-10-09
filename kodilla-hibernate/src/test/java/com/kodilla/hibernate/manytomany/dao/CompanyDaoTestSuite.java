package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    public void testQueryFunctions(){
        //Given
        Employee employee1 = new Employee("Mark", "Skrzynia");
        Employee employee2 =  new Employee("Maria", "Kosno");
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


        List<Company> shortName = companyDao.retrieveFirstThreeLetters("Nok");
        List<Employee> skrzynia = employeeDao.retrieveEmployeeByLastName("Skrzynia");

        //Then
        try {
            Assert.assertEquals(2, shortName.size());
            Assert.assertEquals(1, skrzynia.size());
        } finally {
            try {
                companyDao.delete(id1);
                companyDao.delete(id2);
                companyDao.delete(id3);
            } catch (Exception e) {
                //do nothing
            }
        }
    }
}


