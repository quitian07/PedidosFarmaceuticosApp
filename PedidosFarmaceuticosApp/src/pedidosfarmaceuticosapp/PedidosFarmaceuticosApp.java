package pedidosfarmaceuticosapp;

import pedidosfarmaceuticosapp.ui.MainWindow;
import javax.swing.SwingUtilities;

public class PedidosFarmaceuticosApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow mainWindow = new MainWindow();
                mainWindow.setVisible(true);
            }
        });
    }
}