import java.net.*

fun main() {
    print("Address: ")
    val address = readln()
    //(21,80,443,53)
    val portList =  21..443

    for (port: Int in portList){
        try {
            val socket = Socket()
            val netSocket = InetSocketAddress(address,port)
            socket.connect(netSocket,1000)
            socket.close()
            println("Port $port is open")
        }catch (error: Exception){
        }
    }
}