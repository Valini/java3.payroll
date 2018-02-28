/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12_java3_payslips;

import java.math.BigDecimal;
import sun.nio.cs.ext.Big5;

/**
 *
 * @author suimi
 */
public class Deduction {
    private long id;
    private int year;
    private double qppRate;
    private BigDecimal qppThreshod;
    private double eiRate;
    private BigDecimal eiThreshold;
    private double qpipRate;
    private BigDecimal qpipThreshold;
    private double taxRate;
    private BigDecimal basicPA;
    private BigDecimal totalDeduction;
}
