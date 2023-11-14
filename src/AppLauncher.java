import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // displays our weather app gui
                new WeatherAppGui().setVisible(true);

                // System.out.println(WeatherApp.getLocationData("Bogota"));;

                // System.out.println(WeatherApp.getCurrentTime());
            }
        });
    }
}
