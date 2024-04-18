import javax.swing.*

fun main() {
    SwingUtilities.invokeLater {
        val frame = JFrame("Kotlin Swing")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(300, 300)
        frame.setLocation(500, 500)

        val label = JLabel("Olá Kotlin");
        frame.add(label)

        frame.isVisible = true
    }
}
