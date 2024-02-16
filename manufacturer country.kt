import kotlin.random.Random
class manufacturer_country(country: String):Car(country){

    fun Price(){
        cost=hp*10000
        cost+=cost*0.25
    }

    fun _Bonus(){
        when(country){
            ("China")-> bonus="Corona virus"
            ("Germany")-> bonus="Хороший уровень обслуживания и 20 лет гарантии"
            ("Italy")-> bonus="pizza/pasta"
            ("USA")-> bonus="Gun and scary looking"
            else->bonus="Sorry i don't know"
        }
    }

    fun Upgrade(){
        println("Хотите ли вы улучшить свой авто?1-yes2-no")
        if(readln()!!.toInt()==1)
        {
            println("Ставим ли мы стейдж двигателя?1-yes2-no")
            if(readln()!!.toInt()==1)
            {
                cost+=300000
                hp+=30
                death+=0.2
            }
            println("Савим ли мы турбонадув?1-yes2-no")
            if(readln()!!.toInt()==1)
            {
                cost+=240000
                hp+=20
                death+=0.2
            }
            println("А тонировочку с подсветкой?1-yes2-no")
            if(readln()!!.toInt()==1)
            {
                cost+=50000
                death+=0.2
            }
            println("А будет ли стоять у такого крутого гонщика сестема нитро?1-yes2-no")
            if(readln()!!.toInt()==1)
            {
                cost+=100000
                death+=0.2
            }
            println("Поздравляю ты прокачал свою малышку давай попробуем прокатиться.1-yes2-no")
            if(readln()!!.toInt()==1)
            {
                if(death<0.6){
                    println("Поздравляю твоя гонка прошла успешно ты победеил")
                }
                else{
                    println("Тебе не повезло и во время гонки пошел дождь из-за чего ты потерял упраление и теперь лежишь в больнице")
                }
            }
        }
    }

}