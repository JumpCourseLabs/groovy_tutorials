interface EmployeeBonus {
  void DisplayBonus()
}

class EmployeeDesignation implements EmployeeBonus {
    private String Title
    private int Salary
    
    public void setTitle(String Title){
      this.Title = Title
    }
    
    public String getTitle() {
      return this.Title
    }
    
    public void setSalary(int Salary) {
      this.Salary = Salary
    }
    
    public int getSalary(int Salary) {
      return this.Salary
    }
    
    public void DisplayBonus(){
      def bonusPay = Salary * .10
      println("Bonus Calculation is: ${bonusPay}")
    }
    public void DisplayPosition(){
      println("Current Position: ${this.Title}")
      println("Current Salary: ${this.Salary}")
    }
    
  }


class Department {
   
 private String DeptName
 private String DeptLocation
  
  public void setDeptName(String DeptName) {
    this.DeptName = DeptName
  }
  
  public void setDeptLocation(String DeptLocation) {
    this.DeptLocation = DeptLocation
  }
  
  public String getDeptName() {
    return this.DeptName
  }
  public String getDeptLocation() {
    return this.DeptLocation
  }
  
}

class Employee extends Department {
  
  private int EmpID 
  private String EmpName 
  private int EmpAge 
  private String EmpHireDate
  
  public Employee() {
    super()
  }

	public int getEmpID() {
		return this.EmpID;
	}

	public void setEmpID(int EmpID) {
		this.EmpID = EmpID;
	}

	public String getEmpName() {
		return this.EmpName;
	}

	public void setEmpName(String EmpName) {
		this.EmpName = EmpName;
	}

	public int getEmpAge() {
		return this.EmpAge;
	}

	public void setEmpAge(int EmpAge) {
		this.EmpAge = EmpAge;
	}

	public String getEmpHireDate() {
		return this.EmpHireDate;
	}

	public void setEmpHireDate(String EmpHireDate) {
		this.EmpHireDate = EmpHireDate;
	}
  

  public void DisplayEmployee() {
    println("Employee ID: ${this.EmpID}")
    println("Employee Name: ${this.EmpName}")
    println("Employee Age: ${this.EmpAge}")
    println("Employee Department: ${this.DeptName}")
    println("Department Location: ${this.DeptLocation}")
    println("Hire Date: ${this.EmpHireDate}")    
  }
  


}

   static void main(String[] args) {
    Employee emp1 = new Employee()
    emp1.setEmpID(1)
    emp1.setEmpName("Joe Smith")
    emp1.setEmpAge(24)
    emp1.setDeptName("Accounting")
    emp1.setDeptLocation("Spokanne")
    emp1.setEmpHireDate("2-15-20")
    emp1.DisplayEmployee()
    
    EmployeeDesignation pos1 = new EmployeeDesignation()
    pos1.setTitle("Payroll Specialist")
    pos1.setSalary(1000)
    pos1.DisplayPosition() 
    pos1.DisplayBonus()
  }