/*
Assignment

1. Suppose  we have the following definitions:
  def str1 = "Groovy Programming"
  def str2 = "Scripting Language"

Evaluate the following expressions:
  str.length()
  str.substring(7,14)
  str.substring(1, str.length()-1)
  str.endsWith("ming")
  concat str1 and str2
  print "Groovy Language" using split

  */

  class Assignment1 {

    static String str1 = 'Groovy Programming'
    static String str2 = 'Scripting Language'

    static lengthOfString(a) {
      println("The length of string 1 is ${str1.length()}.")
      println("The length of string 2 is ${str2.length()}.")
    }
    static partOfString(a) {
      return a.substring(7, 14)
    }
    static partOfString2(a) {
      return a.substring(1, a.length() - 1)
    }
    static endsWith(a) {
      return a.endsWith('ming')
    }
    static joinString(a, b) {
      return a + b
    }
    static splitString() {
      String a = 'Groovy Language'
      String[] str
      str = a.split(' ')
      return str
    }

    static main(args) {
      def str1Ending = endsWith(str1)
      def str2Ending = endsWith(str2)

      println("A substring of string 1 is ${partOfString(str1)}.")
      println("A substring of string 2 is ${partOfString(str2)}.")
      println("Another substring of string 1 is ${partOfString2(str1)}.")
      println("Another substring of string 2 is ${partOfString2(str2)}.")
      println('Does String 1 end in "ming"? ' + str1Ending)
      println('Does String 2 end in "ming"? ' + str2Ending)
      println("string 1 and string 2 contatanated is ${joinString(str1, str2)}")
      println("Wanna see me split a string? ${splitString()}")
    }

  }

