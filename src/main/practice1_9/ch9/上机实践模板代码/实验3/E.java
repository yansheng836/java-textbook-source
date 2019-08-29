package ch9.上机实践模板代码.实验3;

public class E {
	public static void main(String args[]) {
		String[] student = { "张三:数学72，物理67，英语70", "李四:数学92，物理98，英语88", "周明:数学68，物理80，英语77" };
		ComputeScore jisuan = new ComputeScore();
		for (String s : student) {
			double totalScore = jisuan.compute(s);
			String name = s.substring(0, s.indexOf(":"));
			System.out.println(name + "总成绩:" + totalScore);
		}
	}
}

class ComputeScore {
	double compute(String chengjiForm) {
	       Scanner scanner = 【代码1】//创建scanner,将chengjiForm传递给构造方法的参数 
	       String regex = "[^0123456789.]+";
	      【代码2】 //scanner调用useDelimiter(String regex)，将regex传递给该方法的参数
	       double sum=0;
	       while(scanner.hasNext()){
	         try{ 
	              double price = 【代码3】 //scanner调用nextDouble()返回数字单词
	              sum = sum+price;
	         } 
	         catch(InputMismatchException exp){
	              String t = scanner.next();
	         }   
	       }
	       return sum;
	    }
}
