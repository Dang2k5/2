
package com.QuanLyThuVien.view;

import com.QuanLyThuVien.model.Book;
import com.QuanLyThuVien.model.User;
import com.QuanLyThuVien.service.BookService;
import com.QuanLyThuVien.service.UserService;
import com.QuanLyThuVien.view.bill.ManageBillsFrame;
import com.QuanLyThuVien.view.book.ManageBooksFrame;
import com.QuanLyThuVien.view.category.ManageCategoryFrame;
import com.QuanLyThuVien.view.reader.ManageReadersFrame;
import com.QuanLyThuVien.view.user.ManageUsersFrame;
import java.util.List;


public class ReaderFrame extends javax.swing.JFrame {
    public ReaderFrame() {
        initComponents();
        setLocationRelativeTo(null);
        BookService bookService = new BookService();
        List<Book> books = bookService.getAllBook();
        int stt_book = 0;
        for(Book i : books){
            stt_book++;
        }
        
        jlb_book.setText(String.valueOf(stt_book));
        UserService userService = new UserService();
        List<User> users = userService.getAllUser();
        int stt_user = 0;
        for(User i : users){
            stt_user++;
        }
        jlb_user.setText(String.valueOf(stt_user));
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jlbmuontra = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jlbmuontrasach1 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jlbmuontrasach2 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jlbmuontrasach3 = new javax.swing.JLabel();
        jlbmuontrasach4 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jlb_doiMK = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jlb_book = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jlb_user = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlbexit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 254));

        jPanel5.setBackground(new java.awt.Color(153, 153, 254));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(153, 153, 254));
        jPanel21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(153, 153, 254));
        jPanel22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel24.setBackground(new java.awt.Color(153, 153, 254));
        jPanel24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBackground(new java.awt.Color(153, 153, 254));
        jPanel25.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(153, 153, 254));
        jPanel26.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(153, 153, 254));
        jPanel27.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel25.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel61.setBackground(new java.awt.Color(153, 153, 254));
        jPanel61.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel61MouseClicked(evt);
            }
        });
        jPanel61.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel62.setBackground(new java.awt.Color(153, 153, 254));
        jPanel62.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel63.setBackground(new java.awt.Color(153, 153, 254));
        jPanel63.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel63.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel62.add(jPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel61.add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel64.setBackground(new java.awt.Color(153, 153, 254));
        jPanel64.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel64.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel65.setBackground(new java.awt.Color(153, 153, 254));
        jPanel65.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel65.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel66.setBackground(new java.awt.Color(153, 153, 254));
        jPanel66.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel67.setBackground(new java.awt.Color(153, 153, 254));
        jPanel67.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel67.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbmuontra.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jlbmuontra.setForeground(new java.awt.Color(255, 255, 255));
        jlbmuontra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyThuVien/images/icon_menu0_white_24dp.png"))); // NOI18N
        jlbmuontra.setText("MƯỢN TRẢ SÁCH");
        jlbmuontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbmuontraMouseClicked(evt);
            }
        });
        jPanel67.add(jlbmuontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 60));

        jPanel66.add(jPanel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel65.add(jPanel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel64.add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel61.add(jPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel7.setBackground(new java.awt.Color(153, 153, 254));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(153, 153, 254));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyThuVien/images/icon_menu0_white_24dp.png"))); // NOI18N
        jLabel7.setText("MÀN HÌNH CHÍNH");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 250, 60));

        jPanel7.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel9.setBackground(new java.awt.Color(153, 153, 254));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(153, 153, 254));
        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbmuontrasach1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jlbmuontrasach1.setForeground(new java.awt.Color(255, 255, 255));
        jlbmuontrasach1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyThuVien/images/icon_menu0_white_24dp.png"))); // NOI18N
        jlbmuontrasach1.setText("THỂ LOẠI");
        jlbmuontrasach1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbmuontrasach1MouseClicked(evt);
            }
        });
        jPanel12.add(jlbmuontrasach1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 190, 60));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel19.setBackground(new java.awt.Color(153, 153, 254));
        jPanel19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbmuontrasach2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jlbmuontrasach2.setForeground(new java.awt.Color(255, 255, 255));
        jlbmuontrasach2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyThuVien/images/icon_menu0_white_24dp.png"))); // NOI18N
        jlbmuontrasach2.setText("THỂ LOẠI");
        jlbmuontrasach2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbmuontrasach2MouseClicked(evt);
            }
        });
        jPanel19.add(jlbmuontrasach2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 190, 60));

        jPanel20.setBackground(new java.awt.Color(153, 153, 254));
        jPanel20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbmuontrasach3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jlbmuontrasach3.setForeground(new java.awt.Color(255, 255, 255));
        jlbmuontrasach3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyThuVien/images/icon_menu0_white_24dp.png"))); // NOI18N
        jlbmuontrasach3.setText("THỂ LOẠI");
        jlbmuontrasach3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbmuontrasach3MouseClicked(evt);
            }
        });
        jPanel20.add(jlbmuontrasach3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 190, 60));

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel9.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlbmuontrasach4.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jlbmuontrasach4.setForeground(new java.awt.Color(255, 255, 255));
        jlbmuontrasach4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyThuVien/images/icon_menu0_white_24dp.png"))); // NOI18N
        jlbmuontrasach4.setText("THỂ LOẠI");
        jlbmuontrasach4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbmuontrasach4MouseClicked(evt);
            }
        });
        jPanel9.add(jlbmuontrasach4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 190, 60));

        jPanel28.setBackground(new java.awt.Color(153, 153, 254));
        jPanel28.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(153, 153, 254));
        jPanel29.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setBackground(new java.awt.Color(153, 153, 254));
        jPanel30.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(153, 153, 254));
        jPanel31.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel30.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel29.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel28.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel32.setBackground(new java.awt.Color(153, 153, 254));
        jPanel32.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBackground(new java.awt.Color(153, 153, 254));
        jPanel33.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel34.setBackground(new java.awt.Color(153, 153, 254));
        jPanel34.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setBackground(new java.awt.Color(153, 153, 254));
        jPanel35.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel34.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel33.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel32.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel28.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlb_doiMK.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jlb_doiMK.setForeground(new java.awt.Color(255, 255, 255));
        jlb_doiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyThuVien/images/icon_menu0_white_24dp.png"))); // NOI18N
        jlb_doiMK.setText("ĐỔI MẬT KHẨU");
        jlb_doiMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_doiMKMouseClicked(evt);
            }
        });
        jPanel28.add(jlb_doiMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 245, 60));

        jPanel36.setBackground(new java.awt.Color(153, 153, 254));
        jPanel36.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel37.setBackground(new java.awt.Color(153, 153, 254));
        jPanel37.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel38.setBackground(new java.awt.Color(153, 153, 254));
        jPanel38.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel39.setBackground(new java.awt.Color(153, 153, 254));
        jPanel39.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel38.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel37.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel36.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel40.setBackground(new java.awt.Color(153, 153, 254));
        jPanel40.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel41.setBackground(new java.awt.Color(153, 153, 254));
        jPanel41.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel42.setBackground(new java.awt.Color(153, 153, 254));
        jPanel42.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel43.setBackground(new java.awt.Color(153, 153, 254));
        jPanel43.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel42.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        jPanel41.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel40.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel36.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 610));

        jPanel13.setBackground(new java.awt.Color(153, 255, 153));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb_book.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jlb_book.setForeground(new java.awt.Color(0, 153, 204));
        jlb_book.setText("10");
        jPanel13.add(jlb_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("SỐ ĐẦU SÁCH");
        jPanel13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, -1));

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 140, 100));

        jPanel14.setBackground(new java.awt.Color(255, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb_user.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jlb_user.setForeground(new java.awt.Color(0, 153, 204));
        jlb_user.setText("10");
        jPanel14.add(jlb_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel18.setBackground(new java.awt.Color(153, 255, 153));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 204));
        jLabel17.setText("10");
        jPanel18.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("MƯỢN QUÁ HẠN");
        jPanel18.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 250, -1));

        jPanel14.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 120, 100));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("SỐ NGƯỜI DÙNG");
        jPanel14.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, -1));

        jPanel2.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 140, 100));

        jPanel16.setBackground(new java.awt.Color(204, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("10");
        jPanel16.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("SÁCH ĐANG MƯỢN");
        jPanel16.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, -1));

        jPanel2.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 140, 100));

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 204));
        jLabel15.setText("10");
        jPanel17.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("MƯỢN QUÁ HẠN");
        jPanel17.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, -1));

        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 140, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1020, 500));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyThuVien/images/icons8_menu_48px_1.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel15.setBackground(new java.awt.Color(255, 102, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 5, 50));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Library Management System");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jlbexit.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        jlbexit.setForeground(new java.awt.Color(255, 255, 255));
        jlbexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyThuVien/images/close.png"))); // NOI18N
        jlbexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbexitMouseClicked(evt);
            }
        });
        jPanel3.add(jlbexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 20, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyThuVien/images/male_user_50px.png"))); // NOI18N
        jLabel6.setText("Welcome, Admin");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 200, -1));

        btn_logout.setBackground(new java.awt.Color(0, 0, 204));
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Đăng xuất");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel3.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1020, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbexitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlbexitMouseClicked

    private void jlb_doiMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_doiMKMouseClicked
        ChangePasswordFrame cpf = new ChangePasswordFrame();
        cpf.setVisible(true);
        cpf.pack();
        cpf.setLocationRelativeTo(null);
        cpf.setResizable(false);       
    }//GEN-LAST:event_jlb_doiMKMouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null); 
        loginFrame.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void jlbmuontrasach1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbmuontrasach1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbmuontrasach1MouseClicked

    private void jlbmuontrasach2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbmuontrasach2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbmuontrasach2MouseClicked

    private void jlbmuontrasach3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbmuontrasach3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbmuontrasach3MouseClicked

    private void jlbmuontrasach4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbmuontrasach4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbmuontrasach4MouseClicked

    private void jlbmuontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbmuontraMouseClicked
        ManageCategoryFrame mcf = new ManageCategoryFrame();
        mcf.setVisible(true);
        mcf.pack();
        mcf.setLocationRelativeTo(null);
        mcf.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jlbmuontraMouseClicked

    private void jPanel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel61MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel61MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReaderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReaderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReaderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReaderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReaderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlb_book;
    private javax.swing.JLabel jlb_doiMK;
    private javax.swing.JLabel jlb_user;
    private javax.swing.JLabel jlbexit;
    private javax.swing.JLabel jlbmuontra;
    private javax.swing.JLabel jlbmuontrasach1;
    private javax.swing.JLabel jlbmuontrasach2;
    private javax.swing.JLabel jlbmuontrasach3;
    private javax.swing.JLabel jlbmuontrasach4;
    // End of variables declaration//GEN-END:variables
}
