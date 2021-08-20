object question_04 extends App{

	val acc1= new Bankacc("Pavi",15350,4500.00)
	val acc2= new Bankacc("Isi",15351,-3000.00)
    val acc3= new Bankacc("Tharu",15352,1000.00)
	val acc4= new Bankacc("Kiththa",15353,3300.00)

  var bank:List[Bankacc]=List(acc1,acc2,acc3,acc4)

  val overdraft = bank.filter(x=>x.balance<0)
  val balance = bank.map((x)=>(x.balance)).reduce((x,y)=>(x+y))
  val interest = (b:List[Bankacc])=>b.map((x) => (x.nic,x.accnumber,if(x.balance>0)  (x.balance+(x.balance*0.5)) else (x.balance+(x.balance*0.1)) ))

  println(overdraft)
  println(balance)
  println(interest(bank))

}

class Bankacc(id:String,n:Int,b:Double){

  var nic:String=id
  var accnumber:Int =n
  var balance:Double =b

  override def toString = "["+nic+":"+accnumber+":"+balance+"]"

}