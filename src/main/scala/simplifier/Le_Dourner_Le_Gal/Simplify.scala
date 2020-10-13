package simplifier.Le_Dourner_Le_Gal

import library._

class MySimplifier extends Simplifier{
	def simplify(p: List[Symbol]): List[Symbol] = {
		p match {
			case Nil => Nil
			case Star :: Star :: tl =>  simplify(Star:: tl)
			case Qmark :: Star :: tl => simplify(Plus  :: tl)
			case Star :: Qmark :: tl => simplify(Plus :: tl)
			case Qmark :: Plus :: tl => Qmark :: simplify(Plus :: tl)
			case Plus :: Qmark :: tl => Plus :: simplify(Qmark :: tl)
			case Star :: Plus :: tl => simplify(Plus :: tl)
			case Plus :: Star :: tl => simplify(Plus :: tl)
			case Plus :: Plus :: tl => Qmark :: simplify(Plus :: tl)
			case Qmark :: Qmark :: tl => Qmark :: simplify(Qmark :: tl)

			case Char(a) :: Plus :: tl => Char (a) :: simplify(Plus ::tl)
			case Char(a) :: Star :: tl => Char (a) :: simplify(Star ::tl)
			case Char(a) :: Qmark :: tl => Char (a) :: simplify(Qmark ::tl)

			case Plus :: Char(a) :: tl => Plus :: simplify(Char(a) ::tl)
			case Star :: Char(a) :: tl => Star :: simplify(Char(a) ::tl)
			case Qmark :: Char(a) :: tl => Qmark :: simplify(Char(a) ::tl)

			case Char (a) :: Char(b) :: tl => Char (a) :: Char (b) :: simplify(tl)

			case Char (a) :: Nil => Char (a) :: Nil
			case Star :: Nil => Star :: Nil
			case Plus :: Nil => Plus :: Nil
			case Qmark :: Nil => Qmark :: Nil
			
		}
	}

}