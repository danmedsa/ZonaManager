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

/**
 *
 * @author DanielMedina
 */
public final class AWSConnection_PopUp extends javax.swing.JFrame {

    static AmazonDynamoDBClient dynamoDB;

    
    /**
     * Creates new form AWSConnection_PopUp
     * @param name
     * @param breakfast
     * @param cell
     * @param comment
     * @param deliverer
     * @param desc
     * @param dinner
     * @param email
     * @param interior
     * @param lunch 
     * @param number
     * @param joindate
     * @param street
     * @param phone
     */
    public AWSConnection_PopUp(String name, String breakfast, String cell, 
            String comment, String deliverer, String desc, String dinner, 
            String email, String interior, String lunch, String number, String joindate,
            String street, String phone) {
        initComponents();
        Message_lbl.setText("Guardando...");
        Ok_btn.setText("Cancelar");
        //this.setVisible(true);
        initAWSDynamoDB();
        submitRequestAddItem(name, breakfast,cell,comment,deliverer,desc,dinner,
                email,interior,lunch,number,joindate,street,phone);
    }

    public void initAWSDynamoDB(){
        //init AWS DynamoDB
        AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider().getCredentials();
        } catch (Exception e) {
            Message_lbl.setText("Cannot load the credentials from the credential profiles file. " + e);
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
    
    public void submitRequestAddItem(String name, String breakfast, String cell, 
            String comment, String deliverer, String desc, String dinner, 
            String email, String interior, String lunch, String number, String joindate,
            String street, String phone){
       
        // Add an item
        Map<String, AttributeValue> item = newItem(name, 
                breakfast, cell, comment, deliverer, desc, dinner,email,interior,
                lunch, number, joindate, street, phone);
         PutItemRequest putItemRequest = new PutItemRequest("Clients", item);
         PutItemResult putItemResult = dynamoDB.putItem(putItemRequest);
         
         Ok_btn.setText("Aceptar");
         switch(putItemResult.toString()){
             case "{}":
                 Message_lbl.setText("Guardado!");
                 break;
             default:
                 System.out.println("Result: " + putItemResult);
                 break;
         }
         
    }

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
        item.put("JoinDate", new AttributeValue(joindate));
        item.put("Street", new AttributeValue(street));
        item.put("Telephone", new AttributeValue(phone));
        item.put("Balance", new AttributeValue().withN("0"));
        item.put("Active", new AttributeValue().withBOOL(false));
        
        return item;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Message_lbl = new javax.swing.JLabel();
        Ok_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ok_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ok_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Message_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 433, Short.MAX_VALUE)
                .addComponent(Ok_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Message_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Ok_btn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ok_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ok_btnActionPerformed
        // TODO add your handling code here:
        switch(Ok_btn.getText()){
            case "Aceptar":
                    this.dispose();
                    break;
            default:
                //TODO: Cancel connection AWS
                break;
        }
    }//GEN-LAST:event_Ok_btnActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AWSConnection_PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AWSConnection_PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AWSConnection_PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AWSConnection_PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
////                new AWSConnection_PopUp().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Message_lbl;
    private javax.swing.JButton Ok_btn;
    // End of variables declaration//GEN-END:variables
}
