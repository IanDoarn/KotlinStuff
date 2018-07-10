import java.util.Random

val random  = Random()

fun main(args: Array<String>) {

    println("Type a question, receive an answer. Type `exit` to quit.")

    while(true) {
        println("What say thee?")
        print(">> ")

        val q: String = readLine().toString()

        if(q != "exit")
            if(checkQuestion(q))
                println(response(rand(0, 19)))
            else
                println("That wasn't a question!")
        else
            break
    }
}

fun checkQuestion(q: String) : Boolean {
    if(q.substring(q.length - 1) != "?")
        return false
    return true
}

fun response(index: Int) : String {
    val responses = arrayOf(
        "It is certain.",
        "It is decidedly so.",
        "Without a doubt.",
        "Yes - definitely.",
        "You may rely on it.",
        "As I see it, yes.",
        "Most likely.",
        "Outlook good.",
        "Yes.",
        "Signs point to yes.",
        "Reply hazy, try again.",
        "Ask again later.",
        "Better not tell you now.",
        "Cannot predict now.",
        "Concentrate and ask again.",
        "Don't count on it.",
        "My reply is no.",
        "My sources say no.",
        "Outlook not so good.",
        "Very doubtful."
    )
    return responses[index]
}

fun rand(from: Int, to: Int) : Int {
    return random.nextInt(to - from) + from
}