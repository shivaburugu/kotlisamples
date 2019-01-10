fun startServer() : Nothing{
    while (true){
        listenToThePort()
    }
}

fun listenToThePort(){
    println("Listening to the port to read values")
}

fun setupServer(){
    startServer()
    println("Start Server")
}

fun main(){
    setupServer()
}