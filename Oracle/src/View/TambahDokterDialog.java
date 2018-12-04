/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Model_RS.*;
import java.awt.Font;

/**
 *
 * @author user only
 */
public class TambahDokterDialog extends JDialog {

    private RumahSakit rumahSakit;
    private JLabel tambahDokterLabel;
    private JLabel idDokterLabel;
    private JTextField idDokterText;
    private JLabel namaDokterLabel;
    private JTextField namaDokterText;
    private JButton tambahButton;
    private MyDokterDialog owner;

    public TambahDokterDialog(MyDokterDialog owner, RumahSakit rs) {
        super(owner);
        this.owner = owner;
        rumahSakit = rs;
        init();
    }

    /**
     * Fungsi untuk inisialisasi
     */
    public void init() {
        // set size
        setSize(400, 300);
        // set layout
        setLayout(null);
        // tambah dokter label
        tambahDokterLabel = new JLabel("Tambah Dokter");
        tambahDokterLabel.setBounds(50, 0, 100, 50);
        add(tambahDokterLabel);

        // id dokter lebel
        idDokterLabel = new JLabel("ID DOKTER");
        idDokterLabel.setBounds(10, 50, 100, 30);
        add(idDokterLabel);

        // id dokter text field
        idDokterText = new JTextField(150);
        idDokterText.setBounds(100, 50, 150, 30);
        add(idDokterText);

        //nama dokter label
        namaDokterLabel = new JLabel("NAMA");
        namaDokterLabel.setBounds(10, 80, 100, 30);
        add(namaDokterLabel);

        //nama dokter text field
        namaDokterText = new JTextField(100);
        namaDokterText.setBounds(100, 80, 150, 30);
        add(namaDokterText);

        // tambah Tombol Tambah
        tambahButton = new JButton("Tambah");
        tambahButton.setBounds(50, 200, 100, 30);
        add(tambahButton);

        // set action listener button
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahDokter();
            }
        });
    }

    public void tambahDokter() {
        Dokter dokter = new Dokter();
        dokter.setIdDokter(idDokterText.getText());
        dokter.setNama(namaDokterText.getText());
        rumahSakit.tambahDokter(dokter);

        owner.refreshTabelDokter();

        dispose();
    }
}
