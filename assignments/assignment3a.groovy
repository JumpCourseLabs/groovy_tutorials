def categories = [
  [
    id: 10, 
    name: "Groovy Cookbook"
  ], 
  [
    id: 2, 
    name: "Newest Posts"
  ], 
  [
    id: 7,
    name: "Something Else"
  ]
]

sortedCategories = categories.sort(false, {a, b -> a.id <=> b.id} as Comparator)
println("Before: " + categories + '\n\n')
println("After: " + sortedCategories + '\n\n')
