package applicationInterface;
import javax.swing.*;

public class MainWindow {

    private int xDimension;
    private int yDimension;

    public MainWindow(int xDimension, int yDimension) {

        this.xDimension = xDimension;
        this.yDimension = yDimension;

        // create new JFrame Instance
        JFrame mainframe = new JFrame();
        mainframe.setLayout(null);
        mainframe.setSize(this.xDimension, this.yDimension);
        mainframe.setVisible(true);

    }

}
