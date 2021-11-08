
package baitaplabbb;
import java.util.Vector;
import javax.swing.table.*;

public class table extends javax.swing.JFrame {
    Vector vtcData = new Vector();
    Vector vtcHeader = new Vector();
    public table() {
        initComponents();
        vtcHeader.add("ID");vtcHeader.add("First Name");vtcHeader.add("Last Name");vtcHeader.add("Age");
        Vector vtcRow1 = new Vector();
        vtcRow1.add("1");
        vtcRow1.add("Đỗ Quốc ");
        vtcRow1.add("Khánh");
        vtcRow1.add("20");
        vtcData.add(vtcRow1);
        Vector vtcRow2 = new Vector();
        vtcRow2.add("2");
        vtcRow2.add("Lê Duy Anh");
        vtcRow2.add("Dũng");
        vtcRow2.add("20");
        vtcData.add(vtcRow2);
        Vector vtcRow3 = new Vector();
        vtcRow3.add("3");
        vtcRow3.add("Trần Văn");
        vtcRow3.add("Hạ");
        vtcRow3.add("20");
        vtcData.add(vtcRow3);
        Vector vtcRow4 = new Vector();
        vtcRow4.add("4");
        vtcRow4.add("Huỳnh Khắc Anh");
        vtcRow4.add("Khoa");
        vtcRow4.add("20");
        vtcData.add(vtcRow4);
        Vector vtcRow5 = new Vector();
        vtcRow5.add("5");
        vtcRow5.add("Bùi Trung");
        vtcRow5.add("Hiếu");
        vtcRow5.add("20");
        vtcData.add(vtcRow5);
        tbListUser.setModel(new DefaultTableModel(vtcData, vtcHeader));
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbListUser = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbListUser.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbListUser);

        jLabel1.setText("USER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbListUser;
    // End of variables declaration//GEN-END:variables
}
