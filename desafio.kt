enum class Nivel {Básico, Intermediário, Avançado}

data class Usuario(val level: String, val skill: String, val tipoVocação: String)

data class Planilha(val level: String, val duracao: Int, val nivel: Nivel)

data class Hunts(val nome: String, val dicas: List<Planilha>, val nivel: Nivel) {

    val classes = mutableListOf<Usuario>()
    
    fun cadastrar(usuario: Usuario) {
        classes.add(usuario)
    }
    
    fun imprimirListaClasses(){
        for(user in classes){
            println(user.level)
        }
    }
    
    fun imprimirGradeHunts(){
        for(cont in dicas){
            println("${cont.level} - ${cont.duracao}")
        }
    }
}

fun main() {
    
    val ModuloKnight = Planilha ("Do 0 ao 1000", 70, Nivel.Intermediário)
    val ModuloPaladin = Planilha ("Do 0 ao 1000", 80, Nivel.Intermediário)
    val ModuloDruid = Planilha ("Do 0 ao 1000", 90, Nivel.Avançado)
    val ModuloSorcerer = Planilha ("Do 0 ao 1000", 90, Nivel.Avançado)
    
    val listDicas = mutableListOf<Planilha>()
    listDicas.add(ModuloKnight)
    listDicas.add(ModuloPaladin)
    listDicas.add(ModuloDruid)
    listDicas.add(ModuloSorcerer)
    
    val Hunts = Hunts("Tutorial Level Up", listDicas, Nivel.Avançado)
    
    val Knight = Usuario("Knight", "knight@zmail.com", "premium")
    val Paladin = Usuario("Paladin", "paladin@zmail.com", "premium")
    val Druid = Usuario("Druid", "druid@zmail.com", "premium")
    val Sorcerer = Usuario("Sorcerer", "sorcerer@zmail.com", "premium")
    
    Hunts.cadastrar(Knight)
    Hunts.cadastrar(Druid)
    Hunts.cadastrar(Sorcerer)
    Hunts.cadastrar(Paladin)
    
    print("Hunts: ")
    println("${Hunts.nome} - ${Hunts.nivel}")
    println("Syllabus: ")
    println(Hunts.imprimirGradeHunts())
    println()
    println("Opções de hunts: ")
    println(Hunts.imprimirGradeHunts())
}
