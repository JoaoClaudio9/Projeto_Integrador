/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.Criar;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import view.menu;

/**
 *
 * @author Aluno
 */
public class Criar2 extends javax.swing.JFrame {

    /**
     * Creates new form Criar2
     */
    public Criar2() {
        initComponents();        
        
        //Criando o frame Criar
        setTitle("Criar ");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        //Criando o Jpanel2
        JPanel painel2 = new JPanel(){
           @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imagemPanel = new ImageIcon("C:\\Users\\Aluno\\Desktop\\imagens integrador\\pag1.jpg");
                g.drawImage(imagemPanel.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        painel2.setBounds(200, 50, 700, 873); // Define posição e tamanho
        painel2.setOpaque(false); // Torna o painel transparente
        painel2.setLayout(null); // Define layout absoluto no painel
        
        // Adiciona um botão no painel para testes
        painel2.add(new JLabel("pagina1"));

        // Adiciona o painel ao JFrame
        getContentPane().add(painel2);
        
        // Configurando o fundo
        ImageIcon imagemBackground = new ImageIcon("C:\\Users\\Aluno\\Desktop\\imagens integrador\\MesaDecoradaPasta.png");
        JLabel labelBackground = new JLabel(imagemBackground);
        labelBackground.setBounds(0, 0, 1920, 1080);
        
        // Adiciona o fundo como último elemento
        getContentPane().add(labelBackground);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        NEX = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Pre = new javax.swing.JTextField();
        Vig = new javax.swing.JTextField();
        Agi = new javax.swing.JTextField();
        Int = new javax.swing.JTextField();
        For = new javax.swing.JTextField();
        Origens = new javax.swing.JComboBox<>();
        Classes = new javax.swing.JComboBox<>();
        Trilhas = new javax.swing.JComboBox<>();
        PV = new javax.swing.JTextField();
        SAN = new javax.swing.JTextField();
        pe = new javax.swing.JTextField();
        DEF = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jComboBox17 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox18 = new javax.swing.JComboBox<>();
        jComboBox19 = new javax.swing.JComboBox<>();
        jComboBox20 = new javax.swing.JComboBox<>();
        jComboBox21 = new javax.swing.JComboBox<>();
        jComboBox22 = new javax.swing.JComboBox<>();
        jComboBox23 = new javax.swing.JComboBox<>();
        jComboBox24 = new javax.swing.JComboBox<>();
        jComboBox25 = new javax.swing.JComboBox<>();
        jComboBox26 = new javax.swing.JComboBox<>();
        jComboBox27 = new javax.swing.JComboBox<>();
        jComboBox28 = new javax.swing.JComboBox<>();
        jComboBox29 = new javax.swing.JComboBox<>();
        jComboBox30 = new javax.swing.JComboBox<>();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 85, 168, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 85, 65, -1));

        NEX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEX%", "0%", "5%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%", "65%", "70%", "75%", "80%", "85%", "90%", "95%", "99%", "!!??%", " " }));
        NEX.setPreferredSize(new java.awt.Dimension(60, 20));
        NEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXActionPerformed(evt);
            }
        });
        getContentPane().add(NEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 86, 66, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Criar/info.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 85, 22, 22));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Criar/info.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 302, 22, 24));
        getContentPane().add(Pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 332, 46, 46));
        getContentPane().add(Vig, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 46, 46));
        getContentPane().add(Agi, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 156, 46, 45));

        Int.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntActionPerformed(evt);
            }
        });
        getContentPane().add(Int, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 220, 46, 46));

        For.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForActionPerformed(evt);
            }
        });
        getContentPane().add(For, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 220, 46, 46));

        Origens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Origens.setPreferredSize(new java.awt.Dimension(79, 22));
        Origens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrigensActionPerformed(evt);
            }
        });
        getContentPane().add(Origens, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 431, 233, 30));

        Classes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Classes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassesActionPerformed(evt);
            }
        });
        getContentPane().add(Classes, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 467, 241, 30));

        Trilhas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Aniquilador - (Combatente)", "Comandante de Campo - (Combatente)", "Operações Especiais - (Combatente)", "Guerreiro - (Combatente)", "Tropa de Choque - (Combatente)", "Atirador de Elite - (Especialista)", "Infiltrador - (Especialista)", "Médico de Campo - (Especialista)", "Negociador - (Especialista)", "Técnico - (Especialista)", "Conduíte - (Ocultista)", "Flagelador - (Ocultista)", "Graduado - (Ocultista)", "Intuitivo - (Ocultista)", "Lâmina Paranormal - (Ocultista)" }));
        Trilhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrilhasActionPerformed(evt);
            }
        });
        getContentPane().add(Trilhas, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 503, 241, 30));

        PV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PVActionPerformed(evt);
            }
        });
        getContentPane().add(PV, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 545, 57, 43));

        SAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SANActionPerformed(evt);
            }
        });
        getContentPane().add(SAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 546, 57, 40));

        pe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peActionPerformed(evt);
            }
        });
        getContentPane().add(pe, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 622, 54, 42));

        DEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEFActionPerformed(evt);
            }
        });
        getContentPane().add(DEF, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 631, 49, 50));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 70, 20));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 70, 20));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 70, 20));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 70, 20));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 70, 20));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 70, 20));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 70, 20));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 70, 20));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 70, 20));

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 70, 20));

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 70, 20));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 70, 20));

        jTextField12.setText("+");
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 30, -1));

        jTextField13.setText("+");
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 30, -1));

        jTextField14.setText("+");
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, 30, -1));

        jTextField15.setText("+");
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 30, -1));

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 70, 20));

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 70, 20));

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 70, 20));

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, 70, 20));

        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 70, 20));

        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, 70, 20));

        jComboBox23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 580, 70, 20));

        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 70, 20));

        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 70, 20));

        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox26, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 640, 70, 20));

        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 660, 70, 20));

        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 680, 70, 20));

        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox29, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 700, 70, 20));

        jComboBox30.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Treinado", "Veterano", "Expert" }));
        getContentPane().add(jComboBox30, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 720, 70, 20));

        jTextField16.setText("+");
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 30, -1));

        jTextField17.setText("+");
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 30, -1));

        jTextField18.setText("+");
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 30, -1));

        jTextField19.setText("+");
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 30, -1));

        jTextField20.setText("+");
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 30, -1));

        jTextField21.setText("+");
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, 30, -1));

        jTextField22.setText("+");
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 30, -1));

        jTextField23.setText("+");
        getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 30, -1));

        jTextField24.setText("+");
        getContentPane().add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 30, -1));

        jTextField25.setText("+");
        getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 30, -1));

        jTextField26.setText("+");
        getContentPane().add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 30, -1));

        jTextField27.setText("+");
        getContentPane().add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 30, -1));

        jTextField28.setText("+");
        getContentPane().add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 30, -1));

        jTextField29.setText("+");
        getContentPane().add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, 30, -1));

        jTextField30.setText("+");
        getContentPane().add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 30, -1));

        jTextField31.setText("+");
        getContentPane().add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 30, -1));

        jTextField32.setText("+");
        getContentPane().add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 620, 30, -1));

        jTextField33.setText("+");
        getContentPane().add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 30, -1));

        jTextField34.setText("+");
        getContentPane().add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 660, 30, -1));

        jTextField35.setText("+");
        getContentPane().add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 680, 30, -1));

        jTextField36.setText("+");
        getContentPane().add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 700, 30, -1));

        jTextField37.setText("+");
        getContentPane().add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 720, 30, -1));

        jTextField38.setText("Profissão");
        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, 80, 20));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Criar/info.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, 20, 20));

        jTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField39ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 770, 170, 20));
        getContentPane().add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 790, 170, 20));
        getContentPane().add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 810, 170, 20));
        getContentPane().add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 830, 170, 20));
        getContentPane().add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 850, 170, 20));
        getContentPane().add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 870, 170, 20));
        getContentPane().add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 770, 40, 20));
        getContentPane().add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 790, 40, 20));
        getContentPane().add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 810, 40, 20));
        getContentPane().add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 830, 40, 20));
        getContentPane().add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 850, 40, 20));
        getContentPane().add(jTextField50, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 870, 40, 20));
        getContentPane().add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 770, 40, 20));
        getContentPane().add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 790, 40, 20));
        getContentPane().add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 810, 40, 20));
        getContentPane().add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 830, 40, 20));
        getContentPane().add(jTextField55, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 850, 40, 20));
        getContentPane().add(jTextField56, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 870, 40, 20));

        jTextField57.setToolTipText("");
        getContentPane().add(jTextField57, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 770, 40, 20));

        jTextField58.setToolTipText("");
        getContentPane().add(jTextField58, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 790, 40, 20));

        jTextField59.setToolTipText("");
        getContentPane().add(jTextField59, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 810, 40, 20));

        jTextField60.setToolTipText("");
        getContentPane().add(jTextField60, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 830, 40, 20));

        jTextField61.setToolTipText("");
        getContentPane().add(jTextField61, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 850, 40, 20));

        jTextField62.setToolTipText("");
        getContentPane().add(jTextField62, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 870, 40, 20));
        getContentPane().add(jTextField63, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 770, 20, 20));
        getContentPane().add(jTextField64, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 790, 20, 20));
        getContentPane().add(jTextField65, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 810, 20, 20));
        getContentPane().add(jTextField66, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 830, 20, 20));
        getContentPane().add(jTextField67, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 850, 20, 20));
        getContentPane().add(jTextField68, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 870, 20, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void NEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NEXActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(
        this, 
        "Todo personagem possui um nível de exposição paranormal, ou\n" +
"NEX, que mede quanto de seu ser já foi exposto ao Outro Lado.\n" +
"Um personagem iniciante começa com NEX 5%, representando\n" +
"quaisquer experiências estranhas pelas quais ele tenha passado\n" +
"durante seu histórico.\n" +
"Conforme você participa de missões e encontra manifestações\n" +
"paranormais, seu NEX aumenta. O mestre define quando isso\n" +
"acontece, mas, via de regra, seu NEX aumenta em 5% a cada missão\n" +
"concluída com sucesso. Quanto maior seu NEX, mais experiente\n" +
"— e poderoso — você é.", 
        "o que é NEX:", 
        JOptionPane.INFORMATION_MESSAGE
        );
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(
        this, 
        "Personagens de Ordem Paranormal RPG possuem cinco atributos, que definem suas competências\n" +
"básicas: Agilidade, Força, Intelecto, Presença e Vigor. Atributos são medidos numericamente.\n" +
"Um valor 1 representa a média humana. Valores 2 ou 3 estão acima da média — um atleta de elite\n" +
"e um pesquisador de renome podem ter Força ou Intelecto nesse intervalo. Valores 4 ou 5\n" +
"representam indivíduos extraordinários — um medalhista olímpico ou vencedor do Nobel podem ter \n" +
"Força ou Intelecto nessa faixa. Já um valor 0 está abaixo da média — uma criança pode ter Força 0,\n" +
"enquanto um idoso de saúde frágil pode ter Vigor 0.\n" +
"\n" +
"Sempre que você faz um teste, rola uma quantidade de dados de vinte faces igual ao valor do atributo\n" +
"envolvido. Se você tem Força 3, por exemplo rola três dados em testes de Força e usa o melhor resultado\n" +
"— isso é anotado como 3O. Se você tem um atributo0, rola dois dados em testes daquele atributo, mas usa\n" +
"o pior resultado.", 
        "ATRIBUTOS", 
        JOptionPane.INFORMATION_MESSAGE
    );
        JOptionPane.showMessageDialog(
        this, 
        "Define sua coordenação motora, velocidade de reação e destreza manual. Uma pessoa com Agilidade elevada\n" +
"é rápida e tem movimentos precisos, como um ginasta ou dançarino. Agilidade é o atributo-base das\n" +
"perícias Acrobacia, Furtividade, Iniciativa, Crime, Pilotagem, Pontaria e Reflexos.", 
        "ATRIBUTO: Agilidade", 
        JOptionPane.INFORMATION_MESSAGE
    );
        JOptionPane.showMessageDialog(
        this, 
        "Determina sua potência muscular e habilidade atlética. Um personagem com Força alta tem grande capacidade\n" +
"física, seja por predisposição genética, treinamento constante ou modificação paranormal. Força é o\n" +
"atributo-base de Atletismo e Luta, além de ser aplicada em suas rolagens de dano corpo a corpo e com armas\n" +
"de arremesso." , 
        "ATRIBUTO: Força", 
        JOptionPane.INFORMATION_MESSAGE
    );
        JOptionPane.showMessageDialog(
        this, 
        "Mede seu raciocínio, memória e educação geral. Uma pessoa com Intelecto elevado tem raciocínio rápido e\n" +
"afiado, conhecimento amplo sobre diversos assuntos e habilidades que envolvem estudo, como conhecimento\n" +
"científico. Intelecto é o atributo-base de Atualidades, Ciências, Investigação, Medicina, Ocultismo,\n" +
"Profissão, Sobrevivência, Tática e Tecnologia. Além disso, você recebe treinamento em perícias adicionais\n" +
"igual ao seu Intelecto. Caso seu Intelecto aumente, você aprende uma perícia adicional para cada ponto.\n" +
"Por fim, o Intelecto afeta sua compreensão do Outro Lado e sua capacidade de racionalizar o paranormal,\n" +
"definindo o número de rituais que você pode aprender.",
        "ATRIBUTO: Intelecto", 
        JOptionPane.INFORMATION_MESSAGE
    );
        JOptionPane.showMessageDialog(
        this, 
        "Define seus sentidos, força de vontade e habilidades sociais. Um personagem com Presença alta é atento,\n" +
"determinado e possui boa lábia ou aparência. Pode ser uma figura agradável e descolada, ou séria e\n" +
"imponente.\n" +
"\n" +
"Presença é o atributo-base de Diplomacia, Enganação, Intimidação, Intuição, Percepção, Religião e Vontade,\n" +
"além de conceder pontos de esforço adicionais por nível de exposição (NEX).",
        "ATRIBUTO: Presença", 
        JOptionPane.INFORMATION_MESSAGE
    );
        JOptionPane.showMessageDialog(
        this, 
        "Determina sua saúde e resistência física. Uma pessoa com Vigor elevado pode ser grande e robusta, ou\n" +
"simplesmente ter bom fôlego e disposição.\n" +
"\n" +
"Vigor é o atributo-base de Fortitude, além de conceder pontos de vida adicionais por nível de exposição.\n" +
"Se você aumentar seu Vigor, seus PV aumentam de acordo retroativamente.\n" ,
        "ATRIBUTO: Vigor", 
        
        JOptionPane.INFORMATION_MESSAGE
    );
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SANActionPerformed

        if (Classe == Combatente){
            int san_base = 12;
            int san_posterior = 3;
        }
        
        if (Classe == Especialista){
            int san_base = 16;
            int san_posterior = 4;
        }
        
        if (Classe == Ocultista){
            int san_base = 20;
            int san_posterior = 5;
        }
        
    }//GEN-LAST:event_SANActionPerformed

    private void PVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PVActionPerformed
       
        int pv_base;
        int pv_posterior;
        
        if (Classe == Combatente){
            pv_base = 20 + Vig;
            pv_posterior = 4 + Vig;
        }
        
        if (Classe == Especialista){
            pv_base = 16 + Vig;
            pv_posterior = 3 + Vig;
        }
        
        if (Classe == Ocultista){
            pv_base = 12 + Vig;
            pv_posterior = 2 + Vig;
        }
             
    }//GEN-LAST:event_PVActionPerformed

    private void peActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_peActionPerformed

    private void OrigensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrigensActionPerformed

        // ORIGENS
    }//GEN-LAST:event_OrigensActionPerformed

    private void IntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntActionPerformed

    private void ForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForActionPerformed

        
    }//GEN-LAST:event_ForActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JOptionPane.showMessageDialog(
        this, 
        "Você sabe exercer uma profissão específica, como\n" +
