package com.kodilla.hibernate.manytomany.facade;

public class FindingByPartOfTheNameException extends Exception{

    public static String ERR_EMPLOYEES_NOT_FOUND= "No employee found";
    public static String ERR_COMPANY_NOT_FOUND = "No company found";


    public FindingByPartOfTheNameException(String message) {
        super(message);
    }
}
