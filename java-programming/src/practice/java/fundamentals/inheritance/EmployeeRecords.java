package practice.java.fundamentals.inheritance;

public class EmployeeRecords {
    public static void main(String[] args) {
        
        PermanentEmployee permaEmployee = new PermanentEmployee();
        ContractEmployee tEmployee = new ContractEmployee();

        permaEmployee.setName("Anil");
        permaEmployee.setEmpId(101);
        permaEmployee.setBasicPay(10000);
        permaEmployee.setHra(1500);
        permaEmployee.setExperience(3);

        permaEmployee.calculateSalary();


        tEmployee.setName("Ankit");
        tEmployee.setEmpId(102);
        tEmployee.setWages(500);
        tEmployee.setHours(10);
        
        tEmployee.calculateSalary();
    }
}
