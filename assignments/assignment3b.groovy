import groovy.text.*
import java.io.*

def file = new File("./book.template")
def binding = [author: "Ken Barclay", title: "Groovy", publisher: "Elsevier", isbn: 1234567890]

def engine = new SimpleTemplateEngine()
def template = engine.createTemplate(file)
def writable = template.make(binding)

println writable
