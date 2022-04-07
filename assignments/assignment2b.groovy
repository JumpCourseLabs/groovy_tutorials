Map employees = [:]

employees.put(1001,"John Smith")
employees.put(1002,"Pete Savoy")
employees.put(1003,"Nora Knox")
employees.put(1004,"Amy Chen")
employees.put(1005,"Jake Hummer")

println('Employees Mapped: ' + employees + '\n\n')

println ('Employees Sorted: ' + employees.sort {a, b -> a.value <=> b.value} + '\n\n')

println('Removing 1003 and Re-Sorting...')
employees.remove(1003)
println('Employee 1003 Removed: ' + employees.sort {a, b -> a.value <=> b.value} + '\n\n')
println('Re-Adding Employee 1003...')
employees.put(1003, 'Nora Knox')

employees.put(1004, 'James Strachan')
println('Renaming 1004 and Re-sorting...')
println('Employee 1004 Renamed: ' + employees.sort {a, b -> a.value <=> b.value} + '\n\n')




