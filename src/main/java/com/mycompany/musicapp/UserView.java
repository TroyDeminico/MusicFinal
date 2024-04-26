/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.musicapp;

import java.awt.Desktop;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author troydeminico
 */
public class UserView extends javax.swing.JFrame {
    
    //SongHashMap test = new SongHashMap();
    
    Playlist userPlaylist = new Playlist();
    Playlist favPlaylist = new Playlist();
    Playlist userLinks = new Playlist();
    Playlist favLinks = new Playlist();
    Playlist artistList = new Playlist();
    IntList artistCounts = new IntList();
    Playlist userImgs = new Playlist();
    
    ArrayList<Song> mySongs = new ArrayList<>();
    
    private static void openWebpage(String url) {
        try {
            Desktop.getDesktop().browse(new java.net.URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Creates new form NewJFrame
     */
    public UserView() {
        initComponents(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAreaPList = new javax.swing.JTextArea();
        btnRemove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        songNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ArtistName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        songName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnAddFav = new javax.swing.JButton();
        btnListen = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        FirstArtist = new javax.swing.JLabel();
        SecondArtist = new javax.swing.JLabel();
        ThirdArtist = new javax.swing.JLabel();
        jLabelFirst = new javax.swing.JLabel();
        jLabelSecond = new javax.swing.JLabel();
        jLabelThird = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtAreaFav = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnFavRemove = new javax.swing.JButton();
        songFavNumber = new javax.swing.JTextField();
        btnFavListen = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtAreaPList.setEditable(false);
        jTxtAreaPList.setColumns(20);
        jTxtAreaPList.setRows(5);
        jScrollPane1.setViewportView(jTxtAreaPList);
        jTxtAreaPList.getAccessibleContext().setAccessibleName("");
        jTxtAreaPList.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 261, 152));

        btnRemove.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 49, 79, -1));

        jLabel2.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Song Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 9, 79, -1));

        songNumber.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        songNumber.setText("Song #");
        songNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songNumberActionPerformed(evt);
            }
        });
        jPanel1.add(songNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Artist");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 210, 40, -1));

        ArtistName.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        ArtistName.setText("Artist name");
        ArtistName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistNameActionPerformed(evt);
            }
        });
        jPanel1.add(ArtistName, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 207, -1, -1));

        jLabel1.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Song");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 179, 64, -1));

        songName.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        songName.setText("Song name");
        jPanel1.add(songName, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 176, -1, -1));

        btnAdd.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 250, -1, -1));

        btnAddFav.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        btnAddFav.setText("Favorite");
        btnAddFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFavActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 49, 79, -1));

        btnListen.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        btnListen.setText("Listen");
        btnListen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListenActionPerformed(evt);
            }
        });
        jPanel1.add(btnListen, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 83, -1, -1));

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Top 3 Artist");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        FirstArtist.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(FirstArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 43, 147, 134));

        SecondArtist.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(SecondArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 43, 147, 134));

        ThirdArtist.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(ThirdArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 43, 147, 134));

        jLabelFirst.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        jLabelFirst.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabelFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 195, 147, 28));

        jLabelSecond.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        jLabelSecond.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabelSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 195, 147, 28));

        jLabelThird.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        jLabelThird.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabelThird, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 195, 147, 28));

        jTabbedPane1.addTab("Top Artist", jPanel3);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtAreaFav.setEditable(false);
        jTxtAreaFav.setColumns(20);
        jTxtAreaFav.setRows(5);
        jScrollPane2.setViewportView(jTxtAreaFav);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 26, 431, 259));

        jLabel5.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Favorite Songs");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        btnFavRemove.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        btnFavRemove.setText("Remove");
        btnFavRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavRemoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnFavRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 82, 79, -1));

        songFavNumber.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        songFavNumber.setText("Song #");
        songFavNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songFavNumberActionPerformed(evt);
            }
        });
        jPanel2.add(songFavNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 26, 80, -1));

        btnFavListen.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        btnFavListen.setText("Listen");
        btnFavListen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavListenActionPerformed(evt);
            }
        });
        jPanel2.add(btnFavListen, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 125, 79, -1));

        jTabbedPane1.addTab("Favorites", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String request = songName.getText();
        boolean hasSpace = request.contains(" ");
        if (hasSpace) {
            request = request.replace(" ", "%20");
                    }
       
        Song fullSong = APISearch.getFirstSongInfo(request); 
        mySongs.add(fullSong);
        
        String newSong = fullSong.getSongInfo();
        userPlaylist.addSong(newSong);
        
        // Create a list with the links to the added songs
//        String newLink = APISearch.getSongLink(request);
        String newLink = fullSong.getSongLink();
        String newImg = fullSong.getSongImg();
        
        userLinks.addSong(newLink);
        
        //test.addSong(newSong, newLink);
        
//        String newImg = APISearch.getSongImg(request);
        userImgs.addSong(newImg);
       
        jTxtAreaPList.setText(userPlaylist.toString());
        
//        s = APISearch.getFirstSongArtistInfo(request);
        String newID = fullSong.getArtistID();
        
        int newCount = 1;
        int index = artistList.compareID(newID);
        
        if (index != -1){
            artistCounts.increaseCount(index);
        }
        else{
            artistList.addSong(newID);
            artistCounts.addCount(newCount);
        }
        
        // Get the top 3
            // Set the labels accordingyly;
        Artist a = fullSong.getArtist();
        
//        ImageIcon ii = mySongs.get(0).getArtist().getImage();
//        ImageIcon ii2 = mySongs.get(1).getArtist().getImage();
//        ImageIcon ii3 = mySongs.get(2).getArtist().getImage();
        //ImageIcon ii = a.getImage();
        if (mySongs.size() == 1){
            ImageIcon ii = mySongs.get(0).getArtist().getImage();
            FirstArtist.setIcon(ii);
            jLabelFirst.setText(mySongs.get(0).getArtistName());
        }
        else if (mySongs.size() == 2){
            ImageIcon ii = mySongs.get(0).getArtist().getImage();
            FirstArtist.setIcon(ii);
            jLabelFirst.setText(mySongs.get(0).getArtistName());
            ImageIcon ii2 = mySongs.get(1).getArtist().getImage();
            SecondArtist.setIcon(ii2);
            jLabelSecond.setText(mySongs.get(1).getArtistName());
        }
        if(mySongs.size()>2){
            ImageIcon ii = mySongs.get(0).getArtist().getImage();
            ImageIcon ii2 = mySongs.get(1).getArtist().getImage();
            ImageIcon ii3 = mySongs.get(2).getArtist().getImage();
            FirstArtist.setIcon(ii);
            SecondArtist.setIcon(ii2);
            ThirdArtist.setIcon(ii3);
            jLabelFirst.setText(mySongs.get(0).getArtistName());
            jLabelSecond.setText(mySongs.get(1).getArtistName());
            jLabelThird.setText(mySongs.get(2).getArtistName());
        }
//          To test above code
        //jTxtAreaPList.setText(artistList.toString());
        //jTxtAreaFav.setText(artistCounts.toString());
        //jTxtAreaArtist.setText(Integer.toString(index));
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        String number = songNumber.getText();
        userPlaylist.removeSong(Integer.valueOf(number)-1);
        userLinks.removeSong(Integer.valueOf(number)-1);
        jTxtAreaPList.setText(userPlaylist.toString());
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnListenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListenActionPerformed
        String number = songNumber.getText();
        openWebpage(userLinks.get(Integer.valueOf(number)-1));
        
    }//GEN-LAST:event_btnListenActionPerformed

    private void songNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songNumberActionPerformed

    private void songFavNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songFavNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songFavNumberActionPerformed

    private void btnAddFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFavActionPerformed
        String number = songNumber.getText();
        int number1 = Integer.valueOf(number)-1;
        if (number1 < userPlaylist.getSize() && number1 >= 0){
            favPlaylist.addSong(userPlaylist.get(number1));
            favLinks.addSong(userLinks.get(number1));
            jTxtAreaFav.setText(favPlaylist.toString());
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid number", "Invalid", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAddFavActionPerformed

    private void ArtistNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArtistNameActionPerformed

    private void btnFavRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavRemoveActionPerformed
        String favNumber = songFavNumber.getText();
       
        if (Integer.valueOf(favNumber)-1 < 0 || Integer.valueOf(favNumber) > favPlaylist.getSize()){
            JOptionPane.showMessageDialog(null, "Invalid number", "Invalid", JOptionPane.ERROR_MESSAGE);
        }
        else{
            favPlaylist.removeSong(Integer.valueOf(favNumber)-1);
            favLinks.removeSong(Integer.valueOf(favNumber)-1);
            jTxtAreaFav.setText(favPlaylist.toString());
        }
            
    }//GEN-LAST:event_btnFavRemoveActionPerformed

    private void btnFavListenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavListenActionPerformed
        String favNumber = songFavNumber.getText();
        openWebpage(favLinks.get(Integer.valueOf(favNumber)-1));
    }//GEN-LAST:event_btnFavListenActionPerformed

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
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ArtistName;
    private javax.swing.JLabel FirstArtist;
    private javax.swing.JLabel SecondArtist;
    private javax.swing.JLabel ThirdArtist;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddFav;
    private javax.swing.JButton btnFavListen;
    private javax.swing.JButton btnFavRemove;
    private javax.swing.JButton btnListen;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFirst;
    private javax.swing.JLabel jLabelSecond;
    private javax.swing.JLabel jLabelThird;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea jTxtAreaFav;
    private javax.swing.JTextArea jTxtAreaPList;
    private javax.swing.JTextField songFavNumber;
    private javax.swing.JTextField songName;
    private javax.swing.JTextField songNumber;
    // End of variables declaration//GEN-END:variables
}
