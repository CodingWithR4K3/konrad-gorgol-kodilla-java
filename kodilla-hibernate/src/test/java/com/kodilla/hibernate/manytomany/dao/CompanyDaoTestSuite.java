package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
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
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveByEmployeeLastName() {

        //Given
        Employee employee1 = new Employee("Mark", "Stratford");
        Employee employee2 = new Employee("Sylvanas", "Windrunner");
        Employee employee3 = new Employee("Malfurion", "Stormrage");

        Company company = new Company("Ship");

        employee1.getCompanies().add(company);
        employee2.getCompanies().add(company);
        employee3.getCompanies().add(company);

        company.getEmployees().add(employee1);
        company.getEmployees().add(employee2);
        company.getEmployees().add(employee3);

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        //When
        List<Employee> resultList = employeeDao.retrieveByEmployeeLastName("Stratford");
        for (Employee resultEmployee : resultList) {
            System.out.println(resultEmployee.getFirstname() + " " + resultEmployee.getLastname());
        }

        //Then
        Assertions.assertEquals(1, resultList.size());

        //CleanUp
        try {
            employeeDao.deleteAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRetrieveByFirstThreeLettersOfCompanyName() {

        //Given
        Employee employee = new Employee("Mark", "Stratford");

        Company company1 = new Company("Shipsons");
        Company company2 = new Company("Apple");
        Company company3 = new Company("Microsoft");
        Company company4 = new Company("IdSoft");
        Company company5 = new Company("AppCd");
        Company company6 = new Company("Appstof");

        employee.getCompanies().add(company1);
        employee.getCompanies().add(company2);
        employee.getCompanies().add(company3);
        employee.getCompanies().add(company4);
        employee.getCompanies().add(company5);
        employee.getCompanies().add(company6);


        company1.getEmployees().add(employee);
        company2.getEmployees().add(employee);
        company3.getEmployees().add(employee);
        company4.getEmployees().add(employee);
        company5.getEmployees().add(employee);
        company6.getEmployees().add(employee);

        //When
        employeeDao.save(employee);
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);
        companyDao.save(company5);
        companyDao.save(company6);


        List<Company> resultList = companyDao.retrieveByFirstThreeOfCompanyName("App");

        for (Company resultCompany : resultList) {
            System.out.println(resultCompany.getName());
        }

        //Then
        Assertions.assertEquals(3, resultList.size());

        //CleanUp
        try {
            companyDao.deleteAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}