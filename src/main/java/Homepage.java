import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage {
    public static void main(String[] args) {
        // Creazione del frame principale
        JFrame frame = new JFrame("Pagina Iniziale");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Centra la finestra sullo schermo

        // Creazione del pannello principale
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Etichetta di benvenuto
        JLabel welcomeLabel = new JLabel("Benvenuto nell'applicazione!", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(welcomeLabel, BorderLayout.CENTER);

        // Pulsante per continuare
        JButton responsabileButton = new JButton("Responsabile");
        responsabileButton.setFont(new Font("Arial", Font.PLAIN, 14));
        responsabileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Azione da eseguire quando si clicca "Continua"
                JOptionPane.showMessageDialog(frame, "Hai cliccato Continua!");
                frame.dispose(); // Chiude la pagina iniziale

                // Puoi aprire una nuova finestra qui, se necessario

            }
        });

        JButton ricercatoreButton = new JButton("Ricercatore");
        ricercatoreButton.setFont(new Font("Arial", Font.PLAIN, 14));
        ricercatoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Azione da eseguire quando si clicca "Continua"
                JOptionPane.showMessageDialog(frame, "Hai cliccato Continua!");
                frame.dispose(); // Chiude la pagina iniziale

                // Puoi aprire una nuova finestra qui, se necessario

            }
        });

        panel.add(responsabileButton, BorderLayout.SOUTH);

        // Aggiunta del pannello al frame
        frame.add(panel);
        frame.setVisible(true);
    }


}

