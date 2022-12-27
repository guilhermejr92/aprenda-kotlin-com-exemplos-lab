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
    
    val PlanilhaKnight = MelhoresLocaisdeHunt ("Do 0 ao 1000", 70, Calculator.Intermediário)
    val PlanilhaPaladin = MelhoresLocaisdeHunt("Do 0 ao 1000", 80, Calculator.Intermediário)
    val PlanilhaDruid = MelhoresLocaisdeHunt("Do 0 ao 1000", 90, Calculator.Avançado)
    val PlanilhaSorcerer = MelhoresLocaisdeHunt("Do 0 ao 1000", 90, Calculator.Avançado)
    
    val listMelhoresLocaisdeHunt = mutableListOf<Usuario>()
    listMelhoresLocaisdeHunt.add(PlanilhaKnight)
    listMelhoresLocaisdeHunt.add(PlanilhaPaladin)
    listMelhoresLocaisdeHunt.add(PlanilhaDruid)
    listMelhoresLocaisdeHunt.add(PlanilhaSorcerer)
    
    val Hunts = Vocação("Tutorial Level e Skill", listMelhoresLocaisdeHunt, Calculator.Avançado)
    
    val Knight = Usuario("Char", "knight@zmail.com", "premium")
    val Paladin = Usuario("Char", "paladin@zmail.com", "premium")
    val Druid = Usuario("Char", "druid@zmail.com", "premium")
    val Sorcerer = Usuario("Char", "sorcerer@zmail.com", "premium")
    
    Hunts.cadastrar()
    Hunts.cadastrar()
    
    print("Calculator: ")
    println("${Hunts.level} - ${Hunts.Calculator}")
    println(Hunts.imprimirGradePlanilha())
    println()
    println("Opções de hunts: ")
    println(Hunts.imprimirHunts())
}
