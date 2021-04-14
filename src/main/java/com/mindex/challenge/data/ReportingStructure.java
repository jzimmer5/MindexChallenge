package com.mindex.challenge.data;

import java.util.List;

public class ReportingStructure {
    private static Employee employee;
    private static int numberOfReports;

    public static int getNumberOfReports(Employee employeeReport){
        employee = employeeReport;
        numberOfReports = recursveLoop(employee);
        return numberOfReports;
    }

    public static int recursveLoop(Employee employeeReport)
    {
        List<Employee> reporters = employeeReport.getDirectReports();
		for (Employee report : reporters) {
			return 1 + getNumberOfReports(report);
		}
		return 0;
    }
}
