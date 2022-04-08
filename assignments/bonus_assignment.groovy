def empMap = [
['emp-id': 1001, 'name': 'John Smith', 'age': 55, 'dept': 'Finance', 'location': 'Seattle', 'salary': 30000, 'hire-date': Date.parse('MMM d, yyyy', 'March 1, 2000')],
['emp-id': 1002, 'name': 'Pete Savoy', 'age': 25, 'dept': 'Tech & Ops', 'location': 'Chicago', 'salary': 45000, 'hire-date': Date.parse('MMM d, yyy', 'May 2, 2015')],
['emp-id': 1003, 'name': 'Nora Knox', 'age': 57, 'dept': 'HR', 'location': 'Seattle', 'salary': 25000, 'hire-date':Date.parse('MMM d, yyy', 'July 8, 2005')],
['emp-id': 1004, 'name': 'Amy Chen', 'age': 32, 'dept': 'Finance', 'location': 'Chicago', 'salary': 39000, 'hire-date': Date.parse('MMM d, yyy','November 1, 2013')],
]
// Insert new Employee 
def newEmp = ['emp-id': 1005, 'name': 'Jake Hummer', 'age': 45, 'dept': 'Tech & Ops', 'location': 'Chicago', 'salary': 42000, 'hire-date': Date.parse('MMM d, yyy','May 7, 2011')]
empMap << newEmp

println empMap + '\n\n'

def chicagoOffice = empMap.findAll {it.location == 'Chicago'}
println chicagoOffice + '\n\n'

def richEmps = empMap.findAll {it.salary > 40000}
println richEmps + '\n\n'

// I got these to work, and then got stuck on the date.
// I've sorted and deleted in other assignments
// Since this is a bonus, I'll submit as is this time.
