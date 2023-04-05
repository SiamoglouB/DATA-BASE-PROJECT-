package evaluation;

import com.github.lgooddatepicker.components.DateTimePicker;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;

public class Administrator {
    private JPanel panelAdministrator;
    private JTable tableUsers;
    private JTable tableCompanies;
    private JScrollPane scrollPaneUsers;
    private JScrollPane scrollPaneCompanies;
    private JTabbedPane tabbedPaneAdministrator;
    private JPanel panelUsers;
    private JPanel panelCompanies;
    private JPanel panelUserAdd;
    private JPanel panelCompanyAdd;
    private JLabel labelCompanyAFM;
    private JTextField textFieldCompanyAFM;
    private JLabel labelCompanyName;
    private JLabel labelCompanyStreet;
    private JTextField textFieldCompanyName;
    private JTextField textFieldCompanyStreet;
    private JLabel labelCompanyCity;
    private JTextField textFieldCompanyCity;
    private JLabel labelCompanyPhone;
    private JLabel labelCompanyNum;
    private JLabel labelCompanyCountry;
    private JTextField textFieldCompanyPhone;
    private JTextField textFieldCompanyNum;
    private JTextField textFieldCompanyCountry;
    private JTextField textFieldCompanyDOY;
    private JLabel labelCompanyDOY;
    private JButton buttonCompanyAdd;
    private JButton buttonUserAdd;
    private JTextField textFieldUserEmail;
    private JTextField textFieldUserName;
    private JTextField textFieldUserSurname;
    private JComboBox comboBoxUserRole;
    private JTextField textFieldUserUsername;
    private JPasswordField passwordFieldUserPassword;
    private JComboBox comboBoxUserCompany;
    private JLabel labelUserUsername;
    private JLabel labelUserName;
    private JLabel labelUserEmail;
    private JLabel labelUserPassword;
    private JLabel labelUserSurname;
    private JLabel labelUserRole;
    private JLabel labelUserCompany;
    private JPanel panelActivities;
    private JPanel panelActivityAdd;
    private JButton buttonActivityAdd;
    private JTextField textFieldActivityTitle;
    private JLabel labelActivityParent;
    private JLabel labelActivityTitle;
    private JComboBox comboBoxActivityParent;
    private JScrollPane scrollPaneActivityDescription;
    private JTextArea textAreaActivityDescription;
    private JTable tableActivities;
    private JScrollPane scrollPaneActivities;
    private JPanel panelLog;
    private DateTimePicker dateTimePickerFrom;
    private DateTimePicker dateTimePickerTo;
    private JComboBox comboBoxLogUsername;
    private JComboBox comboBoxLogTable;
    private JLabel labelLogUsername;
    private JLabel labelLogTable;
    private JLabel labelLogFrom;
    private JLabel labelLogTo;
    private JScrollPane scrollPaneLog;
    private JTable tableLog;
    private JButton buttonLogFetch;
    private JButton buttonUserEdit;
    private JButton buttonCompanyEdit;

    private Connection conn = null;
    private Statement stmt = null;
    private CallableStatement cs = null;
    private ResultSet rs = null;
    private ResultSetMetaData rsmd = null;

    private String user = null;
    private String role = null;

