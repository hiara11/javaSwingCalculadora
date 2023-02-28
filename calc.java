import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JFrame{
    private JPanel pnlTelCalc;
    private JButton btn01;
    private JButton btn04;
    private JButton btn05;
    private JButton btn03;
    private JButton btn02;
    private JButton btnPorcentagem;
    private JButton btnSubtrair;
    private JButton btn06;
    private JButton btnMultiplicacao;
    private JButton btn09;
    private JButton btn08;
    private JButton btn07;
    private JButton btnDivisao;
    private JButton btnLimpar;
    private JButton btnVirgula;
    private JButton btn0;
    private JButton btnSomar;
    private JButton btnRaizQuadrada;
    private JButton btnResultado;
    private JTextField txtSaida;
    double valor1;
    double valor2;
    String operador;
    public calc() {
    iniciarComponentes();
    addListeners();

    }

    private void iniciarComponentes() {
        JPanel telaCalc = new JPanel();
        setSize(500,350);
        setContentPane(pnlTelCalc);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setVisible(true);
    }
    private void addListeners() {

        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "1");
            }
        });


        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "2");
            }
        });

        btn03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "3");
            }
        });

        btn04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "4");
            }
        });

        btn05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "5");
            }
        });

        btn06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "6");
            }
        });

        btn07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "7");
            }
        });

        btn08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "8");
            }
        });

        btn09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "9");
            }
        });

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "0");
            }
        });

        btnVirgula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + ",");
            }
        });

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               valor1 = Double.parseDouble(txtSaida.getText());
               txtSaida.setText("");
               operador = "+";
            }
        });

        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "-";
            }
        });
        btnMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "*";
            }
        });
        btnDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "/";
            }
        });
        btnPorcentagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "%";
            }
        });
        btnRaizQuadrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "sqrt";
                double sqrt = Math.sqrt(valor1);
                txtSaida.setText(String.valueOf(sqrt));
            }
        });

        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor2 = Double.parseDouble(txtSaida.getText());

                switch (operador){
                    case "+":
                        txtSaida.setText(String.valueOf(valor1 + valor2));
                        break;
                    case "-":
                        txtSaida.setText(String.valueOf(valor1 - valor2));
                        break;
                    case "*":
                        txtSaida.setText(String.valueOf(valor1 * valor2));
                        break;
                    case "/":
                        txtSaida.setText(String.valueOf(valor1/ valor2));
                        break;
                    case "%":
                        txtSaida.setText(String.valueOf(valor1*(valor2/100)));
                        break;
                    default:
                }
            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText("");
                operador = "";
            }
        });
    }


    public static void main(String[] args) {
        calc calculadora = new calc();

    }
}

