package ch9.�ϻ�ʵ��ģ�����.ʵ��3;

public class E {
	public static void main(String args[]) {
		String[] student = { "����:��ѧ72������67��Ӣ��70", "����:��ѧ92������98��Ӣ��88", "����:��ѧ68������80��Ӣ��77" };
		ComputeScore jisuan = new ComputeScore();
		for (String s : student) {
			double totalScore = jisuan.compute(s);
			String name = s.substring(0, s.indexOf(":"));
			System.out.println(name + "�ܳɼ�:" + totalScore);
		}
	}
}

class ComputeScore {
	double compute(String chengjiForm) {
	       Scanner scanner = ������1��//����scanner,��chengjiForm���ݸ����췽���Ĳ��� 
	       String regex = "[^0123456789.]+";
	      ������2�� //scanner����useDelimiter(String regex)����regex���ݸ��÷����Ĳ���
	       double sum=0;
	       while(scanner.hasNext()){
	         try{ 
	              double price = ������3�� //scanner����nextDouble()�������ֵ���
	              sum = sum+price;
	         } 
	         catch(InputMismatchException exp){
	              String t = scanner.next();
	         }   
	       }
	       return sum;
	    }
}