    public Administrator(String user, String role) {
        conn = CheckConnection.ConnectDb();
        this.user = user;
        this.role = role;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(String.format("SET @evaluation_current_user = '%s';", user));
            rs = stmt.executeQuery(String.format("SET @evaluation_current_role = '%s';", role));
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panelAdministrator, e.toString());
        }
        populate();
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panelAdministrator = new JPanel();
        panelAdministrator.setLayout(new GridBagLayout());
        tabbedPaneAdministrator = new JTabbedPane();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelAdministrator.add(tabbedPaneAdministrator, gbc);
        panelUsers = new JPanel();
        panelUsers.setLayout(new GridBagLayout());
        tabbedPaneAdministrator.addTab("Users", panelUsers);
        scrollPaneUsers = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelUsers.add(scrollPaneUsers, gbc);
        tableUsers = new JTable();
        tableUsers.setFillsViewportHeight(true);
        tableUsers.setPreferredScrollableViewportSize(new Dimension(450, 300));
        scrollPaneUsers.setViewportView(tableUsers);
        panelUserAdd = new JPanel();
        panelUserAdd.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelUsers.add(panelUserAdd, gbc);
        panelUserAdd.setBorder(BorderFactory.createTitledBorder(null, "Add User", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        buttonUserAdd = new JButton();
        buttonUserAdd.setText("Add");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelUserAdd.add(buttonUserAdd, gbc);
        textFieldUserEmail = new JTextField();
        textFieldUserEmail.setMinimumSize(new Dimension(150, 30));
        textFieldUserEmail.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelUserAdd.add(textFieldUserEmail, gbc);
        textFieldUserName = new JTextField();
        textFieldUserName.setMinimumSize(new Dimension(150, 30));
        textFieldUserName.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelUserAdd.add(textFieldUserName, gbc);
        textFieldUserSurname = new JTextField();
        textFieldUserSurname.setMinimumSize(new Dimension(150, 30));
        textFieldUserSurname.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelUserAdd.add(textFieldUserSurname, gbc);
        textFieldUserUsername = new JTextField();
        textFieldUserUsername.setMinimumSize(new Dimension(150, 30));
        textFieldUserUsername.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelUserAdd.add(textFieldUserUsername, gbc);
        passwordFieldUserPassword = new JPasswordField();
        passwordFieldUserPassword.setMinimumSize(new Dimension(150, 30));
        passwordFieldUserPassword.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelUserAdd.add(passwordFieldUserPassword, gbc);
        labelUserUsername = new JLabel();
        labelUserUsername.setText("Username:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelUserAdd.add(labelUserUsername, gbc);
        labelUserName = new JLabel();
        labelUserName.setText("Name:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panelUserAdd.add(labelUserName, gbc);
        labelUserEmail = new JLabel();
        labelUserEmail.setText("Email:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panelUserAdd.add(labelUserEmail, gbc);
        labelUserPassword = new JLabel();
        labelUserPassword.setText("Password:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelUserAdd.add(labelUserPassword, gbc);
        labelUserSurname = new JLabel();
        labelUserSurname.setText("Surname:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panelUserAdd.add(labelUserSurname, gbc);
        labelUserRole = new JLabel();
        labelUserRole.setText("Role:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panelUserAdd.add(labelUserRole, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelUserAdd.add(spacer1, gbc);
        comboBoxUserRole = new JComboBox();
        comboBoxUserRole.setMinimumSize(new Dimension(150, 30));
        comboBoxUserRole.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelUserAdd.add(comboBoxUserRole, gbc);
        comboBoxUserCompany = new JComboBox();
        comboBoxUserCompany.setMinimumSize(new Dimension(150, 30));
        comboBoxUserCompany.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelUserAdd.add(comboBoxUserCompany, gbc);
        labelUserCompany = new JLabel();
        labelUserCompany.setText("Company:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panelUserAdd.add(labelUserCompany, gbc);
        buttonUserEdit = new JButton();
        buttonUserEdit.setText("Edit");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panelUsers.add(buttonUserEdit, gbc);
        panelCompanies = new JPanel();
        panelCompanies.setLayout(new GridBagLayout());
        tabbedPaneAdministrator.addTab("Companies", panelCompanies);
        scrollPaneCompanies = new JScrollPane();
        scrollPaneCompanies.setOpaque(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelCompanies.add(scrollPaneCompanies, gbc);
        tableCompanies = new JTable();
        tableCompanies.setFillsViewportHeight(true);
        tableCompanies.setPreferredScrollableViewportSize(new Dimension(450, 300));
        scrollPaneCompanies.setViewportView(tableCompanies);
        buttonCompanyEdit = new JButton();
        buttonCompanyEdit.setText("Edit");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panelCompanies.add(buttonCompanyEdit, gbc);
        panelCompanyAdd = new JPanel();
        panelCompanyAdd.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelCompanies.add(panelCompanyAdd, gbc);
        panelCompanyAdd.setBorder(BorderFactory.createTitledBorder(null, "Add Company", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        labelCompanyAFM = new JLabel();
        labelCompanyAFM.setText("AFM:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelCompanyAdd.add(labelCompanyAFM, gbc);
        textFieldCompanyAFM = new JTextField();
        textFieldCompanyAFM.setEditable(true);
        textFieldCompanyAFM.setMinimumSize(new Dimension(150, 30));
        textFieldCompanyAFM.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelCompanyAdd.add(textFieldCompanyAFM, gbc);
        labelCompanyName = new JLabel();
        labelCompanyName.setText("Name:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panelCompanyAdd.add(labelCompanyName, gbc);
        labelCompanyStreet = new JLabel();
        labelCompanyStreet.setText("Street:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panelCompanyAdd.add(labelCompanyStreet, gbc);
        textFieldCompanyName = new JTextField();
        textFieldCompanyName.setEditable(true);
        textFieldCompanyName.setMinimumSize(new Dimension(150, 30));
        textFieldCompanyName.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelCompanyAdd.add(textFieldCompanyName, gbc);
        textFieldCompanyStreet = new JTextField();
        textFieldCompanyStreet.setMinimumSize(new Dimension(150, 30));
        textFieldCompanyStreet.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelCompanyAdd.add(textFieldCompanyStreet, gbc);
        labelCompanyCity = new JLabel();
        labelCompanyCity.setText("City:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panelCompanyAdd.add(labelCompanyCity, gbc);
        textFieldCompanyCity = new JTextField();
        textFieldCompanyCity.setMinimumSize(new Dimension(150, 30));
        textFieldCompanyCity.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelCompanyAdd.add(textFieldCompanyCity, gbc);
        labelCompanyPhone = new JLabel();
        labelCompanyPhone.setText("Phone:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panelCompanyAdd.add(labelCompanyPhone, gbc);
        labelCompanyNum = new JLabel();
        labelCompanyNum.setText("Num:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panelCompanyAdd.add(labelCompanyNum, gbc);
        labelCompanyCountry = new JLabel();
        labelCompanyCountry.setText("Country:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panelCompanyAdd.add(labelCompanyCountry, gbc);
        textFieldCompanyPhone = new JTextField();
        textFieldCompanyPhone.setMinimumSize(new Dimension(150, 30));
        textFieldCompanyPhone.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelCompanyAdd.add(textFieldCompanyPhone, gbc);
        textFieldCompanyNum = new JTextField();
        textFieldCompanyNum.setMinimumSize(new Dimension(150, 30));
        textFieldCompanyNum.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelCompanyAdd.add(textFieldCompanyNum, gbc);
        textFieldCompanyCountry = new JTextField();
        textFieldCompanyCountry.setMinimumSize(new Dimension(150, 30));
        textFieldCompanyCountry.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelCompanyAdd.add(textFieldCompanyCountry, gbc);
        textFieldCompanyDOY = new JTextField();
        textFieldCompanyDOY.setEditable(true);
        textFieldCompanyDOY.setMinimumSize(new Dimension(150, 30));
        textFieldCompanyDOY.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelCompanyAdd.add(textFieldCompanyDOY, gbc);
        labelCompanyDOY = new JLabel();
        labelCompanyDOY.setText("DOY:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelCompanyAdd.add(labelCompanyDOY, gbc);
        buttonCompanyAdd = new JButton();
        buttonCompanyAdd.setText("Add");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        panelCompanyAdd.add(buttonCompanyAdd, gbc);
        panelActivities = new JPanel();
        panelActivities.setLayout(new GridBagLayout());
        tabbedPaneAdministrator.addTab("Activities", panelActivities);
        panelActivityAdd = new JPanel();
        panelActivityAdd.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.8;
        gbc.fill = GridBagConstraints.BOTH;
        panelActivities.add(panelActivityAdd, gbc);
        panelActivityAdd.setBorder(BorderFactory.createTitledBorder(null, "Add Activity", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        textFieldActivityTitle = new JTextField();
        textFieldActivityTitle.setMinimumSize(new Dimension(150, 30));
        textFieldActivityTitle.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelActivityAdd.add(textFieldActivityTitle, gbc);
        scrollPaneActivityDescription = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelActivityAdd.add(scrollPaneActivityDescription, gbc);
        scrollPaneActivityDescription.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        textAreaActivityDescription = new JTextArea();
        scrollPaneActivityDescription.setViewportView(textAreaActivityDescription);
        labelActivityTitle = new JLabel();
        labelActivityTitle.setText("Title:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelActivityAdd.add(labelActivityTitle, gbc);
        labelActivityParent = new JLabel();
        labelActivityParent.setText("Parent:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelActivityAdd.add(labelActivityParent, gbc);
        comboBoxActivityParent = new JComboBox();
        comboBoxActivityParent.setMinimumSize(new Dimension(150, 30));
        comboBoxActivityParent.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelActivityAdd.add(comboBoxActivityParent, gbc);
        buttonActivityAdd = new JButton();
        buttonActivityAdd.setText("Add");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelActivityAdd.add(buttonActivityAdd, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelActivityAdd.add(spacer2, gbc);
        scrollPaneActivities = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelActivities.add(scrollPaneActivities, gbc);
        tableActivities = new JTable();
        tableActivities.setFillsViewportHeight(true);
        scrollPaneActivities.setViewportView(tableActivities);
        panelLog = new JPanel();
        panelLog.setLayout(new GridBagLayout());
        tabbedPaneAdministrator.addTab("Log", panelLog);
        dateTimePickerFrom = new DateTimePicker();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        panelLog.add(dateTimePickerFrom, gbc);
        dateTimePickerTo = new DateTimePicker();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        panelLog.add(dateTimePickerTo, gbc);
        comboBoxLogUsername = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelLog.add(comboBoxLogUsername, gbc);
        comboBoxLogTable = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelLog.add(comboBoxLogTable, gbc);
        labelLogUsername = new JLabel();
        labelLogUsername.setText("Username:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelLog.add(labelLogUsername, gbc);
        labelLogTable = new JLabel();
        labelLogTable.setText("Table:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panelLog.add(labelLogTable, gbc);
        labelLogFrom = new JLabel();
        labelLogFrom.setText("From:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelLog.add(labelLogFrom, gbc);
        labelLogTo = new JLabel();
        labelLogTo.setText("To:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panelLog.add(labelLogTo, gbc);
        scrollPaneLog = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelLog.add(scrollPaneLog, gbc);
        tableLog = new JTable();
        scrollPaneLog.setViewportView(tableLog);
        buttonLogFetch = new JButton();
        buttonLogFetch.setText("Fetch");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelLog.add(buttonLogFetch, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelAdministrator;
    }

    public static void show(String user, String role) {
        JFrame frame = new JFrame("Administrator");
        frame.setContentPane(new Administrator(user, role).panelAdministrator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
    }

    private void updateUsers() {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM user");
            rsmd = rs.getMetaData();
            Vector<String> clmns = new Vector<String>();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                clmns.add(rsmd.getColumnName(i));
            }
            DefaultTableModel modelUsers = new DefaultTableModel(clmns, 0) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            while (rs.next()) {
                Vector<String> vls = new Vector<String>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    vls.add(rs.getObject(i).toString());
                }
                modelUsers.addRow(vls);
            }
            tableUsers.setModel(modelUsers);
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panelAdministrator, e.toString());
        }
    }

    private void updateCompanies() {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM company");
            rsmd = rs.getMetaData();
            Vector<String> clmns = new Vector<String>();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                clmns.add(rsmd.getColumnName(i));
            }
            DefaultTableModel modelCompanies = new DefaultTableModel(clmns, 0) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            while (rs.next()) {
                Vector<String> vls = new Vector<String>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    vls.add(rs.getObject(i).toString());
                }
                modelCompanies.addRow(vls);
            }
            tableCompanies.setModel(modelCompanies);
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panelAdministrator, e.toString());
        }
    }

    private void updateActivities() {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM company");
            rsmd = rs.getMetaData();
            Vector<String> clmns = new Vector<String>();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                clmns.add(rsmd.getColumnName(i));
            }
            DefaultTableModel modelCompanies = new DefaultTableModel(clmns, 0) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            while (rs.next()) {
                Vector<String> vls = new Vector<String>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    vls.add(rs.getObject(i).toString());
                }
                modelCompanies.addRow(vls);
            }
            tableCompanies.setModel(modelCompanies);
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panelAdministrator, e.toString());
        }
    }

    private void updateLog() {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT DISTINCT log.table FROM log");
            while (rs.next()) {
                comboBoxLogTable.addItem(rs.getString(1));
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panelAdministrator, e.toString());
        }
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT user.username FROM user");
            while (rs.next()) {
                comboBoxLogUsername.addItem(rs.getString(1));
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panelAdministrator, e.toString());
        }
    }

    private void fetchLog(String user, String table, String from, String to) {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(
                    String.format(
                            "SELECT * FROM log WHERE log.username = \"%s\" AND log.table = \"%s\" AND log.datetime >= \"%s\" AND log.datetime <= \"%s\"",
                            user, table, from, to));
            rsmd = rs.getMetaData();
            Vector<String> clmns = new Vector<String>();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                clmns.add(rsmd.getColumnName(i));
            }
            DefaultTableModel modelLog = new DefaultTableModel(clmns, 0) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            while (rs.next()) {
                Vector<String> vls = new Vector<String>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    vls.add(rs.getObject(i).toString());
                }
                modelLog.addRow(vls);
            }
            tableLog.setModel(modelLog);
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panelAdministrator, e.toString());
        }
    }

    private void populate() {
        updateUsers();
        updateCompanies();
        updateLog();

        buttonLogFetch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String user = comboBoxLogUsername.getSelectedItem().toString();
                String table = comboBoxLogTable.getSelectedItem().toString();
                String from = dateTimePickerFrom.toString();
                String to = dateTimePickerTo.toString();
                fetchLog(user, table, from, to);
            }
        });

        buttonUserEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultTableModel model = (DefaultTableModel) tableUsers.getModel();
                Vector<String> items = model.getDataVector().elementAt(tableUsers.getSelectedRow());
                textFieldUserUsername.setText(items.elementAt(0));
                passwordFieldUserPassword.setText(items.elementAt(1));
                textFieldUserName.setText(items.elementAt(2));
                textFieldUserSurname.setText(items.elementAt(3));
                textFieldUserEmail.setText(items.elementAt(5));
//                comboBoxUserRole.setSelectedItem(items.elementAt(6));
//                comboBoxUserCompany.setSelectedItem(items.elementAt(7));
            }
        });
    }
}
