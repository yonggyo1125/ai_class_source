package exam05;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventHandler2 extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("클릭!");
    }
}
