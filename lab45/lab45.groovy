names = ['Joe', 'Jane', 'Adam', 'Mary', 'Betty', 'Zoe']

println "Names : $names"

names=names.sort { a, b -> a.length() <=> b.length() ?: b <=> a }

println "sortedNames: $names"