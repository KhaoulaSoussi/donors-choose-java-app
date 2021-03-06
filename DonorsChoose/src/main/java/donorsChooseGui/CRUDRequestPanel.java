/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donorsChooseGui;

/**
 *
 * @author hp
 */
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import project.Category;
import static donorsChooseGui.DonorsChooseFrame.projects;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import project.ProjectRequest;

public class CRUDRequestPanel extends javax.swing.JPanel {
    DefaultListModel<ProjectRequest> model;

    /**
     * Creates new form AddProjectRequestPanel
     */
    public CRUDRequestPanel() {
        model = new DefaultListModel<>();
        initComponents();
        projectsList.setModel(model);
        Iterator<ProjectRequest> iter = projects.getProjects();
        while(iter.hasNext()){
            ProjectRequest prj = iter.next();
            model.addElement(prj);
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

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        descriptionTxt = new javax.swing.JTextField();
        deadlineLabel = new javax.swing.JLabel();
        categoryComBox = new javax.swing.JComboBox<>();
        institutionLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        institutionTxt = new javax.swing.JTextField();
        studGradeLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        studGradeComBox = new javax.swing.JComboBox<>();
        funGoalTxt = new javax.swing.JTextField();
        deadlineTxt = new javax.swing.JTextField();
        titleTxt = new javax.swing.JTextField();
        funGoalLabel = new javax.swing.JLabel();
        addRequestBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectsList = new javax.swing.JList<>();

        jButton2.setText("jButton2");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("To add a new project request, please fill in the form. ");

        jSeparator1.setBackground(new java.awt.Color(255, 0, 51));

        jSeparator2.setForeground(new java.awt.Color(255, 0, 51));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("To view the information of a project request, please select it from the list. ");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descriptionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTxtActionPerformed(evt);
            }
        });

        deadlineLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        deadlineLabel.setText("Deadline:");
        deadlineLabel.setToolTipText("The deadline should be written in the following format: day/month/year");

        categoryComBox.setModel(new javax.swing.DefaultComboBoxModel<>(Category.values()));

        institutionLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        institutionLabel.setText("Instutution:");

        titleLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titleLabel.setText("Title:");

        categoryLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        categoryLabel.setText("Category:");

        studGradeLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        studGradeLabel.setText("Students' Grade:");

        descriptionLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        descriptionLabel.setText("Description:");

        studGradeComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new Character[] { 'A', 'B', 'C', 'D' , 'F'}));

        deadlineTxt.setToolTipText("");

        titleTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTxtActionPerformed(evt);
            }
        });

        funGoalLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        funGoalLabel.setText("Funding Goal:");

        addRequestBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        addRequestBtn.setForeground(new java.awt.Color(0, 0, 255));
        addRequestBtn.setText("Add Request");
        addRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRequestBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        deleteBtn.setText("Delete Request");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        editBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(153, 0, 153));
        editBtn.setText("Edit Request");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 0, 0));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(titleLabel)
                    .addComponent(studGradeLabel)
                    .addComponent(funGoalLabel)
                    .addComponent(categoryLabel)
                    .addComponent(institutionLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(deadlineLabel)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studGradeComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funGoalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(institutionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deadlineTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addRequestBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionLabel))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studGradeComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studGradeLabel))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funGoalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funGoalLabel))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryLabel))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(institutionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(institutionLabel))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deadlineTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deadlineLabel))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRequestBtn)
                    .addComponent(deleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(clearBtn))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {titleLabel, titleTxt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {descriptionLabel, descriptionTxt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {studGradeComBox, studGradeLabel});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {funGoalLabel, funGoalTxt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {categoryComBox, categoryLabel});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {institutionLabel, institutionTxt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deadlineLabel, deadlineTxt});

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Project Requests List:");

        projectsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        projectsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                projectsListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(projectsList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRequestBtnActionPerformed
        String title = titleTxt.getText();
        ProjectRequest prj = projects.searchByTitle(title);
        if(prj != null){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "This title already exists\nPlease type another title!"
                    , "Invalid Input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(title.isEmpty()){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "Please provide a valid title!"
                    , "Invalid Input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String desc = descriptionTxt.getText();
        if(desc.isEmpty()){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "Please provide a valid Description!"
                    , "Invalid Input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        char studGrade = (char)studGradeComBox.getSelectedItem();
        double fundingGoal;
        try{
            fundingGoal = parseDouble(funGoalTxt.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "Please provide a valid funding goal!"
                    , "Invalid Input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Category c = (Category) categoryComBox.getSelectedItem();
        String institution = institutionTxt.getText();
        if(institution.isEmpty()){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "Please provide a valid institution name!"
                    , "Invalid Input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String deadline = deadlineTxt.getText();
        StringTokenizer stk = new StringTokenizer(deadline, "/");
        int deadDay;
        int deadMonth;
        int deadYear;
        try{
            deadDay = parseInt(stk.nextToken());
            deadMonth = parseInt(stk.nextToken());
            deadYear = parseInt(stk.nextToken());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "Please provide a valid deadline", "Invalid Input!"
                    , JOptionPane.ERROR_MESSAGE);
            return;
        }
        ProjectRequest proj = new ProjectRequest(title, desc, studGrade, c, fundingGoal, deadYear, deadMonth
                , deadDay, institution);
        projects.addProject(proj);
        model.addElement(proj);
        JOptionPane.showMessageDialog(CRUDRequestPanel.this, "The request was added successfully!"
                , "Project Request Added", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_addRequestBtnActionPerformed

    private void projectsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_projectsListValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        if(projectsList.getSelectedValue() != null){
            ProjectRequest prj = projectsList.getSelectedValue();
            titleTxt.setText(prj.getTitle());
            descriptionTxt.setText(prj.getDescription());
            funGoalTxt.setText(String.valueOf(prj.getFundingGoal()));
            institutionTxt.setText(prj.getInstitution());
            deadlineTxt.setText(prj.getDeadline());
            studGradeComBox.setSelectedItem(prj.getStudentGrade());
            categoryComBox.setSelectedItem(prj.getCategory());
        }
    }//GEN-LAST:event_projectsListValueChanged

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        titleTxt.setText("");
        descriptionTxt.setText("");
        funGoalTxt.setText("");
        institutionTxt.setText("");
        deadlineTxt.setText("");
        studGradeComBox.setSelectedIndex(0);
        categoryComBox.setSelectedIndex(0);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if(projectsList.getSelectedValue() == null){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "Please select a project from the list first!"
                , "Invalid Action", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean bool = projects.removeProject(projectsList.getSelectedValue());
        System.out.println(bool);
        model.removeElement(projectsList.getSelectedValue());
        clearBtn.doClick();
        JOptionPane.showMessageDialog(CRUDRequestPanel.this, "The project request was deleted successfully!"
            , "Project Request Deleted", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        if(projectsList.getSelectedValue() == null){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "Please select a project from the list first!"
                , "Invalid Action", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String title = titleTxt.getText();
        if(title.isEmpty()){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "Please provide a valid title!"
                , "Invalid Input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        projectsList.getSelectedValue().setTitle(title);
        String desc = descriptionTxt.getText();
        if(desc.isEmpty()){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "Please provide a valid Description!"
                , "Invalid Input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        projectsList.getSelectedValue().setDescription(desc);
        char studGrade = (char)studGradeComBox.getSelectedItem();
        projectsList.getSelectedValue().setStudentGrade(studGrade);
        double fundingGoal;
        try{
            fundingGoal = parseDouble(funGoalTxt.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "Please provide a valid funding goal!"
                , "Invalid Input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        projectsList.getSelectedValue().setFundingGoal(fundingGoal);
        Category c = (Category) categoryComBox.getSelectedItem();
        projectsList.getSelectedValue().setCategory(c);
        String institution = institutionTxt.getText();
        if(institution.isEmpty()){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "Please provide a valid institution name!"
                , "Invalid Input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        projectsList.getSelectedValue().setInstitution(institution);
        String deadline = deadlineTxt.getText();
        StringTokenizer stk = new StringTokenizer(deadline, "/");
        int deadDay;
        int deadMonth;
        int deadYear;
        try{
            deadDay = parseInt(stk.nextToken());
            deadMonth = parseInt(stk.nextToken());
            deadYear = parseInt(stk.nextToken());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(CRUDRequestPanel.this, "Please provide a valid deadline", "Invalid Input!"
                , JOptionPane.ERROR_MESSAGE);
            return;
        }
        projectsList.getSelectedValue().setDeadline(deadYear, deadMonth, deadDay);
        JOptionPane.showMessageDialog(CRUDRequestPanel.this, "The request was modified successfully!"
            , "Project Request Edited", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_editBtnActionPerformed

    private void titleTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTxtActionPerformed

    private void descriptionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRequestBtn;
    private javax.swing.JComboBox<Category> categoryComBox;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel deadlineLabel;
    private javax.swing.JTextField deadlineTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField descriptionTxt;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel funGoalLabel;
    private javax.swing.JTextField funGoalTxt;
    private javax.swing.JLabel institutionLabel;
    private javax.swing.JTextField institutionTxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JList<ProjectRequest> projectsList;
    private javax.swing.JComboBox<Character> studGradeComBox;
    private javax.swing.JLabel studGradeLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleTxt;
    // End of variables declaration//GEN-END:variables
}
