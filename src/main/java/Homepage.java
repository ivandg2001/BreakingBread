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
        JButton continueButton = new JButton("Continua");
        continueButton.setFont(new Font("Arial", Font.PLAIN, 14));
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Azione da eseguire quando si clicca "Continua"
                JOptionPane.showMessageDialog(frame, "Hai cliccato Continua!");
                frame.dispose(); // Chiude la pagina iniziale

                // Puoi aprire una nuova finestra qui, se necessario
                openMainApplication();
            }
        });
        panel.add(continueButton, BorderLayout.SOUTH);

        // Aggiunta del pannello al frame
        frame.add(panel);
        frame.setVisible(true);
    }

    // Metodo per aprire la finestra principale dell'applicazione
    private static void openMainApplication() {
        JFrame mainFrame = new JFrame("Applicazione Principale");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600, 400);
        mainFrame.setLocationRelativeTo(null);

        JLabel mainLabel = new JLabel("Questa è la schermata principale.", JLabel.CENTER);
        mainFrame.add(mainLabel);

        mainFrame.setVisible(true);
    }
}

