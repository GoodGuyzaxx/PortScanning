import java.net.*

fun main() {
    val portList =  arrayOf(21,80,443,53)

    for (port: Int in portList){
        try {
            val socket = Socket()
            val netSocket = InetSocketAddress("192.168.1.1",port)
            socket.connect(netSocket,1000)
            socket.close()
            println("Port $port is open")
        }catch (error: Exception){
            println("Port Error ${error.message}")
        }
    }
}