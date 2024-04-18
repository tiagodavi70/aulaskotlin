import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

fun main() {
    SwingUtilities.invokeLater {
        val frame = JFrame("Exemplo botões")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(300, 300)

        val painel = JPanel()
        painel.layout = FlowLayout()

        val botao1 = JButton("Botão 1")
        val botao2 = JButton("Botão 2")

        botao1.addActionListener(BotaoListener())
        botao2.addActionListener {
            JOptionPane.showMessageDialog(null, "Botão 2: Click!")
        }

        painel.add(botao1)
        painel.add(botao2)

        frame.add(painel)
        frame.isVisible = true
    }
}

class BotaoListener: ActionListener {
    override fun actionPerformed(e: ActionEvent) {
        JOptionPane.showMessageDialog(null, "Botão 1: Click!")
    }
}
