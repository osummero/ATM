import java.util.*
import kotlin.system.exitProcess
var money = 2000
var originpassword =123456
fun main() {
  login()
    while(true){
    println("请选择您所要办理的业务:")
    show()
    var scanner = Scanner(System.`in`)
    var choice = scanner.nextInt()
    when(choice){
        1 ->{Mmoney1()}
        2 ->{Mmoney2()}
        3 ->{Mmoney3()}
        4 ->{changepwd()}
        5 -> {exitProcess(1)}
        }
    }
}
fun show(){
    println("********************")
    println("1.查询账户金额")
    println("2.存款")
    println("3.取款")
    println("4.更改密码")
    println("5.退出")
    println("********************")

}

fun login(){
    //设置初始账号和密码
    //账号名为ly
    //密码为123456
    println("欢迎光临西大银行！")
    var number=5
    while (number>0){
    println("请输入您的账号：")
    var scanner = Scanner(System.`in`)
    var acount = scanner.nextLine()
        println("请输入您的密码：")
    var password = scanner.nextInt()
    if (acount=="ly" && password==123456){
      println("登陆成功！")
        break
    }else{if (number-1>0){
        println("账号或密码错误，你还有${number-1}次机会，请重新登陆！")
      }else{ println("您的机会已用完！")
        break}
       }
        number--
    }
}
fun Mmoney1(): Int {
    println("当前账户余额为${money}元！")
    return money
}
fun  Mmoney2(): Int {
    println("请输入存款金额：")
    var scanner = Scanner(System.`in`)
    var cmoney = scanner.nextInt()
    money=money+cmoney
    return money
}
fun Mmoney3(): Int {
    println("请输入取款金额：")
    var scanner = Scanner(System.`in`)
    var cmoney = scanner.nextInt()
    money=money-cmoney
    if (money<0){
        println("余额不足！")
    }
    return money
}
fun changepwd(){
    var number=3
    var num=3
    while(number>0) {
        println("请输入原密码：")
        var scanner = Scanner(System.`in`)
        var oldpassword = scanner.nextInt()

        if (oldpassword == originpassword) {
            println("请重置密码：")

            while (num>0){
            var scanner = Scanner(System.`in`)
            var newpassword = scanner.nextInt()
            println("请再次输入密码：")
            var yzpassword = scanner.nextInt()
            if (yzpassword == newpassword) {
                originpassword = newpassword
                println("密码设置成功！，新密码为${newpassword}")
                break
            } else {if (num-1>0){
                println("前后密码不一致！您还有${num-1}次机会。")
                      }
                  else  println("您的机会已用完！")
               }
                num--
            }
            if (num>0)break
        }
        else {if (number-1>0)
            println("输入密码错误！你还有${number-1}次机会")
            else{
                println("您的机会已用完，请联系客服！")
               }
        }
        number--

    }
}