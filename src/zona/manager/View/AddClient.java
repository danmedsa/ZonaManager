/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zona.manager.View;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.PutItemResult;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import static zona.manager.View.AddClient.dynamoDB;


/**
 *
 * @author DanielMedina
 */
public class AddClient extends javax.swing.JFrame {

    static AmazonDynamoDBClient dynamoDB;


    
    /**
     * Creates new form AddClient
     */
    public AddClient() {
        initComponents();
        
        
        //init AWS DynamoDB
        AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider().getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (~/.aws/credentials), and is in valid format.",
                    e);
        }
        dynamoDB = new AmazonDynamoDBClient(credentials);
        Region usWest2 = Region.getRegion(Regions.US_WEST_2);
        dynamoDB.setRegion(usWest2);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Name_lbl = new javax.swing.JLabel();
        Name_txt = new javax.swing.JTextField();
        Phone_lbl = new javax.swing.JLabel();
        Phone_txt = new javax.swing.JTextField();
        Cellphone_lbl = new javax.swing.JLabel();
        Cellphone_txt = new javax.swing.JTextField();
        email_lbl = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        Street_lbl = new javax.swing.JLabel();
        Street_txt = new javax.swing.JTextField();
        Number_lbl = new javax.swing.JLabel();
        Number_txt = new javax.swing.JTextField();
        Interior_lbl = new javax.swing.JLabel();
        Interior_txt = new javax.swing.JTextField();
        Neighborhood_lbl = new javax.swing.JLabel();
        Neighborhood_txt = new javax.swing.JTextField();
        Description_lbl = new javax.swing.JLabel();
        Description_SP = new javax.swing.JScrollPane();
        Description_txt = new javax.swing.JTextArea();
        JoinDate_lbl = new javax.swing.JLabel();
        JoinDate_txt = new com.toedter.calendar.JDateChooser();
        Lunch_lbl = new javax.swing.JLabel();
        Lunch_txt = new javax.swing.JTextField();
        Breakfast_lbl = new javax.swing.JLabel();
        Breakfast_txt = new javax.swing.JTextField();
        Dinner_lbl = new javax.swing.JLabel();
        Dinner_txt = new javax.swing.JTextField();
        Comments_lbl = new javax.swing.JLabel();
        Comments_SP = new javax.swing.JScrollPane();
        Comments_txt = new javax.swing.JTextArea();
        Save_btn = new javax.swing.JButton();
        Cancel_btn = new javax.swing.JButton();
        Deliverer_lbl = new javax.swing.JLabel();
        Deliverer_txt = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Name_lbl.setText("Nombre:");

        Phone_lbl.setText("Tel:");

        Cellphone_lbl.setText("Cel:");

        Cellphone_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cellphone_txtActionPerformed(evt);
            }
        });

        email_lbl.setText("E-Mail:");

        Street_lbl.setText("Calle:");

        Number_lbl.setText("Numero:");

        Interior_lbl.setText("Interior:");

        Neighborhood_lbl.setText("Colonia:");

        Description_lbl.setText("Descripcion:");

        Description_txt.setColumns(20);
        Description_txt.setRows(3);
        Description_SP.setViewportView(Description_txt);

        JoinDate_lbl.setText("Fecha Ing:");

        Lunch_lbl.setText("Comida:");

        Breakfast_lbl.setText("Refrigerio:");

        Dinner_lbl.setText("Cena:");

        Comments_lbl.setText("Comentarios:");

        Comments_txt.setColumns(20);
        Comments_txt.setRows(5);
        Comments_SP.setViewportView(Comments_txt);

        Save_btn.setText("Guardar");
        Save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_btnActionPerformed(evt);
            }
        });

        Cancel_btn.setText("Cancelar");

        Deliverer_lbl.setText("Repartidor:");

        Deliverer_txt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Save_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancel_btn)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Deliverer_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Deliverer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Comments_lbl)
                            .addComponent(Lunch_lbl)
                            .addComponent(JoinDate_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JoinDate_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lunch_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(Breakfast_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Breakfast_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(Dinner_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dinner_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Comments_SP)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Description_lbl)
                            .addComponent(Neighborhood_lbl)
                            .addComponent(Street_lbl)
                            .addComponent(email_lbl)
                            .addComponent(Phone_lbl)
                            .addComponent(Name_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name_txt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Phone_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cellphone_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cellphone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(email_txt)
                            .addComponent(Street_txt)
                            .addComponent(Neighborhood_txt)
                            .addComponent(Description_SP)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Number_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Number_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Interior_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Interior_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name_lbl)
                            .addComponent(Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Phone_lbl)
                            .addComponent(Phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cellphone_lbl)
                            .addComponent(Cellphone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email_lbl))
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Street_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Street_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number_lbl)
                    .addComponent(Number_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Interior_lbl)
                    .addComponent(Interior_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Neighborhood_lbl)
                    .addComponent(Neighborhood_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Description_lbl)
                    .addComponent(Description_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deliverer_lbl)
                    .addComponent(Deliverer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(JoinDate_lbl))
                    .addComponent(JoinDate_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lunch_lbl)
                    .addComponent(Lunch_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Breakfast_lbl)
                    .addComponent(Breakfast_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dinner_lbl)
                    .addComponent(Dinner_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Comments_lbl)
                    .addComponent(Comments_SP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel_btn)
                    .addComponent(Save_btn)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cellphone_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cellphone_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cellphone_txtActionPerformed

    private void Save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_btnActionPerformed
        // TODO add your handling code here:
        // Add an item
            Map<String, AttributeValue> item = newItem(Name_txt.getText(), 
                   Breakfast_txt.getText(), Cellphone_txt.getText(), Comments_txt.getText(), Deliverer_txt.getSelectedItem().toString(),
                   Description_txt.getText(), Dinner_txt.getText(),email_txt.getText(),Interior_txt.getText(),
                   Lunch_txt.getText(), Number_txt.getText(), JoinDate_txt.getDateFormatString(), Street_txt.getText(),
                   Phone_txt.getText());
            PutItemRequest putItemRequest = new PutItemRequest("Clients", item);
            PutItemResult putItemResult = dynamoDB.putItem(putItemRequest);
            System.out.println("Result: " + putItemResult);
    }//GEN-LAST:event_Save_btnActionPerformed

    private Map<String, AttributeValue> newItem(String name, String breakfast, String cellphone, String comments, String deliverer, String description, String dinner, String email, String interior, String lunch, String number, String joindate, String street, String phone) {
    Map<String, AttributeValue> item = new HashMap<String, AttributeValue>();
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyyMMddhhmmssS");
        System.out.println(ft.format(date));
        item.put("id", new AttributeValue().withN(ft.format(date)));
        item.put("Name", new AttributeValue(name));
        item.put("Breakfast", new AttributeValue(breakfast));
        item.put("Cellphone", new AttributeValue(cellphone));
        item.put("Comments", new AttributeValue(comments));
        item.put("Deliverer", new AttributeValue(deliverer));
        item.put("Description", new AttributeValue(description));
        item.put("Dinner", new AttributeValue(dinner));
        item.put("Email", new AttributeValue(email));
        item.put("Interior", new AttributeValue(interior));
        item.put("Lunch", new AttributeValue(lunch));
        item.put("Number", new AttributeValue(number));
        item.put("JoinDate", new AttributeValue(joindate.toString()));
        item.put("Street", new AttributeValue(street));
        item.put("Telephone", new AttributeValue(phone));
        
        return item;
    }
    
    
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
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddClient().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Breakfast_lbl;
    private javax.swing.JTextField Breakfast_txt;
    private javax.swing.JButton Cancel_btn;
    private javax.swing.JLabel Cellphone_lbl;
    private javax.swing.JTextField Cellphone_txt;
    private javax.swing.JScrollPane Comments_SP;
    private javax.swing.JLabel Comments_lbl;
    private javax.swing.JTextArea Comments_txt;
    private javax.swing.JLabel Deliverer_lbl;
    private javax.swing.JComboBox Deliverer_txt;
    private javax.swing.JScrollPane Description_SP;
    private javax.swing.JLabel Description_lbl;
    private javax.swing.JTextArea Description_txt;
    private javax.swing.JLabel Dinner_lbl;
    private javax.swing.JTextField Dinner_txt;
    private javax.swing.JLabel Interior_lbl;
    private javax.swing.JTextField Interior_txt;
    private javax.swing.JLabel JoinDate_lbl;
    private com.toedter.calendar.JDateChooser JoinDate_txt;
    private javax.swing.JLabel Lunch_lbl;
    private javax.swing.JTextField Lunch_txt;
    private javax.swing.JLabel Name_lbl;
    private javax.swing.JTextField Name_txt;
    private javax.swing.JLabel Neighborhood_lbl;
    private javax.swing.JTextField Neighborhood_txt;
    private javax.swing.JLabel Number_lbl;
    private javax.swing.JTextField Number_txt;
    private javax.swing.JLabel Phone_lbl;
    private javax.swing.JTextField Phone_txt;
    private javax.swing.JButton Save_btn;
    private javax.swing.JLabel Street_lbl;
    private javax.swing.JTextField Street_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField email_txt;
    // End of variables declaration//GEN-END:variables

    
}
