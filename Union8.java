import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class union8 extends javax.swing.JFrame {

   
    public Union8() {
        initComponents();
        
        public static final USERNAME = "tree";
		
        public static final PASSWORD = "1111";
		
        public static final HOST = "localhost";
		
        public static final PORT = "8080";
		
        public static final DATABASE = "login";
		
        public static final CLASSNAME = "java.sql.Driver";
		
        public static final URL ="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
		
        public static final Connection con;

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
        
    }


    public Conexion() throws SQLException{
        try{
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e){
            System.err.println("ERROR " + e);
            
        } catch(SQLException e) {
            System.err.println("ERROR " + e);
            
        } 
    }
    
    public Connection getConexion(){
        return con;
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botn.setText("Conectar");
        botn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(botn)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(botn)
                .addGap(131, 131, 131))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botnActionPerformed










    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Conector8().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botn;
    // End of variables declaration//GEN-END:variables
}