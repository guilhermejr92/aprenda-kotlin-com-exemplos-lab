// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { EASY, MEDIUM, HARD }

class User

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<User>()
    
    fun matricular(usuario: User) {
        TODO("Utilize o parâmetro $user para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
