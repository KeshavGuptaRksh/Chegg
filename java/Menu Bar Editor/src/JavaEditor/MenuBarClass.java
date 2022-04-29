package JavaEditor;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


public class MenuBarClass extends JMenuBar {
    JMenu m1, m2, m3;
    JTextArea textArea;
    public MenuBarClass() {

        m1 = new JMenu ("FILE");
        m2 = new JMenu ("Font");
        m3 = new JMenu ("Style");
        add(m1);
        add(m2);
        add(m3);


        //First Menu Item Options

        JMenuItem m11 = new JMenuItem("Load");
        m11.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent e)
        {System.out.println("Load");}
        });
        m1.add(m11);

        JMenuItem m12 = new JMenuItem("Save As");
        m12.addActionListener(new ActionListener ()
        { public void actionPerformed(ActionEvent e)
        {System.out.println("Save As");}
        });
        m1.add(m12);

        //Second Menu Item options

        JMenuItem m21 = new JMenuItem("Mono");
        m21.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
        {System.out.println("Mono");
            textArea.setFont(new Font(Font.MONOSPACED,Font.PLAIN,18));
        }
        });
        m2.add(m21);

        JMenuItem m22 = new JMenuItem("Serif");
        m22.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
        {System.out.println("Serif");
            textArea.setFont(new Font(Font.SERIF,Font.PLAIN,18));
        }
        });
        m2.add(m22);

        JMenuItem m23 = new JMenuItem("San-Serif");
        m23.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
        {System.out.println("San-Serif");
            textArea.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,18));
        }
        });
        m2.add(m23);

        //Third Menu Item Options

        JMenuItem m31 = new JMenuItem("Plain");
        m31.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
        {System.out.println("Plain");}
        });
        m3.add(m31);

        JMenuItem m32 = new JMenuItem("Italics");
        m32.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
        {System.out.println("Italics");}
        });
        m3.add(m32);

        JMenuItem m33 = new JMenuItem("Bold");
        m33.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
        {System.out.println("Bold");}
        });
        m3.add(m33);

    }

}