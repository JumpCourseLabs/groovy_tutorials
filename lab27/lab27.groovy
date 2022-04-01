package com.javacodegeeks.groovy.regex
 
class GroovyRegexMatchAdvanced {
 
    static main(args) {
        def grepPattern = ~/A\w+/
        def cities = ['Alabama', 'Canada', 'Arizona']
        println cities.grep(grepPattern) // [Alabama, Arizona]
    }
 
}