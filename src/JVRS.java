import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class JVRS {
    private static final Color BG = new Color(13, 18, 27);
    private static final Color PANEL = new Color(24, 34, 48);
    private static final Color BLUE = new Color(0, 145, 220);
    private static final Color CYAN = new Color(35, 205, 235);
    private static final Color TEXT = new Color(235, 243, 250);
    private static final CardLayout pages = new CardLayout();
    private static JPanel content;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JVRS::showApp);
    }

    private static void showApp() {
        JFrame frame = new JFrame("JOÃO VITOR - MULTIMÍDIA JVRS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(1050, 680));
        frame.setSize(1220, 760);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(BG);
        frame.setLayout(new BorderLayout());

        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(new Color(9, 14, 22));
        header.setBorder(new EmptyBorder(18, 24, 18, 24));
        JLabel brand = new JLabel("JVRS  /  MULTIMÍDIA");
        brand.setForeground(CYAN);
        brand.setFont(new Font("Segoe UI", Font.BOLD, 22));
        JLabel status = new JLabel("CARBONO AZUL  •  CENTRAL MULTIMÍDIA");
        status.setForeground(new Color(155, 177, 198));
        status.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        header.add(brand, BorderLayout.WEST);
        header.add(status, BorderLayout.EAST);
        frame.add(header, BorderLayout.NORTH);

        JPanel nav = new JPanel();
        nav.setBackground(new Color(10, 17, 27));
        nav.setBorder(new EmptyBorder(18, 12, 18, 12));
        nav.setLayout(new BoxLayout(nav, BoxLayout.Y_AXIS));
        nav.setPreferredSize(new Dimension(205, 0));
        String[][] items = {
            {"⌂", "Início"}, {"▣", "Caminhão"}, {"⌁", "Bluetooth"},
            {"☎", "Telefone"}, {"♫", "Música"}, {"◎", "GPS"},
            {"▦", "Menu Apps"}, {"⚙", "Configurações"}
        };
        for (String[] item : items) {
            JButton b = new JButton(item[0] + "   " + item[1]);
            b.setHorizontalAlignment(SwingConstants.LEFT);
            b.setForeground(TEXT);
            b.setBackground(PANEL);
            b.setFont(new Font("Segoe UI", Font.BOLD, 14));
            b.setFocusPainted(false);
            b.setBorder(new CompoundBorder(new LineBorder(new Color(42, 66, 88)), new EmptyBorder(13, 14, 13, 10)));
            b.setMaximumSize(new Dimension(Integer.MAX_VALUE, 48));
            b.setAlignmentX(Component.LEFT_ALIGNMENT);
            b.addActionListener(e -> pages.show(content, item[1]));
            nav.add(b);
            nav.add(Box.createVerticalStrut(9));
        }
        frame.add(nav, BorderLayout.WEST);

        content = new JPanel(pages);
        content.setBackground(BG);
        content.setBorder(new EmptyBorder(26, 28, 26, 28));
        content.add(homePage(), "Início");
        for (String[] item : items) {
            if (!item[1].equals("Início")) content.add(infoPage(item[1]), item[1]);
        }
        frame.add(content, BorderLayout.CENTER);
        pages.show(content, "Início");
        frame.setVisible(true);
    }

    private static JPanel homePage() {
        JPanel p = new JPanel(new BorderLayout(0, 22));
        p.setOpaque(false);
        JLabel title = new JLabel("<html><span style='font-size:28pt'>Bem-vindo à MULTIMÍDIA JVRS</span><br><span style='color:#23cdee;font-size:13pt'>Sua viagem começa aqui</span></html>");
        title.setForeground(TEXT);
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        p.add(title, BorderLayout.NORTH);

        JPanel grid = new JPanel(new GridLayout(2, 2, 16, 16));
        grid.setOpaque(false);
        grid.add(tile("CAMINHÃO", "Painel de telemetria", "Integração ETS2 pendente"));
        grid.add(tile("BLUETOOTH", "Conexão com dispositivo", "Pareamento ainda não integrado"));
        grid.add(tile("MÚSICA", "Spotify e áudio", "Conexão de conta ainda não integrada"));
        grid.add(tile("NAVEGAÇÃO", "Mapas e rotas", "Fonte de mapas ainda não integrada"));
        p.add(grid, BorderLayout.CENTER);

        JLabel note = new JLabel("Versão inicial • Recursos externos serão ativados após integração e testes.");
        note.setForeground(new Color(150, 170, 190));
        note.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        p.add(note, BorderLayout.SOUTH);
        return p;
    }

    private static JPanel tile(String heading, String detail, String state) {
        JPanel card = new JPanel();
        card.setBackground(PANEL);
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBorder(new CompoundBorder(new LineBorder(new Color(0, 120, 185), 1), new EmptyBorder(22, 22, 22, 22)));
        JLabel h = new JLabel(heading);
        h.setForeground(CYAN);
        h.setFont(new Font("Segoe UI", Font.BOLD, 17));
        JLabel d = new JLabel(detail);
        d.setForeground(TEXT);
        d.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        JLabel s = new JLabel(state);
        s.setForeground(new Color(165, 185, 205));
        s.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        card.add(h); card.add(Box.createVerticalStrut(12)); card.add(d);
        card.add(Box.createVerticalStrut(10)); card.add(s);
        return card;
    }

    private static JPanel infoPage(String name) {
        JPanel p = new JPanel(new BorderLayout());
        p.setOpaque(false);
        JLabel heading = new JLabel(name.toUpperCase());
        heading.setForeground(CYAN);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 27));
        JLabel body = new JLabel("<html><div style='width:500px'>Esta área está preparada na interface JVRS.<br><br>A integração correspondente ainda precisa ser implementada e testada. Nenhuma conexão é simulada nesta versão.</div></html>");
        body.setForeground(TEXT);
        body.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p.add(heading, BorderLayout.NORTH);
        p.add(body, BorderLayout.CENTER);
        return p;
    }
}