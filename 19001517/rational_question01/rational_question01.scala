object question_01 extends App{

	val r1= new Rational(2,4)

	val r=r1.neg

	println(r)

}

class Rational(n:Int, d:Int){

	def numer=n
	def denom=d

	def neg=new Rational(-this.numer,this.denom)

	override def toString=numer+"/"+denom

	}