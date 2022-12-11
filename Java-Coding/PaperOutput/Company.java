package PaperOutput;

class SalaryCalculationException extends Exception {}
class Person1 {
    public void calculateSalary() throws SalaryCalculationException {
        throw new SalaryCalculationException();
    }
}
class Company {
    public void paySalaries() throws SalaryCalculationException {
        new Person1().calculateSalary();
    }
}
