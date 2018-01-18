
import java.util.ArrayList;
import java.util.ListIterator;


public class Playerinterface extends javax.swing.JFrame {

    // we need an array list an iterator to get all of the players into an array list
     ArrayList list;
    ListIterator li;
    int totpoints, energy, health, skill;
    int curplayer, totplayer;
    Player p;
    
    
    public Playerinterface() {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        curplayer=0;
        totplayer=0;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtname = new javax.swing.JLabel();
        lblh = new javax.swing.JLabel();
        lbls = new javax.swing.JLabel();
        lblp = new javax.swing.JLabel();
        lblpotential = new javax.swing.JLabel();
        lblenergy = new javax.swing.JLabel();
        lblskill = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblpo = new javax.swing.JLabel();
        lblpoints = new javax.swing.JLabel();
        btnnext = new javax.swing.JButton();
        btnskipright = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnwayback = new javax.swing.JButton();
        btntrain = new javax.swing.JButton();
        btnplay = new javax.swing.JButton();
        btnsleep = new javax.swing.JButton();
        lbldescrip = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtname.setBackground(new java.awt.Color(200, 200, 200));
        txtname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 153, 153));
        txtname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtname.setOpaque(true);

        lblh.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblh.setText("Energy:");

        lbls.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbls.setText("Skill:");

        lblp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblp.setText("Potential:");

        lblpotential.setBackground(new java.awt.Color(0, 0, 0));
        lblpotential.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblpotential.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpotential.setOpaque(true);

        lblenergy.setBackground(new java.awt.Color(0, 0, 0));
        lblenergy.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblenergy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblenergy.setOpaque(true);

        lblskill.setBackground(new java.awt.Color(0, 0, 0));
        lblskill.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblskill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblskill.setOpaque(true);

        jButton1.setText("Add Player");

        jButton2.setText("Delete Player");

        lblpo.setText("Points: ");

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnskipright.setText(">>");
        btnskipright.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnskiprightActionPerformed(evt);
            }
        });

        btnback.setText("<");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnwayback.setText("<<");
        btnwayback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwaybackActionPerformed(evt);
            }
        });

        btntrain.setText("Train");
        btntrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntrainActionPerformed(evt);
            }
        });

        btnplay.setText("Play Game");

        btnsleep.setText("Sleep");
        btnsleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsleepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbldescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblp, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                            .addComponent(lbls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblpotential, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblskill, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblenergy, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnwayback)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnnext)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 93, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnback)
                                        .addGap(208, 208, 208))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnplay)
                                        .addGap(87, 87, 87)
                                        .addComponent(btntrain)
                                        .addGap(90, 90, 90)
                                        .addComponent(btnsleep))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblpo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblpoints, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnskipright)
                        .addGap(42, 42, 42)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblpoints, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblpo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblenergy, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbls, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblskill, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpotential, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntrain)
                    .addComponent(btnplay)
                    .addComponent(btnsleep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbldescrip, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnext)
                    .addComponent(btnback)
                    .addComponent(btnwayback)
                    .addComponent(btnskipright))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnwaybackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwaybackActionPerformed
        if(curplayer==0) {
             return;
         }
        while(li.hasPrevious()){
        p =(Player)li.previous();
        }
        
        curplayer=1;
        
        txtname.setText("" + p.getName());
         lblenergy.setText( "" + p.getHealth());
        lblskill.setText( "" + p.getSkill());
        lblpotential.setText(p.Potential());
        
    }//GEN-LAST:event_btnwaybackActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
         if(curplayer==1) return;
        curplayer--;
        txtname.setText("" + p.getName());
        p = (Player)li.previous(); 
        lblskill.setText("" + p.getSkill());
        lblenergy.setText("" + p.getHealth());
        lblpotential.setText(p.Potential());
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnsleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsleepActionPerformed
        p.upHealth();
    }//GEN-LAST:event_btnsleepActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
         if(curplayer==totplayer) return;
        curplayer++;
        txtname.setText(" " + curplayer);
        li.next();
        li.next();
        p =(Player)li.previous();
        lblenergy.setText( "" + p.getHealth());
        lblskill.setText( "" + p.getSkill());
        lblpotential.setText(p.Potential());
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnskiprightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnskiprightActionPerformed
        if(curplayer==totplayer) {
            return;
        }
        while(li.hasNext()){
             li.next();
        }
          
        p =(Player)li.previous();
        curplayer=totplayer;
        
        txtname.setText("" + p.getName());
         lblenergy.setText( "" + p.getHealth());
        lblskill.setText( "" + p.getSkill());
        lblpotential.setText(p.Potential());
    }//GEN-LAST:event_btnskiprightActionPerformed

    private void btntrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntrainActionPerformed
       p.upSkill();
    }//GEN-LAST:event_btntrainActionPerformed

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
            java.util.logging.Logger.getLogger(Playerinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Playerinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Playerinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Playerinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Playerinterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnplay;
    private javax.swing.JButton btnskipright;
    private javax.swing.JButton btnsleep;
    private javax.swing.JButton btntrain;
    private javax.swing.JButton btnwayback;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lbldescrip;
    private javax.swing.JLabel lblenergy;
    private javax.swing.JLabel lblh;
    private javax.swing.JLabel lblp;
    private javax.swing.JLabel lblpo;
    private javax.swing.JLabel lblpoints;
    private javax.swing.JLabel lblpotential;
    private javax.swing.JLabel lbls;
    private javax.swing.JLabel lblskill;
    private javax.swing.JLabel txtname;
    // End of variables declaration//GEN-END:variables
}
