/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques_juego;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angie
 */
public class AgregarUsuario extends javax.swing.JPanel {

    /**
     * Creates new form AgregarUsuario
     */
    public static Jugador jugador;
    public static DefaultTableModel table_model_personas;
    public static DefaultTableModel table_model_personas1;
    public static DefaultTableModel table_model_personas2;
    Principal pr = new Principal();

    public AgregarUsuario() {
        initComponents();
    }
    public void setTableModel(DefaultTableModel table_model_personas){
        this.table_model_personas = table_model_personas;
    }
    public void setTableModel1(DefaultTableModel table_model_personas1){
        this.table_model_personas1= table_model_personas1;
    }
    public void setTableModel2(DefaultTableModel table_model_personas2){
        this.table_model_personas2 = table_model_personas2;
    }
    
    public void refreshTableModel()
    {
        ArrayList<Jugador> lista_personas = Insertar.obtenerTodos();
        while (table_model_personas.getRowCount() > 0) {
            table_model_personas.removeRow(0);
        }
        
        for(Jugador p : lista_personas)
        {
            String[] data = {Integer.toString(p.getId()),p.getFoto(), Integer.toString(p.getCedula()), p.getNombre(),p.getApellido(),Integer.toString(p.getEdad()), p.getFechan(),p.getAho()};
            table_model_personas.addRow(data);
        }
    }
    public void refreshTableModel1()
    {
        ArrayList<Jugador> lista_personas1 = Insertar.obtenerTodos1();
        while (table_model_personas1.getRowCount() > 0) {
            table_model_personas1.removeRow(0);
        }
        
        for(Jugador p : lista_personas1)
        {
            String[] data = {Integer.toString(p.getId()),p.getFoto(), Integer.toString(p.getCedula()), p.getNombre(),p.getApellido(),Integer.toString(p.getEdad()), p.getFechan(),p.getAho()};
            table_model_personas1.addRow(data);
        }
    }
    public void refreshTableModel2()
    {
        ArrayList<Jugador> lista_personas2 = Insertar.obtenerTodos2();
        while (table_model_personas2.getRowCount() > 0) {
            table_model_personas2.removeRow(0);
        }
        
        for(Jugador p : lista_personas2)
        {
            String[] data = {Integer.toString(p.getId()),p.getFoto(), Integer.toString(p.getCedula()), p.getNombre(),p.getApellido(),Integer.toString(p.getEdad()), p.getFechan(),p.getAho()};
            table_model_personas2.addRow(data);
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

        jLabel1 = new javax.swing.JLabel();
        jl_foto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cedulatext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombretext = new javax.swing.JTextField();
        apellidotext = new javax.swing.JTextField();
        edadtext = new javax.swing.JTextField();
        fechanactext = new javax.swing.JTextField();
        agrfoto = new javax.swing.JButton();
        agrusuario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rutatext = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 153, 255));
        setName("panelAgregar"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("DATOS JUGADORES");

        jl_foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 51)));

        jLabel2.setText("FOTO");

        jLabel3.setText("CÉDULA:");

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("APELLIDO:");

        jLabel6.setText("EDAD:");

        jLabel7.setText("FECHA DE NACIMIENTO:");

        agrfoto.setBackground(new java.awt.Color(153, 153, 255));
        agrfoto.setText("AGREGAR FOTO");
        agrfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agrfotoActionPerformed(evt);
            }
        });

        agrusuario.setBackground(new java.awt.Color(102, 255, 204));
        agrusuario.setText("AGREGAR USUARIO");
        agrusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agrusuarioActionPerformed(evt);
            }
        });

        jLabel9.setText("DIRECCIÓN DE UBICACIÓN DE LA FOTO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agrfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(agrusuario))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rutatext, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cedulatext)
                                            .addComponent(nombretext)
                                            .addComponent(apellidotext)
                                            .addComponent(edadtext)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fechanactext)))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cedulatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombretext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(apellidotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(edadtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(fechanactext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agrusuario)
                            .addComponent(agrfoto))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void agrusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrusuarioActionPerformed
        try {
            if (nombretext.getText().isEmpty() || rutatext.getText().isEmpty() ||cedulatext.getText().isEmpty()
                || apellidotext.getText().isEmpty() || edadtext.getText().isEmpty() || fechanactext.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor diligencie todo el formulario", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                jugador = Jugador.crear(0, rutatext.getText(), Integer.parseInt(cedulatext.getText()), nombretext.getText(), apellidotext.getText(), Integer.parseInt(edadtext.getText()), fechanactext.getText(), Jugador.aho);
                Insertar.crear(jugador);
                JOptionPane.showMessageDialog(this, "Persona creada satisfactoriamente", "Bien", JOptionPane.INFORMATION_MESSAGE);
              
        }      

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos mal ingresados", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_agrusuarioActionPerformed

    private void agrfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrfotoActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos JPEG(*.JPG;*.JPEG)", "jpg","jpeg");
        JFileChooser seleccionar = new JFileChooser();
        seleccionar.addChoosableFileFilter(filtro);
        seleccionar.setDialogTitle("Seleccionar Imagen");
        File ruta = new File("C:\\Users\\Pavilion 15\\Pictures");
        seleccionar.setCurrentDirectory(ruta);
        int aux = seleccionar.showOpenDialog(null);
        if(aux==JFileChooser.APPROVE_OPTION){
            File file = seleccionar.getSelectedFile();
            rutatext.setText(String.valueOf(file));
            Image foto= getToolkit().getImage(rutatext.getText());
            foto = foto.getScaledInstance(120, 140, Image.SCALE_DEFAULT);
            jl_foto.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_agrfotoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agrfoto;
    private javax.swing.JButton agrusuario;
    private javax.swing.JTextField apellidotext;
    private javax.swing.JTextField cedulatext;
    private javax.swing.JTextField edadtext;
    private javax.swing.JTextField fechanactext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jl_foto;
    private javax.swing.JTextField nombretext;
    private javax.swing.JTextField rutatext;
    // End of variables declaration//GEN-END:variables
}
