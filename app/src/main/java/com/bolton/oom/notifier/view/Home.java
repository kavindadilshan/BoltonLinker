/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bolton.oom.notifier.view;

import com.bolton.oom.notifier.controller.ControllerFactory;
import com.bolton.oom.notifier.controller.SubscriptionController;
import com.bolton.oom.notifier.dto.PostContentDTO;
import com.bolton.oom.notifier.dto.ResponseDTO;
import com.bolton.oom.notifier.dto.SubscribedUsersDTO;
import com.bolton.oom.notifier.dto.SubscriptionDetailsDTO;
import com.bolton.oom.notifier.dto.UserDTO;
import com.bolton.oom.notifier.enums.ControllerStatus;
import com.bolton.oom.notifier.store.ChannelObserver;
import com.bolton.oom.notifier.store.impl.ChannelObserverImpl;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

/**
 *
 * @author Kevin Boy
 */
public final class Home extends javax.swing.JFrame implements ChannelObserver {

    private UserDTO loggedUserDetails;
    private SubscriptionController subscriptionController;
    private ChannelObserverImpl channelObserverImpl;
    
    JPanel containerPosts = new JPanel(new GridLayout(0, 1));

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        showGreetingText();
    }

    public Home(UserDTO userDTO, ChannelObserverImpl observerImpl) {
        initComponents();
        showGreetingText();
         subscriptionController = (SubscriptionController) ControllerFactory.getInstance().getController(ControllerStatus.SUBSCRIBE);

        this.loggedUserDetails = userDTO;
        this.channelObserverImpl = observerImpl;
        lblUserName.setText("Hi" + " " + loggedUserDetails.getUsername());
        
        getAllSubscriptionHandler();
        
    }

    public final void showGreetingText() {
        Calendar calendar = Calendar.getInstance();
        int timeOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        if (timeOfDay >= 0 && timeOfDay < 12) {
            lblGreeting.setText("Good Morning!");
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            lblGreeting.setText("Good Afternoon!");
        } else if (timeOfDay >= 16 && timeOfDay < 21) {
            lblGreeting.setText("Good Evening!");
        } else {
            lblGreeting.setText("Good Night!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnPost = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jspNewsFeed = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jspActiveList = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblGreeting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPost.setBackground(new java.awt.Color(0, 153, 153));
        btnPost.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnPost.setForeground(new java.awt.Color(255, 255, 255));
        btnPost.setText("Post");
        btnPost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPostMouseClicked(evt);
            }
        });
        btnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("New Feed");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspNewsFeed)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspNewsFeed, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspActiveList, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspActiveList, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Active Contacts");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(290, 290, 290)
                        .addComponent(btnPost, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bolton_logo.png"))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        lblUserName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 0, 0));
        lblUserName.setText("Hi Kavinda,");

        lblGreeting.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblGreeting.setText("Good Morning!");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblGreeting)
                        .addGap(0, 438, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGreeting)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPostActionPerformed

    private void btnPostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPostMouseClicked
        new PostCreator(loggedUserDetails,channelObserverImpl).setVisible(true);
    }//GEN-LAST:event_btnPostMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jspActiveList;
    private javax.swing.JScrollPane jspNewsFeed;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables

    public void getAllSubscriptionHandler(){
        ResponseDTO response = subscriptionController.getAllSubscriptionsForUser(loggedUserDetails);
        System.out.println("response::::::::::::"+response);
        if (response.isSuccess()) {
            ArrayList<SubscribedUsersDTO> subscribedUsersDTOs = (ArrayList<SubscribedUsersDTO>) response.getData();
            JPanel containerSubscription = new JPanel(new GridLayout(0, 1));
            
            System.out.println("subscribers:::::::::"+subscribedUsersDTOs);
            
            subscribedUsersDTOs.forEach((SubscribedUsersDTO item) -> {
                JPanel userWrapperl = new JPanel();
                userWrapperl.setBackground(new java.awt.Color(255, 255, 255));
                
                JSeparator separator = new JSeparator();
                
                JLabel lblRegUser = new JLabel();
                lblRegUser.setBackground(new java.awt.Color(255, 255, 255));
                
                lblRegUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblRegUser.setToolTipText(item.getUserDTO().getUsername());
                lblRegUser.setText(item.getUserDTO().getUsername());
                
                JButton btnSubscribe = new JButton();
                btnSubscribe.setBackground(item.isIsSubscribed()? new java.awt.Color(102, 102, 102) : new java.awt.Color(255, 0, 0));
                
                btnSubscribe.setForeground(new java.awt.Color(255, 255, 255));
                btnSubscribe.setText(item.isIsSubscribed() ? "Unsubscribe" : "Subscribe");
                btnSubscribe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                btnSubscribe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                
                btnSubscribe.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        if (item.isIsSubscribed()) {
                            ResponseDTO response = subscriptionController.unsubscriptionManagement(new SubscriptionDetailsDTO(item.getUserDTO().getId(), loggedUserDetails.getId()));
                            if (response.isSuccess()) {
                               getAllSubscriptionHandler();
                            }
                        }else{
                            ResponseDTO response = subscriptionController.subscriptionProcessManagement(new SubscriptionDetailsDTO(item.getUserDTO().getId(), loggedUserDetails.getId()));
                            if (response.isSuccess()) {
                               getAllSubscriptionHandler();
                            }
                        }
                    }
                });
                
                
                javax.swing.GroupLayout userWrapperlLayout = new javax.swing.GroupLayout(userWrapperl);
                userWrapperl.setLayout(userWrapperlLayout);
                userWrapperlLayout.setHorizontalGroup(
                        userWrapperlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(separator)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userWrapperlLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSubscribe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                .addGroup(userWrapperlLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblRegUser, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                userWrapperlLayout.setVerticalGroup(
                        userWrapperlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userWrapperlLayout.createSequentialGroup()
                                        .addContainerGap(15, Short.MAX_VALUE)
                                        .addComponent(lblRegUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(btnSubscribe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                );
                
                containerSubscription.add(userWrapperl);
               
            });
            jspActiveList.setViewportView(containerSubscription);
        }
    }
    
    @Override
    public void notifyPostCreation(PostContentDTO postContentDTO) {
        System.out.println("notify::::::::::::::::::::"+postContentDTO.getAuthor()+"loguser::::::::::::::"+loggedUserDetails);
        String postedBy = loggedUserDetails.getId() == postContentDTO.getAuthor().getId() ? postContentDTO.getAuthor().getUsername() + " (Me)" : postContentDTO.getAuthor().getUsername();
        JPanel subPanel = new JPanel();
        subPanel.setBackground(new java.awt.Color(255, 255, 255));
        JSeparator separator = new JSeparator();
         JTextPane username = new JTextPane();
         username.setEditable(true);
         username.setBackground(new java.awt.Color(255, 255, 255));
         username.setFont(new java.awt.Font("URW Gothic L", 0, 14));
         username.setFont(username.getFont().deriveFont(Font.BOLD));
         username.setText(postedBy);
        JTextPane textPane = new JTextPane();
        textPane.setEditable(false);
        textPane.setBackground(new java.awt.Color(255, 255, 255));
        textPane.setFont(new java.awt.Font("URW Gothic L", 0, 14));
        JLabel lblAuthor = new JLabel();
        lblAuthor.setBackground(new java.awt.Color(255, 255, 255));
        lblAuthor.setFont(new java.awt.Font("URW Gothic L", 0, 13));
        lblAuthor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textPane.setText(postContentDTO.getPostTitle());
        
        lblAuthor.setText(postContentDTO.getDateAndTime());
        javax.swing.GroupLayout groupLayout = new javax.swing.GroupLayout(subPanel);
        subPanel.setLayout(groupLayout);

        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(0, 0, 0)
                                                .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(0, 0, 0)
                                                .addComponent(textPane, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addComponent(separator)
        );

        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                .addComponent(textPane, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        
        containerPosts.add(subPanel);
        jspNewsFeed.setViewportView(containerPosts);

    }

    @Override
    public void notifyAccountCreation(UserDTO userDTO) {
        getAllSubscriptionHandler();
    }

    public UserDTO getLoggedUserDetails() {
        return loggedUserDetails;
    }
}