"advogado, engenheiro, jornalista ou publicitário.\n" +
"Converse com o mestre para definir os detalhes de\n" +
"sua profissão e que tipos de testes você pode fazer\n" +
"com ela. Por exemplo, um advogado pode fazer um\n" +
"teste de Profissão para argumentar com a polícia,\n" +
"enquanto um administrador pode usar esta perícia\n" +
"para investigar os documentos de uma corporação" ,
        "PERICIA: Profissão", 
        JOptionPane.INFORMATION_MESSAGE
    );
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39ActionPerformed

    private void ClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassesActionPerformed
        // CLASSES
    }//GEN-LAST:event_ClassesActionPerformed

    private void TrilhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrilhasActionPerformed
        //TRILHA
    }//GEN-LAST:event_TrilhasActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void DEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEFActionPerformed
       
        DEF = 10 + Agi + 5;
        
    }//GEN-LAST:event_DEFActionPerformed

    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            Criar2 tela = new Criar2();
            tela.setVisible(true);
        });    
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Agi;
    private javax.swing.JComboBox<String> Classes;
    private javax.swing.JTextField DEF;
    private javax.swing.JTextField For;
    private javax.swing.JTextField Int;
    private javax.swing.JComboBox<String> NEX;
    private javax.swing.JComboBox<String> Origens;
    private javax.swing.JTextField PV;
    private javax.swing.JTextField Pre;
    private javax.swing.JTextField SAN;
    private javax.swing.JComboBox<String> Trilhas;
    private javax.swing.JTextField Vig;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JComboBox<String> jComboBox23;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox26;
    private javax.swing.JComboBox<String> jComboBox27;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JComboBox<String> jComboBox29;
    private javax.swing.JComboBox<String> jComboBox30;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField pe;
    // End of variables declaration//GEN-END:variables
}
