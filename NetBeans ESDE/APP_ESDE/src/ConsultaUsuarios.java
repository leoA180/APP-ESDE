
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author adria
 */
public class ConsultaUsuarios extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    String titulos[] = {"id","Nombre","Usuario","Password","Telefono","Tipo Usuario","Area"};
    String fila[] = new String [7];
    DefaultTableModel modelo;
     
    public ConsultaUsuarios() {
        initComponents();
        this.setTitle("Consulta Usuarios");
        this.setLocation(335,200);
        this.setResizable(false);
        ImageIcon icono = new ImageIcon("");
        this.setIconImage(icono.getImage());

      
            try {
            
            String url = "jdbc:mysql://localhost:3306/appesde";
            String usuario = "root";
            String contraseña = "321904";  
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             con = DriverManager.getConnection(url,usuario,contraseña);
             if (con!= null)
                   System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
               
               stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery("select* from usuarios");
               
               modelo = new DefaultTableModel(null,titulos);
            
               while(rs.next()) {
                   
                   fila[0] = rs.getString("ID");
                   fila[1] = rs.getString("Nombre");
                   fila[2] = rs.getString("Usuario Dominio");
                   fila[3] = rs.getString("Pass");
                   fila[4] = rs.getString("Telefono");
                   fila[5] = rs.getString("Tipo Usuario");
                   fila[6] = rs.getString("Area");
                   
                   modelo.addRow(fila);     
               }
               tabla_usuarios.setModel(modelo);
                TableColumn ci = tabla_usuarios.getColumn("id");
                ci.setMaxWidth(25);
                TableColumn cn = tabla_usuarios.getColumn("Nombre");
                cn.setMaxWidth(250);
                TableColumn cd = tabla_usuarios.getColumn("Usuario");
                cd.setMaxWidth(175);
                TableColumn ct = tabla_usuarios.getColumn("Password");
                ct.setMaxWidth(120);
                TableColumn cnick = tabla_usuarios.getColumn("Telefono");
                cnick.setMaxWidth(100);
                TableColumn cp = tabla_usuarios.getColumn("Tipo Usuario");
                cp.setMaxWidth(160);
                TableColumn ctipo = tabla_usuarios.getColumn("Area");
                ctipo.setMaxWidth(120);
                
               
               
        }
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
        }

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        BarraMenu = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        MenuRegistro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_usuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 360));

        MenuArchivo.setText("Archivo");

        MenuRegistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        MenuRegistro.setText("Registro Usuarios");
        MenuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuRegistro);

        BarraMenu.add(MenuArchivo);

        setJMenuBar(BarraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistroActionPerformed
        
        this.dispose();
        Usuarios u = new Usuarios();
        u.setVisible(true);
    }//GEN-LAST:event_MenuRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenuItem MenuRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_usuarios;
    // End of variables declaration//GEN-END:variables
}
