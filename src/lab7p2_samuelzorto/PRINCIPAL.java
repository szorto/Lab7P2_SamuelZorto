/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab7p2_samuelzorto;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

/**
 *
 * @author szorto
 */
public class PRINCIPAL extends javax.swing.JFrame {

    /**
     * Creates new form PRINCIPAL
     */
    public PRINCIPAL() {
        initComponents();
        
        admin au = new admin("./Archivos.sz");
        au.cargarArchivo();
        arc = au.getListaArchivo();
        
        adminCarpeta ac = new adminCarpeta("./Carpetas.sz");
        ac.cargarCarpeta();
        car = ac.getListaCarpeta();
        
        
        
        //hilos
        bitacora b=new bitacora(jpb_link);
        Thread proceso = new Thread(b);
        proceso.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crearArchivo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_extension = new javax.swing.JTextField();
        js_tamanio = new javax.swing.JSpinner();
        jb_crearArchivo2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jd_crearCarpeta = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pp_hilo = new javax.swing.JPopupMenu();
        jmi_hilo = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_algo = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_archivos = new javax.swing.JTree();
        jpb_link = new javax.swing.JProgressBar();
        jb_crearArchivo = new javax.swing.JButton();
        jb_crearCarpeta = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Crear Archivo");

        jb_crearArchivo2.setText("Crear");
        jb_crearArchivo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearArchivo2MouseClicked(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Extension");

        jLabel4.setText("Tama??o (Mb)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jb_crearArchivo2)
                    .addComponent(jtf_extension, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(js_tamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addComponent(jtf_extension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(js_tamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addComponent(jb_crearArchivo2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_crearArchivoLayout = new javax.swing.GroupLayout(jd_crearArchivo.getContentPane());
        jd_crearArchivo.getContentPane().setLayout(jd_crearArchivoLayout);
        jd_crearArchivoLayout.setHorizontalGroup(
            jd_crearArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_crearArchivoLayout.setVerticalGroup(
            jd_crearArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 39, 126));
        jLabel5.setText("Crear Carpeta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel5)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(477, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_crearCarpetaLayout = new javax.swing.GroupLayout(jd_crearCarpeta.getContentPane());
        jd_crearCarpeta.getContentPane().setLayout(jd_crearCarpetaLayout);
        jd_crearCarpetaLayout.setHorizontalGroup(
            jd_crearCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_crearCarpetaLayout.setVerticalGroup(
            jd_crearCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jmi_hilo.setText("Descargar");
        jmi_hilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_hiloActionPerformed(evt);
            }
        });
        pp_hilo.add(jmi_hilo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jl_algo.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jl_algo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mi Unidad", "Destacados", "Papelera" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jl_algo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_algoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_algo);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jt_archivos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_archivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_archivosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_archivos);

        jb_crearArchivo.setText("Crear Archivo");
        jb_crearArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearArchivoMouseClicked(evt);
            }
        });

        jb_crearCarpeta.setText("Crear Carpeta");
        jb_crearCarpeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearCarpetaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpb_link, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jb_crearArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jb_crearCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jpb_link, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_crearArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_crearCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearArchivoMouseClicked
        jd_crearArchivo.setModal(true);
        jd_crearArchivo.pack();
        jd_crearArchivo.setLocationRelativeTo(this);
        jd_crearArchivo.setVisible(true);
    }//GEN-LAST:event_jb_crearArchivoMouseClicked

    private void jb_crearArchivo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearArchivo2MouseClicked
        nombre = jtf_nombre.getText();
        extension = jtf_extension.getText();
        for (int i = 0; i < 10; i++) {
            int random = new Random().nextInt((9 - 0) + 1) + 0;
            int random1 = new Random().nextInt((1 - 0) + 1) + 0;
            switch (random1) {
                case 0:
                    link += random;
                    break;
                case 1:
                    int random2 = new Random().nextInt((1 - 0) + 1) + 0;
                    switch (random2) {
                        case 0:
                            int random3 = new Random().nextInt((90 - 65) + 1) + 65;
                            char rand = (char) random3;
                            link += rand;
                            break;
                        case 1:
                            int random4 = new Random().nextInt((122 - 97) + 1) + 97;
                            char rando = (char) random4;
                            link += rando;
                            break;
                    }
                    break;
            }
        }
        tamanio = (Integer) js_tamanio.getValue();
        a = new archivo(nombre, link, extension, tamanio);
        System.out.println(nombre);
        System.out.println(extension);
        System.out.println(link);
        System.out.println(tamanio);

        
        admin au = new admin("./Archivos.sz");
        au.cargarArchivo();
        arc = au.getListaArchivo();
        
        au.setArchivos(a);
        au.escribirArchivo();
        link = "";
        if (jt_archivos.isSelectionEmpty()) {

//            int row = jt_personajes.getClosestRowForLocation(evt.getX(), evt.getY());
//            jt_personajes.setSelectionRow(row);
//            Object v1 = jt_personajes.getSelectionPath().getLastPathComponent();
//            nodo = (DefaultMutableTreeNode) v1;
        }


    }//GEN-LAST:event_jb_crearArchivo2MouseClicked

    private void jl_algoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_algoMouseClicked

        if (jl_algo.getSelectedValue().equals("Mi Unidad")) {
            admin au = new admin("./Archivos.sz");
            
            DefaultTreeModel m = (DefaultTreeModel) jt_archivos.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            raiz.removeAllChildren();

            for (archivo t : arc) {
                DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(t);
                raiz.add(nodo);
            }

            for (carpeta t : car) {
                DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(t);
                for (archivo o : t.getArc()) {
                    DefaultMutableTreeNode nodo1 = new DefaultMutableTreeNode(o);
                    nodo.add(nodo1);
                }
                raiz.add(nodo);
            }
            m.reload();

//            DefaultTreeModel m = (DefaultTreeModel) jt_archivos.getModel();
//            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
//            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(a);
//            raiz.add(nodo);
//            m.reload();
        } else if (jl_algo.getSelectedValue().equals("Destacados")) {
            DefaultTreeModel m = (DefaultTreeModel) jt_archivos.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            raiz.removeAllChildren();
            m.reload();

        } else if (jl_algo.getSelectedValue().equals("Papelera")) {
            DefaultTreeModel m = (DefaultTreeModel) jt_archivos.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            raiz.removeAllChildren();
            m.reload();

        }

    }//GEN-LAST:event_jl_algoMouseClicked

    private void jb_crearCarpetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearCarpetaMouseClicked
//        jd_crearCarpeta.setModal(true);
//        jd_crearCarpeta.pack();
//        jd_crearCarpeta.setLocationRelativeTo(this);
//        jd_crearCarpeta.setVisible(true);

        nombreCarpeta = JOptionPane.showInputDialog(this, "Ingrese el nombre de la carpeta");
        cantt = 0;
        while (cantt <= 0) {
            String cant = JOptionPane.showInputDialog(this, "Ingrese cantidad de archivos que desea ingresar en la carpeta (Debe ser mayor a 0)");
            cantt = Integer.parseInt(cant);

        }

        for (int i = 0; i < 5; i++) {
            int random = new Random().nextInt((9 - 0) + 1) + 0;
            int random1 = new Random().nextInt((1 - 0) + 1) + 0;
            switch (random1) {
                case 0:
                    link += random;
                    break;
                case 1:
                    int random2 = new Random().nextInt((1 - 0) + 1) + 0;
                    switch (random2) {
                        case 0:
                            int random3 = new Random().nextInt((90 - 65) + 1) + 65;
                            char rand = (char) random3;
                            link += rand;
                            break;
                        case 1:
                            int random4 = new Random().nextInt((122 - 97) + 1) + 97;
                            char rando = (char) random4;
                            link += rando;
                            break;
                    }
                    break;
            }
        }

        c = new carpeta(nombreCarpeta, link);
        link = "";
        
        
        //aqui se crean los nuevos archivos
        for (int i = 0; i < cantt; i++) {
            nombre = JOptionPane.showInputDialog(this, "Ingrese nombre de archivo");
            extension = JOptionPane.showInputDialog(this, "Igrese la extension del archivo");
            for (int j = 0; j < 10; j++) {
                int random = new Random().nextInt((9 - 0) + 1) + 0;
                int random1 = new Random().nextInt((1 - 0) + 1) + 0;
                switch (random1) {
                    case 0:
                        link += random;
                        break;
                    case 1:
                        int random2 = new Random().nextInt((1 - 0) + 1) + 0;
                        switch (random2) {
                            case 0:
                                int random3 = new Random().nextInt((90 - 65) + 1) + 65;
                                char rand = (char) random3;
                                link += rand;
                                break;
                            case 1:
                                int random4 = new Random().nextInt((122 - 97) + 1) + 97;
                                char rando = (char) random4;
                                link += rando;
                                break;
                        }
                        break;
                }
            }
            
            tamanio =  Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese tamanio"));
            a = new archivo(nombre, link, extension, tamanio);
            c.getArc().add(a);
            link = "";
        }
        
        
        adminCarpeta ac = new adminCarpeta("./Carpetas.sz");
        ac.cargarCarpeta();
        car = ac.getListaCarpeta();
        
        ac.setCarpetas(c);
        ac.escribirCarpeta();
        
        
        
        
        System.out.println(car);
        
        
    }//GEN-LAST:event_jb_crearCarpetaMouseClicked

    private void jt_archivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_archivosMouseClicked
        if(SwingUtilities.isRightMouseButton(evt)){
            int row = jt_archivos.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_archivos.setSelectionRow(row);
            pp_hilo.show(evt.getComponent(), evt.getX(), evt.getY());
            
        }
    }//GEN-LAST:event_jt_archivosMouseClicked

    private void jmi_hiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_hiloActionPerformed
        DefaultTreeModel m = (DefaultTreeModel) jt_archivos.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        Object v1 = jt_archivos.getSelectionPath().getLastPathComponent();
        nodoo = (DefaultMutableTreeNode) v1;
        
        
        hiloBarra hc = new hiloBarra();
                hc.setTamanio(40);
                hc.start();
        for (archivo t : arc) {
            if(t.equals(nodoo.getUserObject())){
                hiloBarra hb = new hiloBarra();
                hb.setTamanio(t.getTamanio());
                hb.start();
            }
        }
        
        for (carpeta t : car) {
            if(t.equals(nodoo.getUserObject())){
                
            }
        }
        
        
    }//GEN-LAST:event_jmi_hiloActionPerformed

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
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_crearArchivo;
    private javax.swing.JButton jb_crearArchivo2;
    private javax.swing.JButton jb_crearCarpeta;
    private javax.swing.JDialog jd_crearArchivo;
    private javax.swing.JDialog jd_crearCarpeta;
    private javax.swing.JList<String> jl_algo;
    private javax.swing.JMenuItem jmi_hilo;
    private javax.swing.JProgressBar jpb_link;
    private javax.swing.JSpinner js_tamanio;
    private javax.swing.JTree jt_archivos;
    private javax.swing.JTextField jtf_extension;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JPopupMenu pp_hilo;
    // End of variables declaration//GEN-END:variables
    private String nombre, link = "", extension;
    private double tamanio;

    private ArrayList<archivo> arc = new ArrayList();
    private ArrayList<carpeta> car = new ArrayList();
    archivo a;
    carpeta c;
    int cantt;
    private String nombreCarpeta;
    DefaultMutableTreeNode nodoo;

}
