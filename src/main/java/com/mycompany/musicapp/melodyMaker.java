/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.musicapp;

import java.awt.Desktop;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


/**
 *
 * @author troydeminico\
 */
public class melodyMaker extends javax.swing.JFrame {
    
    //SongHashMap test = new SongHashMap();
    
    Playlist userPlaylist = new Playlist();
    Playlist favPlaylist = new Playlist();
    Playlist userLinks = new Playlist();
    Playlist favLinks = new Playlist();
    Playlist fullArtistList = new Playlist();
    List testList = new ArrayList<String>();
    
    //for top artist
    Playlist namesList = new Playlist();
    IntList artistCounts = new IntList();
    Playlist artistList = new Playlist();
    ArrayList<ImageIcon> favImgs = new ArrayList<>();
    
    private static void openWebpage(String url) {
        try {
            Desktop.getDesktop().browse(new java.net.URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void setModel(Playlist playlist, JComboBox<String> jComboBox){
        String[] songs = new String[playlist.getSize()]; 
        for (int i = 0; i < playlist.getSize(); i++) {
            songs[i] = playlist.get(i);
        }
        DefaultComboBoxModel aModel = new DefaultComboBoxModel<>(songs);
        jComboBox.setModel(aModel);
    }
    
    private void reOrder(){
        artistCounts.reorderListsFromGreatestToLeast(artistList, favImgs, namesList);
        if (favImgs.size() == 1){
            ImageIcon ii = favImgs.get(0);
            FirstArtist.setIcon(ii);
            jLabelFirst.setText(namesList.get(0));
            SecondArtist.setIcon(null);
            jLabelSecond.setText(null);
            ThirdArtist.setIcon(null);
            jLabelThird.setText(null);
        }
        else if (favImgs.size() == 2){
            ImageIcon ii = favImgs.get(0);
            FirstArtist.setIcon(ii);
            jLabelFirst.setText(namesList.get(0));
            ImageIcon ii2 = favImgs.get(1);
            SecondArtist.setIcon(ii2);
            jLabelSecond.setText(namesList.get(1));
            ThirdArtist.setIcon(null);
            jLabelThird.setText(null);
        }
        else if(favImgs.size()>2){
            ImageIcon ii = favImgs.get(0);
            ImageIcon ii2 = favImgs.get(1);
            ImageIcon ii3 = favImgs.get(2);
            FirstArtist.setIcon(ii);
            SecondArtist.setIcon(ii2);
            ThirdArtist.setIcon(ii3);
            jLabelFirst.setText(namesList.get(0));
            jLabelSecond.setText(namesList.get(1));
            jLabelThird.setText(namesList.get(2));
        }
        else if (favImgs.isEmpty()){
            FirstArtist.setIcon(null);
            jLabelFirst.setText(null);
        }
    }
    
    /**
     * Creates new form NewJFrame
     */
    public melodyMaker() {
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
        jScrollBar1 = new javax.swing.JScrollBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAreaPList = new javax.swing.JTextArea();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        songName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnAddFav = new javax.swing.JButton();
        btnListen = new javax.swing.JButton();
        jComboBoxSongs = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtAreaFav = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnFavRemove = new javax.swing.JButton();
        btnFavListen = new javax.swing.JButton();
        jComboBoxFavs = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        FirstArtist = new javax.swing.JLabel();
        SecondArtist = new javax.swing.JLabel();
        ThirdArtist = new javax.swing.JLabel();
        jLabelFirst = new javax.swing.JLabel();
        jLabelSecond = new javax.swing.JLabel();
        jLabelThird = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(90, 90, 90));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtAreaPList.setEditable(false);
        jTxtAreaPList.setBackground(new java.awt.Color(190, 190, 190));
        jTxtAreaPList.setColumns(20);
        jTxtAreaPList.setRows(5);
        jScrollPane1.setViewportView(jTxtAreaPList);
        jTxtAreaPList.getAccessibleContext().setAccessibleName("");
        jTxtAreaPList.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, 152));

        btnRemove.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 79, -1));

        jLabel1.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Song");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 64, -1));

        songName.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        songName.setText("Song name");
        songName.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.add(songName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 270, -1));

        btnAdd.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        btnAdd.setText("Search");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        btnAddFav.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        btnAddFav.setText("Favorite");
        btnAddFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFavActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 79, -1));

        btnListen.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        btnListen.setText("Listen");
        btnListen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListenActionPerformed(evt);
            }
        });
        jPanel1.add(btnListen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 80, -1));

        jComboBoxSongs.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        jComboBoxSongs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Songs" }));
        jComboBoxSongs.setToolTipText("");
        jComboBoxSongs.setMaximumSize(new java.awt.Dimension(72, 25));
        jPanel1.add(jComboBoxSongs, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 160, -1));

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel2.setBackground(new java.awt.Color(90, 90, 90));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtAreaFav.setEditable(false);
        jTxtAreaFav.setColumns(20);
        jTxtAreaFav.setRows(5);
        jScrollPane2.setViewportView(jTxtAreaFav);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 26, 320, 259));

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
        jPanel2.add(btnFavRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 79, -1));

        btnFavListen.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        btnFavListen.setText("Listen");
        btnFavListen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavListenActionPerformed(evt);
            }
        });
        jPanel2.add(btnFavListen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 79, -1));

        jComboBoxFavs.setFont(new java.awt.Font("Gurmukhi MN", 0, 12)); // NOI18N
        jComboBoxFavs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Favorites" }));
        jComboBoxFavs.setMaximumSize(new java.awt.Dimension(89, 25));
        jPanel2.add(jComboBoxFavs, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 180, -1));

        jTabbedPane1.addTab("Favorites", jPanel2);

        jPanel3.setBackground(new java.awt.Color(90, 90, 90));
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

        jLabelFirst.setFont(new java.awt.Font("Gurmukhi MN", 0, 18)); // NOI18N
        jLabelFirst.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFirst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabelFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 195, 147, 28));

        jLabelSecond.setFont(new java.awt.Font("Gurmukhi MN", 0, 18)); // NOI18N
        jLabelSecond.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSecond.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabelSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 195, 147, 28));

        jLabelThird.setFont(new java.awt.Font("Gurmukhi MN", 0, 18)); // NOI18N
        jLabelThird.setForeground(new java.awt.Color(255, 255, 255));
        jLabelThird.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabelThird, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 195, 147, 28));

        jTabbedPane1.addTab("Top Artist", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Object selectedValue = null;
        String request = songName.getText();
        boolean hasSpace = request.contains(" ");
        if (hasSpace) {
            request = request.replace(" ", "%20");
                    }
        
        testList = APISearch.searchSong(request);
        Object[] possibleValues = null;
        int selectedIndex = -1;
        
        if (testList != null && !testList.isEmpty()) {
            possibleValues = new Object[testList.size()];
            for (int i = 0; i < testList.size(); i++) {
                possibleValues[i] = testList.get(i);
            }
        
            selectedValue = JOptionPane.showInputDialog(null,
             "Choose Your Song", "Song Choice",
             JOptionPane.INFORMATION_MESSAGE, null,
             possibleValues, possibleValues[0]);
        }
        
        if (selectedValue != null) {
            selectedIndex = -1;
            for (int i = 0; i < possibleValues.length; i++) {
                if (selectedValue.equals(possibleValues[i])) {
                    selectedIndex = i;
                    break;
                }
            }
        }
        
        if (selectedIndex != -1) {  
            Song fullSong = APISearch.getSelectedSongInfo(request, (int) selectedIndex); 

            // create list with song info name - artist
            String newSong = fullSong.getSongInfo();
            userPlaylist.addSong(newSong);


            // Create a list with the links to the added songs
            String newLink = fullSong.getSongLink();
            userLinks.addSong(newLink);



            jTxtAreaPList.setText(userPlaylist.toString());

            String newID = fullSong.getArtistID();
            ImageIcon imgAdd = fullSong.getArtist().getImage();
            fullArtistList.addSong(newID);

            int newCount = 1;
            int index = artistList.compareID(newID);

            if (index != -1){
                artistCounts.increaseCount(index);
            }
            else{
                artistList.addSong(newID);
                artistCounts.addCount(newCount);
                favImgs.add(imgAdd);
                namesList.addSong(fullSong.getArtistName());
            }

            // sets the top artist tab
            reOrder();
            setModel(userPlaylist, jComboBoxSongs);

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int selectedIndex = jComboBoxSongs.getSelectedIndex();
        
        
        if (selectedIndex < userPlaylist.getSize() && selectedIndex >= 0){
            userPlaylist.removeSong(selectedIndex);
            userLinks.removeSong(selectedIndex);
            jTxtAreaPList.setText(userPlaylist.toString());
            
            String compare = fullArtistList.get(selectedIndex);
            fullArtistList.removeSong(selectedIndex);
        
            int index = artistList.compareID(compare);

            if (index != -1){
                if(artistCounts.get(index) == 1){
                    artistCounts.removeCount(index);
                    namesList.removeSong(index);
                    favImgs.remove(index);
                    artistList.removeSong(index);
                }
                else{
                    artistCounts.decreaseCount(index);
                }  
            }
            else{

            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Song", "Invalid", JOptionPane.ERROR_MESSAGE);
        }
        setModel(userPlaylist, jComboBoxSongs);
        
        // sets the top artist tab
        reOrder();
            
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnListenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListenActionPerformed
        int selectedIndex = jComboBoxSongs.getSelectedIndex();
        if (selectedIndex < userPlaylist.getSize() && selectedIndex >= 0){
            openWebpage(userLinks.get(selectedIndex));
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Song", "Invalid", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnListenActionPerformed

    private void btnAddFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFavActionPerformed
        int selectedIndex = jComboBoxSongs.getSelectedIndex();
        if (selectedIndex < userPlaylist.getSize() && selectedIndex >= 0){
            favPlaylist.addSong(userPlaylist.get(selectedIndex));
            favLinks.addSong(userLinks.get(selectedIndex));
            jTxtAreaFav.setText(favPlaylist.toString());
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Song", "Invalid", JOptionPane.ERROR_MESSAGE);
        }
        setModel(favPlaylist, jComboBoxFavs);
        
    }//GEN-LAST:event_btnAddFavActionPerformed

    private void btnFavRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavRemoveActionPerformed
        int selectedIndex = jComboBoxFavs.getSelectedIndex();
       
        if (selectedIndex < 0 || selectedIndex > favPlaylist.getSize()){
            JOptionPane.showMessageDialog(null, "Invalid number", "Invalid", JOptionPane.ERROR_MESSAGE);
        }
        else{
            favPlaylist.removeSong(selectedIndex);
            favLinks.removeSong(selectedIndex);
            jTxtAreaFav.setText(favPlaylist.toString());
        }
        setModel(favPlaylist, jComboBoxFavs);
            
    }//GEN-LAST:event_btnFavRemoveActionPerformed

    private void btnFavListenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavListenActionPerformed
        int selectedIndex = jComboBoxFavs.getSelectedIndex();
        if (selectedIndex < favPlaylist.getSize() && selectedIndex >= 0){
            openWebpage(favLinks.get(selectedIndex));
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Song", "Invalid", JOptionPane.ERROR_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(melodyMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(melodyMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(melodyMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(melodyMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new melodyMaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstArtist;
    private javax.swing.JLabel SecondArtist;
    private javax.swing.JLabel ThirdArtist;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddFav;
    private javax.swing.JButton btnFavListen;
    private javax.swing.JButton btnFavRemove;
    private javax.swing.JButton btnListen;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> jComboBoxFavs;
    private javax.swing.JComboBox<String> jComboBoxSongs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFirst;
    private javax.swing.JLabel jLabelSecond;
    private javax.swing.JLabel jLabelThird;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea jTxtAreaFav;
    private javax.swing.JTextArea jTxtAreaPList;
    private javax.swing.JTextField songName;
    // End of variables declaration//GEN-END:variables
}
