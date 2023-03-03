/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Antonio
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registroUsuario = new javax.swing.JFrame();
        panelVacio1Registro = new javax.swing.JPanel();
        panelCentralRegistro = new javax.swing.JPanel();
        textFieldPasswordUsuario = new javax.swing.JTextField();
        comboBoxRegiones = new javax.swing.JComboBox<>();
        labelSuperiorRegistro = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textFieldNombreUsuario = new javax.swing.JTextField();
        textFieldEdadUsuario = new javax.swing.JTextField();
        btnReset1 = new javax.swing.JButton();
        btnEnviar1 = new javax.swing.JButton();
        panelVacio2Registro = new javax.swing.JPanel();
        logIn = new javax.swing.JFrame();
        panelVacio1Login = new javax.swing.JPanel();
        panelCentralLogin = new javax.swing.JPanel();
        textFieldPasswordUsuario1 = new javax.swing.JTextField();
        labelSuperiorRegistro1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textFieldNombreUsuario1 = new javax.swing.JTextField();
        btnReset2 = new javax.swing.JButton();
        btnEnviar2 = new javax.swing.JButton();
        panelVacio2Login = new javax.swing.JPanel();
        jDialog1 = new javax.swing.JDialog();
        panelIconoAviso = new javax.swing.JPanel();
        labelMensaje = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JFrame();
        panelVacio = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        panelColeccion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelVacio2 = new javax.swing.JPanel();
        panelVacio1 = new javax.swing.JPanel();
        panelCentral1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnEnviar3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnReset3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelVacio3 = new javax.swing.JPanel();

        registroUsuario.getContentPane().setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout panelVacio1RegistroLayout = new javax.swing.GroupLayout(panelVacio1Registro);
        panelVacio1Registro.setLayout(panelVacio1RegistroLayout);
        panelVacio1RegistroLayout.setHorizontalGroup(
            panelVacio1RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        panelVacio1RegistroLayout.setVerticalGroup(
            panelVacio1RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        registroUsuario.getContentPane().add(panelVacio1Registro);

        textFieldPasswordUsuario.setToolTipText("Contraseña");
        textFieldPasswordUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldPasswordUsuario.setMinimumSize(new java.awt.Dimension(50, 100));
        textFieldPasswordUsuario.setPreferredSize(new java.awt.Dimension(50, 100));

        comboBoxRegiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUW", "EUNE", "KOR", "NA", "LATAM", "CHI", "JAP", "RUS", "AFR", "OCE" }));

        labelSuperiorRegistro.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        labelSuperiorRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSuperiorRegistro.setText("Registrar");

        jLabel5.setFont(new java.awt.Font("Dogica Pixel", 0, 24)); // NOI18N
        jLabel5.setText("Edad:");

        jLabel6.setFont(new java.awt.Font("Dogica Pixel", 0, 24)); // NOI18N
        jLabel6.setText("Región: ");

        jLabel7.setFont(new java.awt.Font("Dogica Pixel", 0, 24)); // NOI18N
        jLabel7.setText("Contraseña:");

        jLabel8.setFont(new java.awt.Font("Dogica Pixel", 0, 24)); // NOI18N
        jLabel8.setText("Nombre:");

        textFieldNombreUsuario.setToolTipText("Nombre");
        textFieldNombreUsuario.setMinimumSize(new java.awt.Dimension(50, 100));
        textFieldNombreUsuario.setPreferredSize(new java.awt.Dimension(50, 100));

        textFieldEdadUsuario.setToolTipText("Contraseña");
        textFieldEdadUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldEdadUsuario.setMinimumSize(new java.awt.Dimension(50, 100));
        textFieldEdadUsuario.setPreferredSize(new java.awt.Dimension(50, 100));
        textFieldEdadUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldEdadUsuarioKeyPressed(evt);
            }
        });

        btnEnviar1.setPreferredSize(new java.awt.Dimension(72, 24));

        javax.swing.GroupLayout panelCentralRegistroLayout = new javax.swing.GroupLayout(panelCentralRegistro);
        panelCentralRegistro.setLayout(panelCentralRegistroLayout);
        panelCentralRegistroLayout.setHorizontalGroup(
            panelCentralRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textFieldNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textFieldPasswordUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textFieldEdadUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(comboBoxRegiones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelSuperiorRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCentralRegistroLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(panelCentralRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        panelCentralRegistroLayout.setVerticalGroup(
            panelCentralRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralRegistroLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(labelSuperiorRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(textFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(textFieldPasswordUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(textFieldEdadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(comboBoxRegiones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnEnviar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        registroUsuario.getContentPane().add(panelCentralRegistro);

        javax.swing.GroupLayout panelVacio2RegistroLayout = new javax.swing.GroupLayout(panelVacio2Registro);
        panelVacio2Registro.setLayout(panelVacio2RegistroLayout);
        panelVacio2RegistroLayout.setHorizontalGroup(
            panelVacio2RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        panelVacio2RegistroLayout.setVerticalGroup(
            panelVacio2RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        registroUsuario.getContentPane().add(panelVacio2Registro);

        logIn.getContentPane().setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout panelVacio1LoginLayout = new javax.swing.GroupLayout(panelVacio1Login);
        panelVacio1Login.setLayout(panelVacio1LoginLayout);
        panelVacio1LoginLayout.setHorizontalGroup(
            panelVacio1LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        panelVacio1LoginLayout.setVerticalGroup(
            panelVacio1LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        logIn.getContentPane().add(panelVacio1Login);

        textFieldPasswordUsuario1.setToolTipText("Contraseña");
        textFieldPasswordUsuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldPasswordUsuario1.setMinimumSize(new java.awt.Dimension(50, 100));
        textFieldPasswordUsuario1.setPreferredSize(new java.awt.Dimension(50, 100));

        labelSuperiorRegistro1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        labelSuperiorRegistro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSuperiorRegistro1.setText("Iniciar sesión");

        jLabel11.setFont(new java.awt.Font("Dogica Pixel", 0, 24)); // NOI18N
        jLabel11.setText("Contraseña:");

        jLabel12.setFont(new java.awt.Font("Dogica Pixel", 0, 24)); // NOI18N
        jLabel12.setText("Nombre:");

        textFieldNombreUsuario1.setToolTipText("Nombre");
        textFieldNombreUsuario1.setMinimumSize(new java.awt.Dimension(50, 100));
        textFieldNombreUsuario1.setPreferredSize(new java.awt.Dimension(50, 100));

        btnEnviar2.setPreferredSize(new java.awt.Dimension(72, 24));

        javax.swing.GroupLayout panelCentralLoginLayout = new javax.swing.GroupLayout(panelCentralLogin);
        panelCentralLogin.setLayout(panelCentralLoginLayout);
        panelCentralLoginLayout.setHorizontalGroup(
            panelCentralLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textFieldNombreUsuario1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textFieldPasswordUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelSuperiorRegistro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCentralLoginLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(panelCentralLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        panelCentralLoginLayout.setVerticalGroup(
            panelCentralLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLoginLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(labelSuperiorRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(textFieldNombreUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(textFieldPasswordUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnEnviar2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        logIn.getContentPane().add(panelCentralLogin);

        javax.swing.GroupLayout panelVacio2LoginLayout = new javax.swing.GroupLayout(panelVacio2Login);
        panelVacio2Login.setLayout(panelVacio2LoginLayout);
        panelVacio2LoginLayout.setHorizontalGroup(
            panelVacio2LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        panelVacio2LoginLayout.setVerticalGroup(
            panelVacio2LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        logIn.getContentPane().add(panelVacio2Login);

        javax.swing.GroupLayout panelIconoAvisoLayout = new javax.swing.GroupLayout(panelIconoAviso);
        panelIconoAviso.setLayout(panelIconoAvisoLayout);
        panelIconoAvisoLayout.setHorizontalGroup(
            panelIconoAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelIconoAvisoLayout.setVerticalGroup(
            panelIconoAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        labelMensaje.setText("Inicio de sesion fallido");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(panelIconoAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelIconoAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        menuPrincipal.getContentPane().setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout panelVacioLayout = new javax.swing.GroupLayout(panelVacio);
        panelVacio.setLayout(panelVacioLayout);
        panelVacioLayout.setHorizontalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        panelVacioLayout.setVerticalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        menuPrincipal.getContentPane().add(panelVacio);

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel15.setText("NUMERO DE MONEDAS");

        jLabel1.setText("AQUI VA EL BUCLE QUE METE LAS CARTAS");

        javax.swing.GroupLayout panelColeccionLayout = new javax.swing.GroupLayout(panelColeccion);
        panelColeccion.setLayout(panelColeccionLayout);
        panelColeccionLayout.setHorizontalGroup(
            panelColeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColeccionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(206, 206, 206))
        );
        panelColeccionLayout.setVerticalGroup(
            panelColeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColeccionLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(813, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
            .addComponent(panelColeccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelColeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPrincipal.getContentPane().add(panelCentral);

        javax.swing.GroupLayout panelVacio2Layout = new javax.swing.GroupLayout(panelVacio2);
        panelVacio2.setLayout(panelVacio2Layout);
        panelVacio2Layout.setHorizontalGroup(
            panelVacio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        panelVacio2Layout.setVerticalGroup(
            panelVacio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        menuPrincipal.getContentPane().add(panelVacio2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MPT");
        getContentPane().setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout panelVacio1Layout = new javax.swing.GroupLayout(panelVacio1);
        panelVacio1.setLayout(panelVacio1Layout);
        panelVacio1Layout.setHorizontalGroup(
            panelVacio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        panelVacio1Layout.setVerticalGroup(
            panelVacio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        getContentPane().add(panelVacio1);

        jPanel2.setEnabled(false);
        jPanel2.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MPT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnEnviar3.setPreferredSize(new java.awt.Dimension(72, 24));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Iniciar sesión");
        jLabel10.setFocusable(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Resgistrar");
        jLabel13.setFocusable(false);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Medieval Pixel Tokens");

        javax.swing.GroupLayout panelCentral1Layout = new javax.swing.GroupLayout(panelCentral1);
        panelCentral1.setLayout(panelCentral1Layout);
        panelCentral1Layout.setHorizontalGroup(
            panelCentral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelCentral1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelCentral1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(panelCentral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelCentral1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(panelCentral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelCentral1Layout.setVerticalGroup(
            panelCentral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentral1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addGroup(panelCentral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(panelCentral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(panelCentral1);

        javax.swing.GroupLayout panelVacio3Layout = new javax.swing.GroupLayout(panelVacio3);
        panelVacio3.setLayout(panelVacio3Layout);
        panelVacio3Layout.setHorizontalGroup(
            panelVacio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        panelVacio3Layout.setVerticalGroup(
            panelVacio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        getContentPane().add(panelVacio3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldEdadUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldEdadUsuarioKeyPressed
        String value = this.textFieldEdadUsuario.getText();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            this.textFieldEdadUsuario.setEditable(true);
            try {
                Integer.parseInt(value);
            } catch (Exception e) {
                this.textFieldEdadUsuario.setText("");
            }
        } else {
            this.textFieldEdadUsuario.setText("* Enter only numeric digits(0-9)");
        }
    }//GEN-LAST:event_textFieldEdadUsuarioKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar1;
    private javax.swing.JButton btnEnviar2;
    private javax.swing.JButton btnEnviar3;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnReset2;
    private javax.swing.JButton btnReset3;
    private javax.swing.JComboBox<String> comboBoxRegiones;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelSuperiorRegistro;
    private javax.swing.JLabel labelSuperiorRegistro1;
    private javax.swing.JFrame logIn;
    private javax.swing.JFrame menuPrincipal;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelCentral1;
    private javax.swing.JPanel panelCentralLogin;
    private javax.swing.JPanel panelCentralRegistro;
    private javax.swing.JPanel panelColeccion;
    private javax.swing.JPanel panelIconoAviso;
    private javax.swing.JPanel panelVacio;
    private javax.swing.JPanel panelVacio1;
    private javax.swing.JPanel panelVacio1Login;
    private javax.swing.JPanel panelVacio1Registro;
    private javax.swing.JPanel panelVacio2;
    private javax.swing.JPanel panelVacio2Login;
    private javax.swing.JPanel panelVacio2Registro;
    private javax.swing.JPanel panelVacio3;
    private javax.swing.JFrame registroUsuario;
    private javax.swing.JTextField textFieldEdadUsuario;
    private javax.swing.JTextField textFieldNombreUsuario;
    private javax.swing.JTextField textFieldNombreUsuario1;
    private javax.swing.JTextField textFieldPasswordUsuario;
    private javax.swing.JTextField textFieldPasswordUsuario1;
    // End of variables declaration//GEN-END:variables
}