package com.mycompany.scrabble2;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Este es la clase mayor donde se genera todo el tablero grafico y hace que
 * funcione el scrabble
 *
 * @author Juan Esteban Jaramillo, Samuel Palacio, Santiago Rodriguez
 * @version 2021 05 29
 */
public class Scrabble extends javax.swing.JFrame {

    /**
     * Creates new form Scrabble
     */
    /**
     * Este constructor llama dos metodos donde se crean la matriz de botones y
     * donde se crean los otros objetos graficos
     */
    public Scrabble() {
        initComponents();
        setMatrix();
    }

    /**
     * este constructos nos crea un diccionario
     *
     * @param diccionario diccionario que se usa para el scrabble
     */
    public Scrabble(Diccionario diccionario) {
        this.diccionario = diccionario;
    }

    private int FILS = 16;
    private int COLS = 16;
    JButton[][] CUADRO = new JButton[FILS][COLS];
    private int turn = 0;
    private String jugador1;
    private String jugador2;
    private String nombre = "";
    private Jugador j1;
    private Jugador j2;
    private boolean validacion = true;
    private boolean validacionPalabra = true;
    private boolean cruzado = false;
    Diccionario diccionario;
    private ArrayList<String> palabrasTablero = new ArrayList<String>();

    /**
     * este metodo crea la cuadricula de botones que se usa para poner la letras
     * del scrabble
     */
    public void setMatrix() {
        int x = 0;
        int y = 0;
        for (int i = 0; i < CUADRO.length; i++) {
            for (int j = 0; j < CUADRO[0].length; j++) {
                JButton boton = new JButton();
                boton.setSize(46, 41);
                boton.setLocation((46 * i), (41 * j));
                CUADRO[i][j] = boton;
                boton.setRolloverEnabled(false);
                boton.setBackground(new Color(4, 156, 96));
                this.add(boton);
                if (j == 0) {
                    boton.setText(x + "");
                    x++;
                    boton.setBackground(new Color(255, 255, 255));
                }
                if (i == 0) {
                    boton.setText(y + "");
                    y++;
                    boton.setBackground(new Color(255, 255, 255));
                }

            }
        }

        jButtonEnterColumn.setVisible(false);
        jButtonEnterInput.setVisible(false);
        jButtonFinalizar.setVisible(false);
        lista1.setVisible(false);
        jTextField1.setVisible(false);
        jScrollPane1.setVisible(false);
    }

