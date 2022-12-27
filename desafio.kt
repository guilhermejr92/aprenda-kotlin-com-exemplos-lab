enum class Nivel {Básico, Intermediário, Avançado}

data class Usuario(val level: String, val skill: String, val vocação: String)

data class Planilha&Tutorial(val level: String, val duracao: Int, val nivel: Calculator)

data class Hunts(val nome: String, val dicas: List<MelhoresLocaisdeHunt>, val nivel: Calculator) {

    val classes = mutableListOf<Usuario>()
    
    fun cadastrar(usuario: Usuario) {
        cadastrar.add(usuario)
    }
    
    fun imprimirListaCadastrar(){
        for(user in cadastrar){
            println(user.level)
        }
    }
    
    fun imprimirGradePlanilha&Tutorial(){
        for(cont in dicas){
            println("${cont.level} - ${cont.duracao}")
        }
    }
}

fun main() {
    
    val PlanilhaKnight = MelhoresLocaisdeHunt ("Do 0 ao 1000", 70, Nivel.Intermediário)
    val PlanilhaPaladin = MelhoresLocaisdeHunt("Do 0 ao 1000", 80, Nivel.Intermediário)
    val PlanilhaDruid = MelhoresLocaisdeHunt("Do 0 ao 1000", 90, Nivel.Avançado)
    val PlanilhaSorcerer = MelhoresLocaisdeHunt("Do 0 ao 1000", 90, Nivel.Avançado)
    
    val listMelhoresLocaisdeHunt = mutableListOf<Usuario>()
    listMelhoresLocaisdeHunt.add(PlanilhaKnight)
    listMelhoresLocaisdeHunt.add(PlanilhaPaladin)
    listMelhoresLocaisdeHunt.add(PlanilhaMage)
    listMelhoresLocaisdeHunt.add(PlanilhaSorcerer)
    
    val Calculator = Vocação("Tutorial Level e Skill", listMelhoresLocaisdeHunt, Nivel.Avançado)
    
    val Knight = Usuario("Char", "knight@zmail.com", "premium")
    val Paladin = Usuario("Char", "paladin@zmail.com", "premium")
    val Druid = Usuario("Char", "druid@zmail.com", "premium")
    val Sorcerer = Usuario("Char", "sorcerer@zmail.com", "premium")
    
    Calculator.cadastrar()
    Calculator.cadastrar()
    
    print("Calculator: ")
    println("${Calculator.level} - ${Calculator.nivel}")
    println(Calculator.imprimirGradeVocação())
    println()
    println("Opções de hunts: ")
    println(Calculator.imprimirOpçõesdehunts())
}
