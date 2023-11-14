import java.util.ArrayList;
import java.util.Random;

class Exam2{
	public static void main(String[] args){
		ArrayList<Employee> employeeArr = new ArrayList<Employee>(); 
		Manager e1m1= new Manager("SRK",40);
		employeeArr.add(e1m1);
		//System.out.println(e1m1.calculateGrossSalary());

		Supervisor e2s1= new Supervisor("SRK",40);
		employeeArr.add(e2s1);
		Supervisor e3s2= new Supervisor("SRK",30);
		employeeArr.add(e3s2);

		Worker e4w1= new Worker("Rahul",20);
		employeeArr.add(e4w1);
		Worker e5w2= new Worker("Rahul",35);
		employeeArr.add(e5w2);
		Worker e6w3= new Worker("Rahul",54);
		employeeArr.add(e6w3);
		Worker e7w4= new Worker("Rahul32",63);
		employeeArr.add(e7w4);
		Worker e8w5= new Worker("Rahul",53);
		employeeArr.add(e8w5);
		Worker e9w6= new Worker("Rahul",23);
		employeeArr.add(e9w6);
		Worker e10w7= new Worker("Rahul",34);
		employeeArr.add(e10w7);
		Worker e11w8= new Worker("Rahul",23);
		employeeArr.add(e11w8);
		Worker e12w9= new Worker("Rahul",44);
		employeeArr.add(e12w9);
		Worker e13w10= new Worker("Rdhf",68);
		employeeArr.add(e13w10);
	

		ArrayList<Employee> violationReportArrayList = new ArrayList<>();
		double sum=0;
		for (Employee i :employeeArr){
			sum+=(i.calculateGrossSalary());
			if (i.getWorkingHour()>60){
				violationReportArrayList.add(i);
			}
		}
		System.out.println(sum);
	
		for( Employee j:violationReportArrayList){
			System.out.println(j);
		}
		
		
	} 
	

}

interface Employee {
	int getWorkingHour();
	int getEmployeeId();
	String getName();
	
	double calculateGrossSalary();
	double calculateTax();
	double calculateNetSalary();
	
}


class Manager implements Employee{
	private int workingHour;
	private int employeeId;
	private String name;

	public Manager(String name,int workingHour){
		this.workingHour = workingHour;
		Random random = new Random();
		this.employeeId=random.nextInt();
		this.name =name;
	}
	
	

	public int getWorkingHour(){
		return workingHour;
	}

	
	public int getEmployeeId(){
		return employeeId;
	
	}

	public String getName(){
		return name;
	}
	
	
	public double calculateGrossSalary(){
		double grossSalary = getWorkingHour()*500;
		return grossSalary;
		}


	public double calculateTax(){
		double taxOutgo= calculateGrossSalary()*.30;
		return taxOutgo;
	}

	public double calculateNetSalary(){
		double netSalary = calculateGrossSalary()-calculateTax();
		return netSalary;
	}
	
	public String toString(){
		StringBuilder sb=new StringBuilder("EmployeeId: "+employeeId);
		sb.append("\n Name : "+name);
		sb.append("\n Gross salary : "+calculateGrossSalary());
		sb.append("\n Tax outgo : "+calculateTax());
		sb.append("\n  Net Salary : "+calculateNetSalary());
		return sb.toString();
	}
	
}

class Supervisor implements Employee{
	private int workingHour;
	private int employeeId;
	private String name;

	public Supervisor (String name,int workingHour){
		this.workingHour = workingHour;
		Random random = new Random();
		this.employeeId=random.nextInt();
		this.name =name;
	}
	
	public int getWorkingHour(){
		return workingHour;
	}

	
	public int getEmployeeId(){
		return employeeId;
	}

	public String getName(){
		return name;
	}
	
	public double calculateGrossSalary(){
		if (getWorkingHour()<40){
			return getWorkingHour()*300;
		}else{
			if(getWorkingHour()>60){
				return 40*300+(20)*450;
			}return 40*300+((getWorkingHour()-40)*450);	
		}
	}
	

	 public double calculateTax(){
		double taxOutGo=calculateGrossSalary()*.20;
		return taxOutGo;
	}

	 public double calculateNetSalary(){
		double netSalary= calculateGrossSalary()- calculateTax();
		return netSalary;
	}


	public String toString(){
		StringBuilder sb=new StringBuilder("EmployeeId: "+employeeId);
		sb.append("Name : "+name);
		sb.append(" Gross salary : "+calculateGrossSalary());
		sb.append(" Tax outgo : "+calculateTax());
		sb.append(" Net Salary : "+calculateNetSalary());
		return sb.toString();
	}
}

class Worker implements Employee{
	private int workingHour;
	private int employeeId;
	private String name;
	

	public Worker(String name,int workingHour){
		this.workingHour = workingHour;
		Random random = new Random();
		this.employeeId=random.nextInt();
		this.name =name;
	}

	public int getWorkingHour(){
		return workingHour;
	}

	
	public int getEmployeeId(){
		return employeeId;
	
	}

	public String getName(){
		return name;
	}

	
	 public double calculateGrossSalary(){
		if (getWorkingHour()<40){
			return getWorkingHour()*200;
		}else{
			if(getWorkingHour()>60){
				return 40*200+(20)*300;
			}return 40*200+((getWorkingHour()-40)*300);	
		}

	}
	 public double calculateTax(){
		double taxOutGo=calculateGrossSalary()*.10;
		return taxOutGo;
	}

	public double calculateNetSalary(){
		double netSalary= calculateGrossSalary()- calculateTax();
		return netSalary;
	}
	
	public String toString(){
		StringBuilder sb=new StringBuilder("EmployeeId: "+employeeId);
		sb.append("Name : "+name);
		sb.append(" Gross salary : "+calculateGrossSalary());
		sb.append(" Tax outgo : "+calculateTax());
		sb.append(" Net Salary : "+calculateNetSalary());
		return sb.toString();
	}
}






