package comparator.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmpInfo
{
	private int empId;
	private String empName;
	private int empSal;
	
	public EmpInfo(int empId, String empName, int empSal) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	@Override
	public String toString() 
	{
		return "\n[empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
}
class EmpId implements Comparator<EmpInfo>
{

	@Override
	public int compare(EmpInfo o1, EmpInfo o2) 
	{
		if(o1.getEmpId()==o2.getEmpId())
		{
			return 0;
		}
		else if(o1.getEmpId()>o2.getEmpId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
class EmpName implements Comparator<EmpInfo>
{

	@Override
	public int compare(EmpInfo o1, EmpInfo o2) 
	{
		if(o1.getEmpName()==o2.getEmpName())
		{
			return 0;
		}
		else if(o1.getEmpName().compareTo(o2.getEmpName())<0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class ComapreToDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<EmpInfo> a1 = new ArrayList<EmpInfo>();
		a1.add(new EmpInfo(1,"raj   ",43000));
		a1.add(new EmpInfo(21,"Sangram",53000));
		a1.add(new EmpInfo(32,"Aditya",45000));
		a1.add(new EmpInfo(14,"Harshad",42000));
		a1.add(new EmpInfo(15,"Omkar   ",  43000));
		System.out.println("Before sort: ");
		System.out.println("\tEmpId\tEmpName  \tEmpSal");
		for(EmpInfo e:a1)
		{
			System.out.println("\t"+e.getEmpId()+"\t"+e.getEmpName()+"  \t"+e.getEmpSal());
		}
		Collections.sort(a1, new EmpName());
		System.out.println("After sort: ");
		System.out.println("\tEmpId\tEmpName  \tEmpSal");
		for(EmpInfo e:a1)
		{
			System.out.println("\t"+e.getEmpId()+"\t"+e.getEmpName()+"  \t"+e.getEmpSal());
		}
	}
}
