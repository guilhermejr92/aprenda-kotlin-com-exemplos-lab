enum class Nivel {Básico, Intermediário, Avançado}

data class Usuario(val level: String, val skill: String, val vocação: String)

data class Planilha(val level: String, val duracao: Int, val nivel: Calculator)

data class Hunts(val nome: String, val dicas: List<LocaisdeHunt>, val nivel: Calculator) {

    val classes = mutableListOf<Usuario>()
    
    fun cadastrar(usuario: Usuario) {
        cadastrar.add(usuario)
    }
    
    fun imprimirListaCadastrar(){
        for(user in cadastrar){
            println(user.level)
        }
    }
    
    fun imprimirGradePlanilha(){
        for(cont in dicas){
            println("${cont.level} - ${cont.duracao}")
        }
    }
}

fun main() {
    
    val PlanilhaKnight = LocaisdeHunt ("Do 0 ao 1000", 70, nivel.Calculator)
    val PlanilhaPaladin = LocaisdeHunt("Do 0 ao 1000", 80, nivel.Calculator)
    val PlanilhaDruid = LocaisdeHunt("Do 0 ao 1000", 90, nivel.Calculator)
    val PlanilhaSorcerer = LocaisdeHunt("Do 0 ao 1000", 90, nivel.Calculator)
    
    val listLocaisdeHunt = mutableListOf<Usuario>()
    listLocaisdeHunt.add(PlanilhaKnight)
    listLocaisdeHunt.add(PlanilhaPaladin)
    listLocaisdeHunt.add(PlanilhaDruid)
    listLocaisdeHunt.add(PlanilhaSorcerer)
    
    val Hunts = Vocação("Tutorial Level e Skill", listLocaisdeHunt, nivel.Calculator)
    
    val Knight = Usuario("Char", "knight@zmail.com", "premium")
    val Paladin = Usuario("Char", "paladin@zmail.com", "premium")
    val Druid = Usuario("Char", "druid@zmail.com", "premium")
    val Sorcerer = Usuario("Char", "sorcerer@zmail.com", "premium")
    
    Hunts.cadastrar()
    Hunts.cadastrar()
    
    print("Hunts: ")
    println("${Hunts.level} - ${Hunts.nivel}")
    println(Hunts.imprimirLocaisdeHunt())
    println()
    println("Opções de hunts: ")
    println(Hunts.imprimirHunts())
}
