import com.formdev.flatlaf.FlatDarkLaf;
import gui.Window;
import services.MoneyService;

import javax.swing.*;

public class App {

    public static void main(String[] args) throws Exception {
        FlatDarkLaf.setup();
        SwingUtilities.invokeLater(Window::new);
        MoneyService.updateDollarEquivalenceOfCoins();
    }

}