    /**
     * Se llama a este método desde dentro del constructor para inicializar el
     * formulario. ADVERTENCIA: NO modifique este código. El contenido de este
     * método es siempre regenerado por el Editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEnterInput = new javax.swing.JButton();
        jButtonStart = new javax.swing.JButton();
        jButtonEnterColumn = new javax.swing.JButton();
        jButtonFinalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(752, 870));

        jButtonEnterInput.setText("Enter");
        jButtonEnterInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterInputActionPerformed(evt);
            }
        });

        jButtonStart.setText("Jugar");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        jButtonEnterColumn.setText("Enter");
        jButtonEnterColumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterColumnActionPerformed(evt);
            }
        });

        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lista1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEnterInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addGap(48, 48, 48)
                        .addComponent(jButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEnterColumn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonFinalizar)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(590, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEnterInput)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEnterColumn)
                            .addComponent(jButtonFinalizar))
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este metodo inicia el juego del scrabble mostrando todos los botones y
     * demas cosas que se necesitan
     *
     * @param evt evento del click
     */
    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        // TODO add your handling code here:
        jButtonEnterColumn.setVisible(true);
        jButtonEnterInput.setVisible(true);
        jButtonFinalizar.setVisible(true);
        lista1.setVisible(true);
        jTextField1.setVisible(true);
        jScrollPane1.setVisible(true);
        jButtonStart.setVisible(false);
        jugador1 = JOptionPane.showInputDialog(null, "Escriba el nombre del Jugador 1", null);
        jugador2 = JOptionPane.showInputDialog(null, "Escriba el nombre del Jugador 2", null);
        j1 = new Jugador(jugador1);
        j2 = new Jugador(jugador2);
        if (turn == 1 || turn == 0) {
            nombre = jugador1;
        } else if (turn == 2) {
            nombre = jugador2;
        }
        jLabel1.setText("<html><p>Turno de " + nombre + "</p><p>Ingrese las letras que tiene en la mano sin espacios</p></html>");

    }//GEN-LAST:event_jButtonStartActionPerformed

    /**
     * este metodo se ingresa las letras de cada jugador y llama las clases de
     * diccionario y lettercombinations para traer las mejores 10 o menos
     * palabas con las letras dadas y mostrarlas en el grafico
     *
     * @param evt evento donde se llama al metodo
     */
    private void jButtonEnterInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterInputActionPerformed
        Diccionario diccionario = new Diccionario();
        diccionario.leerDiccionario("diccionario.txt");

        LetterCombinations lc = new LetterCombinations(diccionario);

        jLabel1.setText(" ");

        String letrasEnMiMano = jTextField1.getText();

        lc.crearPalabras(letrasEnMiMano);
        lc.mejores10();
        ArrayList<Palabra> arrlistPalabras = lc.getPalabrasArrayString();
        String Palabras[] = new String[arrlistPalabras.size()];

        for (int i = 0; i < arrlistPalabras.size(); i++) {
            Palabras[i] = arrlistPalabras.get(i).toString();
        }
        if (Palabras.length > 0) {
            jLabel1.setText("<html><p>Turno de " + nombre + "</p><p>Estas son las mejores palabras que puedes usar</p></html>");
            lista1.setListData(Palabras);
        } else {
            if (turn == 1 || turn == 0) {
                nombre = jugador1;
            } else if (turn == 2) {
                nombre = jugador2;
            }
            String vacio[] = new String[0];
            lista1.setListData(vacio);
            jLabel1.setText("<html><p>No tienes Palabras para usar con estas letras</p><p>Turno de " + nombre + "</p><p>Ingresa las letras que tienes en tu mano</p></html>");
        }

    }//GEN-LAST:event_jButtonEnterInputActionPerformed

    /**
     * Este metodo se llama en el boton de finalizar y finaliza el programa
     * mostrando el ganador o el perdedor
     *
     * @param evt evento del click
     */
    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        if (j1.getPuntaje() > j2.getPuntaje()) {
            jLabel1.setText("<html><p>Ganador: " + jugador1 + " = " + j1.getPuntaje() + "</p><p>Perdedor: " + jugador2 + " = " + j2.getPuntaje() + "</p>");
        } else if (j2.getPuntaje() > j1.getPuntaje()) {
            jLabel1.setText("<html><p>Ganador: " + jugador2 + " = " + j2.getPuntaje() + "</p><p>Perdedor: " + jugador1 + " = " + j1.getPuntaje() + "</p>");
        } else if (j1.getPuntaje() == j2.getPuntaje()) {
            jLabel1.setText("<html><p>EMPATE" + "</p><p>El puntaje de ambos fue: " + j2.getPuntaje() + "</p>");
        }
        //jLabel1.setText("<html><p>Puntaje FINAL:</p><p>" + jugador1 + ": " + j1.getPuntaje() + "</p><P>" + jugador2 + ": " + j2.getPuntaje());
        jButtonEnterColumn.setVisible(false);
        jButtonEnterInput.setVisible(false);
        jButtonFinalizar.setVisible(false);
        lista1.setVisible(false);
        jTextField1.setVisible(false);
        jScrollPane1.setVisible(false);
        //System.exit(0);
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    /**
     * Este metodo caputa la palabra que el jugador quiere ingresar al tablero y
     * valida que la palabra no este en el tablero, que la primera palabra
     * empiece en el centro y que obligatoriamente la palabra atraviese otra a
     * menos que sea el primer turno despues de estas validaciones pone la
     * palabra en el tablero
     *
     * @param evt evento en el cual se llama el metodo
     */
    private void jButtonEnterColumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterColumnActionPerformed
        // TODO add your handling code here:
        String palabra = lista1.getSelectedValue();// CASA: 6
        String palabraF = "";
        if (palabra.indexOf(":") > -1) {
            palabraF = palabra.substring(0, palabra.indexOf(":")); // CASA
        }
        int puntajeF = 0;
        validacion = true;
        validacionPalabra = true;
        puntajeF = Integer.parseInt(palabra.substring(palabra.indexOf(":") + 2, palabra.length()));// 6
        System.out.println(puntajeF + "soy el puntaje");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba 1 para vertical y 2 para horizontal", null));
        int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero de la columna donde quiere que empiece", null));
        int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero de la fila donde quiere que empiece", null));
        int cont = 0;

        for (int i = 0; i < palabraF.length(); i++) {
            if (opcion != 1 && opcion != 2) {
                JOptionPane.showMessageDialog(null, "Escriba bien el numero de la direccion que quiere usar");
                validacionPalabra = false;
                validacion = false;
                break;
            }
            if (turn == 0) {
                if (columna != 8 || fila != 8) {
                    JOptionPane.showMessageDialog(null, "La primera palabra tiene que estar en el centro (8,8)");
                    validacionPalabra = false;
                    validacion = false;
                    break;
                }
            }

            if (fila == 0 || columna == 0) {
                JOptionPane.showMessageDialog(null, "no puedes colocar palabras en la posicion 0");
                validacionPalabra = false;
                validacion = false;
                break;
            }
            if (opcion == 1) {
                System.out.println(fila + "soy fila");
                System.out.println(columna + " soy columna");
                if (!"".equals(CUADRO[columna][fila + i].getText()) || columna > 15 || fila + i > 15) {
                    String prueba = CUADRO[columna][fila + i].getText();
                    System.out.println(CUADRO[columna][fila + i].getText() + " soy el espacio fila + 1");
                    System.out.println(i + "soy i");
                    if (!prueba.equals(String.valueOf(palabraF.charAt(i)))) {
                        System.out.println(String.valueOf(palabraF.charAt(i)) + " soy la letra a validar");
                        System.out.println(prueba + " soy prueba");
                        JOptionPane.showMessageDialog(null, "no puedes colocar esta palabra en esta posicion");
                        validacionPalabra = false;
                        validacion = false;
                        //CUADRO[columna][fila + i].setText("");
                        //CUADRO[columna][fila + i].setBackground(new Color(4, 156, 96));
                        break;
                    } else {
                        //cruzado = true;
                        cont++;
                    }
                }

            } else if (opcion == 2) {
                System.out.println(fila + "soy fila");
                System.out.println(columna + " soy columna");
                if (!"".equals(CUADRO[columna + i][fila].getText()) || columna + i > 15 || fila > 15) {
                    System.out.println(i + "soy i");
                    String prueba2 = CUADRO[columna + i][fila].getText();
                    System.out.println(CUADRO[columna + i][fila].getText() + "soy el espacio columna + 1");
                    if (!prueba2.equals(String.valueOf(palabraF.charAt(i)))) {
                        System.out.println(String.valueOf(palabraF.charAt(i)) + " soy la letra a validar");
                        System.out.println(prueba2 + " soy prueba2");
                        JOptionPane.showMessageDialog(null, "no puedes colocar esta palabra en esta posicion");
                        validacionPalabra = false;
                        validacion = false;
                        //CUADRO[columna][fila + i].setText("");
                        //CUADRO[columna][fila + i].setBackground(new Color(4, 156, 96));
                        //cruzado = false;
                        break;
                    } else {
                        cont++;
                    }
                }
            }

            System.out.println(cont + "soy cont");
        }
        for (int k = 0; k < palabrasTablero.size(); k++) {
            if (palabrasTablero.get(k).equals(palabraF)) {
                validacionPalabra = false;
                validacion = false;
                JOptionPane.showMessageDialog(null, "Esta Palabra ya esta en el tablero");
                break;
            }
        }

        if (cont != 0) {
            cruzado = true;
        }
        if (opcion == 1) {
            for (int i = 0; i < palabraF.length(); i++) {
                if (validacionPalabra == true) {
                    if (cruzado == true || turn == 0) {
                        CUADRO[columna][fila + i].setText(String.valueOf(palabraF.charAt(i)));
                        CUADRO[columna][fila + i].setBackground(new Color(170, 100, 33));
                        //validacion = true;
                        palabrasTablero.add(palabraF);
                        String vacio[] = new String[0];
                        lista1.setListData(vacio);
                    } else {
                        JOptionPane.showMessageDialog(null, "Tienes que cruzar con alguna palabra que este en el tablero");
                        validacionPalabra = false;
                        validacion = false;
                        break;
                    }
                }
            }
            cruzado = false;
        } else if (opcion == 2) {
            for (int i = 0; i < palabraF.length(); i++) {
                if (validacionPalabra == true) {
                    if (cruzado == true || turn == 0) {
                        CUADRO[columna + i][fila].setText(String.valueOf(palabraF.charAt(i)));
                        CUADRO[columna + i][fila].setBackground(new Color(170, 100, 33));
                        String vacio[] = new String[0];
                        lista1.setListData(vacio);
                        //validacion = true;
                        palabrasTablero.add(palabraF);
                    } else {
                        JOptionPane.showMessageDialog(null, "Tienes que cruzar con alguna que este en el tablero");
                        validacionPalabra = false;
                        validacion = false;
                        break;
                    }

                }

            }
            cruzado = false;
        }
        if (validacion == true) {
            if (turn == 1 || turn == 0) {
                j1.setPuntaje(puntajeF);
            } else if (turn == 2) {
                j2.setPuntaje(puntajeF);
            }
            if (turn == 0 || turn == 1) {
                turn = 2;
                nombre = jugador2;
            } else if (turn == 2) {
                turn = 1;
                nombre = jugador1;
            }
        }
        String vacio[] = new String[0];
        lista1.setListData(vacio);
        System.out.println(turn + "soy el turno");
        System.out.println(nombre + "soy nombre");
        jLabel1.setText("<html><p>Turno de " + nombre + "</p><p>Ingrese las letras que tiene en la mano sin espacios</p></html>");
    }//GEN-LAST:event_jButtonEnterColumnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Scrabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scrabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scrabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scrabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scrabble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnterColumn;
    private javax.swing.JButton jButtonEnterInput;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> lista1;
    // End of variables declaration//GEN-END:variables
}
