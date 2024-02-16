import kotlin.reflect.jvm.internal.impl.protobuf.ByteString

open class Car(var country:String){
    open var cost: Double=0.0
    var name: String=""
    open var hp: Double=0.0
    open var bonus:String=""
    open var death: Double=0.0

    fun Info(){
        println("Введите название вашего Авто")
        name=readln()
        do {
            println("Введите сколько лошадиных сил у вашего авто")
            hp= readln()!!.toDouble()
        }while (hp>0)
    }
    fun Output(){
        if(death<=0.6){
            println("название вашего авто:$name\nСтоимость мавто:$cost\nСтрана производитель:$country\nЛошадиные силы:$hp")
        }
        else{
            println("Щас ты лежишь в больнице и твоя машина вся в смятку аххахахах\nА все потому что не надо гонять")
        }

    }

}