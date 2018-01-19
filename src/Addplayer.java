
public class Addplayer extends javax.swing.JPanel {

 
    Player p;
    String signal;
    
    public Addplayer(java.awt.Frame parent, boolean modal) {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtgetname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtgetskill = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtenergy = new javax.swing.JTextField();
        btnforward = new javax.swing.JButton();
        btndefense = new javax.swing.JButton();
        btngoalie = new javax.swing.JButton();
        txtinfo = new javax.swing.JLabel();

        jLabel1.setText("Name: ");

        jLabel2.setText("Skill: ");

        jLabel3.setText("Energy:");

        btnforward.setText("Add Forward");
        btnforward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnforwardActionPerformed(evt);
            }
        });

        btndefense.setText("Add Defense");
        btndefense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndefenseActionPerformed(evt);
            }
        });

        btngoalie.setText("Add Goalie");
        btngoalie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngoalieActionPerformed(evt);
            }
        });

        txtinfo.setText("name must be filled in as well as skill and energy should be from 1-10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtinfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnforward)
                                .addGap(40, 40, 40)
                                .addComponent(btndefense)
                                .addGap(38, 38, 38)
                                .addComponent(btngoalie))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtgetname)
                                    .addComponent(txtgetskill)
                                    .addComponent(txtenergy, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgetname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgetskill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtenergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnforward)
                    .addComponent(btndefense)
                    .addComponent(btngoalie))
                .addGap(26, 26, 26)
                .addComponent(txtinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnforwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnforwardActionPerformed
       String names = txtgetname.getText();
       int skills = Integer.parseInt(txtgetskill.getText());
       int healths = Integer.parseInt(txtenergy.getText());
       
       
       // i used a if statement to make sure that they put the right amount of integers in
      if(healths<10 && healths >0 && skills<10 && skills > 0){  
        p = new Forward(txtgetname.getText(), Integer.parseInt(txtgetskill.getText()), Integer.parseInt(txtenergy.getText()));
        signal = "f";
         txtinfo.setText("name must be filled in as well as skill and energy should be from 1-10");
        System.exit(0);
    }
      else {
          txtinfo.setText("you have failed to listen to instructions - try again");
     }
    }//GEN-LAST:event_btnforwardActionPerformed

    private void btndefenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndefenseActionPerformed
        String names = txtgetname.getText();
       int skills = Integer.parseInt(txtgetskill.getText());
       int healths = Integer.parseInt(txtenergy.getText());
       
       
       // i used a if statement to make sure that they put the right amount of integers in
      if(healths<10 && healths >0 && skills<10 && skills > 0){  
        
        p = new Defense(txtgetname.getText(), Integer.parseInt(txtgetskill.getText()), Integer.parseInt(txtenergy.getText()));
        signal = "d";
        txtinfo.setText("name must be filled in as well as skill and energy should be from 1-10");
        System.exit(0);
      }
          else {
          txtinfo.setText("you have failed to listen to instructions - try again");
     
      }
    }//GEN-LAST:event_btndefenseActionPerformed

    private void btngoalieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngoalieActionPerformed
         String names = txtgetname.getText();
       int skills = Integer.parseInt(txtgetskill.getText());
       int healths = Integer.parseInt(txtenergy.getText());
       
       
       // i used a if statement to make sure that they put the right amount of integers in
      if(healths<10 && healths >0 && skills<10 && skills > 0){  
        
        p = new Goalie(txtgetname.getText(), Integer.parseInt(txtgetskill.getText()), Integer.parseInt(txtenergy.getText()));
        signal = "g";
        txtinfo.setText("name must be filled in as well as skill and energy should be from 1-10");
        System.exit(0);
      }
        else {
          txtinfo.setText("you have failed to listen to instructions - try again");
     }
    }//GEN-LAST:event_btngoalieActionPerformed


     public Player getPlayer(){
      return p;
  }
  
    
     
  public String getSignal(){
      return signal;
  }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndefense;
    private javax.swing.JButton btnforward;
    private javax.swing.JButton btngoalie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtenergy;
    private javax.swing.JTextField txtgetname;
    private javax.swing.JTextField txtgetskill;
    private javax.swing.JLabel txtinfo;
    // End of variables declaration//GEN-END:variables
}
