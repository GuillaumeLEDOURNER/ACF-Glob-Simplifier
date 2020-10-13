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
  def t1_00(){
    val simp = new MySimplifier
    var p = List(Plus,Plus)
    var pres = List (Qmark, Plus)
    assertEquals(pres, simp.simplify(p))
    }
  @Test 
  def t1_01(){
    val simp = new MySimplifier
    var p = List(Star,Star)
    var pres = List (Star)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_02(){
    val simp = new MySimplifier
    var p = List(Qmark,Qmark)
    var pres = List (Qmark,Qmark)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_03(){
    val simp = new MySimplifier
    var p = List(Plus,Star)
    var pres = List (Plus)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_04(){
    val simp = new MySimplifier
    var p = List(Star,Plus)
    var pres = List (Plus)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_05(){
    val simp = new MySimplifier
    var p = List(Star,Qmark)
    var pres = List (Plus)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_06(){
    val simp = new MySimplifier
    var p = List(Qmark, Star)
    var pres = List (Plus)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_07(){
    val simp = new MySimplifier
    var p = List(Qmark, Plus)
    var pres = List (Qmark, Plus)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_08(){
    val simp = new MySimplifier
    var p = List(Plus, Qmark)
    var pres = List (Plus, Qmark)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_09(){
    val simp = new MySimplifier
    var p = List(Char('a'),Plus)
    var pres = List(Char('a'),Plus)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_10(){
    val simp = new MySimplifier
    var p = List(Char('a'),Star)
    var pres = List(Char('a'),Star)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_11(){
    val simp = new MySimplifier
    var p = List(Char('a'),Qmark)
    var pres = List(Char('a'),Qmark)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_12(){
    val simp = new MySimplifier
    var p = List(Qmark,Char('a'))
    var pres = List(Qmark,Char('a'))
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_13(){
    val simp = new MySimplifier
    var p = List(Star,Char('a'))
    var pres = List(Star,Char('a'))
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_14(){
    val simp = new MySimplifier
    var p = List(Plus,Char('a'))
    var pres = List(Plus,Char('a'))
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_15(){
    val simp = new MySimplifier
    var p = List(Char('a'),Char('b'))
    var pres = List(Char('a'),Char('b'))
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_16(){
    val simp = new MySimplifier
    var p = List(Char('a'))
    var pres = List(Char('a'))
    assertEquals(pres, simp.simplify(p))
    }
  @Test 
  def t1_17(){
    val simp = new MySimplifier
    var p = List(Star)
    var pres = List(Star)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t1_18(){
    val simp = new MySimplifier
    var p = List(Plus)
    var pres = List(Plus)
    assertEquals(pres, simp.simplify(p))
      }
  @Test 
  def t1_19(){
    val simp = new MySimplifier
    var p = List(Qmark)
    var pres = List(Qmark)
    assertEquals(pres, simp.simplify(p))
  }

  @Test 
  def t2_01(){
    val simp = new MySimplifier
    var p = List(Plus,Char('c'),Star,Qmark,Char('d'),Star,Plus)
    var pres = List (Plus,Char('c'),Plus,Char('d'),Plus)
    assertEquals(pres, simp.simplify(p))
  }
  @Test 
  def t2_02(){
    val simp = new MySimplifier
    var p = List(Char('a'),Star,Star)
    var pres = List(Char('a'),Star)
    assertEquals(pres, simp.simplify(p))
  }

  @Test 
  def t2_03(){
    val simp = new MySimplifier
    var p = List(Star,Qmark,Char('a'),Qmark,Char('b'),Plus,Plus,Star,Qmark,Char('c'),Star,Star,Star,Char('d'))
    var pres = List(Plus,Char('a'),Qmark,Char('b'),Qmark,Plus,Qmark,Char('c'),Star,Char('d'))
    assertEquals(pres, simp.simplify(p))
  }

  @Test 
  def t2_04(){
    val simp = new MySimplifier
    var p = List(Star,Star,Star,Star,Star,Char('a'),Star,Star,Star,Star,Star)
    var pres = List(Star,Char('a'),Star)
    assertEquals(pres, simp.simplify(p))
  }


}