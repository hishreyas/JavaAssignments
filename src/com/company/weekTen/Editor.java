package com.company.weekTen;
import java.awt.event.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Editor extends JFrame implements ActionListener,ItemListener
{

    JRadioButton fy,sy,ty;
    JCheckBox music,sport,travelling;
    JCheckBox bold,italic,underline;
    JTextField name;
    JComboBox<String> fontList;
    JComboBox<Integer> sizeList;
    JLabel  nameField,classField,hobbiesField;
    ButtonGroup buttonGroup;

    JPanel classLayout,centerLayout,hobbiesLayout,fontLayout,topLayout,bottomLayout,sizeLayout,styleLayout;

    Editor()
    {

        //top layout

        topLayout=new JPanel();
        topLayout.setLayout(new FlowLayout());
        name=new JTextField(20);
        topLayout.add(new JLabel("Your Name:"));
        topLayout.add(name);


        //center layout
        centerLayout=new JPanel();
        centerLayout.setLayout(new FlowLayout());


        //class layout
        fy=new JRadioButton("FY");
        sy=new JRadioButton("SY");
        ty=new JRadioButton("TY");
        buttonGroup=new ButtonGroup();
        buttonGroup.add(fy);
        buttonGroup.add(sy);
        buttonGroup.add(ty);
        classLayout=new JPanel();
        classLayout.setLayout(new GridLayout(4,1));
        classLayout.add(new JLabel("Your Class"));
        classLayout.add(fy);
        classLayout.add(sy);
        classLayout.add(ty);

        //hobbies layout
        music=new JCheckBox("Music");
        travelling=new JCheckBox("Travelling");
        sport=new JCheckBox("Sports");
        hobbiesLayout=new JPanel();
        hobbiesLayout.setLayout(new GridLayout(4,1));
        hobbiesLayout.add(new JLabel("  Hobbies"));
        hobbiesLayout.add(music);
        hobbiesLayout.add(travelling);
        hobbiesLayout.add(sport);


        //sizeLayout
        sizeLayout=new JPanel();
        sizeLayout.setLayout(new FlowLayout());
        sizeList=new JComboBox<>(new Integer[]{10,12,16,24});
        sizeLayout.add(new JLabel("Size"));
        sizeLayout.add(sizeList);


        //font layout
        fontLayout=new JPanel();
        fontLayout.setLayout(new GridLayout(3,1));
        fontList= new JComboBox<>(new String[]{Font.SANS_SERIF,Font.MONOSPACED,Font.SERIF});
        fontLayout.add(new JLabel("Font"));
        fontLayout.add(fontList);
        fontLayout.add(sizeLayout);



        //style layout
        bold=new JCheckBox("Bold");
        italic=new JCheckBox("Italic");
        underline=new JCheckBox("Underline");
        styleLayout=new JPanel();
        styleLayout.setLayout(new GridLayout(4,1));
        styleLayout.add(new JLabel("Style"));
        styleLayout.add(bold);
        styleLayout.add(italic);
        styleLayout.add(underline);



        //adding four layout to center layout
        centerLayout.add(classLayout);
        centerLayout.add(hobbiesLayout);
        centerLayout.add(fontLayout);
        centerLayout.add(styleLayout);


        //bottom layout
        bottomLayout=new JPanel();
        bottomLayout.setLayout(new FlowLayout());
        bottomLayout.setBorder(BorderFactory.createCompoundBorder());
        nameField=new JLabel("Name:");
        classField=new JLabel("Class:");
        hobbiesField=new JLabel("Hobbies:");
        bottomLayout.add(nameField);
        bottomLayout.add(classField);
        bottomLayout.add(hobbiesField);



        fy.addActionListener(this);
        sy.addActionListener(this);
        ty.addActionListener(this);

        travelling.addActionListener(this);
        sport.addActionListener(this);
        music.addActionListener(this);

        fontList.addItemListener(this);
        sizeList.addItemListener(this);

        bold.addActionListener(this);
        italic.addActionListener(this);
        underline.addActionListener(this);


        name.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                nameField.setText("Name:"+name.getText()+"  |  ");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                nameField.setText("Name:"+name.getText()+"  |  ");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                nameField.setText("Name:"+name.getText()+"    |  ");
            }
        });


        setLayout(new BorderLayout());
        add(BorderLayout.NORTH,topLayout);
        add(BorderLayout.CENTER,centerLayout);
        add(BorderLayout.SOUTH,bottomLayout);
        setSize(700,300);
        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        String fontFamily=(String) fontList.getSelectedItem();
        Integer fontSize=(Integer) sizeList.getSelectedItem();

        Font font=new Font(fontFamily,Font.BOLD,fontSize==null?10:fontSize);



        if(bold.isSelected() && italic.isSelected() && underline.isSelected()){
            font.deriveFont(Font.BOLD|Font.ITALIC);
            Map attributes = font.getAttributes();
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            font.deriveFont(attributes);
        } else if(bold.isSelected() && italic.isSelected()){
           font= font.deriveFont(Font.BOLD|Font.ITALIC);
        } else if(bold.isSelected()){
           font= font.deriveFont(Font.BOLD);
        } else if(italic.isSelected()){
           font= font.deriveFont(Font.ITALIC);
        } else if(underline.isSelected()){
            Map attributes = font.getAttributes();
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            font=font.deriveFont(attributes);
        }

        nameField.setFont(font);
        classField.setFont(font);
        hobbiesField.setFont(font);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String fontFamily=(String) fontList.getSelectedItem();
        Integer fontSize=(Integer) sizeList.getSelectedItem();

        Font font=new Font(fontFamily,Font.BOLD,fontSize==null?10:fontSize);



        if(bold.isSelected()){
           font= font.deriveFont(Font.BOLD);
        }
        if(italic.isSelected()){
           font= font.deriveFont(Font.ITALIC);
        }
        if(bold.isSelected() && italic.isSelected()){
            font= font.deriveFont(Font.BOLD|Font.ITALIC);
        }
        if(underline.isSelected()){
            Map attributes = font.getAttributes();
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            font= font.deriveFont(attributes);
        }
        if(bold.isSelected() && italic.isSelected() && underline.isSelected()){
            font.deriveFont(Font.BOLD|Font.ITALIC);
            Map attributes = font.getAttributes();
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            font.deriveFont(attributes);
        }

        nameField.setFont(font);
        classField.setFont(font);
        hobbiesField.setFont(font);
        if(e.getSource() instanceof JRadioButton ) {
            classField.setText("Class:" + e.getActionCommand()+ "     |  ");
        }

        String hobbiesText="Hobbies:";
        if(music.isSelected()){
            if(!hobbiesText.equals("Hobbies:")){
                hobbiesText+=",";
            }
            hobbiesText+=music.getText();
        }
        if(sport.isSelected()){
            if(!hobbiesText.equals("Hobbies:")){
                hobbiesText+=",";
            }
            hobbiesText+=sport.getText();
        }
        if(travelling.isSelected()){
            if(!hobbiesText.equals("Hobbies:")){
                hobbiesText+=",";
            }
            hobbiesText+=travelling.getText();
        }
        hobbiesField.setText(hobbiesText+"     |   ");
    }

    public static void main(String args[])
    {
        new Editor();
    }
}
