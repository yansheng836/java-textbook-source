package ch7.上机实践模板代码.实验2;

abstract class Employee {
	public abstract double earnings();
}

class YearWorker extends Employee {
	public double earnings() {
		return 12000;
	}
}

class MonthWorker extends Employee {
	public double earnings() {
		return 12 * 6730;
	}
}

class Company {
//	   【代码1】//声明一个名字是employee类型是Employee的数组
	   double salaries=0;
	   Company(Employee[] employee) {
	      this.employee=employee;
	   }
	   public double salariesPay() {
	       salaries=0;
	       //【代码2】 //计算salaries。
	       return salaries;
	   }    
	}

public class CompanySalary {
	public static void main(String args[]) {
		Employee[] employee = new Employee[129]; // 公司有129名雇员
		for (int i = 0; i < employee.length; i++) {   // 雇员简单地分成2类
			if (i % 2 == 0)
				employee[i] = new YearWorker();
			else if (i % 2 == 1)
				employee[i] = new MonthWorker();
		}
		Company company = new Company(employee);
		System.out.println("公司薪水总额:" + company.salariesPay() + "元");
	}
}
