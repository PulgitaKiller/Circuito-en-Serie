package main;

import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.metal.MetalSliderUI;
/**
 *
 * @author Paul Meza
 * 
 */
public class Circuito extends JFrame{
    
    private Calculadora c;
    //Entrada
    private JLabel lblNumFuente;
    private JLabel lblFuenteVol;
    private JLabel lblFuente1;
    private JLabel lblFuente2;
    private JLabel lblFuente3;
    private JLabel lblFuente4;
    private JLabel lblNumResistencia;
    private JLabel lblOhmResistencia;
    private JLabel lblResistencia1;
    private JLabel lblResistencia2;
    private JLabel lblResistencia3;
    private JLabel lblResistencia4;
    private JLabel lblResistencia5;
    private JLabel lblResistencia6;
    private JSlider sldFuentes;
    private JTextField txtFuente1;
    private JTextField txtFuente2;
    private JTextField txtFuente3;
    private JTextField txtFuente4;
    private JSlider sldResistencias;
    private JTextField txtResistencia1;
    private JTextField txtResistencia2;
    private JTextField txtResistencia3;
    private JTextField txtResistencia4;
    private JTextField txtResistencia5;
    private JTextField txtResistencia6;
    private JComboBox cbxIntensidad;
    private JTextField txtIntensidad;
    private JLabel lblIntensidadAmp;
    //Titulos
    private JLabel lblTitulo;
    private JLabel lblFuente;
    private JLabel lblResistencia;
    private JLabel lblIntensidad;
    //Botones
    private JButton btnCalcular;
    private JButton btnLimpiar;
    //Resultado
    private JTextArea txaResultados;
    private JLabel lblResultado;

