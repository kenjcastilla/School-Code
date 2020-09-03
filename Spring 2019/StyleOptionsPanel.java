/*Kendall Castilla
 * 26 April 2019
 * Homework 5, Part I
 */
package homework5;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel {
	
   private JLabel saying;
   private JCheckBox bold, italic;
   private JSlider slider;
   private JLabel sLabel;
   private JPanel controls, sPanel;

   //-----------------------------------------------------------------
   //  Sets up a panel with a label and some check boxes that
   //  control the style of the label's font.
   //-----------------------------------------------------------------
   public StyleOptionsPanel() {
	   
      saying = new JLabel("Say it with style!");
      saying.setFont(new Font("Helvetica", Font.PLAIN, 36));

      bold = new JCheckBox("Bold");
      bold.setBackground(Color.cyan);
      italic = new JCheckBox("Italic");
      italic.setBackground(Color.cyan);
      
      slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 0);
      slider.setMajorTickSpacing(10);
      slider.setMinorTickSpacing(5);
      slider.setPaintTicks(true);
      slider.setPaintLabels(true);
      slider.setAlignmentX(Component.BOTTOM_ALIGNMENT);
      
      sLabel = new JLabel("Font Size: 36");
      controls = new JPanel();
      controls.add(sLabel);
      controls.add(slider);
      
      SliderListener listen = new SliderListener();
      slider.addChangeListener(listen);

      StyleListener listener = new StyleListener();
      bold.addItemListener(listener);
      italic.addItemListener(listener);
      add(saying);
      add(bold);
      add(italic);
      add(controls);
      add(slider);
      setBackground(Color.cyan);
      setPreferredSize(new Dimension(500, 300));
   }

   //*****************************************************************
   //  Represents the listener for both check boxes.
   //*****************************************************************
   private class StyleListener implements ItemListener {
	   
      //--------------------------------------------------------------
      //  Updates the style of the label font style.
      //--------------------------------------------------------------
      public void itemStateChanged(ItemEvent event)
      {
         int style = Font.PLAIN;

         if (bold.isSelected())
            style = Font.BOLD;

         if (italic.isSelected())
            style += Font.ITALIC;

         saying.setFont(new Font("Helvetica", style, slider.getValue()));
      }
   }
   
   private class SliderListener implements ChangeListener {
	   private int size;
	   public void stateChanged(ChangeEvent event) {
		   size = slider.getValue();
		   int style = Font.PLAIN;
		   
		   if(bold.isSelected())
			   style = Font.BOLD;
		   if (italic.isSelected())
			   style = Font.ITALIC;
		   
		   sLabel.setText("Font Size: " + size);
		   saying.setFont(new Font("Helvetica", style, size));
	   }
   }
}		
