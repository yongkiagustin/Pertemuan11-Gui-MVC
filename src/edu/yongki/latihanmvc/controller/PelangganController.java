/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.yongki.latihanmvc.controller;

import edu.yongki.latihanmvc.model.PelangganModel;
import edu.yongki.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Young
 * Nama : yongki Agustin
 * NIM : 10117903
 * Kelas : IF6K
 */
public class PelangganController {

    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }

    public void resetFrom(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String telepon = view.getTxtTelepon().getText();
        if (nama.equals("") && email.equals("") && telepon.equals("")) {

        } else {
            model.resetForm();
        }

    }

    public void simpanForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String telepon = view.getTxtTelepon().getText();

        if (nama.equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (telepon.equals("")) {
            JOptionPane.showMessageDialog(view, "No Telepon Masih Kosong");
        } else {
            model.simpanForm();
        }

    }

}