    public Circuito(){
        
        //Tamaño de la Ventana
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((screenSize.width - this.getWidth()) / 4,
                (screenSize.height - this.getHeight()) / 6);
        this.setSize(720, 480);
        //Cerrar Ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Barra de Tarea
        this.setTitle("Calculadora de Circuitos");
        ImageIcon icon = new ImageIcon("src/resources/icono.png");
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        
        lblTitulo = new JLabel("Circuitos en Serie");
        lblTitulo.setForeground(Color.red);
        lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
        lblTitulo.setBounds(275, 0, 350, 45);
        
        lblFuente = new JLabel("Fuente");
        lblFuente.setForeground(Color.blue);
        lblFuente.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        lblFuente.setBounds(207, 35, 100, 30);

        lblNumFuente = new JLabel("Núm de Fuentes");
        lblNumFuente.setForeground(new Color(0, 153, 0));
        lblNumFuente.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNumFuente.setBounds(95, 55, 150, 30);

        sldFuentes = new JSlider(JSlider.HORIZONTAL, 1, 4, 1);
        sldFuentes.setMajorTickSpacing(1);
        sldFuentes.setMinorTickSpacing(1);
        sldFuentes.setPaintTicks(true);
        sldFuentes.setPaintLabels(true);
        sldFuentes.setBounds(90, 85, 125, 70);
        sldFuentes.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(sldFuentes.getValue() == 1){
                    txtFuente1.setEnabled(true);
                    txtFuente2.setEnabled(false);
                    txtFuente2.setText("");
                    txtFuente3.setEnabled(false);
                    txtFuente3.setText("");
                    txtFuente4.setEnabled(false);
                    txtFuente4.setText("");
                }
                if(sldFuentes.getValue() == 2){
                    txtFuente1.setEnabled(true);
                    txtFuente2.setEnabled(true);
                    txtFuente3.setEnabled(false);
                    txtFuente3.setText("");
                    txtFuente4.setEnabled(false);
                    txtFuente4.setText("");
                }
                if(sldFuentes.getValue() == 3){
                    txtFuente1.setEnabled(true);
                    txtFuente2.setEnabled(true);
                    txtFuente3.setEnabled(true);
                    txtFuente4.setEnabled(false);
                    txtFuente4.setText("");
                }
                if(sldFuentes.getValue() == 4){
                    txtFuente1.setEnabled(true);
                    txtFuente2.setEnabled(true);
                    txtFuente3.setEnabled(true);
                    txtFuente4.setEnabled(true);
                }
            }
        });

        lblFuenteVol = new JLabel("Voltaje de las Fuentes");
        lblFuenteVol.setForeground(new Color(0, 153, 0));
        lblFuenteVol.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblFuenteVol.setBounds(220, 55, 200, 30);

        txtFuente1 = new JTextField();
        txtFuente1.setBounds(220, 85, 75, 30);
        txtFuente1.setEnabled(false);
        txtFuente1.setHorizontalAlignment(JTextField.CENTER);
        txtFuente1.setToolTipText("Voltaje de la Fuente 1 en V");
        txtFuente1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //solo acepta numeros
                char c = ke.getKeyChar();
                if(!Character.isDigit(c)&& c != '.'){
                    ke.consume();
                }
                if(c == '.' && txtFuente1.getText().contains(".")){
                    ke.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }});
                
        lblFuente1 = new JLabel("Fuente 1");
        lblFuente1.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
        lblFuente1.setBounds(235, 105, 100, 30);

        txtFuente2 = new JTextField();
        txtFuente2.setBounds(300, 85, 75, 30);
        txtFuente2.setEnabled(false);
        txtFuente2.setHorizontalAlignment(JTextField.CENTER);
        txtFuente2.setToolTipText("Voltaje de la Fuente 2 en V");
        txtFuente2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //solo acepta numeros
                char c = ke.getKeyChar();
                if(!Character.isDigit(c)&& c != '.'){
                    ke.consume();
                }
                if(c == '.' && txtFuente2.getText().contains(".")){
                    ke.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }});

        lblFuente2 = new JLabel("Fuente 2");
        lblFuente2.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
        lblFuente2.setBounds(315, 105, 100, 30);

        txtFuente3 = new JTextField();
        txtFuente3.setBounds(220, 125, 75, 30);
        txtFuente3.setEnabled(false);
        txtFuente3.setHorizontalAlignment(JTextField.CENTER);
        txtFuente3.setToolTipText("Voltaje de la Fuente 3 en V");
        txtFuente3.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //solo acepta numeros
                char c = ke.getKeyChar();
                if(!Character.isDigit(c)&& c != '.'){
                    ke.consume();
                }
                if(c == '.' && txtFuente3.getText().contains(".")){
                    ke.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }});
        
        lblFuente3 = new JLabel("Fuente 3");
        lblFuente3.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
        lblFuente3.setBounds(235, 145, 100, 30);

        txtFuente4 = new JTextField();
        txtFuente4.setBounds(300, 125, 75, 30);
        txtFuente4.setEnabled(false);
        txtFuente4.setHorizontalAlignment(JTextField.CENTER);
        txtFuente4.setToolTipText("Voltaje de la Fuente 4 en V");
        txtFuente4.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //solo acepta numeros
                char c = ke.getKeyChar();
                if(!Character.isDigit(c)&& c != '.'){
                    ke.consume();
                }
                if(c == '.' && txtFuente4.getText().contains(".")){
                    ke.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }});

        lblFuente4 = new JLabel("Fuente 4");
        lblFuente4.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
        lblFuente4.setBounds(315, 145, 100, 30);

        lblResistencia = new JLabel("Resistencia");
        lblResistencia.setForeground(Color.blue);
        lblResistencia.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        lblResistencia.setBounds(500, 35, 100, 30);

        lblNumResistencia = new JLabel("Núm de Resistencias");
        lblNumResistencia.setForeground(new Color(0, 153, 0));
        lblNumResistencia.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNumResistencia.setBounds(400, 55, 200, 30);

        sldResistencias = new JSlider(JSlider.HORIZONTAL, 1, 6, 1);
        sldResistencias.setBounds(413, 85, 125, 70);
        sldResistencias.setMajorTickSpacing(1);
        sldResistencias.setMinorTickSpacing(1);
        sldResistencias.setPaintTicks(true);
        sldResistencias.setPaintLabels(true);
        sldResistencias.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // TODO Auto-generated method stub
                int numResistencias = sldResistencias.getValue();
                switch(numResistencias){
                    case 1:
                        txtResistencia1.setEnabled(true);
                        txtResistencia2.setEnabled(false);
                        txtResistencia2.setText("");
                        txtResistencia3.setEnabled(false);
                        txtResistencia3.setText("");
                        txtResistencia4.setEnabled(false);
                        txtResistencia4.setText("");
                        txtResistencia5.setEnabled(false);
                        txtResistencia5.setText("");
                        txtResistencia6.setEnabled(false);
                        txtResistencia6.setText("");
                        break;
                    case 2:
                        txtResistencia1.setEnabled(true);
                        txtResistencia2.setEnabled(true);
                        txtResistencia3.setEnabled(false);
                        txtResistencia3.setText("");
                        txtResistencia4.setEnabled(false);
                        txtResistencia4.setText("");
                        txtResistencia5.setEnabled(false);
                        txtResistencia5.setText("");
                        txtResistencia6.setEnabled(false);
                        txtResistencia6.setText("");
                        break;
                    case 3:
                        txtResistencia1.setEnabled(true);
                        txtResistencia2.setEnabled(true);
                        txtResistencia3.setEnabled(true);
                        txtResistencia4.setEnabled(false);
                        txtResistencia4.setText("");
                        txtResistencia5.setEnabled(false);
                        txtResistencia5.setText("");
                        txtResistencia6.setEnabled(false);
                        txtResistencia6.setText("");
                        break;
                    case 4:
                        txtResistencia1.setEnabled(true);
                        txtResistencia2.setEnabled(true);
                        txtResistencia3.setEnabled(true);
                        txtResistencia4.setEnabled(true);
                        txtResistencia5.setEnabled(false);
                        txtResistencia5.setText("");
                        txtResistencia6.setEnabled(false);
                        txtResistencia6.setText("");
                        break;
                    case 5:
                        txtResistencia1.setEnabled(true);
                        txtResistencia2.setEnabled(true);
                        txtResistencia3.setEnabled(true);
                        txtResistencia4.setEnabled(true);
                        txtResistencia5.setEnabled(true);
                        txtResistencia6.setEnabled(false);
                        txtResistencia6.setText("");
                        break;
                    case 6:
                        txtResistencia1.setEnabled(true);
                        txtResistencia2.setEnabled(true);
                        txtResistencia3.setEnabled(true);
                        txtResistencia4.setEnabled(true);
                        txtResistencia5.setEnabled(true);
                        txtResistencia6.setEnabled(true);
                        break;
                }
            }});

        lblOhmResistencia = new JLabel("Ohmios de Resistencias");
        lblOhmResistencia.setForeground(new Color(0, 153, 0));
        lblOhmResistencia.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblOhmResistencia.setBounds(545, 55, 200, 30);

        txtResistencia1 = new JTextField();
        txtResistencia1.setBounds(545, 85, 75, 30);
        txtResistencia1.setEnabled(false);
        txtResistencia1.setHorizontalAlignment(JTextField.CENTER);
        txtResistencia1.setToolTipText("Resistencia 1 en Ohmios");
        txtResistencia1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //solo acepta numeros
                char c = ke.getKeyChar();
                if(!Character.isDigit(c)&& c != '.'){
                    ke.consume();
                }
                if(c == '.' && txtResistencia1.getText().contains(".")){
                    ke.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }});

        lblResistencia1 = new JLabel("Resistencia 1");
        lblResistencia1.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
        lblResistencia1.setBounds(550, 105, 100, 30);

        txtResistencia2 = new JTextField();
        txtResistencia2.setBounds(625, 85, 75, 30);
        txtResistencia2.setEnabled(false);
        txtResistencia2.setHorizontalAlignment(JTextField.CENTER);
        txtResistencia2.setToolTipText("Resistencia 2 en Ohmios");
        txtResistencia2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //solo acepta numeros
                char c = ke.getKeyChar();
                if(!Character.isDigit(c)&& c != '.'){
                    ke.consume();
                }
                if(c == '.' && txtResistencia2.getText().contains(".")){
                    ke.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }});

        lblResistencia2 = new JLabel("Resistencia 2");
        lblResistencia2.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
        lblResistencia2.setBounds(630, 105, 100, 30);

        txtResistencia3 = new JTextField();
        txtResistencia3.setBounds(545, 125, 75, 30);
        txtResistencia3.setEnabled(false);
        txtResistencia3.setHorizontalAlignment(JTextField.CENTER);
        txtResistencia3.setToolTipText("Resistencia 3 en Ohmios");
        txtResistencia3.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //solo acepta numeros
                char c = ke.getKeyChar();
                if(!Character.isDigit(c)&& c != '.'){
                    ke.consume();
                }
                if(c == '.' && txtResistencia3.getText().contains(".")){
                    ke.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }});
        
        lblResistencia3 = new JLabel("Resistencia 3");
        lblResistencia3.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
        lblResistencia3.setBounds(550, 145, 100, 30);

        txtResistencia4 = new JTextField();
        txtResistencia4.setBounds(625, 125, 75, 30);
        txtResistencia4.setEnabled(false);
        txtResistencia4.setHorizontalAlignment(JTextField.CENTER);
        txtResistencia4.setToolTipText("Resistencia 4 en Ohmios");
        txtResistencia4.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //solo acepta numeros
                char c = ke.getKeyChar();
                if(!Character.isDigit(c)&& c != '.'){
                    ke.consume();
                }
                if(c == '.' && txtResistencia4.getText().contains(".")){
                    ke.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }});
        
        lblResistencia4 = new JLabel("Resistencia 4");
        lblResistencia4.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
        lblResistencia4.setBounds(630, 145, 100, 30);

        txtResistencia5 = new JTextField();
        txtResistencia5.setBounds(545, 165, 75, 30);
        txtResistencia5.setEnabled(false);
        txtResistencia5.setHorizontalAlignment(JTextField.CENTER);
        txtResistencia5.setToolTipText("Resistencia 5 en Ohmios");
        txtResistencia5.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //solo acepta numeros
                char c = ke.getKeyChar();
                if(!Character.isDigit(c)&& c != '.'){
                    ke.consume();
                }
                if(c == '.' && txtResistencia5.getText().contains(".")){
                    ke.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }});

        lblResistencia5 = new JLabel("Resistencia 5");
        lblResistencia5.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
        lblResistencia5.setBounds(550, 185, 100, 30);

        txtResistencia6 = new JTextField();
        txtResistencia6.setBounds(625, 165, 75, 30);
        txtResistencia6.setEnabled(false);
        txtResistencia6.setHorizontalAlignment(JTextField.CENTER);
        txtResistencia6.setToolTipText("Resistencia 6 en Ohmios");
        txtResistencia6.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //solo acepta numeros
                char c = ke.getKeyChar();
                if(!Character.isDigit(c)&& c != '.'){
                    ke.consume();
                }
                if(c == '.' && txtResistencia6.getText().contains(".")){
                    ke.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }});

        lblResistencia6 = new JLabel("Resistencia 6");
        lblResistencia6.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
        lblResistencia6.setBounds(630, 185, 100, 30);

        lblIntensidad = new JLabel("Intensidad");
        lblIntensidad.setForeground(Color.blue);
        lblIntensidad.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        lblIntensidad.setBounds(190, 205, 100, 30);

        cbxIntensidad = new JComboBox();
        cbxIntensidad.setBounds(250, 235, 100, 30);
        cbxIntensidad.setToolTipText("¿Tiene intensidad el circuito?");
        cbxIntensidad.addItem("No");
        cbxIntensidad.addItem("Si");
        cbxIntensidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cbxIntensidad.getSelectedItem().equals("Si")){
                    txtIntensidad.setEnabled(true);
                }else{
                    txtIntensidad.setEnabled(false);
                    txtIntensidad.setText("");
                }
            }
        });

        txtIntensidad = new JTextField();
        txtIntensidad.setBounds(140, 235, 75, 30);
        txtIntensidad.setEnabled(false);
        txtIntensidad.setHorizontalAlignment(JTextField.CENTER);
        txtIntensidad.setToolTipText("Intensidad en Amperios");
        txtIntensidad.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //solo acepta numeros
                char c = ke.getKeyChar();
                if(!Character.isDigit(c)&& c != '.'){
                    ke.consume();
                }
                if(c == '.' && txtIntensidad.getText().contains(".")){
                    ke.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }});

        lblIntensidadAmp = new JLabel("¿Tiene intensidad el circuito?");
        lblIntensidadAmp.setFont(new Font("Comic Sans MS", Font.ITALIC, 10));
        lblIntensidadAmp.setBounds(170, 256, 150, 30);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 300, 100, 30);
        btnCalcular.setToolTipText("Calcular todo el circuito");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sldFuentes.getValue() == 1){
                    if(txtFuente1.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Fuente 1", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else if(sldFuentes.getValue() == 2){
                    if(txtFuente1.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Fuente 1", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtFuente2.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Fuente 2", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else if(sldFuentes.getValue() == 3){
                    if(txtFuente1.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Fuente 1", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtFuente2.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Fuente 2", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtFuente3.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Fuente 3", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else if(sldFuentes.getValue() == 4){
                    if(txtFuente1.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Fuente 1", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtFuente1.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Fuente 2", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtFuente3.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Fuente 3", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtFuente4.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Fuente 4", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                if(sldResistencias.getValue() == 1){
                    if(txtResistencia1.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 1", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else if(sldResistencias.getValue() == 2){
                    if(txtResistencia1.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 1", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia2.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 2", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else if(sldResistencias.getValue() == 3){
                    if(txtResistencia1.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 1", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia2.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 2", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia3.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 3", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else if(sldResistencias.getValue() == 4){
                    if(txtResistencia1.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 1", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia2.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 2", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia3.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 3", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia4.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 4", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else if(sldResistencias.getValue() == 5){
                    if(txtResistencia1.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 1", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia2.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 2", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia3.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 3", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia4.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 4", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia5.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 5", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else if(sldResistencias.getValue() == 6){
                    if(txtResistencia1.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 1", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia2.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 2", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia3.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 3", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia4.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 4", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia5.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 5", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else if(txtResistencia6.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la Resistencia 6", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                if(cbxIntensidad.getSelectedItem().equals("Si")){
                    if(txtIntensidad.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingrese la intensidad", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                c = new Calculadora();

                int fuentes = sldFuentes.getValue();
                String numFuentes = String.valueOf(fuentes);
                c.setNumFuente(numFuentes);

                if(sldFuentes.getValue() == 1){
                    String fuente1 = txtFuente1.getText();
                    c.setFuente1(fuente1);
                }else if(sldFuentes.getValue() == 2){
                    String fuente1 = txtFuente1.getText();
                    String fuente2 = txtFuente2.getText();
                    c.setFuente1(fuente1);
                    c.setFuente2(fuente2);
                }else if(sldFuentes.getValue() == 3){
                    String fuente1 = txtFuente1.getText();
                    String fuente2 = txtFuente2.getText();
                    String fuente3 = txtFuente3.getText();
                    c.setFuente1(fuente1);
                    c.setFuente2(fuente2);
                    c.setFuente3(fuente3);
                }else if(sldFuentes.getValue() == 4){
                    String fuente1 = txtFuente1.getText();
                    String fuente2 = txtFuente2.getText();
                    String fuente3 = txtFuente3.getText();
                    String fuente4 = txtFuente4.getText();
                    c.setFuente1(fuente1);
                    c.setFuente2(fuente2);
                    c.setFuente3(fuente3);
                    c.setFuente4(fuente4);
                }

                int resistencias = sldResistencias.getValue();
                String numResistencias = String.valueOf(resistencias);
                c.setNumResistecia(numResistencias);

                if(sldResistencias.getValue() == 1){
                    String resistencia1 = txtResistencia1.getText();
                    c.setResistencia1(resistencia1);
                }else if(sldResistencias.getValue() == 2){
                    String resistencia1 = txtResistencia1.getText();
                    String resistencia2 = txtResistencia2.getText();
                    c.setResistencia1(resistencia1);
                    c.setResistencia2(resistencia2);
                }else if(sldResistencias.getValue() == 3){
                    String resistencia1 = txtResistencia1.getText();
                    String resistencia2 = txtResistencia2.getText();
                    String resistencia3 = txtResistencia3.getText();
                    c.setResistencia1(resistencia1);
                    c.setResistencia2(resistencia2);
                    c.setResistencia3(resistencia3);
                }else if(sldResistencias.getValue() == 4){
                    String resistencia1 = txtResistencia1.getText();
                    String resistencia2 = txtResistencia2.getText();
                    String resistencia3 = txtResistencia3.getText();
                    String resistencia4 = txtResistencia4.getText();
                    c.setResistencia1(resistencia1);
                    c.setResistencia2(resistencia2);
                    c.setResistencia3(resistencia3);
                    c.setResistencia4(resistencia4);
                }else if(sldResistencias.getValue() == 5){
                    String resistencia1 = txtResistencia1.getText();
                    String resistencia2 = txtResistencia2.getText();
                    String resistencia3 = txtResistencia3.getText();
                    String resistencia4 = txtResistencia4.getText();
                    String resistencia5 = txtResistencia5.getText();
                    c.setResistencia1(resistencia1);
                    c.setResistencia2(resistencia2);
                    c.setResistencia3(resistencia3);
                    c.setResistencia4(resistencia4);
                    c.setResistencia5(resistencia5);
                }else if(sldResistencias.getValue() == 6){
                    String resistencia1 = txtResistencia1.getText();
                    String resistencia2 = txtResistencia2.getText();
                    String resistencia3 = txtResistencia3.getText();
                    String resistencia4 = txtResistencia4.getText();
                    String resistencia5 = txtResistencia5.getText();
                    String resistencia6 = txtResistencia6.getText();
                    c.setResistencia1(resistencia1);
                    c.setResistencia2(resistencia2);
                    c.setResistencia3(resistencia3);
                    c.setResistencia4(resistencia4);
                    c.setResistencia5(resistencia5);
                    c.setResistencia6(resistencia6);
                }

                if(cbxIntensidad.getSelectedItem() == "Si"){
                    c.setExisteIntesidad(true);
                    String intensidad = txtIntensidad.getText();
                    c.setIntesidad(intensidad);
                }else if(cbxIntensidad.getSelectedItem() == "No"){
                    c.setExisteIntesidad(false);
                    c.setIntesidad("");
                }

                c.calcular();
                
                txaResultados.setText(c.getcircuitoTotal());
                
            }
        });

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(250, 300, 100, 30);
        btnLimpiar.setToolTipText("Limpiar todos los campos");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sldFuentes.setValue(1);
                txtFuente1.setText("");
                txtFuente2.setText("");
                txtFuente3.setText("");
                txtFuente4.setText("");
                sldResistencias.setValue(1);
                txtResistencia1.setText("");
                txtResistencia2.setText("");
                txtResistencia3.setText("");
                txtResistencia4.setText("");
                txtResistencia5.setText("");
                txtResistencia6.setText("");
                txtIntensidad.setText("");
                cbxIntensidad.setSelectedIndex(0);
                txaResultados.setText("");     
            }
        });

        lblResultado = new JLabel("Resultado");
        lblResultado.setForeground(Color.blue);
        lblResultado.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        lblResultado.setBounds(500, 205, 100, 30);

        txaResultados = new JTextArea();

        JScrollPane scroll = new JScrollPane(txaResultados);
        scroll.setBounds(400, 235, 280, 200);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBorder(BorderFactory.createLineBorder(Color.blue));
        txaResultados.setEditable(false);
        txaResultados.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        txaResultados.setToolTipText("Resultados del Circuito");


        this.add(lblTitulo);
        this.add(lblFuente);
        this.add(lblNumFuente);
        this.add(lblFuenteVol);
        this.add(lblFuente1);
        this.add(lblFuente2);
        this.add(lblFuente3);
        this.add(lblFuente4);
        this.add(sldFuentes);
        this.add(txtFuente1);
        this.add(txtFuente2);
        this.add(txtFuente3);
        this.add(txtFuente4);
        this.add(lblResistencia);
        this.add(lblNumResistencia);
        this.add(lblOhmResistencia);
        this.add(lblResistencia1);
        this.add(lblResistencia2);
        this.add(lblResistencia3);
        this.add(lblResistencia4);
        this.add(lblResistencia5);
        this.add(lblResistencia6);
        this.add(sldResistencias);
        this.add(txtResistencia1);
        this.add(txtResistencia2);
        this.add(txtResistencia3);
        this.add(txtResistencia4);
        this.add(txtResistencia5);
        this.add(txtResistencia6);
        this.add(lblIntensidad);
        this.add(txtIntensidad);
        this.add(lblIntensidadAmp);
        this.add(btnCalcular);
        this.add(btnLimpiar);
        this.add(scroll);
        //this.add(txaResultados);
        this.add(lblResultado);
        this.add(cbxIntensidad);

        //fondo de la ventana con imagen
        JLabel fondo = new JLabel();
        ImageIcon imagen = new ImageIcon("src/resources/fondo.jpg");
        fondo.setIcon(imagen);
        fondo.setBounds(0, 0, 720, 480);
        this.add(fondo);

        this.setVisible(true);
        this.setLayout(null);
    }

    
    public static void main(String[] args) {
        Circuito c = new Circuito();

    }    
}
