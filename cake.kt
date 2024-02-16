open class Cake(var manufacturer: String) {
    open var name: String=""
    open var cost: Double=0.0
    open var cream: String=""
    open var calorie_content: Double=0.0
    open var weight:Double=0.0
    open var dough:String=""
    open var fate: String=""
    

    open fun Info(){
        println("Введите название продукта")
        name=readln()
        println("Введите крем у этого $name")
        cream=readln()
        println("Сколько каллорий у это $name")
        calorie_content=readln()!!.toDouble()
        if(calorie_content>0)
        {
            println("Введите вес $name")
            weight=readln()!!.toDouble()
            if(weight>0)
            {
                println("Введите тип теста $name")
                dough=readln()
            }
        }
    }

    fun Output(){
        println("Название:$name\nСтоисость:$cost\nКрем:$cream\nКалорийность:$calorie_content\nВес:$weight\nТесто:$dough\nПроизводитель$manufacturer\nСудьба:$fate")
    }





}