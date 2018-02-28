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
 * @author suimi
 */
public class Allowance {
    private long id;
    private long employeeId;
    private int overtimeHour;
    private BigDecimal overtimeRate;
    private BigDecimal overtimeAmount;
    private BigDecimal bonus;
    private BigDecimal totalAllowance;
    private Date periodFrom;
    private Date periodTo;
}
