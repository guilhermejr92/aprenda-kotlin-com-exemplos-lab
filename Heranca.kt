open class Automovel (nome: String, ano: Int){
    val nome: String
    val ano: Int
    init{
        this.nome = nome
        this.ano = ano
    }
    open fun acelerar(velocidade: Int) = println("Acelerando esse automovel $velocidade")
    
    override fun toString() = "Automovel $nome, ano: $ano"
}
class Carro (nome: String, ano: Int): Automovel(nome, ano){
    override fun acelerar(velocidade: Int) = println("Acelerando esse carro $velocidade")
}
fun main (args: Array<String>){
    val c1 = Carro("Chevrolet Impala ",1967)
    println(c1)
    c1.acelerar(1000)
}