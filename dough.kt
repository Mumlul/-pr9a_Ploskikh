import kotlin.random.Random
class Manf(manufacturer :String, ):Cake(manufacturer){

    fun price(){
        cost=weight*0.7
    }




    fun fate(){
        val rnds = (0..6).random()
        when{
            rnds==0->fate="Потерял"
            rnds==1->fate="Скушал"
            rnds==2->fate="Проиграл в бите с бомжом"
            rnds==3->fate="выбросил"
            rnds==4->fate="Обменял на махито клубничный"
            else ->fate="Вы подцепили кишечную палочку"
        }
    }




}