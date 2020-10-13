package main

import simplifier.Le_Dourner_Le_Gal.MySimplifier

import scala.io.StdIn.readLine
//import isabelleAndScala.Converter
import library._

object Application extends App{
  val sp1= new MySimplifier()
  while(true){
    print("Pattern: ")
    val p= readLine
    val p2= Parser.parseSymbolList(p)
    val ps1= sp1.simplify(p2)
    println("Simplified scala: "+PrettyPrinter.show(ps1))
  }
}