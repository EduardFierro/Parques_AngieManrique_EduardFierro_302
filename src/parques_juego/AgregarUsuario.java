/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques_juego;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import static parques_juego.Principal.panelPrincipal;

/**
 *
 * @author Angie
 */
public class AgregarUsuario extends javax.swing.JPanel {

    /**
     * Creates new form AgregarUsuario
     */
    //declaracion de variables
    private Timestamp ahora12;
    private Date fecha1;
    private LocalDate fechan;
    public static int cont=0;
    public static Jugador jugador;
    public static DefaultTableModel table_model_personas;
    public static DefaultTableModel table_model_personas1;
    public static DefaultTableModel table_model_personas2;
    Principal pr = new Principal();

    public AgregarUsuario() {
        initComponents();
    }
    //conructor de la tabla recive parametro DefaultTableMode
    public void setTableModel(DefaultTableModel table_model_personas){
        this.table_model_personas = table_model_personas;
    }
    public void setTableModel1(DefaultTableModel table_model_personas1){
        this.table_model_personas1= table_model_personas1;
    }
    public void setTableModel2(DefaultTableModel table_model_personas2){
        this.table_model_personas2 = table_model_personas2;
    }
    //actualiza la tabla segun la informacion de la base de datos 
    public void refreshTableModel()
    {
        ArrayList<Jugador> lista_personas = Insertar.obtenerTodos();
        while (table_model_personas.getRowCount() > 0) {
            table_model_personas.removeRow(0);
        }
        
        for(Jugador p : lista_personas)
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         
            String fecha1 = sdf.format(p.getFechan());
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
         
            String fecha2 = sdf.format(p.getAho());
            String[] data = {Integer.toString(p.getId()),p.getFoto(), Integer.toString(p.getCedula()), p.getNombre(),p.getApellido(),Integer.toString(p.getEdad()),fecha1, fecha2};
            table_model_personas.addRow(data);
        }
    }
    //actualiza la tabla segun la informacion de la base de datos 
    public void refreshTableModel1()
    {
        ArrayList<Jugador> lista_personas1 = Insertar.obtenerTodos1();
        while (table_model_personas1.getRowCount() > 0) {
            table_model_personas1.removeRow(0);
        }
        
        for(Jugador p : lista_personas1)
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         
            String fecha1 = sdf.format(p.getFechan());
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
         
            String fecha2 = sdf.format(p.getAho());
            String[] data = {Integer.toString(p.getId()),p.getFoto(), Integer.toString(p.getCedula()), p.getNombre(),p.getApellido(),Integer.toString(p.getEdad()),fecha1, fecha2};
            table_model_personas1.addRow(data);
        }
    }
    //actualiza la tabla segun la informacion de la base de datos 
    public void refreshTableModel2()
    {
        ArrayList<Jugador> lista_personas2 = Insertar.obtenerTodos2();
        while (table_model_personas2.getRowCount() > 0) {
            table_model_personas2.removeRow(0);
        }
        
        for(Jugador p : lista_personas2)
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         
            String fecha1 = sdf.format(p.getFechan());
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
         
            String fecha2 = sdf.format(p.getAho());
            String[] data = {Integer.toString(p.getId()),p.getFoto(), Integer.toString(p.getCedula()), p.getNombre(),p.getApellido(),Integer.toString(p.getEdad()), fecha1,fecha2};
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        menu = new javax.swing.JButton();

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

        rutatext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutatextActionPerformed(evt);
            }
        });

        jLabel9.setText("DIRECCIÓN DE UBICACIÓN DE LA FOTO:");

        jLabel10.setText("Año");

        jLabel11.setText("Mes");

        jLabel12.setText("Dia");

        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });

        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fechanactext, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel11)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agrfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(menu)
                                .addGap(69, 69, 69)))
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutatext, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(agrusuario)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(fechanactext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agrfoto)
                    .addComponent(agrusuario))
                .addGap(35, 35, 35)
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void agrusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrusuarioActionPerformed
        
                    
        try {
            //validacion de los TextField que no esten vacios
            if (nombretext.getText().isEmpty() || rutatext.getText().isEmpty() ||cedulatext.getText().isEmpty()
                || apellidotext.getText().isEmpty() || edadtext.getText().isEmpty() || fechanactext.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor diligencie todo el formulario", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                cont++;
                LocalDateTime ahora = LocalDateTime.now();
                fechan = LocalDate.of(Integer.parseInt(fechanactext.getText()), Month.of(Integer.parseInt(mes.getText())), Integer.parseInt(dia.getText()));
                    fecha1 = Date.valueOf(fechan);
                    ahora12 = Timestamp.valueOf(ahora);
                //agregar los datos del panel al metodo crear de la clase jugador
                jugador = Jugador.crear(0, rutatext.getText(), Integer.parseInt(cedulatext.getText()), nombretext.getText(), apellidotext.getText(), Integer.parseInt(edadtext.getText()), fecha1, ahora12);
                Insertar.crear(jugador);
                JOptionPane.showMessageDialog(this, "Persona creada satisfactoriamente", "Bien", JOptionPane.INFORMATION_MESSAGE);
             
        }      
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos mal ingresados", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_agrusuarioActionPerformed

    private void agrfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrfotoActionPerformed
        //crea filtro para el JFileChooser con los formatos de imagen
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos JPEG(*.JPG;*.JPEG)", "jpg","jpeg");
        JFileChooser seleccionar = new JFileChooser();
        seleccionar.addChoosableFileFilter(filtro);
        seleccionar.setDialogTitle("Seleccionar Imagen");
        File ruta = new File("C:\\Users\\Pavilion 15\\Pictures");
        seleccionar.setCurrentDirectory(ruta);
        int aux = seleccionar.showOpenDialog(null);
        //agrega la imagen al JLabel
        if(aux==JFileChooser.APPROVE_OPTION){
            File file = seleccionar.getSelectedFile();
            rutatext.setText(String.valueOf(file));
            Image foto= getToolkit().getImage(rutatext.getText());
            foto = foto.getScaledInstance(120, 140, Image.SCALE_DEFAULT);
            jl_foto.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_agrfotoActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesActionPerformed

    private void rutatextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutatextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutatextActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        MenuOpt menu = new MenuOpt();
        menu.setVisible(true);
        
    }//GEN-LAST:event_menuActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agrfoto;
    private javax.swing.JButton agrusuario;
    private javax.swing.JTextField apellidotext;
    private javax.swing.JTextField cedulatext;
    private javax.swing.JTextField dia;
    private javax.swing.JTextField edadtext;
    private javax.swing.JTextField fechanactext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jl_foto;
    private javax.swing.JButton menu;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField nombretext;
    private javax.swing.JTextField rutatext;
    // End of variables declaration//GEN-END:variables
}
