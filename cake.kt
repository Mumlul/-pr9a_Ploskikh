open class Cake(var manufacturer: String) {
    open var name: String=""
    open var cost: Double=0.0
    open var cream: String=""
    open var calorie_content: Double=0.0
    open var weight:Double=0.0
    open var dough:String=""
    open var fate: String=""
    open var p_weight: Double=0.0


    open fun Info(){
        println("Введите название продукта")
        name=readln()
        println("Введите крем у этого $name")
        cream=readln()
        do{
            println("Сколько каллорий у это $name")
            calorie_content=readln()!!.toDouble()
            println("Введите вес $name")
            weight=readln()!!.toDouble()
        }while (weight<0.0&&calorie_content<0.0)
        println("Введите тип теста $name")
        dough=readln()
    }

    fun Output(){
        println("Название:$name\nСтоисость:$cost\nКрем:$cream\nКалорийность:$calorie_content\nВес:$weight\nТесто:$dough\nПроизводитель$manufacturer\nСудьба:$fate\nСтолько калорий наберет человек:$p_weight")
    }





}