package guia5package;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class gui5 extends javax.swing.JFrame {
    final float NotaAprueba = 30;
    private int Paso = 0;
    private int Perdio = 0;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo1 = new DefaultTableModel();
    public gui5() {
        initComponents();
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btn3 = new javax.swing.JButton();
        txt3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MostrarGrafico = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero de alumnos:");

        jLabel2.setText("Numero de notas:");

        btn2.setText("Calcular notas finales");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        jTable2.setModel(modelo1);
        jScrollPane2.setViewportView(jTable2);

        btn3.setText("Historial");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre del estudiante ->");

        MostrarGrafico.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout MostrarGraficoLayout = new javax.swing.GroupLayout(MostrarGrafico);
        MostrarGrafico.setLayout(MostrarGraficoLayout);
        MostrarGraficoLayout.setHorizontalGroup(
            MostrarGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MostrarGraficoLayout.setVerticalGroup(
            MostrarGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        jLabel4.setText("Tasa de perdida de la asignatura --> ");

        btn4.setText("Grafico");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(btn2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3))
                            .addComponent(MostrarGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MostrarGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btn4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modelo.setRowCount(Integer.parseInt(txt1.getText()));
        modelo.setColumnCount(Integer.parseInt(txt2.getText()));
        
        modelo1.setRowCount(Integer.parseInt(txt1.getText()));
        modelo1.setColumnCount(3);
        String titulos[] = new String[Integer.parseInt(txt2.getText())];
            for(int i = 0;i<Integer.parseInt(txt2.getText());i++){
                titulos[i] = "Nota "+i; 
            } 
            titulos[0]="Nombre";
            modelo.setColumnIdentifiers(titulos);
       
        String tittle[] = new String[3];
        tittle[0] = "Nombre";
        tittle[1] = "Promedio";
        tittle[2] = "Definitiva";
        modelo1.setColumnIdentifiers(tittle);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        //Tabla de notas y estudiantes
        String n = (String)(modelo.getValueAt(1, 0));
        modelo1.setValueAt(n, 1, 0);
   
        for(int x = 0;x<modelo.getRowCount();x++){
            String nombre = (String)(modelo.getValueAt(x, 0));
            modelo1.setValueAt(nombre, x, 0);
            
            float sum1 = 0; // sumatoria para el promedio
            for(int i = 1 ; i<modelo.getColumnCount()-1;i++){ //Nnotas es la cantidad de notas -1 por que el primero es el nombre
                float nota = Float.parseFloat((String)modelo.getValueAt(x,i)); // trae las notas en el espacio 0,i de la tabla
                sum1 += nota; //suma nota a la suma total
            } 
            float promedio1 = (float) (sum1 / (modelo.getColumnCount()-1)); //guarda en aux la el promedio de las notas guardadas en not[]
            promedio1 = promedio1 + 10;
            String prom1 = String.valueOf(promedio1); //pasa not[] a string    
            if( promedio1 >= NotaAprueba ){ // el promedio es mayor de 30 pasa si o pierde
                String Pasa = "Aprobo"; 
                modelo1.setValueAt(Pasa, x, 2);
            }else if( promedio1 < NotaAprueba){
                String Pierde = "Reprobo"; 
                modelo1.setValueAt(Pierde, x, 2);
            }  
            modelo1.setValueAt(prom1,x,1); // le paso la definiva a la tabla en la posicion 0,1  
            modelo1.fireTableDataChanged();  //actualiza tabla
           
            if(promedio1>NotaAprueba){
                Paso++;
            }else if(promedio1<NotaAprueba){
                Perdio++;
            }
        }
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String aux = txt3.getText();//trae el nombre del estudiante para ver el historial
        int filaEncontrada = -1;
        for(int i=0; i<modelo.getRowCount(); i++){
                String nombre = (String) modelo.getValueAt(i, 0);
                if(aux.equals(nombre)){
                    filaEncontrada = i;
                    break;                  
                    }
                }
        Object [] datosFila = new Object[modelo.getColumnCount()-1];
        if(filaEncontrada!= -1){    
            // Llenar el vector con los datos de la fila
            for(int j = 1 ; j<modelo.getColumnCount();j++){
                double valorCelda = Double.parseDouble(modelo.getValueAt(filaEncontrada, j).toString()); // Convertir el valor de la celda a double
                datosFila[j-1] = valorCelda; 
            }            
        }else{
            System.out.println("No se encontro el estudiante: "+aux);
        }
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        for (int i = 0; i < datosFila.length; i++) {
            datos.addValue((double) datosFila[i], "Calificaciones", "Nota:" + (i + 1));
        }
        JFreeChart grafico = ChartFactory.createBarChart3D("Notas de: "+aux,"Notas","Nota max 5.0", (CategoryDataset) datos,PlotOrientation.VERTICAL,true,true,false);
        ChartPanel panel = new ChartPanel(grafico);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,200));
        MostrarGrafico.setLayout(new BorderLayout());
        MostrarGrafico.add(panel,BorderLayout.NORTH);
        pack();
        repaint();
        MostrarGrafico.repaint();
    }//GEN-LAST:event_btn3ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        int aux = modelo.getRowCount();
        DefaultPieDataset datosGrafico = new DefaultPieDataset();
        datosGrafico.setValue("Pasaron: ", Paso);
        datosGrafico.setValue("Perdieron: ", Perdio);
        JFreeChart grafico1 = ChartFactory.createPieChart("Tasa de mortalidad de la asignatura",datosGrafico,true,true,false);
        //grafico = ChartFactory.createPieChart("nombre",datos del grafico,mostrar leyenda,usar herramientas tooltips ,generar URls);
        ChartPanel panel = new ChartPanel(grafico1);
        panel.setPreferredSize(new Dimension(600,200));
        JFrame frame = new JFrame("Gráfico de Torta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        if(Paso > Perdio || Perdio<Paso){
            System.out.println("El "+(Paso*10)+"% "+"Aprobo la asignatura y El "+(Perdio*10)+"% "+"Reprobo la asignatura");
        }else if(Paso == 0 ){
            System.out.println("El 100% Reprobo la asignatura");
        }else if(Perdio == 0){
            System.out.println("El 100% Aprobo la asignatura");
        }
    }//GEN-LAST:event_btn4ActionPerformed
  
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new gui5().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MostrarGrafico;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}

