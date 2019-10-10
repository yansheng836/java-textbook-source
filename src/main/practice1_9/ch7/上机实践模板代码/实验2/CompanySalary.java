package ch7.�ϻ�ʵ��ģ�����.ʵ��2;

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
//	   ������1��//����һ��������employee������Employee������
	   double salaries=0;
	   Company(Employee[] employee) {
	      this.employee=employee;
	   }
	   public double salariesPay() {
	       salaries=0;
	       //������2�� //����salaries��
	       return salaries;
	   }    
	}

public class CompanySalary {
	public static void main(String args[]) {
		Employee[] employee = new Employee[129]; // ��˾��129����Ա
		for (int i = 0; i < employee.length; i++) {   // ��Ա�򵥵طֳ�2��
			if (i % 2 == 0)
				employee[i] = new YearWorker();
			else if (i % 2 == 1)
				employee[i] = new MonthWorker();
		}
		Company company = new Company(employee);
		System.out.println("��˾нˮ�ܶ�:" + company.salariesPay() + "Ԫ");
	}
}
