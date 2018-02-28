/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12_java3_payslips;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author 1796138
 */
public class Employee {
    public  static enum Gender { Female, Male, NA};
    public static enum Department { HR, Sales, IT, Accounting };
    public static enum JobTitle { Manager, Developer };
    private long id;
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
    private Gender gender;
    private String email;
    private String contact;
    private String address1;
    private String address2;
    private int aptHouseNo;
    private String postCode;
    private Department dept;
    private Date hiredDate;
    private JobTitle jobTitle;
    private BigDecimal basicSalary;
    private BigDecimal overtimeRate;
}
