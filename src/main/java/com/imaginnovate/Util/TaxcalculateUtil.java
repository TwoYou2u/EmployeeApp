package com.imaginnovate.Util;

import com.imaginnovate.constants.Constants;
import com.imaginnovate.entity.Employee;

public interface TaxcalculateUtil {
	
	
	public static double calculateAnnualSalary(Employee employee){
        double monthlySalary = employee.getSalary();
        String doj=employee.getDoj();
        int month=Integer.parseInt(doj.substring(5,7));
        int day=Integer.parseInt(doj.substring(8,10));
        int totalMonth=monthCalculation(month);

         double ansalary;
        if(day==1) {
        	ansalary=monthlySalary*totalMonth;
        }else {
        	
        	ansalary=monthlySalary*(totalMonth-1)+ (monthlySalary/30)*day;
        }
       
        
        return ansalary;
        
        }
	
	
	

	public static double calculateTaxAmount(double annualSalary) {
        double taxAmount = 0;

        if (annualSalary <= Constants.TAX_RATE_1) {
            taxAmount = 0;
        } else if (annualSalary <= Constants.TAX_RATE_2) {
            taxAmount = (annualSalary - Constants.TAX_RATE_1) * 0.05;
        } else if (annualSalary <= Constants.TAX_RATE_3) {
            taxAmount = (Constants.TAX_RATE_2 - Constants.TAX_RATE_1) * 0.05 + (annualSalary - Constants.TAX_RATE_2) * 0.10;
        } else {
            taxAmount = (Constants.TAX_RATE_2 - Constants.TAX_RATE_1) * 0.05 + (Constants.TAX_RATE_3 - Constants.TAX_RATE_2) * 0.10 + (annualSalary - Constants.TAX_RATE_3) * 0.20;
        }

        return taxAmount;
    }

	
	
    public static double calculateCessAmount(double annualSalary) {
        if (annualSalary > Constants.CESS_Bugate) {
            return (annualSalary - Constants.CESS_Bugate) * Constants.CESS_RATE;
        }
        return 0;
    }
    
    
	
	
	private static int monthCalculation(int month) {
		
		int mon=0;
		
		switch(month) {
		
		case 1:
			mon=3;
			break;
			
		case 2:
			mon=2;
			break;
			
		case 3:
			mon=1;
			break;
			
		case 4:
			mon=12;
			break;
			
		case 5:
			mon=11;
			break;
			
		case 6:
			mon=10;
			break;
			
		case 7:
			mon=9;
			break;
			
		case 8:
			mon=8;
			break;
			
		case 9:
			mon=7;
			break;
			
		case 10:
			mon=6;
			break;
			
		case 11:
			mon=5;
			break;
			
		case 12:
			mon=4;
			break;
			
			

		}
		
		
		return mon;
	}
	
	
	
	
	
	
}





