package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyAndEmployeeFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyAndEmployeeFacade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> processCompanyFinding(String partOfTheName) throws FindingByPartOfTheNameException {
        LOGGER.info("Starting the process of searching for a company...");
        List<Company> companies= companyDao.findByNameContaining(partOfTheName);
        if(companies.isEmpty()) {
            LOGGER.error(FindingByPartOfTheNameException.ERR_COMPANY_NOT_FOUND);
            throw new FindingByPartOfTheNameException(FindingByPartOfTheNameException.ERR_COMPANY_NOT_FOUND);
        }
        LOGGER.info("Finished, company has been found");
        return companies;
    }

    public List<Employee> processEmployeeFinding(String partOfTheName) throws FindingByPartOfTheNameException {
        LOGGER.info("Starting the process of searching for an employee...");
        List<Employee> employees = employeeDao.findByFirstnameContaining(partOfTheName);
        if(employees.isEmpty()) {
            LOGGER.error(FindingByPartOfTheNameException.ERR_EMPLOYEES_NOT_FOUND);
            throw new FindingByPartOfTheNameException(FindingByPartOfTheNameException.ERR_EMPLOYEES_NOT_FOUND);
        }
        LOGGER.info("Finished, employee has been found");
        return employees;
    }

}
