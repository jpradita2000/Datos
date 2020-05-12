/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1erlaboratorio;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author JPPM
 */
public class LabCircular extends javax.swing.JFrame {

    DefaultListModel model1;
    DefaultListModel model2;

    public LabCircular() {
        initComponents();
        model1 = new DefaultListModel();
        lista1.setModel(model1);

        model2 = new DefaultListModel();
        lista2.setModel(model2);
        ptr = null;
        ptr2 = null;
    }

    class Nodo {

        int num;
        Nodo link;

        public Nodo() {
        }

        public Nodo(int num) {
            this.num = num;
        }
    }
    Nodo ptr;
    Nodo ptr2;
    Nodo ult = null;
    Nodo ult2 = null;

    public Nodo addNodoCircular(Nodo ptr, int nume) {
        Nodo q = new Nodo();
        q.num = nume;
        if (ptr == null) {
            ptr = q;
            ult = q;
        } else {
            ult.link = q;
            ult = q;
        }
        q.link = ptr;
        return ptr;
    }

    public Nodo addNodoSimple(Nodo ptr2, int nume) {
        Nodo q = new Nodo();
        q.num = nume;
        Nodo p = ptr2;
        if (ptr2 == null) {
            ptr2 = q;
            ult2 = q;
        } else {
            ult2.link = q;
            ult2 = q;
        }
        return ptr2;
    }

    public void showList(Nodo ptr) {
        DefaultListModel model = (DefaultListModel) lista1.getModel();
        model.clear();
        Nodo p = ptr;
        do {
            model.addElement(p.num);
            p = p.link;
        } while (p != ptr);
        NodoC.setText("");

    }

    public void showList2(Nodo ptr2) {
        DefaultListModel model = (DefaultListModel) lista2.getModel();
        model.clear();
        Nodo p = ptr2;
        while (p != null) {
            model.addElement(p.num);
            p = p.link;
        }
        NodoS.setText("");
        

    }

    Nodo getUltimoSimple(Nodo ptr2) {
        Nodo ultimoS = ptr2;
        while (ultimoS.link != null) {
            ultimoS = ultimoS.link;
        }
        return ultimoS;
    }

    Nodo getUltimoCircular(Nodo ptr) {
        Nodo ultimoC = ptr;
        while (ultimoC.link != ptr) {
            ultimoC = ultimoC.link;
        }

        return ultimoC;
    }

    int getNumeroUltimo(Nodo ptr) {
        int cont = 0;
        Nodo p = ptr;
        while (p.link != ptr) {
            cont++;
            p = p.link;
        }

        return cont;
    }
    
    //Se crea una lista totalmente nueva, con la misma información de la que se paso como parametro
    public Nodo copiarLista(Nodo simple) {
        Nodo copia = new Nodo();
        copia.num = simple.num;
        Nodo p = copia;

        while (simple.link != null) {
            simple = simple.link;
            p.link = new Nodo(simple.num);
            p = p.link;
        }

        return copia;
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista2 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pos = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        NodoS = new javax.swing.JTextField();
        NodoC = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lista2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista2);

        lista1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lista1);

        jButton1.setText("Agregar_NodoS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar_NodoC");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Posicion");

        pos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        NodoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodoCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NodoC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NodoS, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel1)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NodoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NodoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (!(NodoC.getText().isEmpty())) {
            int nodoc = Integer.parseInt(NodoC.getText());
            ptr = addNodoCircular(ptr, nodoc);
            showList(ptr);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void posActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posActionPerformed

    private void NodoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodoCActionPerformed

    }//GEN-LAST:event_NodoCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!(NodoS.getText().isEmpty())) {
            int nodos = Integer.parseInt(NodoS.getText());
            ptr2 = addNodoSimple(ptr2, nodos);
            showList2(ptr2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!(pos.getText().isEmpty())) {
            int posi = Integer.parseInt(pos.getText());
            Nodo ultimoc = getUltimoCircular(ptr);

            int cont = 1;
            Nodo p = ptr;
            Nodo antp = null;

            while (p.link != ptr && cont != posi) {
                cont++;
                antp = p;
                p = p.link;
            }

            if (cont == posi) {
                Nodo copia = copiarLista(ptr2);
                Nodo ultimos = getUltimoSimple(copia);
                if (cont == 1) {
                    ultimoc.link = copia;
                    ultimos.link = ptr;
                    ptr = copia;
                } else if (cont > 1 && p.link != ptr) {
                    ultimos.link = p;
                    antp.link = copia;
                }
            } else if(posi-1==cont) {
                Nodo copia = copiarLista(ptr2);
                Nodo ultimos = getUltimoSimple(copia);
                 ultimos.link = ptr;
                 p.link = copia;
            }else{
                JOptionPane.showMessageDialog(null, "No se enceuntra esa posicion");
            }
            

        }
        showList(ptr);
        ptr2 = null;
        showList2(ptr2);
        
        pos.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LabCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabCircular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NodoC;
    private javax.swing.JTextField NodoS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista1;
    private javax.swing.JList<String> lista2;
    private javax.swing.JTextField pos;
    // End of variables declaration//GEN-END:variables
}
