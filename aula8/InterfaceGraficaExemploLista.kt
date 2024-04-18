import java.awt.BorderLayout
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.*

fun main() {
    SwingUtilities.invokeLater {
        val frame = JFrame("Exemplo botões")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(300, 300)

        val painel = JPanel()
        painel.layout = BoxLayout(painel, BoxLayout.Y_AXIS)
        painel.border = BorderFactory.createEmptyBorder(30, 30, 30, 30)

        val items: List<Int> = listOf(1,2,3,4,5)

        items.forEach {
            val label = JLabel("Item $it")
            label.border = BorderFactory.createEmptyBorder(50, 20, 10, 0)

            label.addMouseListener(object: MouseAdapter() {
                override fun mouseClicked(e: MouseEvent?) {
                    JOptionPane.showMessageDialog(frame, "Clicou no Item $it")
                }
            })

            painel.add(label)
        }

        val scrollPane = JScrollPane(painel)
        frame.add(scrollPane, BorderLayout.CENTER)

        frame.add(painel)
        frame.isVisible = true
    }
}