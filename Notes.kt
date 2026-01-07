import java.io.File

fun addNote(note: String) {
    File("notes.txt").appendText(note + "\n")
}

fun viewNotes() {
    val file = File("notes.txt")
    if (!file.exists()) {
        println("No notes found")
        return
    }
    file.forEachLine { println(it) }
}

fun main() {
    println("1. Add note")
    println("2. View notes")
    print("Choose option: ")
    val choice = readLine()

    when (choice) {
        "1" -> {
            print("Enter note: ")
            val note = readLine() ?: ""
            addNote(note)
            println("Note saved")
        }
        "2" -> viewNotes()
        else -> println("Invalid option")
    }
}
