public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        int extraWorkHours = Math.max(workHours - 40, 0);
        return extraWorkHours * 30;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int yearsOfWork = currentYear - hireYear;

        if (yearsOfWork < 10) {
            return salary * 0.05;
        } else if (yearsOfWork >= 10 && yearsOfWork < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public double totalSalary() {
        return salary - tax() + bonus() + raiseSalary();
    }

    @Override
    public String toString() {
        return "Adı : " + name + "\nMaaşı : " + salary + "\nÇalışma Saati : " + workHours + "\nBaşlangıç Yılı : " + hireYear
                + "\nVergi : " + tax() + "\nBonus : " + bonus() + "\nMaaş Artışı : " + raiseSalary()
                + "\nVergi ve Bonuslar ile birlikte maaş : " + totalSalary() + "\nToplam Maaş : " + salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(emp.toString());
    }
}
