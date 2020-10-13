package main

import library._
import org.junit.Assert._
import org.junit.Test
import simplifier.LE_NOM_DE_VOTRE_BINOME._

class TestSimplify {
  @Test
  def t0(){
    val simp= new MySimplifier
    val p= List(Star)
    val pres= List(Star)
    
    assertEquals(pres, simp.simplify(p))
  }

  @Test 
  def t1(){
    val simp = new MySimplifier
    var p = List(Plus,Plus)
    var pres = List (Qmark, Plus)
    assertEquals(pres, simp.simplify(p))

    var p = List(Star,Star)
    var pres = List (Star)
    assertEquals(pres, simp.simplify(p))

    var p = List(Qmark,Qmark)
    var pres = List (Qmark,Qmark)
    assertEquals(pres, simp.simplify(p))

    var p = List(Plus,Star)
    var pres = List (Plus)
    assertEquals(pres, simp.simplify(p))

    var p = List(Star,Plus)
    var pres = List (Plus)
    assertEquals(pres, simp.simplify(p))

    var p = List(Star,Qmark)
    var pres = List (Plus)
    assertEquals(pres, simp.simplify(p))

    var p = List(Qmark, Star)
    var pres = List (Plus)
    assertEquals(pres, simp.simplify(p))

    var p = List(Qmark, Plus)
    var pres = List (Qmark, Plus)
    assertEquals(pres, simp.simplify(p))

    var p = List(Plus, Qmark)
    var pres = List (Plus, Qmark)
    assertEquals(pres, simp.simplify(p))

    var p = List(Char(a),Plus)
    var pres = List(Char(a),Plus)
    assertEquals(pres, simp.simplify(p))

    var p = List(Char(a),Star)
    var pres = List(Char(a),Star)
    assertEquals(pres, simp.simplify(p))

    var p = List(Char(a),Qmark)
    var pres = List(Char(a),Qmark)
    assertEquals(pres, simp.simplify(p))

    var p = List(Qmark,Char(a))
    var pres = List(Qmark,Char(a))
    assertEquals(pres, simp.simplify(p))

    var p = List(Star,Char(a))
    var pres = List(Star,Char(a))
    assertEquals(pres, simp.simplify(p))

    var p = List(Plus,Char(a))
    var pres = List(Plus,Char(a))
    assertEquals(pres, simp.simplify(p))

    var p = List(Char(a),Char(b))
    var pres = List(Char(a),Char(b))
    assertEquals(pres, simp.simplify(p))

    var p = List(Char(a),Nil)
    var pres = List(Char(a),Nil)
    assertEquals(pres, simp.simplify(p))
  
    var p = List(Star,Nil)
    var pres = List(Star,Nil)
    assertEquals(pres, simp.simplify(p))

    var p = List(Plus,Nil)
    var pres = List(Plus,Nil)
    assertEquals(pres, simp.simplify(p))
    
    var p = List(Qmark,Nil)
    var pres = List(Qmark,Nil)
    assertEquals(pres, simp.simplify(p))
  }

  @Test 
  def t2(){
    val simp = new MySimplifier
    var p = List(Plus,Char(c),Star,Qmark,Char(d),Star,Plus)
    var pres = List (Plus,Char(c),Plus,Char(d),Plus)
    assertEquals(pres, simp.simplify(p))

    var p = List(Char(a),Star,Star)
    var pres = List(Char(a),Star)
    assertEquals(pres, simp.simplify(p))
  }


}