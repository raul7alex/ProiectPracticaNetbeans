/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.upm.brebanalexandru.gui;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import ro.upm.brebanalexandru.pojo.StudentPojo;
import ro.upm.brebanalexandru.service.StudentService;
import ro.upm.brebanalexandru.service.StudentServiceImpl;

/**
 *
 * @author Practicant
 */
public class StudentTablePanel extends javax.swing.JPanel {

    private StudentService studentService;
    /**
     * Creates new form StudentTablePanel
     */
    public StudentTablePanel() {
       studentService = new StudentServiceImpl();
       initComponents();
       populate(studentService.getAllStudents());
    }
    
    private void populate(List<StudentPojo> stundents){
        if (stundents == null) return;
        
        Vector header = new Vector();
        int colNr = jTable1.getModel().getColumnCount();
        for(int i=0;i<colNr;i++){
            header.add(jTable1.getModel().getColumnName(i));
        }
        Vector data = new Vector();
        for(StudentPojo stundent:stundents){
            if (stundent == null) continue;
            Vector row = new Vector();
            row.add(stundent.getId());
            row.add(stundent.getFirstName());
            row.add(stundent.getLastName());
            row.add(stundent.getDepartment());
            row.add(stundent.getYear());
            data.add(row);
        }
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        dtm.setDataVector(data, header);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "First Name", "Last Name", "Profile", "Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
